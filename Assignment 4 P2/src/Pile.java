/*
 File Name: Pile.Java
@author Roberto Lopez-Trigo
purpose: Creates the Pile object and assosciated methods

Affirmation/Disclaimer: 
I affirm that this program is entirely my own work and none 
of it is the work of any other person.
	_Roberto Lopez-Trigo_
	(your signature)

 */
import java.util.Random;
/**
 *Creates the pile class and its associated methods.
 * @author RobertoLT
 */
public class Pile {
    
    private int numberOfMarbles;
    
    /**
     * Constructor method for a Pile object. 
     * The pile is constructed with a random size between 10 and 100.
     */
    public Pile()
    {
        Random randomGenerator= new Random();
        this.numberOfMarbles = randomGenerator.nextInt(90)+10;
    }
    
    /**
     * gets the remaining amount of marbles in the pile.
     * @return numberOfMarbles the remaining amount of marbles in the pile.
     */
    public int getPileSize()
    {
        return numberOfMarbles;
    }
    
    /**
     * Sets the remaining number of marbles to the difference 
     * between the amount of marbles and the amount taken from the pile.
     * @param numToSubtract the number of marbles 
     * that will be subtracted from the pile.
     */
    public void subtractFromPile(int numToSubtract) 
    {
        numberOfMarbles = numberOfMarbles - numToSubtract;
    }
}
