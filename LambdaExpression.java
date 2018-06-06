import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Animal {
private String type;
private boolean canJump;
private boolean canSwim;
public Animal(String type,boolean canJump,boolean canSwim) {
	this.type=type;
	this.canJump=canJump;
	this.canSwim=canSwim;
}
public boolean canJump() {
	return canJump;
}
public boolean canSwim() {
	return canSwim;
}
public String getType() {
	return type;
}
}
 interface CheckAnimal{
	 boolean check(Animal animal);
 }
 interface AnotherCheck{
	 boolean check(Animal one,Animal two);
 }
 class CheckCanJump implements CheckAnimal{

	@Override
	public boolean check(Animal animal) {
		// TODO Auto-generated method stub
		return animal.canJump();
	}
	 
 }
 public class LambdaExpression{
	 public static void main(String[] args) {
		 List<Animal> animals=new ArrayList<>();
		 animals.add(new Animal("fish",false,true));
		 animals.add(new Animal("rabbit",true,false));
		 animals.add(new Animal("dog",true,true));
		 print(animals,new CheckCanJump());
		 print(animals,(animal)->animal.canSwim());
		 printPredicate(animals,(animal)->animal.canSwim());
		 print(animals,(animal)->!animal.canSwim());
		 print(animals,(animal)->{return animal.canJump();});
		 print(animals,(Animal animal)->{
			 //Animal animal=new Animal("cat",true,false);
			 System.out.println("Checking animal= "+animal.getType());
			 return animal.canJump();
		 });
		 Animal fish=animals.get(0);
		 Animal rabbit=animals.get(1);
		 Animal dog=animals.get(2);
		 print(fish,rabbit,(first,second)->first.canSwim()&&second.canJump());
		 print(fish,dog,(f,s)->f.canJump()&&s.canSwim());
		 
		 
		 List<String> names=new ArrayList<>();
		 names.add("John");
		 names.add("Anthony");
		 names.add("Jimmy");
		 names.add("Pearson");
		 System.out.println(names);
		 names.removeIf(name->name.charAt(0)=='J');
		 System.out.println(names);
	}
	 private static void print(List<Animal> animals,CheckAnimal filter) {
		 for(Animal animal:animals) {
			 if(filter.check(animal)) {
				 System.out.println(animal.getType());
			 }
			 
		 }
		 System.out.println();
	 }
	 private static void print(Animal one, Animal two, AnotherCheck anotherCheck) {
		 System.out.println(anotherCheck.check(one, two));
	 }
	 private static void printPredicate(List<Animal> one,Predicate<Animal> filter) {
		 System.out.println("using Predicate from Java.util.function.Predicate");
		 for(Animal animal:one) {
			 if(filter.test(animal)) {
				 System.out.println(animal.getType());
			 }
		 }
		 System.out.println("End Of Predicate");
	 }
 }
