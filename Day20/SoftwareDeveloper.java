import java.util.List;

public class SoftwareDeveloper implements java.io.Serializable {
  private String name;
  private int age;
  private List<String> skills;

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public List<String> getSkills() {
    return skills;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }
}
