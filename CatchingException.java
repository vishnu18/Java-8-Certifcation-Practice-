class MuseumClosed extends RuntimeException{
	
}
class MuseumClosedForLunch extends MuseumClosed{
	
}
public class CatchingException {
public static void main(String[] args) {
	try {
		visitMuseum();
	}
//	catch(RuntimeException r) {
//		Since runtime exetion is super class of both MuseumClosed 
	//and museum closed for lunch 
//	}
	catch(MuseumClosedForLunch mch) {
		System.out.println("Come back after 2 hours");
	}
	catch(MuseumClosed mc) {
		System.out.println("Closed");
	}
	//Does not compile
//	catch(MuseumClosedForLunch mch) {
	//Will not compile since museumclosedforlunch is subclass of museumclosed
//		System.out.println("Come back after 2 hours");
//	}
	System.out.println(calculate());
}
public static String calculate() {
	String result="";
	String str=null;
	try {
		try {
			result+="start";
			str.length();
			result+="end";
		}catch(NullPointerException n) {
			result+="npe";
			throw new RuntimeException();
		}finally {
			result+="finally";
			throw new Exception();
		}
	}
	catch(Exception e){
		result+="finished";
	}
	return result;
}
public static void visitMuseum(){
	boolean b= Math.random()<0.5;
	if(b) {
		throw new MuseumClosed();
	}
	throw new MuseumClosedForLunch();
}
}
