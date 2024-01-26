package JFx_prac;

import java.util.Calendar;

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

public class UI_event_handler extends Application{
	String message = "";

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		HBox root2 = new HBox();
		HBox root3 = new HBox();
		root.setPrefSize(550, 500); // 가로, 세로
		root.setPadding(new Insets(10, 10, 10, 10)); //안쪽 여백 설정
		
		root.setAlignment(Pos.CENTER); //컨트롤을 중앙으로 정렬
		root.setSpacing(20); //컨트롤 간의 수직 간격 설정
		
		root2.setSpacing(20); //컨트롤 간의 수평 간격 설정
		root2.setAlignment(Pos.CENTER); //버튼 정렬
		
		root3.setSpacing(20);
		root3.setAlignment(Pos.CENTER);
		
		TextField textField = new TextField(); //TextField 컨트롤 설정
		textField.setPrefWidth(50);
		
		TextField textField2 = new TextField();
		textField2.setPrefWidth(50);
		
		TextArea textArea = new TextArea(); //TextArea 컨트롤 설정
		textArea.setPrefWidth(50);
		textArea.setPrefHeight(500);
		textArea.setFont(new Font(15)); // 폰트 크기 설정
		
		Label label = new Label(); //Label 컨트롤 설정
		label.setPrefWidth(200);
		label.setText("레이블 출력"); //text 속성 설정
		label.setFont(new Font(20)); //font 속성 설정
		
		Button btn1 = new Button("크기 비교"); //Button 컨트롤 설정
		Button btn2 = new Button("문자 갯수 출력");
		Button btn3 = new Button("날짜 출력");
		Button btn4 = new Button("자동차 정보");
		Button btn5 = new Button("피자 나누기");
		Button btn6 = new Button("동물 정보");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() { //클릭 이벤트 처리 
			@Override
			public void handle(ActionEvent event) {
				String temp1 = textField.getText();
				boolean error = false;
				int num1 = 0;
				try {
					num1 = Integer.parseInt(temp1);
				} catch(NumberFormatException e) { // 숫자로 변환하지 못할 때
					error = true;
				}
				String temp2 = textField2.getText();
				int num2 = 0;
				try {
					num2 = Integer.parseInt(temp2);
				} catch(NumberFormatException e) {
					error = true;
				}
				boolean size;
				size = num1 >= num2 ? true : false;
				
				if(size)
					message = "첫번째 숫자가 더 크거나 같습니다.\n";
				else
					message = "두번째 숫자가 더 큽니다.\n";
				
				if(error)
					message = "잘못된 값을 입력하였습니다.";
				
				textArea.setText(message);
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String temp1 = textField.getText(); // 텍스트필드에서 문자열을 가져옴
				int num1 = temp1.length();
				
				String temp2 = textField2.getText();
				int num2 = temp2.length();
				
				if(num2 == 0)
					message = temp1 +" 문장의 문자 갯수는 "+ num1 +"개 입니다.\n";
				else if(num1 == 0)
					message = temp2 +" 문장의 문자 갯수는 "+ num2 +"개 입니다.\n";
				else
					message = temp1 +" 문장의 문자 갯수는 "+ num1 +"개 입니다.\n"+
							temp2 +" 문장의 문자 갯수는 "+ num2 +"개 입니다.\n";
				
				textArea.setText(message);
			}
		});
		
		btn3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Calendar cal = Calendar.getInstance();
				String meridiem;
				Week today = null;
				
				int year = cal.get(Calendar.YEAR); // 년
				int month = cal.get(Calendar.MONTH) + 1; // 월
				int day = cal.get(Calendar.DAY_OF_MONTH); // 일
				
				int week = cal.get(Calendar.DAY_OF_WEEK); // 요일
				
				int hour = cal.get(Calendar.HOUR); // 시간
				int minute = cal.get(Calendar.MINUTE); // 분
				
				if(hour >= 12)
					meridiem = "PM";
				else
					meridiem = "AM";
				
				switch(week) {
				case 1:
					today = Week.SUNDAY; break;
				case 2:
					today = Week.MONDAY; break;
				case 3:
					today = Week.TUESDAY; break;
				case 4:
					today = Week.WEDNESDAY; break;
				case 5:
					today = Week.THURSDAY; break;
				case 6:
					today = Week.FRIDAY; break;
				case 7:
					today = Week.SATURDAY; break;
				}
				
				//message = year +"-"+ month +"-"+ day +" ("+ today +") "+ meridiem +
				//		hour +":"+ minute +"\n";
				
				message = String.format("%d-%02d-%02d (%s) %s %02d:%02d\n", year, month, day,
						today, meridiem, hour, minute);
				
				textArea.setText(message);
			}
		});

		btn4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Car grandeur = new Car();
				
				textArea.setText(grandeur.toString());
			}
		});
		
		btn5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String temp1 = textField.getText();
				String temp2 = textField2.getText();
				Food food;
				boolean error = false;
				int num = 1;
				
				try {
					num = Integer.parseInt(temp2);
				} catch(NumberFormatException e) {
					if(temp2.equals(""))
						error = false;
					else
						error = true;
				}
				
				if(temp1.equals(""))
					temp1 = "피자";
				
				if(!error) {
					food = new Pizza(temp1, num);
					textArea.setText(food.eat());
				}
				else {
					textArea.setText("잘못된 값이 입력되었습니다.");
				}
			}
		});
		
		btn6.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String text1 = textField.getText();
				String text2 = textField2.getText();
				int num1;
				int num2; // 기준	값
				Animal animal;

				try {
					num1 = Integer.parseInt(text1);
				} catch(NumberFormatException e) { // 숫자로 변환하지 못할 때
					num1 = 0;
				}
				try {
					num2 = Integer.parseInt(text2);
				} catch(NumberFormatException e) { // 숫자로 변환하지 못할 때
					num2 = 0;
				}
				
				if(num2 == 0)
					num2 = num1;
				
				message = "잘못된 입력";
				
				switch(num2) {
				case 0:
					break;
				case 1:
					animal = new Cat();
					message = animal.info();
					break;
				case 2:
					animal = new Dog();
					message = animal.info();
				}
				
				textArea.setText(message);
			}
		});
		
		@SuppressWarnings("rawtypes")
		ObservableList list = root.getChildren(); //HBox의 ObservableList 얻기
		list.addAll(textField, textField2); // TextField 컨트롤 배치
		root2.getChildren().addAll(btn1, btn2, btn3); // Button의 컨트롤 수평 배치
		root3.getChildren().addAll(btn4, btn5, btn6);
		list.add(root2);
		list.add(root3);
		list.add(textArea); // TextArea 컨트롤 배치
		list.add(label); // Label 컨트롤 배치
		
		Scene scene = new Scene(root); // 화면의 루트 컨테이너로 HBox 지정
		
		primaryStage.setTitle("20185212_김대성"); // 윈도우 창 제목 설정
		primaryStage.setScene(scene); // 윈도우 창에 화면 설정
		
		primaryStage.show(); // 윈도우 창 보여주기
	}
	
	public static void main(String[] args) {
		System.out.println("크기 비교 버튼 : 첫번째 줄과 두번째 줄에 숫자를 입력하세요.");
		System.out.println("문자 갯수 출력 버튼 : 첫번째 줄 또는 두번째 줄에 문장을 입력하세요.");
		System.out.println("날짜 출력 : 현재의 날짜 및 시간을 출력합니다.");
		System.out.println("자동차 정보 : 차량의 정보 출력");
		System.out.println("피자 나누기: 첫번째 줄에 피자이름 두번째 나눌 인원 수를 입력하세요.");
		System.out.println("동물 정보 : 첫번째 줄과 두번째 줄에 알고 싶은 동물을 선택하세요");
		System.out.println("===================================================");
		System.out.println("*첫번째와 두번째 동시 입력시 두번째로 입력된 것이 적용됩니다");
		System.out.println("1: 고양이, 2: 개");
		launch(args);
	}
}
