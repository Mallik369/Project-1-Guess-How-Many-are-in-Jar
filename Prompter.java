import java.util.Scanner;

/**
 * Created by Mallikarjuna on 9/28/2016.
 */
public class Prompter {

    private Scanner mScanner;
    private Game mGame;

    public Prompter(Game game) {
        mScanner = new Scanner(System.in);
        mGame = game;
    }

    private void adminDisplay( ) {
        System.out.printf("ADMINISTRATOR CONFIGURATION\n");
        System.out.printf("=================================\n\n");
    }

    private void playerDisplay(String itemName, int maxItemsAllowed) {
        System.out.printf("\nPLAYER\n");
        System.out.printf("=====================\n\n");
        System.out.printf("Game is On :\n");
        System.out.printf("You have to guess how many %s in Jar.\n",itemName);
        System.out.printf("You guess is inbetween 1 to %d\n",maxItemsAllowed);
    }
//    Input : Prompt user Item in Jar
    private String promptForItemName()
    {
        String itemName = "";
        boolean isValidItemName = false;

        while(!isValidItemName) {

            System.out.print("Enter the item in Jar:");
            itemName = mScanner.nextLine();

            if(itemName.matches("[A-Za-z]*")) {
                System.out.printf("%s is a valid Item in Jar\n", itemName);
                isValidItemName = true;
            } else {
                System.out.printf("%s is not a valid Item in Jar\n",itemName);
            }
        }
        return itemName;
    }
//      Input : Prompts user no of Items in Jar
    private int promptForMaximumItems(String itemName) {

        int maxItemsAllowed;

        do {
            System.out.printf("The Number of %s below 1 is not allowed in Jar\n",itemName);
            System.out.printf("Enter Maximum %s Allowed in Jar:\n",itemName);

            while (!mScanner.hasNextInt()) {
                String input = mScanner.next();
                System.out.printf("%s is not a valid number.\n", input);
                System.out.print("Enter Maximum Items Allowed in Jar:");
            }
            maxItemsAllowed = mScanner.nextInt();
        } while (maxItemsAllowed < 1);
        return maxItemsAllowed;
    }

    /*
    Input : Receives Jar Input from User
    @ itemName : Holds the Item in Jar
    @maxItemsAllowed : Holds the No of @itemName in Jar
    Pass @ itemName , @maxItemsAllowed to mGame to Instantiate Jar
    */

    public void play() {

        String itemName;
        int maxItemsAllowed;
        boolean isSolved = false;
        adminDisplay();
        itemName        = promptForItemName();
        maxItemsAllowed = promptForMaximumItems(itemName);
        mGame.IntializeJar(itemName,maxItemsAllowed);
        playerDisplay(itemName,maxItemsAllowed);

//        The Game Runs until User Make Precise Guess
        while(!isSolved) {

            isSolved = promptForGuess();
            System.out.printf("Your Guess is %s\n", mGame.currentProgress());
        }
//        On Precise Guess Display Success Message
        System.out.printf("Congratulations you have guessed that %d %s with %d Tries\n",
                mGame.getGuess(),itemName,mGame.countTries());
    }
    /*
    Input : Prompts User to Make Guess
    @ guessNumber : Holds the User Guess
    Pass @ guessNumber to Match No of Items in Jar
    */

    public boolean promptForGuess() {

        int guessNumber;
        boolean isHit = false;
        System.out.print("Guess:");

        try {
            while (!mScanner.hasNextInt()) {
                String input = mScanner.next();
                System.out.printf("%s is not a valid number.\n", input);
                System.out.print("Guess:");
            }
            guessNumber = mScanner.nextInt();
            isHit = mGame.applyGuess(guessNumber);
        }
        catch(IllegalArgumentException iae) {
            System.out.printf("%s ,Please try Again\n ",iae.getMessage());
        }
        return isHit;
    }

}
