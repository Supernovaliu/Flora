import java.util.Scanner;
class ScannerTest 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("���������������");
		String name = scan.next();
		System.out.println(name);

		
        System.out.println("��������ķ��䣺");
		int age = scan.nextInt();
		System.out.println(age);

		
        System.out.println("������������أ�");
		double Weight = scan.nextDouble();
		System.out.println(Weight);

		
        System.out.println("���Ƿ����������أ���TRUE/FALSE��");
		boolean isLove = scan.nextBoolean();
		System.out.println(isLove);

		System.out.println("����������Ա𣺣���/Ů��");
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);


	}
}
