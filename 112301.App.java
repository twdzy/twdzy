package pac;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		while (true) {
			int x = (int)(Math.random()*100);
			int y = (int)(Math.random()*100);
			Scanner scanner = new Scanner(System.in);
			String a = scanner.next();
			if(a.equals("a")){
				System.out.println(x+","+y);
			}else {
				System.out.println("没有这个坐标！");
			}
		}		
	}	
}
