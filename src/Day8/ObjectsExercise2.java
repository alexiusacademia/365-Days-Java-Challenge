package Day8;// Problem
// There is a class named Account. It includes three fields: id, code and balance.
// Override the method toString() in this class. The method should return a string representation of the account instance.
// Use the provided template. Do not make the class public.
public class ObjectsExercise2 {
  public static void main(String[] args) {
    Account acc = new Account(1L, "ACC-TAR-001", 123415689L);
    System.out.println(acc.toString());
  }
}

class Account {

  private long id;
  private String code;
  private Long balance;

  public Account(long id, String code, Long balance) {
    this.id = id;
    this.code = code;
    this.balance = balance;
  }

  // Override toString() here
  @Override
  public String toString() {
    return "Account{id=" + this.id + ", code=\'" + this.code + "\', balance=" + this.balance + "}";
  }
}
