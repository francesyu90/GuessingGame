import java.util.Scanner;

public class Prompter {
  
  private static Scanner in;
  private static String line = "==============================";
  
  public static Jar promptForItemNameAndMaxNumber() {
      in = new Scanner(System.in);
      System.out.print("What type of item: ");
      String itemName = in.nextLine();
      System.out.printf("maximum amount of %s in the jar: ", itemName);
      Integer maxNumber = in.nextInt();
      return new Jar(itemName, maxNumber);
      
  }
  
  public static void promptForGuessing(Jar jar) {
    in = new Scanner(System.in);
    
      Boolean contd = true;
      Integer count = 0;
      System.out.printf("How many %s\n", jar.getItemName());
      System.out.printf("1 and %d\n", jar.getMaxNumber());
      do {
        Integer guessedNumber = in.nextInt(); 
        if(guessedNumber == jar.getNumber()) {
          count++;
          System.out.printf("You got it in %d attempts.\n", count);
          contd = false;
          break;
        } else if(guessedNumber > jar.getMaxNumber()) {
          System.out.printf("Your guess must be between 1 and %d\n", jar.getMaxNumber());
        } else if(guessedNumber > jar.getNumber()) {
          System.out.println("Your guess is too high");
          count++;
        } else if(guessedNumber < jar.getNumber()) {
          System.out.println("Your guess is too low");
          count++;
        }
      } while(contd);
  
    in.close();
  }
}