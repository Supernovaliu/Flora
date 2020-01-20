//100以内所有质数的输出.从2开始到n-1结束，都不能被这个数本身整除
class PrimeNumberTest 
{
	public static void main(String[] args) {
		
		boolean isFlag = true;
		//标识i是否被j除尽过
	long start	= System.currentTimeMillis();//获取当前时间
		for (int i=2;i<=100000 ;i++ ){
			//boolean isFlag = true;
			//对本身是质数的自然数是有效的
			for (int j = 2;j<Math.sqrt(i) ;j++ ){//Math.sqrt()开方
				if(i%j==0){
				isFlag = false;
				break;//优化一：只对本身非质数的自然数有效
				}
			}

			if(isFlag ==true){
			System.out.println(i);
		}
		   isFlag = true;
		}
           long end = System.currentTimeMillis();
		   System.out.println(""+(end-start));
	}
}
