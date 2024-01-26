package Week15;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001)); // 외부서버 IP 주소
			System.out.println("[연결 성공]");
		} catch (Exception e) {
		}
		if (!socket.isClosed()) {// 연결되어 있을 경우
			try {
				socket.close();// 연결 끊기
			} catch (IOException e1) {
			}
		}
	}
}
