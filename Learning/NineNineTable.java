class NineNineTable 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=9 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				int a = i*j;
				System.out.print(i+"*"+j+"="+a);
			}
			System.out.println();
		}
	}
}
