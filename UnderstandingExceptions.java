
public class UnderstandingExceptions {
	public static void main(String[] args) throws Exception {
		int[] array=new int[2];
		//mymethod(); 
		//anotherMethod();
		System.out.println(array[5]);
	}
public static void mymethod() throws Exception{
	
	throw new Exception("Failed to Load....");
}
public static void anotherMethod() throws RuntimeException{
	throw new RuntimeException("Wrong parameter");
}
}
