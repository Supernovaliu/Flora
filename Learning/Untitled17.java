import java.util.Scanner;
class ScannerTest 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
		String name = scan.next();
		System.out.println(name);

		
        System.out.println("请输入你的芳龄：");
		int age = scan.nextInt();
		System.out.println(age);

		
        System.out.println("请输入你的体重：");
		double Weight = scan.nextDouble();
		System.out.println(Weight);

		
        System.out.println("你是否相中我了呢？（TRUE/FALSE）");
		boolean isLove = scan.nextBoolean();
		System.out.println(isLove);

		System.out.println("请输入你的性别：（男/女）");
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);


	}
}
