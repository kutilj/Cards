package io.kutilj.cards;

import java.util.Collections;

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
        shuffle(deck);
    }

    /**
     * Shuffles the Deck passed in by random sort
     *
     * @param deck The Deck to be shuffled
     */
    public void shuffle(Deck deck) {

        Collections.shuffle(deck.getCards());

    }

    /**
     * Deals Cards from the Deck to designated number of Players
     *
     * @param numPlayers The number of Players to be dealt to
     */
    public void deal(int numPlayers) {

    }

}
