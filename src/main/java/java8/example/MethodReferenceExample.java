package java8.example;

public class MethodReferenceExample {

	public static void main(String[] args) {
		printMethodName();
		execPrinter(MethodReferenceExample::printMessage, "ほげえええええええええええええ");
	}
	// 呼び出しメソッド名を表示
	public static void printMethodName() {
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println(methodName);
	}

	private static void execPrinter(Printer printer, String str) {
		printMethodName();
		printer.print(str);
	}

	// メソッド参照の参照先
	static void printMessage(String msg) {
		printMethodName();
		System.out.println(msg);
	}

	// interface
	@FunctionalInterface
	interface Printer {
		public void print(String msg);
	}
}
