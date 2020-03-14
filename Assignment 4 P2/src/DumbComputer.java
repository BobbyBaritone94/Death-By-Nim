
import java.util.Random;

/*
 File Name: DumbComputer.Java
@author Roberto Lopez-Trigo
purpose: Creates the DumbComputer subclass and assosciated methods

Affirmation/Disclaimer: 
I affirm that this program is entirely my own work and none 
of it is the work of any other person.
	_Roberto Lopez-Trigo_
	(your signature)

 */

/**
 * Creates a subclass of the Players interface and associated methods.
 * @author RobertoLT
 */
public class DumbComputer implements Players {
private String name = "Grognak";
    
    /**
     * gets the name of the DumbComputer
     * @return name of the Dumb Computer.
     */
    public String playerName()
    {
        return name;
    }
    
    /**
     * This method returns the amount of marbles 
     * that will be taken by the warrior. The number is generated 
     * by a random number generator that is given a range of 
     * (1-half the remaining marbles).
     * @param amountOfMarbles - The remaining number of marbles in the Pile.
     * @return move -  the amount of marbles that will be taken by this warrior.
     */
    public int playerMove(int amountOfMarbles)
    {
        boolean illegalMove = false;
        int move = 1;
        
       
        Random rand = new Random();
        
        if (amountOfMarbles == 2)
        {
            move = 1;
        }else{
        move = (rand.nextInt(((amountOfMarbles-1)/2))) + 1;
        }
        
        System.out.println("\tAmount of marbles taken from the pile: " + move);
        
        
        
        return move;  //random number between one and n/2
    }
    
    
}
