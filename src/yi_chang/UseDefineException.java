package yi_chang;


class ArgumentOutOfBoundException extends Exception{
	ArgumentOutOfBoundException(){
		System.out.println("输入错误!欲判断的数不能是负数!");
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
			System.out.println("输入格式错误!请按照此格式输入:java UseDefineException m");
			System.exit(0);
			
		}
		int m = Integer.parseInt(args[0]);
		
		try{
			boolean result = prime(m);
			System.out.println("对您输入的整数"+m+"是否为素数的判断是:"+result);
		}
		catch(ArgumentOutOfBoundException e){
			System.out.println("异常名称:"+e.toString());
		}
		
	}
}
