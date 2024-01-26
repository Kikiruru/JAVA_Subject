package Week15_exam3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); // IP주소와 포트번호 연결
			while (true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
				byte[] bytes = null;
				String message = null;
				// 데이터 받기
				InputStream is = socket.getInputStream();
				bytes = new byte[100];// 수신 버퍼 크기 설정

				int readByteCount = is.read(bytes); // 데이터 받기
				message = new String(bytes, 0, readByteCount, "UTF-8"); // 문자열로 변환
				System.out.println("[데이터 받기 성공]: " + message);// 문자열 출력
				// 데이터 보내기
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";// 클라이언트로 전송할 데이터
				bytes = message.getBytes("UTF-8");
				os.write(bytes);// 데이터 보내기
				os.flush();
				System.out.println("[데이터 보내기 성공]");
				is.close();
				os.close();
				socket.close();
			}
		} catch (Exception e) {
		}
		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e1) {
			}
		}
	}
}
