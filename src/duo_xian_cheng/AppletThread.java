package duo_xian_cheng;

class Thread1 extends Thread{
	Object dummy;
	public Thread1(Object s){
		dummy = s;
		System.out.println("Thread1 is constructed");
	}
	public void run(){
		while(true){
		try{
			System.out.println("Thread1 start");
			System.out.println("Thread1 waits for Thread2 to notify it");
			synchronized (dummy) {
			   
			   dummy.notify();
			   dummy.wait();	
			}
			System.out.println("Thread1 is wakened up by Thread2");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}}
}

class Thread2 extends Thread{
	Object dummy;
	public Thread2(Object s){
		dummy = s;
		System.out.println("Thread2 is constructed");
	}
	public void run(){
		while(true){
		try{
			System.out.println("Thread2 is start");
			sleep(1000);
			synchronized (dummy) {
				
				dummy.notify();	    //唤醒处于等待dummy状态的线程
				dummy.wait(); 
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}}
}

public class AppletThread{
	public static void main(String[] args) {
		Object dummy = new Object();
		Thread1 t1 = new Thread1(dummy);
		Thread2 t2 = new Thread2(dummy);
		t1.start();
		t2.start();
	}
}