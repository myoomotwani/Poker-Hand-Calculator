# Poker Game

Poker is a card game in which players bet over which hand is best according to the game's rules.

Cards are dealt in a phased manner. Here are the  stages

- Hole cards - Each player (who are still in the round) gets dealt 2 cards. 
-  Flop - 3 card are placed in the center. 
- Turn - 1 more card is placed in center.
- River - 1 more card is placed in center.
- Show

![image](https://user-images.githubusercontent.com/13993416/211239579-b69c330b-2f7c-4521-8945-8d2a6301afc4.png)

Before each stage , any of the players can bet more or raise the bet. In order to remain in the round , other players need to match the amount .i.e "Call" , or "Raise" it furthure. If they dont want to match the amount , they can "fold" the cards and stay out for that round. 

All the money collected as part of bets goes to a "pot". 

After "show" , best hands (best combination) for each player , who are still in the round, is determined . 


Hand for a player is decided among best 5 out of the 7 cards for the player. </br>
<pre> 7 cards = 2 hole  + 5 community cards </br>
         = 2 hole  + 3 flop + 1 turn + 1 river </pre>
 
 
The player with the best hand wins the pot.And the winner takes it all.        

# Poker Hands
 
 1. Royal flush
A, K, Q, J, 10, all the same suit.
<img width="615" alt="1 royal flush" src="https://user-images.githubusercontent.com/13993416/211237995-90aa1c6b-1e14-4eb7-8026-aded81505254.png">

2. Straight flush
Five cards in a sequence, all in the same suit.
<img width="615" alt="2 straight flush" src="https://user-images.githubusercontent.com/13993416/211238061-690a7f46-5d93-4af0-8034-c6e8ec5f169f.png">

3. Four of a kind
All four cards of the same rank.
<img width="614" alt="3 Four of a kind" src="https://user-images.githubusercontent.com/13993416/211238101-970610ce-9429-4e48-b042-f309d7ffb722.png">

4. Full house
Three of a kind with a pair.
<img width="616" alt="4 Full House" src="https://user-images.githubusercontent.com/13993416/211238122-40c0e9d4-2c0f-4cb6-9986-e7b213e2e4cc.png">

5. Flush
Any five cards of the same suit, but not in a sequence.
<img width="613" alt="5 Flush" src="https://user-images.githubusercontent.com/13993416/211238141-8a209682-98b8-43f4-9ef3-654d80cc22ac.png">

6. Straight
Five cards in a sequence, but not of the same suit.
<img width="605" alt="6 Straight" src="https://user-images.githubusercontent.com/13993416/211238158-cb6097c8-b715-4a72-a5c6-573ad6f3b55f.png">

7. Three of a kind
Three cards of the same rank.
<img width="609" alt="7 Three of a kind" src="https://user-images.githubusercontent.com/13993416/211238181-de33b8c5-ced6-409c-9c11-5f43140a67a0.png">

8. Two pair
Two different pairs.
<img width="623" alt="8 Two Pairs" src="https://user-images.githubusercontent.com/13993416/211238197-9631e3d1-b5cc-4b6f-9c42-ead70e8f0427.png">

9. Pair
Two cards of the same rank.
<img width="612" alt="9 Pair" src="https://user-images.githubusercontent.com/13993416/211238306-e7c03cde-7363-439d-ae81-d0274682c2d7.png">

10. High Card
When you haven't made any of the hands above, the highest card plays. In the example below, the jack plays as the highest card.
<img width="602" alt="10 High card" src="https://user-images.githubusercontent.com/13993416/211238232-792b720a-f0d8-4f03-ae7b-a308e0f40ad6.png">
     
# Project scope     
This project does not take care of betting system in poker , but only focuses on calculating best hand for players. </br>

As of now  below combinations are covered to be checked </br>

- Royal Flush
- Stright Flush
- Straight
- Flush


