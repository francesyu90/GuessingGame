import java.util.Random;

public class Jar {
  
  private String itemName;
  
  private Integer maxNumber;
  
  private Integer number; 
  // a random number of items between one item and the maximum possible to items.
  
  public Jar(String name, Integer number) {
    this.itemName = name;
    this.maxNumber = number;
    this.fill();
  }
  
  public void setItemName(String name) {
    this.itemName = name;
  }
  
  public void setMaxNumber(Integer number) {
    this.maxNumber = number;
  }
  
  public void setNumber(Integer number) {
    this.number = number;
  }
  
  public String getItemName() {
    return this.itemName;
  }
  
  public Integer getMaxNumber() {
    return this.maxNumber;
  }
  
  public Integer getNumber() {
    return this.number;
  }
  
  public void fill() {
    Random random = new Random();
    this.number = 1 + random.nextInt(this.maxNumber);
  }
  
  
}