package JFx_Thread;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.collections.ObservableList;
import java.awt.Toolkit;

public class UI_Thread02 extends Application {

	String message = "";
	static String argsTemp[]= {"","",""};
	
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {

		VBox root = new VBox();
		HBox root2 = new HBox();
		HBox root3 = new HBox();
		root.setPrefSize(500, 350);
		root.setPadding(new Insets(10,10,10,10));        //안쪽 여백 설정

		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);	                         // 컨트롤 간의 수직 간격 설정
		root2.setSpacing(20);                            // 컨트롤 간의 수평 간격 설정
		root3.setSpacing(20); 
		
		TextField textField = new TextField(); 				//TextField 컨트롤 생성
		textField.setPrefWidth(50);	

		TextField textField2 = new TextField(); 				//TextField 컨트롤 생성
		textField.setPrefWidth(50);	

		TextArea textArea = new TextArea(); 				//TextField 컨트롤 생성
		textArea.setPrefWidth(200);
		
		Label label = new Label();
		label.setPrefWidth(200);
		label.setText("레이블 출력");	
		label.setFont(new Font(20));
			
		Button btn1 = new Button("예제 12-1");
		Button btn2 = new Button("예제 12-2");
		Button btn3 = new Button("예제 12-5");	
		Button btn4 = new Button("예제 12-x4");
		Button btn5 = new Button("예제 12-x5");
		Button btn6 = new Button("예제 12-x6");

		Button btn7 = new Button("예제 12-x7");
		Button btn8 = new Button("예제 12-x8");

		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				message = "";				

				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}

				for(int i=0; i<5; i++) {
					System.out.println("띵");
					message = message + "띵 " + "\n";	
					try { Thread.sleep(500); } catch(Exception e) {}
				}

				textArea.setText(message);
			}
		});
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				message = "";
				
				//Runnable beepTask = new BeepTask();
				//Thread thread = new Thread(beepTask);
				
				//how2
				Thread thread = new Thread(new Runnable() {
					@Override
					public void run() {
						Toolkit toolkit = Toolkit.getDefaultToolkit();	
						for(int i=0; i<5; i++) {		
							toolkit.beep();
							try { Thread.sleep(500); } catch(Exception e) {}
						}
					}
				});
				
				//how3
				/*Thread thread = new Thread(() -> {
					Toolkit toolkit = Toolkit.getDefaultToolkit();	
					for(int i=0; i<5; i++) {		
						toolkit.beep();
						try { Thread.sleep(500); } catch(Exception e) {}
					}
				});*/
				
				thread.start();
				
				for(int i=0; i<5; i++) {
					System.out.println("띵");
					message = message + "띵" + "\n";	
					try { Thread.sleep(500); } catch(Exception e) {}
				}			
							
				textArea.setText(message);	

				
			}
		});		
		btn3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				message = "";
				for(int i=1; i<=10; i++) {
					Thread thread = new CalcThread("thread" + i);
					if(i != 10) {
						thread.setPriority(Thread.MIN_PRIORITY);
					} else {
						thread.setPriority(Thread.MAX_PRIORITY);
					}
					thread.start();
				}

			}
				
		});		
		btn4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {		
				
				try {
					message = "";
//					String data1 = "100";
//					String data2 = "a100";		// 문자열은 숫자로 변환할 수 없기 때문에 에러
					
					String data1 =textField.getText();
					String data2 =textField2.getText();
					
					int value1 = Integer.parseInt(data1);
					int value2 = Integer.parseInt(data2);
					
					int result = value1 + value2;
					System.out.println(data1 + "+" + data2 + "=" + result);
					message = message + data1 + "+" + data2 + "=" + result + "\n";
				} catch (Exception e) {
					System.out.println(e);
					message = message + e.toString() + "\n";
				}
							
				textArea.setText(message);	
				
			}
			
		});		
		btn5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Calculator calculator = new Calculator();
				
				User1 user1 = new User1(); //User1 스레드 생성
				user1.setCalculator(calculator); //공유 객체 설정
				user1.start(); //User1 스레드 시작
				
				User2 user2 = new User2(); //User2 스레드 생성
				user2.setCalculator(calculator); //공유 객체 설정
				user2.start(); //User2 스레드 시작
				
				message = "";

				message = message + "클래스가 존재하지 않습니다." + "\n";				
				textArea.setText(message);	
			}
			
		});	
		btn6.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Calculator2 calculator = new Calculator2();
				
				User1_1 user1 = new User1_1(); //User1 스레드 생성
				user1.setCalculator(calculator); //공유 객체 설정
				user1.start(); //User1 스레드 시작
				
				User2_2 user2 = new User2_2(); //User2 스레드 생성
				user2.setCalculator(calculator); //공유 객체 설정
				user2.start(); //User2 스레드 시작
				//message = "";

				//message = message + "과제." + "\n";				
				//textArea.setText(message);	
			}
			
		});		
		btn7.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
				statePrintThread.start();
			}
			
		});		
		btn8.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				message = "띵";
				
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=0; i<10; i++) {
					toolkit.beep();
					
					try {
						Thread.sleep(3000);
						System.out.println("띵");
						message = message + "띵 " + "\n";	
					} catch(InterruptedException e) {
						
					}
				}
				textArea.setText(message);
			}
			
		});	
		
		
		@SuppressWarnings("rawtypes")
		ObservableList list = root.getChildren();		//HBox의 ObservableList 얻기
		list.addAll(textField, textField2);				//TextField 컨트롤 배치
		root2.getChildren().addAll(btn1, btn2, btn3,  btn4);      //Button의 컨트롤 수평 배치
		list.add(root2);

		root3.getChildren().addAll(btn5, btn6, btn7,  btn8);      //Button의 컨트롤 수평 배치
		list.add(root3);

		
		list.add(textArea);	
		//list.add(label);
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("이한림");
		primaryStage.setScene(scene);

		primaryStage.show();
	}
	
	public static void main(String[] args) {
		argsTemp = args;
		launch(args);			//AppMain 객체 생성 및 메인 윈도우 생성
	}
}
