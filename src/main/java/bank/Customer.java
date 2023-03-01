package bank;

public class Customer {
  private int id;
  private String name;
  private String username;
  private int password;
  private int accountId;

  public Customer(int id, String name, String username, int password, int accountId) {
    setId(id);
    setName(name);
    setUsername(username);
    setPassword(password);
    setAccountId(accountId);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public int getPassword() {
    return this.password;
  }

  public void setPassword(int password) {
    this.password = password;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }
}
