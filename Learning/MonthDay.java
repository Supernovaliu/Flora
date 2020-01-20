import java.util.Scanner;
class  MonthDay
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = scan.nextInt();
		int year = scan.nextInt();
		int sumDays = 0;
		int run = year%400;
		/*if(month==1){
			sumDays = day;
		}else if*/
      if(run!=0){
		switch(month){
			case 12:
                sumDays+=30;
			case 11:
                sumDays+=31;
			case 10:
			    sumDays+=30;
			case 9:
			    sumDays+=31;
			case 8:
		        sumDays+=31;
			case 7:
			    sumDays+=30;
			case 6:
			    sumDays+=31;
			case 5:
			    sumDays+=30;
			case 4:
			    sumDays+=31;
			case 3:
			    sumDays+=28;
			case 2:
			    sumDays+=31;
			case 1:
				sumDays +=day;
		}
		System.out.println(year+""+month+"month"+day+"sumDay"+sumDays+"day");
	  }else{
		switch(month){
			case 12:
                sumDays+=30;
			case 11:
                sumDays+=31;
			case 10:
			    sumDays+=30;
			case 9:
			    sumDays+=31;
			case 8:
		        sumDays+=31;
			case 7:
			    sumDays+=30;
			case 6:
			    sumDays+=31;
			case 5:
			    sumDays+=30;
			case 4:
			    sumDays+=31;
			case 3:
			    sumDays+=29;
			case 2:
			    sumDays+=31;
			case 1:
				sumDays +=day;
		}
		System.out.println(year+""+month+"month"+day+"sumDay"+sumDays+"day");
	  }
	}
}
