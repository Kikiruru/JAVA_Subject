package Week09;

public class Car5 {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas()	{ // ㄱ
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() { // ㄴ
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:"+ gas +")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:"+ gas + ")");
				return;
			}
		}
	}
}
