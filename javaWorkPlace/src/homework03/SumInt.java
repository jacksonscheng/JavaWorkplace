package homework03;

/**
 *  计算一个三位数整数各位的和
 * @author YourName
 */

import java.util.Scanner;
public class SumInt {
	public static void main(String[] args) {
		
		//1.提示用户输入数字
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入一个0到100000的整数:");
		int number=scanner.nextInt();
		
		//2.将该数字的个位提取出来
		int a=number%10; //余数为9，个位上的数
		number/=10; //number = 99

		//3.将该数字的十位提取出来
		int b=number%10; //余数为9，十位上的数
		number/=10; //number=9
		
		//4.将该数字的百位提取出来
		int c=number%10; 
		number/=10; 
		
		//5.将该数字的千位提取出来
		int d = number%10; 
		number/=10; 
		
		System.out.println(number);
		
		//5.将该数字的万位提取出来
		int e = number%10; 

		//5.将三个数字相加
		int sum = a+b+c+d+e;
		
		//6.输出和
		System.out.println("这个整数各位上数的和是： "+sum);
	
		scanner.close();
	}
}
