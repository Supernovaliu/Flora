class  Practice2
{
	public static void main(String[] args) 
	{
		int a = 13;
		int b = 11;
		int c = 12;
		int d = (((a>b)?a:b)>c)?((a>b)?a:b):c;
	    System.out.println(d);
        
		if(a>b){
			int e = a;
			if (e>c)
			{
				System.out.println(a);
			}

		}else if(b>c){
			System.out.println(b);
		}else{
			System.out.println(c);
		}

		double a1 = 12.375;
		double b1 = 13.468;
		if (a1>10.0 && b1<20.0)
		{
			double c1 = a1+b1;
			System.out.println(c1);
		}else{
			double d1 = a1*b1;
			System.out.println(d1);
		}

		int a2 = 11;
		int b2 = 12;
		int temp = a2;
		    a2 = b2;
		    b2 = temp;
		System.out.println(a2+b2);
		System.out.println(b2);

		int temp2 = a2^b2;
		 b2 = temp2^b2;
		 a2 = temp2^a2;
		System.out.println(a2);
		System.out.println(b2);


	}
}
