# BlackJack
Recreated BlackJack game in Java.

I used functions, loops and logic structure to create this.

-Created public integers : playerPts and dealerPts; these will keep track if either of them reaches to 21 or goes beyond it.
-Used Randomizer object to randomize picking up a card.
-Created a public string array : numToCar; to display what card was received.
-Initializer function : initi; provides the player a card, then the dealer and then to player again. If player receives 21 within the first two tries, player wins. Else, player has a decision to HIT or to STAND.
-Then player() function was called to keep track of player's decisions, points and cards. Use a while loop to make sure the playerPts is restricted till 20. After each serve, the player has a chance to HIT or to STAND. 
-If the player keep HITTING, they will either have 21 or more points. If pts = 21, player wins; while if pts > 21, players loses.
-When the player decides to STAND, dealer() function is called.
-The dealer's goal is to score either more than player and less than 22. The dealer will be served until either : i) dealerPts == playerPts; the game is a draw.
                                                                                                                  ii) dealerPts > playerPts and dealerPts<21; dealer wins.
                                                                                                                  iii) deakerPts > playerPts and dealerPts > 21; player wins.
                                                                                                                  
The game conitnues until one of the ending conditions are met.                                                                                                                  
