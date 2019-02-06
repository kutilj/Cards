import io.kutilj.cards.Dealer;
import io.kutilj.cards.Deck;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Simple class for testing the functionality of shuffling and dealing a deck of cards
 */
public class CardsTest {

    private Deck deck;
    private Dealer dealer;

    /**
     * Test setup method that initializes the deck and the dealer
     */
    @BeforeClass
    public void setup() {

        deck = new Deck();
        dealer = new Dealer(deck);

    }

    /**
     * Test method that attempts to shuffle a deck and then validate that it is shuffled
     */
    @Test
    public void testShuffle() {

        dealer.shuffle();

        // validate deck is shuffled

    }

    /**
     * Test method that attempts to deal cards to n players and then validate that each player has the correct amount of
     * cards
     */
    @Test(dependsOnMethods = "testShuffle")
    public void testDeal() {

        dealer.deal(8);

        // validate all players received cards

    }

}
