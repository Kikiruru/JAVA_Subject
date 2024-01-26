package JFx_Week10;

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
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

@SuppressWarnings("unused")
public class UI_Exception02 extends Application{

	String message = "";
	static String argsTemp[]= {"","",""};

	@SuppressWarnings("unused")
	public static String changeDog(Animal animal) {
		String message2="";
		try {
			Dog dog = (Dog) animal; 	//ClassCastException 발생 가능
			message2 =  "Dog";
		} catch (Exception e) {
			System.out.println(e);
			message2 =  e.toString();
		}
		return message2;
	} 

	
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {

		VBox root = new VBox();
		HBox root2 = new HBox();
		HBox root3 = new HBox();
		root.setPrefSize(400, 350);
		root.setPadding(new Insets(10,10,10,10));        //안쪽 여백 설정

		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);	                         // 컨트롤 간의 수직 간격 설정
		root2.setSpacing(20);                            // 컨트롤 간의 수평 간격 설정
		root3.setSpacing(20); 
		
		TextField textField = new TextField(); 		//TextField 컨트롤 생성
		textField.setPrefWidth(50);	

		TextField textField2 = new TextField(); 		//TextField 컨트롤 생성
		textField.setPrefWidth(50);	

		TextArea textArea = new TextArea(); 		//TextField 컨트롤 생성
		textArea.setPrefWidth(200);
		
		Label label = new Label();
		label.setPrefWidth(200);
		label.setText("레이블 출력");	
		label.setFont(new Font(20));
			
		Button btn1 = new Button("예제 10-1");
		Button btn2 = new Button("예제 10-2");
		Button btn3 = new Button("예제 10-3");	
		Button btn4 = new Button("예제 10-4");
		Button btn5 = new Button("예제 10-5");
		Button btn6 = new Button("예제 10-6");

		Button btn7 = new Button("예제 10-7");
		Button btn8 = new Button("예제 10-8");

		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				message = "";				

				if(argsTemp.length == 2) {
					String data1 = argsTemp[0];
					String data2 = argsTemp[1];

					message = message + "args[0]: " + data1 + "\n";
					message = message + "args[1]: " + data2 + "\n";
				} else {

					message = message + "[실행 방법]" + "\n";
					message = message + "java  ArrayIndexOutOfBoundsExceptionExample  " + "\n";
					message = message + "값1  값2" + "\n";
				}	
				
				textArea.setText(message);
			}
		});
		

		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				message = "";
			
				Dog dog = new Dog();
				changeDog(dog);
				
				Cat cat = new Cat();
				changeDog(cat);	
				
				message = message + changeDog(dog) + "\n";	
			
				message = message + changeDog(cat) + "\n";				
				textArea.setText(message);				
			}
		});		
		
		
		btn3.setOnAction(new EventHandler<ActionEvent>() {
			@SuppressWarnings("null")
			@Override
			public void handle(ActionEvent event) {

				message = "";
	
				String data = null;
				try {
				System.out.println(data.toString());
				message = message + data.toString() + "\n";
				} catch (Exception e) {
					System.out.println(e);
				message = message + e.toString() + "\n";				
				textArea.setText(message);	
				}
			}		
		});		
		
		btn4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {		
				
				try {
					message = "";
//					String data1 = "100";
//					String data2 = "a100";	//문자열은 숫자로 변환할 수 없음
					
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

				message = "";

				
				try {
					@SuppressWarnings({ "rawtypes", "unused" })
					Class clazz = Class.forName("java.lang.String2");
					message = message + "클래스 명: java.lang.String2" + "\n";
					//Class clazz = Class.forName("java.lang.String");
				} catch(ClassNotFoundException e) {
					System.out.println("클래스가 존재하지 않습니다.");
					message = message + "클래스가 존재하지 않습니다." + "\n";				
					textArea.setText(message);	

					
				}
				
			}
			
		});	
		
		btn6.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String data1 = null;
				String data2 = null;
				String[] arr = new String[2];
				
				message = "";
				
				arr[0] = textField.getText();
				arr[1] = textField2.getText();
				
				try {
					data1 = arr[0];
					data2 = arr[1];
					if(arr[0].equals("") || arr[1].equals(""))
						data2 = arr[2];
					
					int value1 = Integer.parseInt(data1);
					int value2 = Integer.parseInt(data2);
					int result = value1 + value2;
					message += data1 +"+"+ data2 +"=" + result +"\n";
				} catch(ArrayIndexOutOfBoundsException e) {
					message += "실행 매개값의 수가 부족합니다.\n";
					message += "[실행방법]\n";
					message += "java TryCatchFinallyRuntimeExceptionExample num1 num2\n";
				} catch(NumberFormatException e) {
					message += "숫자로 변환할 수 없습니다.\n";
				} finally {
					message += "다시 실행하세요.";
				}			
					textArea.setText(message);	
			}
		});		

		
		btn7.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String[] args = new String[2];
				args[0] = textField.getText();
				args[1] = textField2.getText();
				
				message = "";
				
				try {
					String data1 = args[0];
					String data2 = args[1];
					if(args[0].equals("") || args[1].equals(""))
						data2 = args[2];
					
					int value1 = Integer.parseInt(data1);
					int value2 = Integer.parseInt(data2);
					int result = value1 + value2;
					
					message += data1 + "+" + data2 + "=" + result +"\n";
				} catch (ArrayIndexOutOfBoundsException e) {
					message += "실행 매개값의 수가 부족합니다.\n";
				} catch (Exception e) {
					message += "실행에 문제가 있습니다.\n";
				} finally {
					message += "다시 실행하세요.\n";
				}
							
				textArea.setText(message);				
			}
			
		});		

		btn8.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String[] args = new String[2];
				args[0] = textField.getText();
				args[1] = textField2.getText();
				
				message = "";

				try {
					String data1 = args[0];
					String data2 = args[1];
					if(args[0].equals("") || args[1].equals(""))
						data2 = args[2];
					
					int value1 = Integer.parseInt(data1);
					int value2 = Integer.parseInt(data2);
					int result = value1 + value2;
					message += data1 +"+"+ data2 +"="+ result +"\n";
				} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
					message += "실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다..\n";
				} catch (Exception e) {
					message += "알수 없은 예외 발생\n";
				} finally {
					message += "다시 실행하세요.\n";
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
		
		primaryStage.setTitle("20185212_김대성");
		primaryStage.setScene(scene);

		primaryStage.show();
	}
	
	public static void main(String[] args) {
		argsTemp = args;
		launch(args);			//AppMain 객체 생성 및 메인 윈도우 생성
	}

}
