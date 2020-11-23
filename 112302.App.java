package pac;
import java.util.Scanner;
public class App {
	public static void main(String[] args) throws InterruptedException {
		int a[][]={
				{7,8},
				{11,12},
				{111,222},
				{333,444},
		};
		while (true){
			Thread.sleep(1000);
			System.out.println("一秒已经过去了");
			int r=(int)(Math.random()*10%4);
			System.out.println(a[r][0]+","+a[r][1]);
		}
	}	
}
