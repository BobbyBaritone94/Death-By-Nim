/*
 File Name: SmartComputer.Java
@author Roberto Lopez-Trigo
purpose: Creates the SmartComputer object and assosciated methods

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
public class SmartComputer implements Players {

    /**
     * gets the name of the SmartComputer.
     * @return the name of the super computer.
     */
    public String playerName()
    {
        return "Skellitor";
    }
    
    /**
     * Depending on the remaining amount of marbles, the computer 
     * takes a remaining amount of marbles that ensures victory. 
     * @param amountOfMarbles the amount of marbles left in the pile.
     * @return move the amount of marbles to be taken from the pile.
     */
    public int playerMove(int amountOfMarbles)
    {
        int move =1; //instantiates the move variable
        
        //logic for smart computer move.
        if(amountOfMarbles > 63)
        {
            move = amountOfMarbles-63;
        } else if (amountOfMarbles > 31)
        {
            move = amountOfMarbles-31;
        } else if (amountOfMarbles > 15)
        {
            move = amountOfMarbles-15;
        } else if (amountOfMarbles > 7)
        {
            move = amountOfMarbles - 7;
        } else if (amountOfMarbles > 3)
        {
            move = amountOfMarbles - 3;
        } else if (amountOfMarbles > 1)
        {
            move = amountOfMarbles - 1;
        }
                
                
         System.out.println("\tAmount of marbles taken from the pile: " + move);
         
        return move;  
    }
    
    
}