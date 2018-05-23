package Day20;// Demonstration of Serialization
// Save an object to a file
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationSample {
  public static void main(String[] args) {
    SoftwareDeveloper sd = new SoftwareDeveloper();
    sd.setName("Alex Academia");
    sd.setAge(30);
    List<String> skills = new ArrayList<>();
    skills.add("Java");
    skills.add("PHP");
    skills.add("Python");
    skills.add("Javascript");

    sd.setSkills(skills);

    try {
      FileOutputStream fos = new FileOutputStream("serialized.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // Write the softwaredeveloper object to the ObjectOutputStream object
      oos.writeObject(sd);
      oos.close();
      fos.close();
    } catch (IOException e) {
      System.out.println("An error has occurred: " + e);
    }
  }
}
