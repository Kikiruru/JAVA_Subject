package JFx_Week13;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.collections.ObservableList;
import java.util.StringTokenizer;

public class UI_13Week02 extends Application{

	static String message = "";
	static String messageSend = "";

	
	static String cmdHelp() {
		messageSend="";
		messageSend= messageSend + "help(h)" +"\n";
		messageSend= messageSend + "hl1(자기소개)" +"\n";
		messageSend= messageSend + "hl2(여행)" +"\n";
		messageSend= messageSend + "hl3(연예인)" +"\n";
		messageSend= messageSend + "hl4(운동선수)" +"\n";	
		messageSend= messageSend + "9-1(ex9-1)" +"\n";
		messageSend= messageSend + "9-2(ex9-2)" +"\n";
		messageSend= messageSend + "7-2(ex7-2)" +"\n";
		messageSend= messageSend + "7-3(ex7-3)" +"\n";
		messageSend= messageSend + "6-19(ex6-19)" +"\n";
		messageSend= messageSend + "5-9(ex5-9)" +"\n";
		return messageSend;
		}

	 static String cmdhl1(){
		 messageSend="";
		 messageSend= messageSend + "스마트IoT 3학년 김대성입니다." +"\n";
		 messageSend= messageSend + "취미는 게임 입니다." +"\n";
		 return messageSend;
		 }
	 static String cmdhl2(){
		 messageSend="";
		 messageSend= messageSend + "여행 가고 싶은 지역은" +"\n";
		 messageSend= messageSend + "미국 입니다." +"\n";
		 return messageSend;
		 }
	 static String cmdhl3(){
		 messageSend="";
		 messageSend= messageSend + "좋아하는 연예인은" +"\n";
		 messageSend= messageSend + "아이유 입니다." +"\n";
		 return messageSend;
		 }
	 static String cmdhl4(){
		 messageSend="";
		 messageSend= messageSend + "좋아하는 운동선수는" +"\n";
		 messageSend= messageSend + "김동현 입니다." +"\n";
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
	 
	 static String cmdEx7_2() {
		 messageSend = "";
		 Student student = new Student("홍길동", "123456-1234567", 1);
		 messageSend += "name : "+ student.name +"\n";
		 messageSend += "ssn : "+ student.ssn +"\n";
		 messageSend += "studentNo : "+ student.studentNo +"\n";
		 
		 return messageSend;
	 }
	 
	 static String cmdEx7_3() {
		 messageSend = "";
		 int r = 10;
		 
		 Calculator calculator = new Calculator();
		 messageSend += "원면적 : "+ calculator.areaCircle(r) +"\n";
		 
		 Computer computer = new Computer();
		 messageSend += "원면적 : "+ computer.areaCircle(r) +"\n";
		 
		 return messageSend;
	 }
	 
	 static String cmdEx6_19() {
		 messageSend = "";
		 messageSend += "지구의 반지름: "+ Earth.EARTH_RADIUS +" km\n";
		 messageSend += "지구의 표면적: "+ Earth.EARTH_SURFACE_AREA +" km^2\n";
		 return messageSend;
	 }
	 
	 static String cmdEx5_9() {
		 messageSend = "";
		 int[] oldIntArray = {1, 2, 3};
		 int[] newIntArray = new int[5];
		 
		 for(int i = 0; i < oldIntArray.length; i++) {
			 newIntArray[i] = oldIntArray[i];
		 }
		 
		 for(int i = 0; i < newIntArray.length; i++) {
			 messageSend += newIntArray[i] +", ";
		 }
		 
		 return messageSend;
	 }
	 
	static String cmdBadCommand() {
		 messageSend="";
		 messageSend= messageSend + "Bad Command..." +"\n";
		 return messageSend;
		}

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {

		VBox root = new VBox();
		HBox root2 = new HBox();
		HBox root3 = new HBox();
		HBox root4 = new HBox();

		root.setPrefSize(500, 300);
		root.setPadding(new Insets(10,10,10,10));        //안쪽 여백 설정

		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);	                         // 컨트롤 간의 수직 간격 설정
		root2.setSpacing(20);                            // 컨트롤 간의 수평 간격 설정
		root3.setSpacing(20); 
		root4.setSpacing(20); 

		TextArea textArea = new TextArea(); 		//TextArea 컨트롤 생성
		textArea.setPrefWidth(300);
		textArea.setPrefHeight(200);
		
		TextField textField = new TextField(); 		//TextField 컨트롤 생성
		textField.setPrefWidth(200);
			
		Button btn1 = new Button("자기소개");
		Button btn2 = new Button("여행");
		Button btn3 = new Button("연예인");	
		Button btn4 = new Button("운동선수");	
		Button btn5 = new Button("예제 9-1");	
		Button btn6 = new Button("예제 9-2");
		Button btn7 = new Button("예제 7-2");
		Button btn8 = new Button("예제 7-3");
		Button btn9 = new Button("예제 6-19");
		Button btnx = new Button("예제 5-9");
		Button btnInput = new Button("입력");

		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				message="";
				message = message + cmdhl1() + "\n";
				textArea.setText(message);
			}
		});
		
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				message="";
				message = message + cmdhl2() + "\n";
				textArea.setText(message);
			}
		});		

		
		btn3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				message="";
				message = message + cmdhl3() + "\n";
				textArea.setText(message);
				
			}
		});		
		
		
		btn4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				message="";
				message = message + cmdhl4() + "\n";
				textArea.setText(message);
				}
				
		});		
		
		btn5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				message="";
				message = message + cmdEx9_1() + "\n";
				textArea.setText(message);	
				}
				
		});		
		
		btn6.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				message="";
				message = message + cmdEx9_2() + "\n";
				textArea.setText(message);	
				}
				
		});
		
		btn7.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				message="";
				message = message + cmdEx7_2() + "\n";
				textArea.setText(message);	
				}
				
		});
		
		btn8.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				message="";
				message = message + cmdEx7_3() + "\n";
				textArea.setText(message);	
				}
				
		});
		
		btn9.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				message="";
				message = message + cmdEx6_19() + "\n";
				textArea.setText(message);	
				}
				
		});
		
		btnx.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				message="";
				message = message + cmdEx5_9() + "\n";
				textArea.setText(message);	
				}
				
		});

		btnInput.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				String messageResult = "";

				String cmdLine =textField.getText();

				StringTokenizer tokens = new StringTokenizer(cmdLine.trim());

				String cmd = null;
				@SuppressWarnings("unused")
				String arg1 = null;
				@SuppressWarnings("unused")
				String arg2 = null;

				if(tokens.hasMoreTokens()) {  
					cmd = tokens.nextToken();

					if(tokens.hasMoreTokens()) {
						arg1 = tokens.nextToken();
					}
					if(tokens.hasMoreTokens()) {
						arg2 = tokens.nextToken();
					}
				} else {
					messageResult = cmdBadCommand();
				}


				if((cmd.equals("help")) ||cmd.equals("h")){ messageResult =cmdHelp(); 
				}else if((cmd.equals("hl1")) ||cmd.equals("자기소개")){ messageResult =cmdhl1(); 
				}else if((cmd.equals("hl2")) ||cmd.equals("여행")){ messageResult =cmdhl2(); 
				}else if((cmd.equals("hl3")) ||cmd.equals("연예인")){ messageResult =cmdhl3(); 
				}else if((cmd.equals("hl4")) ||cmd.equals("운동선수")){ messageResult =cmdhl4(); 
				}else if((cmd.equals("ex9-1")) ||cmd.equals("9-1")) {messageResult =cmdEx9_1();
				}else if((cmd.equals("ex9-2")) ||cmd.equals("9-2")) {messageResult =cmdEx9_2();
				}else if((cmd.equals("ex7-2")) ||cmd.equals("7-2")) {messageResult =cmdEx7_2();
				}else if((cmd.equals("ex7-3")) ||cmd.equals("7-3")) {messageResult =cmdEx7_3();
				}else if((cmd.equals("ex6-19")) ||cmd.equals("6-19")) {messageResult =cmdEx6_19();
				}else if((cmd.equals("ex5-9")) ||cmd.equals("5-9")) {messageResult =cmdEx5_9();
				}else {
					 messageResult =cmdBadCommand();
				}
				
				textArea.setText(messageResult);	
				}
				
		});	
	
		
		@SuppressWarnings("rawtypes")
		ObservableList list = root.getChildren();	    //HBox의 ObservableList 얻기

		root2.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);      //Button의 컨트롤 수평 배치
		root3.getChildren().addAll(btn6, btn7, btn8, btn9, btnx);
		root4.getChildren().addAll(textField, btnInput);
		list.add(root2);
		list.add(root3);
		list.add(root4);
		list.add(textArea);	
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("김대성_20185212");
		primaryStage.setScene(scene);

		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);			//AppMain 객체 생성 및 메인 윈도우 생성

	}

}
