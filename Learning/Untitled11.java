class  LogicTest 
{
	public static void main(String[] args) 
	{
		boolean b1 = true;
		b1 = false;
		int num1 = 10;
		if(b1 & (num1++ >0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
         System.out.println("num1="+num1);


	    boolean b2 = true;
		b2 = false;
		int num2 = 10;
		if(b1 && (num2++ >0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
         System.out.println("num2="+num2);



		


	}
}
