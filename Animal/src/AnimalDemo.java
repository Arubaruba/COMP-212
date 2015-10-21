
public class AnimalDemo {

	public static void main(String[] args) {
		Animal monkey = new Animal();
		Animal pigeon = new Animal(0);
		
		pigeon.setType(monkey.getType());
		pigeon.printType();
	}

}
