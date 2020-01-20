import java.util.Scanner;
class  DogAge
{
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	double age = scan.nextDouble();
	if (age<=0)
	{
		System.out.println("wrong!");
	}
	  else if (age<=2)
	{
		double humanAge1 = age*10.5;
		System.out.println("my dog age is:"+humanAge1);
	}else{
		double humanAge2 = 21+(age-2)*4;
		System.out.println("my dog age is:"+humanAge2);
	}
	}
}
