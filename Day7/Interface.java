// Problem
// Given an interface named AccountService. The interface has two abstract methods:
//
// findAccountByOwnerId(long id) returns Account found by owner id or null.
// countAccountsWithBalanceGreaterThan(long balance) returns number of accounts with the balance greater than the passed value.
// Also there are two another classes: Account (id, balance, owner) and User (id, firstName, lastName). See the provided code template.
//
// You need to implement the AccountService interface and its two methods. Your implementation must be named AccountServiceImpl.
// It should have a constructor with one argument - an array of accounts. The implementation must keep the array inside.
// The first method should search an account by owner id in the array, the second one - count number of accounts by condition in the array.

public class Interface {
  public static void main(String[] args) {

  }
}

interface AccountService {
  /**
   * It finds an account by owner id
   * @param id owner unique identifier
   * @return account or null
   */
  Account findAccountByOwnerId(long id);
  /**
   * It count the number of account with balance > the given value
   * @param value
   * @return the number of accounts
   */
  long countAccountsWithBalanceGreaterThan(long value);
}

// Declare and implement your AccountServiceImpl here
class AccountServiceImpl implements AccountService {
  protected Account[] accounts;

  public AccountServiceImpl(Account[] accounts) {
    this.accounts = accounts;
  }
  public Account findAccountByOwnerId(long id) {
    for (Account acc : this.accounts) {

      if (acc.getOwner().getId() == id) {
        return acc;
      }
    }
    return null;
  }
  public long countAccountsWithBalanceGreaterThan(long value) {
    int counter = 0;
    for (Account acc : this.accounts) {
      if (acc.getBalance() > value) {
        counter++;
      }
    }
    return counter;
  }
}

class Account {

  private long id;
  private long balance;
  private User owner;

  public Account(long id, long balance, User owner) {
    this.id = id;
    this.balance = balance;
    this.owner = owner;
  }

  public long getId() { return id; }

  public long getBalance() { return balance; }

  public User getOwner() { return owner; }
}

class User {

  private long id;
  private String firstName;
  private String lastName;

  public User(long id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public long getId() { return id; }

  public String getFirstName() { return firstName; }

  public String getLastName() { return lastName; }
}
