package duo_xian_cheng;

class MyThread extends Thread{
	public MyThread(String s){
		super(s);
	}
	public void run(){
		for(int i = 1;i <= 3;i++){
			System.out.println(getName()+"��"+i+"������");
			try{
				sleep((int)(Math.random()*10000
						));
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(getName()+"����");
	}
}

public class TestThread {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("T1");
		MyThread t2 = new MyThread("T2");
		t1.start();
		t2.start();
		System.out.println("����߳�����"+Thread.activeCount());
		System.out.println("main()�������");
	}
}
