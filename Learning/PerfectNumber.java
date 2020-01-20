class PerfectNumber{
	public static void main(String[] args){
		
		
		for (int i=1;i<=1000 ;i++ )
		{
			int b = 0;
              for (int j=1;j<i ;j++ )
              {
				  
                  if (i%j==0)
                  {
					  b+=j;
					  
                  }
				   
              }
			  if(i ==b){
				System.out.println(i);
			  }
		}
	}
}
