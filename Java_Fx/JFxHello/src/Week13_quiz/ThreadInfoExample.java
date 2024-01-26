package Week13_quiz;

import java.util.*;

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces(); // 프로세스에서 실행되는
		Set<Thread> threads = map.keySet(); // 모든 Thread를 가져오는 코드
		for (Thread thread : threads) {
			System.out.println("Name: " + thread.getName() + ((thread.isDaemon()) ? "(데몬)" : "(주)"));
			System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}