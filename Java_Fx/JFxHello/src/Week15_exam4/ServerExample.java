package Week15_exam4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import JFx_Week13.Audio;
import JFx_Week13.RemoteControl;
import JFx_Week13.Television;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application {
	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();

	static String messageSend = "";

	static String cmdHelp() {
		messageSend = "";
		messageSend = messageSend + "help(h)" + "\n";
		messageSend = messageSend + "hl1(이한림)" + "\n";
		messageSend = messageSend + "hl2(이이림)" + "\n";
		messageSend = messageSend + "hl3(이삼림)" + "\n";
		messageSend = messageSend + "hl4(이사림)" + "\n";
		messageSend = messageSend + "My1(김대성)" + "\n";
		messageSend = messageSend + "My2(친구)" + "\n";
		messageSend = messageSend + "My3(소개)" + "\n";
		messageSend = messageSend + "9-1(ex9-1)" + "\n";
		messageSend = messageSend + "9-2(ex9-2)" + "\n";
		messageSend = messageSend + "9-3(ex9-2)" + "\n";
		return messageSend;
	}

	static String cmdhl1() {
		messageSend = "";
		messageSend = messageSend + "빅데이터 3학년 이한림입니다." + "\n";
		messageSend = messageSend + "취미는 영화감상 입니다" + "\n";
		return messageSend;
	}

	static String cmdhl2() {
		messageSend = "";
		messageSend = messageSend + "콘텐츠 IT 3학년 이이림입니다." + "\n";
		messageSend = messageSend + "취미는 영화감상 입니다" + "\n";
		return messageSend;
	}

	static String cmdhl3() {
		messageSend = "";
		messageSend = messageSend + "스마트 IOT 3학년 이삼림입니다." + "\n";
		messageSend = messageSend + "취미는 영화감상 입니다" + "\n";
		return messageSend;
	}

	static String cmdhl4() {
		messageSend = "";
		messageSend = messageSend + "일본어학과 3학년 이사림입니다." + "\n";
		messageSend = messageSend + "취미는 영화감상 입니다" + "\n";
		return messageSend;
	}
	
	static String cmdMy1() {
		messageSend = "";
		messageSend = messageSend + "스마트IoT 3학년 김대성입니다."+"\n"+
				"학번은 20185212 이고 복수전공은 콘텐츠IT입니다."+"\n";
		return messageSend;
	}
	
	static String cmdMy2() {
		messageSend = "";
		messageSend = messageSend + "저의 친구 서종오를 소개합니다."+"\n"+
				"콘텐츠IT학과이며 게임회사에 취업하고 싶어합니다."+"\n";
		return messageSend;
	}
	
	static String cmdMy3() {
		messageSend = "";
		messageSend = messageSend + "저의 취미는 게임하는 것 입니다."+"\n"+
				"좋아하는 연예인은 아이유 입니다."+"\n"+
				"좋아하는 운동은 배드민턴 입니다."+"\n";
		return messageSend;
	}
	
	static String cmdEx9_1() {
		 messageSend="";
		 RemoteControl rc = null;
		 
		 rc = new Television();
		 messageSend = messageSend + rc.turnOn() + "\n";
		 messageSend =messageSend + rc.turnOff() + "\n";
			
		 rc = new Audio();
		 messageSend = messageSend + rc.turnOn() + "\n";
		 messageSend = messageSend + rc.turnOff() + "\n";
		 return messageSend;
	 }
	
	static String cmdEx9_2() {
		 messageSend = "";
		 RemoteControl rc = null;
		 
		 rc = new Television();
		 messageSend += rc.turnOn() + "\n";
		 messageSend += rc.setMute(true) + "\n";
		 
		 rc = new Audio();
		 messageSend += rc.turnOn() + "\n";
		 messageSend += rc.setMute(true) + "\n";
		 return messageSend;
	 }
	
	static String cmdEx9_3() {
		 messageSend = "";

		 messageSend += RemoteControl.changeBattery();
		 return messageSend;
	 }
	
	static String cmdBadCommand() {
		messageSend = "";
		messageSend = messageSend + "Bad Command..." + "\n";
		return messageSend;
	}
	
	void startServer() {
		executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
		} catch (Exception e) {
			if (!serverSocket.isClosed()) {
				stopServer();
			}
			return;
		}
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				Platform.runLater(() -> {
					displayText("[이한림 서버 시작]");
					btnStartStop.setText("stop");
				});
				while (true) {
					try {
						Socket socket = serverSocket.accept();
						String message = "[연결 수락: " + socket.getRemoteSocketAddress() + ": "
								+ Thread.currentThread().getName() + "]";
						Platform.runLater(() -> displayText(message));
						Client client = new Client(socket);
						connections.add(client);
						Platform.runLater(() -> displayText("[연결 개수: " + connections.size() + "]"));
					} catch (Exception e) {
						if (!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					}
				}
			}
		};
		executorService.submit(runnable);
	}

	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			if (serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if (executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}
			Platform.runLater(() -> {
				displayText("[서버 멈춤]");
				btnStartStop.setText("start");
			});
		} catch (Exception e) {
		}
	}

	class Client {
		Socket socket;

		Client(Socket socket) {
			this.socket = socket;
			receive();
		}

		void receive() {
			Runnable runnable = new Runnable() { 
				@Override
				public void run() {
					try {
						while (true) {
							byte[] byteArr = new byte[500];
							InputStream inputStream = socket.getInputStream();
							int readByteCount = inputStream.read(byteArr);
							if (readByteCount == -1) {
								throw new IOException();
							}
							String message = "[요청 처리: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							String data = new String(byteArr, 0, readByteCount, "UTF-8");
							String cmd = data;
							String messageResult = "";
							// 메뉴
							if ((cmd.equals("help")) || cmd.equals("h")) {
								messageResult = cmdHelp();
							} else if ((cmd.equals("hl1")) || cmd.equals("이한림")) {
								messageResult = cmdhl1();
							} else if ((cmd.equals("hl2")) || cmd.equals("이이림")) {
								messageResult = cmdhl2();
							} else if ((cmd.equals("hl3")) || cmd.equals("이삼림")) {
								messageResult = cmdhl3();
							} else if ((cmd.equals("hl4")) || cmd.equals("이사림")) {
								messageResult = cmdhl4();
							} else if ((cmd.equals("My1")) || cmd.equals("김대성")) {
								messageResult = cmdMy1();
							} else if ((cmd.equals("My2")) || cmd.equals("친구")) {
								messageResult = cmdMy2();
							} else if ((cmd.equals("My3")) || cmd.equals("소개")) {
								messageResult = cmdMy3();
							} else if ((cmd.equals("9-1")) || cmd.equals("ex9-1")) {
									messageResult = cmdEx9_1();
							} else if ((cmd.equals("9-2")) || cmd.equals("ex9-2")) {
								messageResult = cmdEx9_2();
							} else if ((cmd.equals("9-3")) || cmd.equals("ex9-3")) {
								messageResult = cmdEx9_3();
							} else {
								messageResult = cmdBadCommand();
							}
							String data2 = messageResult;
							for (Client client : connections) {
								client.send(data2);
							}
						}
					} catch (Exception e) {
						try {
							connections.remove(Client.this);
							String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							socket.close();
						} catch (IOException e2) {
						}
					}
				}
			};
			executorService.submit(runnable);
		}

		void send(String data) {
			Runnable runnable = new Runnable() { 
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);
						outputStream.flush();
					} catch (Exception e) {
						try {
							String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							connections.remove(Client.this);
							socket.close();
						} catch (IOException e2) {
						}
					}
				}
			};
			executorService.submit(runnable); 
		}
	}

	TextArea txtDisplay;
	Button btnStartStop;

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);
		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		btnStartStop.setOnAction(e -> { 
			if (btnStartStop.getText().equals("start")) {
				startServer();
			} else if (btnStartStop.getText().equals("stop")) {
				stopServer();
			}
		});
		root.setBottom(btnStartStop);
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Server");
		primaryStage.setOnCloseRequest(event -> stopServer()); 
		primaryStage.show();
	}

	void displayText(String text) { 
		txtDisplay.appendText(text + "\n");
	}

	public static void main(String[] args) {
		launch(args);
	}
}

