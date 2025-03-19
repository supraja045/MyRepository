package SuperKeyword;

public class Cat extends Animal
{
	  Cat() {
	        super(); // Invoke the constructor of the superclass (Animal)
	        System.out.println("Cat constructor");
	    }
	  String name ="cat";
	  void eat()
	  {
		  super.eat(); // Invoke the eat() method of the superclass
	        System.out.println("Cat is eating.");
	        System.out.println("Super class name variable "+super.name);
	        System.out.println("Current class name variable "+this.name);
	        
	  }
	  
	  public static void main(String[] args) {
	        Cat cat = new Cat();
	        cat.eat();
	    }
}


