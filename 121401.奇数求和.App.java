package pac;

public class App {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 2147483647; i += 2) {
		sum += i;
		}
		System.out.println("1到100的奇数和为：" + sum);
	}
}

