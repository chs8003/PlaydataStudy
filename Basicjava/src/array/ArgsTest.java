package array;

public class ArgsTest {
	public static void main(String[] args) {
	System.out.println(args[0]);
	System.out.println(args[1]);
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	System.out.println(args.length);
	System.out.println(num1+num2);
	}
}
