import java.util.Scanner;

public class Prompter {
  
  private static Scanner in;
  private static String line = "==============================";
  
  public static Jar promptForItemNameAndMaxNumber() {
      in = new Scanner(System.in);
//      System.out.println("ADMINISTRATOR SETUP");
//      System.out.println(line);
//      System.out.print("Name of items in the jar: ");
      System.out.print("What type of item: ");
      String itemName = in.nextLine();
      System.out.printf("\nmaximum amount of %s in the jar: ", itemName);
      Integer maxNumber = in.nextInt();
      in.close();
      return new Jar(itemName, maxNumber);
      
  }
  
  public static void promptForGuessing(Jar jar) {
    in = new Scanner(System.in);
    System.out.println("\n\n\n");
    System.out.println("PLAYER");
    System.out.println(line);
//    System.out.printf("Your goal is to guess how many %s are in the jar. Your guess should be between 1 and %d.\n\n", jar.getItemName(), jar.getMaxNumber());
    System.out.printf("How many %s: ", jar.getItemName());
    System.out.print("Ready? (press ENTER to start guessing)");
    String resp = in.nextLine();
    if(resp != null && resp.length() == 0) {
      Boolean contd = true;
      Integer count = 0;
      do {
//        System.out.print("Guess [Note: only numbers are allowed for input]: ");
        Integer guessedNumber = in.nextInt(); 
        if(guessedNumber == jar.getNumber()) {
          count++;
          System.out.printf("You got it in %d attempt(s)", count);
          contd = false;
          break;
        } else if(guessedNumber > jar.getMaxNumber()) {
          System.out.printf("Your guess must be less than %d\n", jar.getMaxNumber());
        } else if(guessedNumber > jar.getNumber()) {
          System.out.println("Your guess is too high");
          count++;
        } else if(guessedNumber < jar.getNumber()) {
          System.out.println("Your guess is too low");
          count++;
        }
        System.out.printf("Guess between 1 and %d. %d attempt(s)", jar.getMaxNumber(), count);
      } while(contd);
    }
    in.close();
  }
}