import io.kutilj.cards.Card;
import io.kutilj.cards.Dealer;
import io.kutilj.cards.Deck;
import io.kutilj.cards.Player;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

/**
 * Simple class for testing the functionality of shuffling and dealing a deck of cards
 */
public class CardsTest {

    private Dealer dealer;

    /**
     * Test setup method that initializes the deck and the dealer
     */
    @BeforeMethod()
    public void setup() {

        dealer = new Dealer(createFullDeck());

    }

    /**
     * Tests that Cards can be compared to see if they are equal
     */
    @Test
    public void testCardCompare() {

        Card aceOfClubs = new Card("Ace", "Clubs", 1);
        Card aceOfSpades = new Card("Ace", "Spades", 1);

        assertNotEquals(aceOfClubs, aceOfSpades, "Cards are equal");

        Card aceOfHearts = new Card("Ace", "Hearts", 1);
        Card aceOfHearts2 = new Card("Ace", "Hearts", 1);

        assertEquals(aceOfHearts, aceOfHearts2, "Cards are not equal");

    }

    /**
     * Test that Decks can be compared to see if they are equal
     */
    @Test
    public void testDeckCompare() {

        assertEquals(dealer.getDeck().getCards(), createFullDeck().getCards(), "Decks are not equal, both should be organized");

    }

    /**
     * Test method that attempts to shuffle a deck and then validate that it is shuffled
     */
    @Test
    public void testShuffle() {

        dealer.shuffle();

        // validate deck is shuffled, deck is shuffled if the current deck doesn't equal a fresh full deck
        assertNotEquals(dealer.getDeck().getCards(), createFullDeck().getCards(), "Decks are equal, one should be shuffled");

    }

    /**
     * Test method that attempts to deal cards to n players and then validate that each player has the correct amount of
     * cards
     */
    @Test
    public void testDeal() {

        List<Player> players = createPlayers(10);

        dealer.shuffle();
        dealer.deal(players, 5);

        players.forEach(System.out::println);

        // validate all players received cards by iterating through the hands of the players and checking the deck if it exists


    }

    /**
     * Tests that the deal method for the Dealer throws an IllegalArgumentException when a bad deal is given
     */
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testBadDeal() {

        List<Player> players = createPlayers(10);

        dealer.shuffle();
        dealer.deal(players, 6);

    }

    @Test
    public void testAddCardToDeck() {

        dealer.shuffle();
        dealer.addCard(new Card());

    }

    @Test
    public void testAddDuplicateCardToDeck() {

    }

    @Test
    public void testAddCardToFullDeck() {

    }

    @Test
    public void testRemoveCard() {

    }

    /**
     * Test helper method for creating a new organized full Deck
     *
     * @return Returns a new full Deck
     */
    private Deck createFullDeck() {

        return new Deck()
                .withCards(
                        new ArrayList<>(
                                Arrays.asList(
                                        new Card("Ace", "Clubs", 1),
                                        new Card("2", "Clubs", 2),
                                        new Card("3", "Clubs", 3),
                                        new Card("4", "Clubs", 4),
                                        new Card("5", "Clubs", 5),
                                        new Card("6", "Clubs", 6),
                                        new Card("7", "Clubs", 7),
                                        new Card("8", "Clubs", 8),
                                        new Card("9", "Clubs", 9),
                                        new Card("10", "Clubs", 10),
                                        new Card("Jack", "Clubs", 11),
                                        new Card("Queen", "Clubs", 12),
                                        new Card("King", "Clubs", 13),
                                        new Card("Ace", "Hearts", 1),
                                        new Card("2", "Hearts", 2),
                                        new Card("3", "Hearts", 3),
                                        new Card("4", "Hearts", 4),
                                        new Card("5", "Hearts", 5),
                                        new Card("6", "Hearts", 6),
                                        new Card("7", "Hearts", 7),
                                        new Card("8", "Hearts", 8),
                                        new Card("9", "Hearts", 9),
                                        new Card("10", "Hearts", 10),
                                        new Card("Jack", "Hearts", 11),
                                        new Card("Queen", "Hearts", 12),
                                        new Card("King", "Hearts", 13),
                                        new Card("Ace", "Spades", 1),
                                        new Card("2", "Spades", 2),
                                        new Card("3", "Spades", 3),
                                        new Card("4", "Spades", 4),
                                        new Card("5", "Spades", 5),
                                        new Card("6", "Spades", 6),
                                        new Card("7", "Spades", 7),
                                        new Card("8", "Spades", 8),
                                        new Card("9", "Spades", 9),
                                        new Card("10", "Spades", 10),
                                        new Card("Jack", "Spades", 11),
                                        new Card("Queen", "Spades", 12),
                                        new Card("King", "Spades", 13),
                                        new Card("Ace", "Diamonds", 1),
                                        new Card("2", "Diamonds", 2),
                                        new Card("3", "Diamonds", 3),
                                        new Card("4", "Diamonds", 4),
                                        new Card("5", "Diamonds", 5),
                                        new Card("6", "Diamonds", 6),
                                        new Card("7", "Diamonds", 7),
                                        new Card("8", "Diamonds", 8),
                                        new Card("9", "Diamonds", 9),
                                        new Card("10", "Diamonds", 10),
                                        new Card("Jack", "Diamonds", 11),
                                        new Card("Queen", "Diamonds", 12),
                                        new Card("King", "Diamonds", 13)
                                )
                        )
                );

    }

    /**
     * Test helper method for creating a new organized full Deck
     *
     * @return Returns a new full Deck
     */
    private Deck createHalfDeck() {

        return new Deck()
                .withCards(
                        new ArrayList<>(
                                Arrays.asList(
                                        new Card("Ace", "Clubs", 1),
                                        new Card("2", "Clubs", 2),
                                        new Card("3", "Clubs", 3),
                                        new Card("4", "Clubs", 4),
                                        new Card("5", "Clubs", 5),
                                        new Card("6", "Clubs", 6),
                                        new Card("7", "Clubs", 7),
                                        new Card("8", "Clubs", 8),
                                        new Card("9", "Clubs", 9),
                                        new Card("10", "Clubs", 10),
                                        new Card("Jack", "Clubs", 11),
                                        new Card("Queen", "Clubs", 12),
                                        new Card("King", "Clubs", 13),
                                        new Card("Ace", "Hearts", 1),
                                        new Card("2", "Hearts", 2),
                                        new Card("3", "Hearts", 3),
                                        new Card("4", "Hearts", 4),
                                        new Card("5", "Hearts", 5),
                                        new Card("6", "Hearts", 6),
                                        new Card("7", "Hearts", 7),
                                        new Card("8", "Hearts", 8),
                                        new Card("9", "Hearts", 9),
                                        new Card("10", "Hearts", 10),
                                        new Card("Jack", "Hearts", 11),
                                        new Card("Queen", "Hearts", 12),
                                        new Card("King", "Hearts", 13),
                                        new Card("Ace", "Spades", 1),
                                        new Card("2", "Spades", 2),
                                        new Card("3", "Spades", 3),
                                        new Card("4", "Spades", 4),
                                        new Card("5", "Spades", 5),
                                        new Card("6", "Spades", 6),
                                        new Card("7", "Spades", 7),
                                        new Card("8", "Spades", 8),
                                        new Card("9", "Spades", 9),
                                        new Card("10", "Spades", 10),
                                        new Card("Jack", "Spades", 11),
                                        new Card("Queen", "Spades", 12),
                                        new Card("King", "Spades", 13),
                                        new Card("Ace", "Diamonds", 1),
                                        new Card("2", "Diamonds", 2),
                                        new Card("3", "Diamonds", 3),
                                        new Card("4", "Diamonds", 4),
                                        new Card("5", "Diamonds", 5),
                                        new Card("6", "Diamonds", 6),
                                        new Card("7", "Diamonds", 7),
                                        new Card("8", "Diamonds", 8),
                                        new Card("9", "Diamonds", 9),
                                        new Card("10", "Diamonds", 10),
                                        new Card("Jack", "Diamonds", 11),
                                        new Card("Queen", "Diamonds", 12),
                                        new Card("King", "Diamonds", 13)
                                )
                        )
                );

    }

    private List<Player> createPlayers(int numPlayers) {

        String[] names = {"Classie", "Domenic", "Yelena", "Stephnie", "Emmanuel", "Vada", "Lonna", "Kristi", "Louella",
                "Luigi", "Brenda", "Reda", "Thad", "Penelope", "Lajuana", "Irmgard", "Lore", "Randell", "Latesha", "Arturo",
                "Rivka", "Viola", "Bradly", "Margo", "Zoe", "Laure", "Livia", "Dwain", "Olen", "Lawrence", "Angella", "Denisse",
                "Dalene", "Garnet", "Ronda", "Mina", "Delfina", "Lane", "Norbert", "Huong", "Suzann", "Alphonse", "Rea",
                "Julene", "Garry", "Cristin", "Debra", "Sybil", "Ouida", "Roselyn", "Errol", "Paulene", "Alisia", "Rene",
                "Sanjuana", "Sherri", "Erlinda", "Buford", "Abel", "Cherrie", "Fairy", "Lenore", "Merrilee", "Christin",
                "Krystina", "Pennie", "Deadra", "Yolonda", "Wilmer", "Daniella", "Vashti", "Nannette", "Jada", "Keisha", "Rubin",
                "Michiko", "Francine", "Cindi", "Christa", "Hee", "Rosemary", "Helene", "Marcela", "Inell", "Katrice", "Bev",
                "Berneice", "Migdalia", "Dirk", "Filiberto", "Kimberly", "Jaclyn", "Marcelina", "Patience", "Cheri", "Gena",
                "Cheryle", "Drew", "Clorinda", "Juanita"};

        List<Player> players = new ArrayList<>();

        for (int i = 0; i < numPlayers; i++) {
            players.add(new Player(names[(new Random().nextInt(names.length - 1))]));
        }

        return players;
    }

}
