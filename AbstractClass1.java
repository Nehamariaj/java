
public class AbstractClass1 {

	public static void main(String [] args) {
	Lion lion=new Lion();
	Tiger tiger=new Tiger();
	lion.sound();
	tiger.sound();
	}

}
abstract class Animal{
	public abstract void sound();
}
class Lion extends Animal{
	public void sound() {
		System.out.println("Lion roars");
	}
}
class Tiger extends Animal{
	public void sound() {
		System.out.println("Tiger growls");
	}
}