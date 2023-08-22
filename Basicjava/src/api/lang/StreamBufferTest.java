package api.lang;

public class StreamBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		StringBuilder sb2 = new StringBuilder("java programming");
		System.out.println(sb);
		System.out.println(sb2);
		sb.append("ing");
		System.out.println(sb);
		sb.insert(2, "sevlet");
		System.out.println(sb);
	}

}
