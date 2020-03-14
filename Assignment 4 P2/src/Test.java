
import java.util.Scanner;

/*
 File Name: Test.Java
@author Roberto Lopez-Trigo
purpose: Contains the main method that utilizes all other classes.

Affirmation/Disclaimer: 
I affirm that this program is entirely my own work and none 
of it is the work of any other person.
	_Roberto Lopez-Trigo_
	(your signature)

 */
/**
 *
 * @author RobertoLT
 */
public class Test {
    
    public static void main(String[] args)
    {           
        

                                //INTRODUCTION
        
        
        System.out.println("\t\t\t####################\n"
                +        "\t\t\t#  WELCOME TO NIM  #  "    //Title of game
                +      "\n\t\t\t####################");
        
        System.out.println("\n\n\t\t\tPLAY....IF YOU DARE!");
        
        //scanner object to allow input
        Scanner userInput = new Scanner(System.in);
        
        //explanation of the game and how it works.
        System.out.println("\n\n\n\n\nNim is an ancient game between warriors "
                +        "\nusing nothing but their wits."
                +      "\n\n \tThe two warriors take turns removing Death Balls"
                + "\n\t from the Death Heap. Each warrior must remove at "
                + "\n\tleast one Death Ball but no more than "
                + "\n\thalf the remaining Death Balls ");
        
        //asking the player if they would like to play.
        System.out.println("\n\nwill you procede? (enter 'yes')");
        
        //takes in user input over whether they want to play.
        String inputBegin = userInput.nextLine();
        
        
                             //SETTINGS   SETTINGS   SETTINGS
        //if they want to play the game loop will initiate.
        while (inputBegin.equalsIgnoreCase("yes"))
        {
        //resets players and creates the player objects with every play through
            Players firstPlayer= null;
            Players secondPlayer=null;
            
            //player one choices
            System.out.println("\n\nwho will be playing this DEADLY game?"
                    + "\t This warrior will have the first move.\n"
                    + "type one of the numbers below, followed by enter, "
                    + "to select the warrior\n\t"
                    + "1. Human (User(s))\n\t"
                    + "2. Grognak (Dumb Computer)\n\t"
                    + "3. Skellitor (Super Computer)");
            
            //Depending on the input, sets player 1 to the specified type.
            //If player does not get chosen. i.e. player type is never chosen.
            while (firstPlayer==null)
            {
             String number = userInput.nextLine(); 
            
            if (number.equalsIgnoreCase("1"))
            {
                Human guy = new Human(); //sets first player to be a human
                guy.setName();
                firstPlayer = guy;
                
            }else if (number.equals("2"))
                    {
                    firstPlayer = new DumbComputer(); 
                    //sets player to dumb computer
                    }
            else if (number.equals("3"))
            {
                firstPlayer = new SmartComputer();
                //sets player to smart computer.
            }else {
                System.out.println("ERROR PLEASE ENTER A VALID NUMBER!");
                //if not valid input.
            }
            }
            
            //player two choices
            System.out.println("\n\n...and who is the opponent?\t"
                    + "This warrior will be going second.\n\t"
                    + "1. Human\n\t"
                    + "2. Grognak (Dumb Computer)\n\t"
                    + "3. Skellitor (Super Computer)");
            
             //Depending on the input, sets player 2 to the specified type.
            //If player does not get chosen. i.e. player type is never chosen.
            while (secondPlayer == null){
          
                String number = userInput.nextLine();
            
            if (number.equalsIgnoreCase("1"))
            {
                Human girl = new Human();
                girl.setName();
                secondPlayer = girl; //sets second player to be a human
            }else if (number.equals("2"))
                    {
                    secondPlayer = new DumbComputer();
                    //sets player to smart computer.
                    }
            else if (number.equals("3"))
            {
                secondPlayer = new SmartComputer();
                //sets player to smart computer.
                
            }else {
                System.out.println("ERROR PLEASE ENTER A VALID NUMBER!");
                //if not valid input.
            }
            }
            
        // creates Nim object
        Nim game = new Nim();
        
        //runs the play() method.
        game.play(firstPlayer, secondPlayer);
        
            System.out.println("\n\n"
                    + "<<<<<<<<<<<<<<<<<<<<<<<<<<"
                    + "Do you dare to play again?"
                    + ">>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
        inputBegin = userInput.nextLine(); 
    //If they input "yes" the loop will restart back to the settings
    }
        
        
}
    
}
