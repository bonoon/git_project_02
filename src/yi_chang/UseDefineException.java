package yi_chang;


class ArgumentOutOfBoundException extends Exception{
	ArgumentOutOfBoundException(){
		System.out.println("�������!���жϵ��������Ǹ���!");
	}
}

public class UseDefineException {

	public static boolean prime(int n)throws ArgumentOutOfBoundException{
		if(n < 0){
			throw new ArgumentOutOfBoundException();
		}
		else{
			boolean isPrime = true;
			for(int i = 2;i < n;i++)
				if(n % i ==0){
					isPrime = false;
					break;
				}
			return isPrime;
		}
	}
	public static void main(String[] args)  {
		
		if(args.length != 1){
			System.out.println("�����ʽ����!�밴�մ˸�ʽ����:java UseDefineException m");
			System.exit(0);
			
		}
		int m = Integer.parseInt(args[0]);
		
		try{
			boolean result = prime(m);
			System.out.println("�������������"+m+"�Ƿ�Ϊ�������ж���:"+result);
		}
		catch(ArgumentOutOfBoundException e){
			System.out.println("�쳣����:"+e.toString());
		}
		
	}
}
