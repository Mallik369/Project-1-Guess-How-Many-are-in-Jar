/**
 * Created by Mallikarjuna on 9/28/2016.
 */
import java.util.Random;

public class Jar
{

    private String mJarItem;
    private int mMaxItemsAllowed;
    private int mRandomNumber;


    public Jar ( String JarItem , int MaxItemsAllowed ) {

        mJarItem         = JarItem;
        mMaxItemsAllowed = MaxItemsAllowed;
    }


    public String getJarItem( )
    {
        return mJarItem;
    }


    public int getMaxItemsAllowed()
    {
        return mMaxItemsAllowed;
    }


    public int getRandomNumber()
    {
        return mRandomNumber;
    }

    //Fill Methods uses Random Class and Fills Jar by generating Random Number

    public void fill ( ) {

        Random random   = new Random();
        mRandomNumber   = random.nextInt(mMaxItemsAllowed)+1; //Ensure that there is always 1

    }

}