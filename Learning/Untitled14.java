class  TernaryOperatorTest
{
	public static void main(String[] args) 
	{

     int m = 12;
	 int n = 5;

	 int max = (m>n)?m:n;


	System.out.println(max);

    String maxStr = (m>n)?"m��":(m==n)?"���":"n��";
	System.out.println(maxStr);
    
	int n1 = 12;
	int n2 = 30;
	int n3 = -43;
	int max1 = (n1>n2)?n1:n2;
	int max2 = (max1>n3)?max1:n3;
	System.out.println("�������е����ֵΪ��"+max2);
	}
}