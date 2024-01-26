package Week12;

public class exam2 {
	public static void main(String[] args) { 
		Thread movie_thread = new Thread() {
			@Override
			public void run() {
				int i=0;
				while(true){
					System.out.println(i++ + ") 동영상을 재생합니다.");
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						break;
					}
				}
			}
		};
        movie_thread.setDaemon(true);                                  
		movie_thread.start();
		try {
			Thread.sleep(3000);  
	} catch (InterruptedException e) {
		}
		System.out.println("메인 스레드 종료");
	}
}

