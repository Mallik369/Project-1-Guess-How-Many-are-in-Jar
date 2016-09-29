/**
 * Created by Mallikarjuna on 9/28/2016.
 */
public class JarGame {

//    Main Method : Application Runs from Here

    public static void main(String[] args) {

//      Instantiate Game Object to Play Game
        Game game       = new Game( );
//       Instantiate prompt for I/O Interaction between Application and User
        Prompter prompt = new Prompter(game);
//        Play Method will start Game
        prompt.play();

    }
}
