package duo_xian_cheng;

class MyThread extends Thread{
	public MyThread(String s){
		super(s);
	}
	public void run(){
		for(int i = 1;i <= 3;i++){
			System.out.println(getName()+"第"+i+"次运行");
			try{
				sleep((int)(Math.random()*10000
						));
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(getName()+"结束");
	}
}

public class TestThread {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("T1");
		MyThread t2 = new MyThread("T2");
		t1.start();
		t2.start();
		System.out.println("活动的线程数："+Thread.activeCount());
		System.out.println("main()运行完毕");
	}
}
