import java.util.Random;

public class Jar {
  
  private String itemName;
  
  private int maximumNumber;
  
  private int number; 
  // a random number of items between one item and the maximum possible to items.
  
  public Jar(String name, int maximumNumber) {
    this.itemName = name;
    this.maximumNumber = maximumNumber;
    this.fill();
  }
  
  public void setItemName(String name) {
    this.itemName = name;
  }
  
  public void setMaxNumber(int maximumNumber) {
    this.maximumNumber = maximumNumber;
  }
  
  public void setNumber(int number) {
    this.number = number;
  }
  
  public String getItemName() {
    return this.itemName;
  }
  
  public int getMaxNumber() {
    return this.maximumNumber;
  }
  
  public int getNumber() {
    return this.number;
  }
  
  public void fill() {
    Random random = new Random();
    this.number = 1 + random.nextInt(this.maximumNumber);
  }
  
  
}