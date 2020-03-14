
import java.util.Scanner;

/*
 File Name: Human.Java
@author Roberto Lopez-Trigo
purpose: Creates the Human object and assosciated methods

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
public class Human implements Players  {
private String humanName;

   /**
    * Allows human players to enter a warrior name.
    */
    public void setName()
    {
        Scanner newName = new Scanner(System.in);
        
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<"
                + "What is the name of this mortal?"
                + ">>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        humanName = newName.nextLine();
        
    }
    
    /**
     * gets the name of the player
     * @return humanName the warrior name of the player
     */
    public String playerName()
    {
        return humanName;  //return the players entered name.
    }
    
    /**
     * Allows for human players to enter the desired amount 
     * of marbles to be withdrawn from the pile. Does not allow illegal
     * moves of more than half the remaining pile size
     * @param amountOfMarbles
     * @return amountTaken the amount of marbles that will be 
     * removed from the pile by the human player
     */
    public int playerMove(int amountOfMarbles)
    {
        int amountTaken =1;
        
        Scanner humanInput= new Scanner(System.in);
        
       
        boolean illegalMove= false;
        
        do
        {
           
        amountTaken = Integer.parseInt(humanInput.nextLine());
        
        if (amountTaken > amountOfMarbles/2 || amountTaken < 1)
        {
            System.out.println("ERROR: ILLEGAL MOVE\n\n\t "
                    + "PLEASE ENTER A VALID NUMBER");
            
            illegalMove=true;
        }else{
            illegalMove=false;
        }
        } while(illegalMove==true);
        
         System.out.println("\tAmount of marbles taken from the pile: " 
                 + amountTaken);        
        
        return amountTaken;  //user input.
    }
    
    
}

