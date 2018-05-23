package Day6;/* Problem
* Implement a class named Cat with two instance fields: string name and int age, and one static int field counter. 
* The static counter field allows you to known how many cats have been already created.
* The class should have a constructor for initializing the instance fields. During the initialization of a new cat, 
* the static field should be incremented. If the counter > 5, the message "You have too many cats" must be printed out in the 
* System.out.
*
* Also, you need to implement a static method getNumberOfCats. It should return the current numbers of created cats.
*
* Use the provided template, do not make the class public.
* Example. Let's assume seven instances of the class Cat have been already created, then the correct implemented 
* method Cat.getNumberOfCats() should return 7 and the message "You have too many cats" has to appear twice.
*/
 
public class Methods {
	public static void main(String[] args) {
		Cat cat = new Cat("Hello kitty", 12);
		Cat cat2 = new Cat("Test", 1);
		Cat cat3 = new Cat("Test", 1);
		Cat cat4 = new Cat("Test", 1);
		Cat cat5 = new Cat("Test", 1);
		Cat cat6 = new Cat("Test", 1);
		Cat cat7 = new Cat("Test", 1);
	}
}

class Cat {

  	// write static and instance variables
  	public String name;
  	public int age;
  	public static int counter;

  	public Cat(String name, int age) {
  	  	// implement the constructor
  	  	// do not forgot to check the number of cats
  		this.name = name;
  		this.age = age;
  		counter++;
  		if (counter > 5) {
  			System.out.println("You have too many cats");
  		}
  	}

  	public static int getNumberOfCats() {
  	  	// implement the static method
  	  	return counter;
  	}
}