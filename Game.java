/**
 * Created by Mallikarjuna on 9/28/2016.
 */
public class Game {

    private Jar mJar;
    private int mGuess;
    private static int mTotalTries = 0;


    public int getGuess( ) {
        return mGuess;
    }

//  Instantiate Jar Object
    public void IntializeJar(String itemName, int maxItemsAllowed) {
        mJar = new Jar(itemName,maxItemsAllowed);
//       Fill Jar with Random number of Items of maxItemsAllowed
        mJar.fill();
    }
    /*
    Compute Method : Intermediate Output
    @ progress : Holds guess is High , Low , Precise
    */

    public String currentProgress( ) {

        String progress = " ";
        if ( mJar.getRandomNumber() != mGuess ) {
            if( mJar.getRandomNumber() < mGuess ) {
                progress = "High";
                return progress;
            } else {
                progress = "Low";
                return progress;
            }
        }
        progress = "Precise";
        return progress;
    }
//  Validate Input : Input can't be more than maxItemsAllowed or less than 1
    private int preventGuess(int guessNumber) {

        if ( guessNumber > mJar.getMaxItemsAllowed() || guessNumber < 1 ) {
            throw new IllegalArgumentException("Your guess must between 1 and "+mJar.getMaxItemsAllowed());
        }
        return guessNumber;
    }
    /*
    Compute method : Checks Random No of Items in Jar is equal to guess by user
    @mGuess : Holds guess made by user
    mTotalTries : Holds no of Tries made by user

    */

    public boolean applyGuess(int guessNumber) {

         mGuess = preventGuess(guessNumber);
         mTotalTries++;
        if ( mJar.getRandomNumber() == mGuess ) {
            return true;
        }
            return false;
    }

    public int countTries()
    {
        return mTotalTries;
    }
}
