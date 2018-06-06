
public class DealingWithException {
public static void main(String[] args) {
	int a=0;
	int b=0;
	try{
		int result=divide(a,b);
	System.out.println(result);
	}catch(ArithmeticException e) {
		
		System.out.println("Error Dividing Zero "+e.getMessage());
	}
	
}
private static int divide(int a, int b) {
	return a/b;
}
}
