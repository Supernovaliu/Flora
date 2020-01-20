
/**

@author flora
@version v13.0
This is my first Java application

*/
public class  HelloJava{
	
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
	}
}
/*
1.JAVA程序编写-编译-运行的过程
编写：以‘.java’结尾的源文件
编译：使用javac.exe命令编译我们的java源文件  javac 源文件名.java
运行：使用java.exe命令解释运行我们的字节码文件 java 类名
在一个Java源文件中可以声明多个类，但是，只能最多有一个类声明为public
public只能声明和文件名同名的类上
程序的入口是main()方法，格式是固定的。
输出语句：
System.out.println():先输出数据，然后换行
System.out.print():
每一行执行语句都以‘；’结束
编译的过程：编译后会生成一个或多个字节码文件，字节码文件的文件名与java源文件中的类名相同，只能运行包含main函数的类
*/