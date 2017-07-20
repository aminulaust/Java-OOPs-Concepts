
public class MyThreadRunnable implements Runnable{
	public static void main(String[] args) {
		
		Thread t1= new Thread (new MyThreadRunnable());
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<20;i++){
			System.out.println("Printing..."+i*5);
		
		}
	}

	
}
