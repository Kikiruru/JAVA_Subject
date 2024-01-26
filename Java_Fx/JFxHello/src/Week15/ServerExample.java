package Week15;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(); // ServerSocket 생성
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			while (true) { // 127.0.0.1
				System.out.println("[연결 기다림]");
				// 외부 서버 접속시 IP
				Socket socket = serverSocket.accept(); // 클라이언트 연결 수락/ 새로운 소켓 생성
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName()); // 클라이언트 IP 출력 i=i +1;
			}
		} catch (Exception e) {
		}
		if (!serverSocket.isClosed()) { // ServerSocket이 닫혀있지 않은 경우
			try {
				serverSocket.close();// ServerSocket 닫기
			} catch (IOException e1) {
			}
		}
	}
}
