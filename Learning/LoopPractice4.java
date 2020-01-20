import   java.util.Scanner;
    class  LoopPractice4

         
		 {    public static void main(String[] args){
           Scanner scan = new Scanner(System.in);
             int m = scan.nextInt();
                   int n = scan.nextInt();
                   int min = (m>=n)?n:m;
             
                   for(int i = min;i >=1;i--){
                      if(m%i==0&&n%i==0){
                          System.out.println(i); 
                            break;  
            }
         }
                    int max = (m>=n)?m:n;
                    for(int i = max;i<=m*n;i++){
                         if(i%m==0&&i%n==0){
                            System.out.println(i);
                             break;
						 }
}
}
}