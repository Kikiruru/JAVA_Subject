package Week10;

public class Car {
	public int speed;

	public void speedUp(){ //---1
		speed+=1;
	}

	public final void stop(){ //---2
		System.out.println("차를 멈춤");
		speed =0;
	}
}
