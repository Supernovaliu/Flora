import java.util.Scanner;
class  Gambling
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int randomNumber = (int)(Math.random()*90+10);
		int inputNumber = scan.nextInt();
		int a1 = randomNumber%10;
		int b1 = randomNumber/10;
		int a2 = inputNumber%10;
		int b2 = inputNumber/10;
		if (randomNumber == inputNumber)
		{
			System.out.println("Award $10000!"+randomNumber);
		}else if(a1==b2&&b1==a2){
			System.out.println("Award $3000!"+randomNumber);
			
		}else if(a1==a2||b1==b2){
			System.out.println("Award $1000!"+randomNumber);
			
		}else if(a1==a2||a1==b2||b1==a2||b1==b2){
			System.out.println("Award $500"+randomNumber);
			
		}else{
			System.out.println("No Award!"+randomNumber);
		}
	}
}
