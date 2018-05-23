package Day20;// Demonstration of Deserialization
// Retrieve an object from a file
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationSample {
  public static void main(String[] args) {
    SoftwareDeveloper sd = null;

    try {
      FileInputStream fis = new FileInputStream("serialized.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);

      sd = (SoftwareDeveloper) ois.readObject();

    } catch (IOException e) {
      System.out.println("An error has occurred: " + e);
    } catch (ClassNotFoundException e) {
      System.out.println("Class SoftwareDeveloper not found!");
    }

    // Print the contents
    System.out.println("Object contents:");
    System.out.println(sd.getName());
    System.out.println(sd.getAge());
    System.out.println(sd.getSkills());
  }
}
