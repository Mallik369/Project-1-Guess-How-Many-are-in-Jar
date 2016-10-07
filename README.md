# Project-1-Guess-How-Many-are-in-Jar
## Jar Game

Jar Game is Console Application developed to play to Guess How many in Jar Game between user and Computer. This Product is developed to Apply, Test and Verify  Skills Acuqired during Team Tree House Java Web Developement Tech Degree Program and review by mentor and fellow Students.

Jar Game Application is build considering following User Stories

**1.  As a player of the game, each game I should be presented with a randomly filled jar so that I can play multiple games and it is still challenging.**

    • Contains code that uses the Random class correctly as in the instructions and inside of a fill method.
    •	Ensure that there is always 1 and that the maximum fill amount is possible.
    •	HINT: Read the code in the instructional Java code about Random.
    
Jar Game needs to Fill Jar Randomly

                Method : public void fill ( )
   
**2.  As a winner of the game, I should know how many attempts it took me to get to the right answer, so that I am encouraged to beat my score.**

    • Program keeps track of tries and informs player of correct amount of tries in the format of:
          You got it in X attempt(s).
          
Jar Games need to keep a Track no of Tries taken by user 

                Method : public int countTries()
               
**3.  As an administrator of the game I should be able to specify what type of item will be stored in the jar as well as the total how many could reasonably fit in jar, so that the game stays in the bounds of reality.**

    •	Creates a new class named Prompter that encapsulates all the I/O (input/output) of the game.

Jar Game needs to recieve Input from User

                Method : public void play()
                 
**4. As a player of the game, I should be displayed with the maximum amount of items that are possible to be in the jar.**

    •	Prevents from guessing over the maximum amount.
    •	User is warned and prompted “Your guess must be less than maximum fill amount”
    •	Over the maximum guesses should not counted against number of tries.
    
Jar Game needs to Validate Input and prevent user from guessing more than maximum fill amount

                Method : private int preventGuess(int guessNumber)
                
**5.  As a player of the game, I should be able to guess the number of the items until I get the correct answer.**

    Player is given the hint : “Your guess is too high” or “Your guess is too low” depending on the truth.
    
Jar Game needs to provide Functionality Enhancement : A Hint to User after each Guess ( High or Low )

                Method : public String currentProgress( )



                


  


