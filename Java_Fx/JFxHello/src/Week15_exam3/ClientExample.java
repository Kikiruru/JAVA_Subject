package Week15_exam3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();// 클라이언트 소켓 생성
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001)); // 서버의 IP 주소와 포트번호
			System.out.println("[연결 성공]");
			byte[] bytes = null;
			String message = null;
			// 데이터 보내기
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";// 서버로 전송할 데이터
			bytes = message.getBytes("UTF-8");
			os.write(bytes);// 데이터 보내기
			os.flush();
			System.out.println("[데이터 보내기 성공]");// 데이터 받기
			InputStream is = socket.getInputStream();
			bytes = new byte[100];// 수신 버퍼 크기 설정
			int readByteCount = is.read(bytes);// 데이터 받기
			message = new String(bytes, 0, readByteCount, "UTF-8");// 문자열로 변환
			System.out.println("[데이터 받기 성공]: " + message);
			os.close();
			is.close();

		} catch (Exception e) {
		}
		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e1) {
			}
		}
	}
}
