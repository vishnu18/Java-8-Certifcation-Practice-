
public class UsingFinally {
public static void main(String[] args) {
	String[] array=new String[5];
	array[0]="John";
	array[0]="Test";
	try {
		String element=firstToUpper(array);
		System.out.println("Element= "+element);
	} catch (NullPointerException e) {
		// TODO Auto-generated catch block
		System.out.println("Error Message: "+e.getMessage());
	}finally {
		System.out.println("Finally Block");
	}
	String str="";
	try {
		throw new Exception("Test");
		
	}catch(Exception e) {
		str+="b";
		
	}
	finally {
		str+="c";
	}
	str+="d";
	System.out.println(str);
}
private static String firstToUpper(String[] array) {
	// TODO Auto-generated method stub
  return array[0].toUpperCase();
}
}
