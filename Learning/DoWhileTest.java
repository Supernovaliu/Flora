class  DoWhileTest{
	public static void main(String[] args){
		int num = 1;
		int sum = 0;
		int count = 0;
		do
		{
			if(num%2==0){
				System.out.println(num);
				sum +=num;
				++count;
			}
			num++;
		}
		while (num<=100);

		System.out.println(sum);
		System.out.println(count);

        int number1 = 10;
		while(number1>10){
			System.out.println("hello:while");
			number1--;
		}

		int number2 = 10;
		do{
           System.out.println("hello:do-while");
		   number2--;
		}
		while (number2>10);
	}
}
