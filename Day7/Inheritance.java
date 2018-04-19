/* Problem
* Develop a class hierarchy of employees. The hierarchy should include three classes:
* Employee is the base class. It includes three fields (name, email and experience),
* one constructor with three arguments and three getters: getName(), getEmail(), getExperience().
* Developer is a subclass. It includes fields from the base class and two additional fields
* (mainLanguage, skills), one constructor with five arguments and two getters: getMainLanguage(), getSkills().
* DataAnalyst is another subclass. It includes fields from the base class and two additional fields (phd, methods),
* one constructor with five arguments and two getters: isPhD(), getMethods().
*/

public class Inheritance {
  public static void main(String[] args) {
    String[] skills = {
      "PHP",
      "Python"
    };
    Developer dev = new Developer("Alex", "alexius.academia@gmail.com", 6, "PHP", skills);
  }
}

class Employee {

  // write fields
  protected String name, email;
  protected int experience;

  // write constructor
  public Employee(String name, String email, int experience) {
    this.name = name;
    this.email = email;
    this.experience = experience;
  }
  // write getters
  public String getName() {
    return this.name;
  }
  public String getEmail() {
    return this.email;
  }
  public int getExperience() {
    return this.experience;
  }
}

class Developer extends Employee {

  // write fields
  protected String mainLanguage;
  protected String[] skills;

  // write constructor
  public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
    super(name, email, experience);
    this.mainLanguage = mainLanguage;
    this.skills = skills;
  }

  // write getters
  public String getMainLanguage() {
    return this.mainLanguage;
  }
  public String[] getSkills() {
    return this.skills;
  }
}

class DataAnalyst extends Employee {

  // write fields
  protected boolean isPhD;
  protected String[] methods;

  // write constructor
  public DataAnalyst(String name, String email, int experience, boolean isPhD, String[] methods) {
    super(name, email, experience);
    this.isPhD = isPhD;
    this.methods = methods;
  }

  // write getters
  public boolean isPhD() {
    return this.isPhD;
  }
  public String[] getMethods() {
    return this.methods;
  }
}
