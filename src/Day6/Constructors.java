package Day6;/* Problem
* Given a class named Movie. Write two constructors for the class.
* The first constructor should take three arguments (title, desc, year) and initialize the corresponding fields.
* The second one should take only two arguments (title, year) and initialize name and year. In this case, the 
* field desc should have a value "empty" (without "").
* Use the provided template, do not change it.*/

public class Constructors {
	public static void main(String[] args) {

	}
}

class Movie {
  private String title;
  private String desc;
  private int year;

  // write two constructors here
  public Movie(String title, String desc, int year) {
  	this.title = title;
  	this.desc = desc;
  	this.year = year;
  }

  public Movie(String title, int year) {
  	this.title = title;
  	this.desc = "empty";
  	this.year = year;
  }

  public String getTitle() {
    return title;
  }

  public String getDesc() {
    return desc;
  }

  public int getYear() {
    return year;
  }
}