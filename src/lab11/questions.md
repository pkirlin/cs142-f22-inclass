# Lab 11: Blackjack

Names:
- Name 1
- Name 2
- Name 3

Blackjack is a widely-played game in casinos.  Also known
as Twenty-One, the game is played between a single
player and the dealer (a casino employee, so you are
playing against "the house" rather than against other
players at the table.)  The object of the game is to 
collect cards that will make the highest sum possible,
hopefully achieving 21, without going over 21 (going over
21 is called busting).  The dealer also wants to achieve 
the highest sum without going over 21.  Whoever achieves 
the higher sum without busting is the winner of that "hand" 
of blackjack. The value of each card is the number on the 
card, with the exception of face cards, which are worth 
10, and aces, which are worth either 11 or 1 as the player 
chooses. If a player is dealt a "blackjack," which is an 
ace and a face card, (notice this makes 21), they 
immediately win and are paid a 50% bonus on their bet.

Our version of blackjack will be simplified from the 
way it works in real life.

The player (you) plays against the dealer.  There are no
other players at the table.  You begin with a certain 
amount of money.  You must make a bet (some amount of money)
that you are going to win the upcoming hand of blackjack.
Once you bet, you are dealt two cards face up, and the 
dealer is dealt one card face up.  If you have a blackjack,
you immediately win.  Otherwise, you must choose to either
take a new card ("hit") or keep your current total of cards
("stand").  If you make 21 exactly, you will automatically
stand.  If you go over 21, you "bust" and immediately lose.
You may continue to "hit" as long as the sum of your cards is
less than or equal to 21.  However, as you approach a sum of
21, the likelihood of busting becomes higher and higher, so
often players choose to "stand" when their sum starts to reach
the upper teens.

Once you choose to stand, the dealer is dealt a second card
and must make their choices about whether to hit or stand.
Normally, dealers in casinos must play according to a 
simple algorithm (they can't actually use any real strategy).
Here, our dealer will automatically hit until they reach 17
or higher, at which point they will stand.  The dealer might
also bust if they happen to get cards which put them over 21.

Once the dealer and player have both chosen to stand, and
neither has busted, we compare the hands to see who has
the higher sum.  If the player has the higher sum, they win,
and earn the amount of money they bet in the beginning.
If the player has the lower sum, they lose, and lose the amount
of money that they originally bet.  If the player and dealer
have the same total, they tie (sometimes called a "push")
and the player does not win or lose any money.

## Part A: Classes and Interfaces

- Open the Rank.java and Suit.java files.  Take a look
through the code.  These are both "enums", which are like
classes but only have a restricted range of values each
type can take (which are appropriate here, because there
are only four possible suits and thirteen possible ranks.)

- Open the Card class.  Look through it.  Notice how a
card has a Rank and a Suit.

- Open the Strategy interface.  This is an interface, so 
all six methods here have no bodies.  This interface allows
a programmer to specify what should happen when six different
situations occur in the game.  By writing code for these
methods, a programmer can design a blackjack "bot" that can
play the game according to some algorithm.

- Open the InteractiveStrategy class.  Notice this class
*implements* the Strategy interface, so it must define all
the methods.  Look through each method.  Notice how every 
time the player must actually make a decision (betting and
choosing to hit or stand), we make a Scanner and have the 
user type in what they want to do.

- Open Blackjack.java and look through the code.  You don't
need to understand everything here, but pay special attention
to the two STATIC methods at the end.  These are methods
that will allow you to compute the value of a hand (the sum
of the cards).  The one that returns a String also will tell
you if the hand is a hard hand or a soft hand.

- Open BlackjackRunner.  Play a few hands interactively.

## Part A: Writing some simple bots

Write a class called "AlwaysHitStrategy."  To do this,
make a new class that IMPLEMENTS the Strategy interface.
You will need to write all six methods, however, you can
leave four of them empty.  All you need to write is the
getDecision() method, which should always return Decision.HIT,
and the getBet() method, which should always return a 
bet of ten dollars.  You may find it useful to copy
the print statements from some or all of the methods
in InteractiveStrategy to AlwaysHitStrategy.

In BlackjackRunner, in main(), switch the code from
runInteractively() to runSimulations().  This will run
100 simulations of 1000 hands of blackjack each, following
whatever Strategy you specify.  On line 25, switch the
strategy to your AlwaysHitStrategy.  Each simulation has
the player starting with $10,000, and will keep track
of the amount of money the player ends with.

At the end of the 100 simulations, a graph will be produced
that shows how the distribution of the final amount of
money the player was left with.

- Copy & paste in the graph below here:

__Your answer here__

- What does the graph tell you about the always hit strategy
we just invented?  

__Your answer here__

Now design a class called AlwaysStandStrategy.  This will
be just like AlwaysHitStrategy, but it always stands 
instead of hitting.  It also always bets $10.  Run this
strategy through the simulator.

- Copy & paste in the graph below here:

__Your answer here__

- What does the graph tell you about the always stand strategy
we just invented?  Is it better or worse than always
hitting?

__Your answer here__

Now design a class called RandomStrategy.  This will
pick randomly between hitting and standing.
It also always bets $10.  Run this
strategy through the simulator.

- Copy & paste in the graph below here:

__Your answer here__

- Which of these three strategies seems to be best?
Why do you think this is the case?

__Your answer here__

## Part B: Better strategies

Read the section of wikipedia about basic strategy
for blackjack:

https://en.wikipedia.org/wiki/Blackjack#Basic_strategy

Write a class that implements a small portion of 
basic strategy.  For instance, you could write a 
strategy that imitates the dealer: hit on 16 or less
and stand on 17 or higher.  Play around with your
strategy to make it as good as you can.  

Like before, you may find it useful to copy some or
all of the print statements from InteractiveStrategy
to your class.

You can use the static getValue() and getValueAsString()
functions in the Blackjack class to figure out values 
of hands and hard/soft values as well.  

Even though these live in the Blackjack class, because
they are STATIC, you don't need an instance of the
Blackjack class to use them.  You can just call

Blackjack.getValue(an arraylist of cards) 

or 

Blackjack.getValueAsString(an arraylist of cards)
(this second one will always have "H" or "S" at
the beginning)

When you like your strategy, you can stop.

NOTE: Your strategy will still most likely lose money 
(in the long run) in every simulation, which is ok.  
This game is "rigged" in the casino's favor.  That doesn't
mean anyone is cheating, it's just that the rules of
blackjack mathematically favor the casino.  This is
true in our simplified version of blackjack and in the
"full" version that casinos use --- it's how they make
money!  The "basic strategy" described in the Wikipedia
entry is the mathematically optimal way to play
blackjack, and it will *still* lose money in the long
run.

- Copy & paste in the graph below here for your strategy.

__Your answer here__

## Part C: Card counting

In this last section, we will implement card counting,
which is a strategy where the player keeps track
of which cards have been dealt and which cards haven't.
If you know this information, you can make more informed
decisions about how much to bet, and whether to hit/stand
in certain situations.

We will implement a very basic card counting system (called Hi-Lo).
The idea is we keep a running counter variable that begins
at zero.  Every time a card with the number 2-6 is dealt,
we increase the counter by 1.  Every time a ten, face card,
or ace is dealt, we decrease the counter by 1.  These rules
apply to both the player and the dealer.  7/8/9 are ignored.
For the idea behind this strategy, read the "Basics" section
here:

https://en.wikipedia.org/wiki/Card_counting

Write a class that implements this Hi-Lo system.  Note that
you should still use the same basic strategy for hitting/standing
as before, but you should increase your bet whenever the 
card count is positive.  Try increasing your bet by $10 
for each positive number (so a card count of 1 means bet 20,
2 means bet 30, etc).  Keep betting 10 if the card count is
negative.  Or you can bet a smaller amount.  Play around
with this.  You should be able to design a system that
actually starts winning money (ending with more than 10000)
now, but probably not very often (the casino's edge is still
too high).

When you have a system that makes more than 10000 at least
sometimes, you can stop.

- Copy & paste in the graph below here for your strategy.

__Your answer here__

Can you improve your card counting?  Can you change your
hit/stand strategy?  Use Google to find other card
counting systems.