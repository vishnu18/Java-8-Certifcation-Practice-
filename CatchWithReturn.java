
public class CatchWithReturn {
public static void main(String[] args) {
	System.out.println(calculate());
	
}
@SuppressWarnings("finally")
public static int calculate() {
	try {
		return 10/0;
	}
	catch(ArithmeticException e){
		System.out.println("error");
		//System.exit(0);
		return 1;
	}finally {
		System.out.println("Finally");
		return 0;
	}
}
}
