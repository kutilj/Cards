import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CardsTest {

    Deck deck;
    Dealer dealer;

    /**
     * Test setup method that initializes the deck and the dealer
     */
    @BeforeClass
    public void setup() {

        deck = new Deck();
        dealer = new Dealer();

    }

    /**
     * Test method that attempts to shuffle a deck and then validate that it is shuffled
     */
    @Test
    public void testShuffle() {

        dealer.shuffle(deck);

        // validate deck is shuffled

    }

    /**
     * Test method that attempts to deal cards to n players and then validate that each player has the correct amount of
     * cards
     */
    @Test
    public void testDeal() {

        dealer.deal(8);

        // validate all players received cards

    }

}
