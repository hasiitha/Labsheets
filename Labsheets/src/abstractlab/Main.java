// Lab Sheet on Abstract Classes

package abstractlab;

abstract class Animal {
	public Animal() {
		System.out.println("Animal Constructor called");
		// TODO Auto-generated constructor stub
	}
   private String name;
   public Animal(String name) {
       this.name = name;
   }
   
   abstract public String speak();
   
  public void display() {
      System.out.println("My name is " + this.name + ".  " + this.speak() + ".");
  }
}

class Dog extends Animal {
	public Dog() {
		System.out.println("Dog Constructor called");
		// TODO Auto-generated constructor stub
	}
   public Dog(String name) {
      super(name);
   }
   public String speak() {
       return "Bow Wow";
   }
}

class Cat extends Animal {
	public Cat() {
		
		System.out.println("Cat Constructor called");
		// TODO Auto-generated constructor stub
	}
  public Cat(String name) {
      super(name);
   }
  public String speak() {
      return "Meow Meow";
  }
}

class ToyCat extends Cat {
  String manufacturer;
  public ToyCat() {
	  System.out.println("Toycat Constructor called");
	// TODO Auto-generated constructor stub
}
  public ToyCat(String name, String manufacturer) {
     super(name);
     this.manufacturer = manufacturer;
  }
  public void display() {
     super.display();
     System.out.println("I am from " + manufacturer + ".");
  }
}

class Main {
  public static void main(String[] args) {
  

     
    /* Cat mycat = new Cat("Micky");
     mycat.display();*/
     
    /* Dog mydog = new Dog("Rover");
     mydog.display();*/
     
   // ToyCat mytoy = new ToyCat("kittie","Toysrus");
   // mytoy.display();
	  ToyCat mycattoy = new ToyCat();
     
     
     
     // 1.  Make the Animal class an abstract class
     //     Make the speak method an abstract method
     //     Modifiy the main function.<-object of the abstract class   
     //     What needs to be removed and why?
     
     // 2. Add default constructors to each of the
     //    classes.  Display a message giving
     //   details of the name of the constructor.
     //   e.g. 
     
     //    public Animal() {
     //         System.out.println
     //             ("Animal constructor called");
     //    }
     //    Create an object of the ToyCat classes
     //   call the default constructor
     //   What will be the output?
     //   Can you explain how why the output
     //  appears as displayed?
     
  }
}