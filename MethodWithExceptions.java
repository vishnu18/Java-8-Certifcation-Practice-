class NoMoreMeat extends Exception{
	
}
class NoMorePlants extends RuntimeException{
	
}
interface Omnivore{
	void eatMeat(int amount) throws NoMoreMeat;
	void eatPlants(int anoumt);
}
class Bear implements Omnivore{

	@Override
	public void eatMeat(int amount){
		// TODO Auto-generated method stub
		if(amount<=0)
		System.out.println("Eating Meat");
	}

	@Override
	public void eatPlants(int amount) {
		// TODO Auto-generated method stub
		if(amount<=0)
			throw new NoMorePlants();
		System.out.println("Eating Plants");
		
	}

}
public class MethodWithExceptions {
	public static void main(String[] args){
		Bear b= new Bear();
		String str=null;
		try {
			b.eatMeat(10);
			//b.eatPlants(-10);
			str.length();
		} catch(NoMorePlants e) {
			e.printStackTrace();
			System.out.println("Bear is hungry as No More plants ...");
		}
		finally {
			System.out.println("Finally....");
		}
		
	}

}
