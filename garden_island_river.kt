//Main Function to Start Program
fun main(args: Array<String>) {

    //Function to Set-up the Program
    fun setupGame() {

        //Create Player 1
        val player1 = Player("Tony", 100)

        //Create Player 2
        val player2 = Player("Dave", 100)

        //Create Deck
        val deck = Deck()

        //Deal 4 cards to each Player
        player1.receiveCards(deck.deal(4))
        player2.receiveCards(deck.deal(4))

        //Create Game
        val game = Game(player1, player2, deck)
    }

    //Function to Play a Round
    fun playRound() {

        //Set up the Game
        setupGame()

        //Start the Round
        game.startRound()

        //Play One Card
        game.playCard()

        //Print the Result
        println("Results: ${game.result())
    }

    //Function to Play the Game
    fun playGame() {

        //Variables
        var isGameOver = false
        var winner: Player? = null

        //Loop Until Game Over
        while (!isGameOver) {

            //Play a Round
            playRound()

            //Check if Game Over
            if (game.checkGameOver()) {

                //Set Game Over to True
                isGameOver = true

                //Set Winner
                winner = game.winner()
            }
        }

        //Print Winner
        if (winner != null) {
            println("${winner.name} wins!")
        } else {
            println("It's a draw!")
        }
    }

    //Play the Game
    playGame()

}

//Class to Represent a Player
class Player(val name: String, var points: Int){

    //List to Store Player Cards
    val cards = mutableListOf<Card>()

    //Function to Receive Cards
    fun receiveCards(cards: List<Card>) {
        this.cards.addAll(cards)
    }

    //Function to Play a Card
    fun playCard() : Card? {
        if (cards.isNotEmpty()) {
            return cards.removeAt(0)
        } else {
            return null
        }
    }
}

//Class to Represent a Card
class Card(val value: Int, val type: CardType){

    //Function to Calculate card Value
    fun cardValue() : Int {
        return when (type) {
            CardType.DIAMONDS -> value * 2
            CardType.HEARTS -> value * 3
            CardType.CLUBS -> value * 4
            CardType.SPADES -> value * 5
        }
    }

}

//Enum to Represent Card Type
enum class CardType{
    DIAMONDS,
    HEARTS,
    CLUBS,
    SPADES
}

//Class to Represent a Deck of Cards
class Deck {

    //List to Store Cards
    val cards = mutableListOf<Card>()

    //Constructor to Create a Deck
    init {

        //Loop Through Card Types
        for (type in CardType.values()) {

            //Loop Through Card Values
            for (value in 1..10) {

                //Create Card
                val card = Card(value, type)

                //Add Card to Deck
                cards.add(card)
            }
        }
    }

    //Function to Shuffle the Deck
    fun shuffle() {

        //Create Mutable List for Shuffled Cards
        val shuffledCards = mutableListOf<Card>()

        //Loop While Cards Not Empty
        while (cards.isNotEmpty()) {

            //Choose Random Index
            val randIndex = (0 until cards.size).random()

            //Add Card to Shuffled Cards
            shuffledCards.add(cards.removeAt(randIndex))
        }

        //Set Cards to Shuffled Cards
        cards.addAll(shuffledCards)
    }

    //Function to Deal Cards
    fun deal(numCards: Int) : List<Card> {

        //Create List to Store Dealt Cards
        val dealtCards = mutableListOf<Card>()

        //Loop numCards Times
        repeat (numCards) {

            //Check if Cards Not Empty
            if (cards.isNotEmpty()) {

                //Remove Card from Deck
                val card = cards.removeAt(0)

                //Add Card to Dealt Cards
                dealtCards.add(card)
            }
        }

        //Return Dealt Cards
        return dealtCards
    }

}

//Class to Represent a Game
class Game(val player1: Player, val player2: Player, val deck: Deck) {

    //Variables
    var player1Score = 0
    var player2Score = 0

    //Function to Start Round
    fun startRound() {

        //Shuffle the Deck
        deck.shuffle()

        //Reset Player Scores
        player1Score = 0
        player2Score = 0
    }

    //Function to Play a Card
    fun playCard() {

        //Play Card from each Player
        val player1Card = player1.playCard()
        val player2Card = player2.playCard()

        //Check if Player1 Played a Card
        if (player1Card != null) {

            //Add Card Value to Player1 Score
            player1Score += player1Card.cardValue()
        }

        //Check if Player2 Played a Card
        if (player2Card != null) {

            //Add Card Value to Player2 Score
            player2Score += player2Card.cardValue()
        }
    }

    //Function to Check if Game is Over
    fun checkGameOver(): Boolean {

        //Check if either Player is Out of Cards
        return player1.cards.isEmpty() || player2.cards.isEmpty()
    }

    //Function to Get the Winner
    fun winner() : Player? {

        //Check if there is a Winner
        return if (player1Score > player2Score) {
            player1
        } else if (player1Score < player2Score) {
            player2
        } else {
            null
        }
    }

    //Function to Get the Result
    fun result() : String {
        return "${player1.name} Score: $player1Score vs ${player2.name} Score: $player2Score"
    }

}