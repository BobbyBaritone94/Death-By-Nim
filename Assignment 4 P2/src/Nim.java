/*
 File Name: Nim.Java
@author Roberto Lopez-Trigo
purpose: Creates the Nim object and assosciated methods

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
public class Nim {

    private Players[] gamePlayers = new Players[2]; 

    public Nim() {

    }

    /**
     * Creates pile object to be used by the two players. 
     * It passes the players and the created pile 
     * into the internal game method.
     * @param firstPlayer Player that will be going first.
     * @param secondPlayer Player that will be going second.
     */
    public void play(Players firstPlayer, Players secondPlayer) {

        Pile gamePile = new Pile();

        Players gameWinner;
        gameWinner = internalGame(firstPlayer, secondPlayer, gamePile);

        System.out.println(gameWinner.playerName()
                + " IS THE ULTIMATE NIM MASTER\n\n"
                        + "AS CUSTOM DICTATES..."
                        + "\n\n " + gameWinner.playerName()
                        + " tossed his opponent into the abyss"
                                + "");
        //name winner and kill loser. (told you it was deadly...)

        System.out.println("\n\n~~~ Thank you for playing ¯\\_(ツ)_/¯ ~~~");
    }

    /**
     * The loop which contains the actual game of nim that uses polymorphism.
     * @param firstPlayer the player that will be going first.
     * @param secondPlayer the player that will be going second.
     * @param gamePile the object representing a pile of marbles.
     * @return winner the player who was victorious in the game.
     */
    public Players internalGame
        (Players firstPlayer, Players secondPlayer, Pile gamePile) {

        gamePlayers[0] = firstPlayer;
        gamePlayers[1] = secondPlayer;
        boolean foundWinner = false;
        Players winner = null;

        while (foundWinner == false) {
            for (int i = 0; i < 2; i++) {
                System.out.println("###################"
                        + "#####################\n");   
                //barriers to make reading easier
                
                //displays players name
                System.out.println(gamePlayers[i].playerName() + //polymorphism
                        " it is your turn\n\n");
                
                //Displays amount of marbles in the pile.
                System.out.println("The pile contains "
                        + gamePile.getPileSize() + 
                        " DEATH BALLS\n\n");

                //
            int subtraction = gamePlayers[i].playerMove(gamePile.getPileSize());
            
                gamePile.subtractFromPile(subtraction);

                System.out.println("The pile contains "
                        + gamePile.getPileSize() + " DEATH BALLS\n\n");

                System.out.println("####################"
                        + "######################\n");

                winner = gamePlayers[i];

                if (gamePile.getPileSize() == 1) {
                    foundWinner = true;
                    i++;
                }
            }
        }
        return winner;
    }
}
