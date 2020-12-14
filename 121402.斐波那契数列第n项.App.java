package pac;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		int n,fn;
		System.out.println("输入一个整数n，取值区间：(1<=n<=40)。");
		Scanner s = new Scanner(System.in);
			n=s.nextInt();
			fn=function(n);
			if(n>=1 && n<=40){
				System.out.println("斐波那契数列第"+n+"项为："+fn);
			}else {
				System.out.println("超出范围");
			}
			
		}
		public static int function(int n){
		if(n==1 || n==2) return 1;
		return function(n-1)+function(n-2);
		}
		
}
