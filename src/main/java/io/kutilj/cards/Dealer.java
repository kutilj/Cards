package io.kutilj.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * A simple class representing a Dealer in a card game that can shuffle the deck and deal the deck
 */
public class Dealer {

    /**
     * The Deck containing the cards
     */
    private Deck deck;

    /**
     * Default constructor
     */
    public Dealer() {
        deck = new Deck();
    }

    /**
     * Constructs the Deck with the Deck given to it
     *
     * @param deck The Deck given to the Dealer
     */
    public Dealer(Deck deck) {
        this.deck = deck;
    }

    /**
     * Returns the Deck currently being held by the Dealer
     *
     * @return The current Deck
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     * Sets the Deck the Dealer has
     *
     * @param deck The new Deck for the Dealer
     */
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    /**
     * Builder method
     * <p>
     * Builds a Dealer with the Deck passed in
     *
     * @param deck The Deck to build the Dealer with
     * @return Returns a Dealer
     */
    public Dealer withDeck(Deck deck) {
        this.deck = deck;
        return this;
    }

    /**
     * Adds a Card to the current Deck
     *
     * @param card The Card to be added to the Deck
     */
    public void addCard(Card card) {
        deck.addCard(card);
    }

    /**
     * Shuffles the Deck the Dealer currently has
     */
    public void shuffle() {

        // randomly sort the deck of cards
        Collections.shuffle(deck.getCards());

        // cut the shuffled deck in half
        List<Card> topOfDeck = new ArrayList<>(deck.getCards().subList(0, 26));
        List<Card> bottomOfDeck = new ArrayList<>(deck.getCards().subList(26, 52));

        // clear the original deck
        deck.getCards().clear();

        // add back the bottom of the original deck first and then top of the original deck second
        deck.getCards().addAll(bottomOfDeck);
        deck.getCards().addAll(topOfDeck);

    }

    /**
     * Deals Cards from the Deck to designated number of Players
     *
     * @param players  A list of Players to be dealt Cards
     * @param numCards The number of Cards to be dealt to each Player
     */
    public void deal(List<Player> players, int numCards) {

        if (players.size() * numCards > deck.getCards().size()) {
            throw new IllegalArgumentException("The given number of players and cards to deal is greater than the size of the deck");
        }

        IntStream.range(0, numCards)
                .mapToObj(i -> players.stream())
                .flatMap(Function.identity())
                .forEach(
                        player ->
                        {
                            player.addCard(deck.getCards().get(0));
                            deck.getCards().remove(0);
                        }
                );

    }

}
