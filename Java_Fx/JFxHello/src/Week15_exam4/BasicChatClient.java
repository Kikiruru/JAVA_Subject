package Week15_exam4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class BasicChatClient extends Application {
   Socket socket;
   
   void startClient() {
      Thread thread = new Thread() {
         @Override
         public void run() {
            try {
               socket = new Socket();
               //socket.connect(new InetSocketAddress("10.50.240.140", 5001));
               socket.connect(new InetSocketAddress("localhost", 5001));
               Platform.runLater(()->{
                  displayText("[연결 완료: "  + socket.getRemoteSocketAddress() + "]");
                  btnConn.setText("stop");
                    btnSend.setDisable(false);
               });
            } catch(Exception e) {
               Platform.runLater(()->displayText("[서버 통신 안됨]"));
               if(!socket.isClosed()) { stopClient(); }
               return;
            }
            receive();
         }
      };
      thread.start();
   }
   
   void stopClient() {
      try {
         Platform.runLater(()->{
            displayText("[연결 끊음]");
            btnConn.setText("start");
            btnSend.setDisable(true);
         });
         if(socket!=null && !socket.isClosed()) {
            socket.close();
         }
      } catch (IOException e) {}
   }   
   
   void receive() {      // 메시지를 수신하는 메소드
      while(true) {
         try {
            byte[] byteArr = new byte[100];
            InputStream inputStream = socket.getInputStream();
            
            //서버가 비정상적으로 종료했을 경우 IOException 발생
            int readByteCount = inputStream.read(byteArr);
            
            //서버가 정상적으로 Socket의 close()를 호출했을 경우
            if(readByteCount == -1) { throw new IOException(); }
            
            String data = new String(byteArr, 0, readByteCount, "UTF-8");// 수신한 데이터
            
            Platform.runLater(()->displayText("- "  + data)); // 수신한 데이터 화면에 출력
         } catch (Exception e) {
            Platform.runLater(()->displayText("[서버 통신 안됨]"));
            stopClient();
            break;
         }
      }
   }
   
   void send(String data) {      // 메시지를 전송하는 메소드
      Thread thread = new Thread() {
         @Override
         public void run() {
            try {      
               byte[] byteArr = data.getBytes("UTF-8");
               OutputStream outputStream = socket.getOutputStream();
               outputStream.write(byteArr);
               outputStream.flush();
               Platform.runLater(()->displayText("--"));
            } catch(Exception e) {
               Platform.runLater(()->displayText("[서버 통신 안됨]"));
               stopClient();
            }            
         }
      };
      thread.start();
   }
   
   //////////////////////////////////////////////////////
   TextArea txtDisplay;
   TextField txtInput,txtNameLabel, txtName;
   Button btnConn, btnSend;
   
   @Override
   public void start(Stage primaryStage) throws Exception {
      BorderPane root = new BorderPane();
      root.setPrefSize(500, 300);
      
      txtDisplay = new TextArea();
      txtDisplay.setEditable(false);
      BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));
      root.setCenter(txtDisplay);
      
      BorderPane bottom = new BorderPane();
      BorderPane top = new BorderPane();

         txtInput = new TextField();      // 메시지를 입력하는 텍스트필드 만들기
// 삭제   1      txtInput.setPrefSize(60, 30);
         txtInput.setPrefSize(35, 30);
// 추가 2         
         txtNameLabel = new TextField("이름 "); 
         txtNameLabel.setPrefSize(60, 30);
         
         txtName = new TextField();      // 이름을 추가하는 텍스트필드 만들기
         txtName.setPrefSize(20, 30);
// 추가 2 끝         
         BorderPane.setMargin(txtInput, new Insets(0,1,1,1));
         
         btnConn = new Button("start");
         btnConn.setPrefSize(60, 30);
         btnConn.setOnAction(e->{
            if(btnConn.getText().equals("start")) {
               startClient();
            } else if(btnConn.getText().equals("stop")){
               stopClient();
            }
         });
         
         btnSend = new Button("send"); 
         btnSend.setPrefSize(60, 30);
         btnSend.setDisable(true);

// 수정 3 - 이름과 메시지 전송
         btnSend.setOnAction(e->send(txtName.getText() + ":  " + txtInput.getText()));
         
         top.setLeft(txtNameLabel);
         top.setCenter(txtName);
         
         bottom.setCenter(txtInput);
         bottom.setLeft(btnConn);
         bottom.setRight(btnSend);
         
      root.setBottom(bottom);
      root.setTop(top);
      
      Scene scene = new Scene(root);
      scene.getStylesheets().add(getClass().getResource("application.css").toString());
      primaryStage.setScene(scene);
      primaryStage.setTitle("Client");
      primaryStage.setOnCloseRequest(event->stopClient());
      primaryStage.show();
   }
   
   void displayText(String text) {
      txtDisplay.appendText(text + "\n");
   }   
   
   public static void main(String[] args) {
      launch(args);
   }
}
