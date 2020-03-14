/*
 File Name: Players.Java
@author Roberto Lopez-Trigo
purpose: Creates the Players interface with assosciated abstract methods.

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
public interface Players {

    int playerMove(int amountOfMarbles); //returns the number of marbles that will be taken from the pile

    String playerName(); //returns the players name

}
