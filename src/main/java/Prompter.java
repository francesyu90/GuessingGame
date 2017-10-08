import java.util.Scanner;

public class Prompter {
  
  private static Scanner in;
  private static String line = "==============================";
  
  public static Jar promptForItemNameAndMaxNumber() {
      in = new Scanner(System.in);
      System.out.println("ADMINISTRATOR SETUP");
      System.out.println(line);
      System.out.print("Name of items in the jar: ");
      String itemName = in.nextLine();
      System.out.printf("Max number of %s in the jar: ", itemName);
      Integer maxNumber = in.nextInt();
      return new Jar(itemName, maxNumber);
      
  }
  
  public static void promptForGuessing(Jar jar) {
    in = new Scanner(System.in);
    System.out.println("\n\n\n");
    System.out.println("PLAYER");
    System.out.println(line);
    System.out.printf("Your goal is to guess how many %s are in the jar. Your guess should be between 1 and %d.\n\n", jar.getItemName(), jar.getMaxNumber());
    System.out.print("Ready? (press ENTER to start guessing)");
    String resp = in.nextLine();
    if(resp != null && resp.length() == 0) {
      
    }
    
    in.close();
  }
}