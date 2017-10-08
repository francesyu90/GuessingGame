

public class GuessingGame {
  
    public static void main(String[] args) {
      
      Jar jar = Prompter.promptForItemNameAndMaxNumber();
      Prompter.promptForGuessing(jar);
    }
}
