package Week12;

public class exam1 {
	public static void main(String[] args) { 
		Thread movie_thread = new Thread() {
			@Override
			public void run() {
				int i=0;
				while(true){
					System.out.println(i++ + ") 동영상을 재생합니다.");
					if(this.isInterrupted())
						break;                 
				}
				System.out.println("자원 정리");
				System.out.println("실행 종료");
			}
		};
		movie_thread.start();
		try {
			Thread.sleep(1000);  
	} catch (InterruptedException e) {
		}
		movie_thread.interrupt();    // interrupt() 메소드를 호출하여 movie_thread 스레드 즉시 종료
		System.out.println("메인 스레드 종료");
	}
}

