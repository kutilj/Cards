package io.kutilj.cards;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class that represents a Deck in a card game
 */
public class Deck {

    /**
     * The Cards in the Deck
     */
    private List<Card> cards;

    /**
     * Default constructor
     */
    public Deck() {
        cards = new ArrayList<>();
    }

    /**
     * Constructs a Deck with the given Cards
     *
     * @param cards The List of Cards given to construct the Deck
     */
    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    /**
     * Gets the current Cards in the Deck
     *
     * @return Returns the List of Cards in the Deck
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * Sets the Cards in the Deck
     *
     * @param cards The Cards given to the Deck
     */
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    /**
     * Builder method
     * <p>
     * Builds a Deck with the given Cards
     *
     * @param cards The Cards given to the Deck
     * @return Returns a Deck
     */
    public Deck withCards(List<Card> cards) {
        this.cards = cards;
        return this;
    }

    /**
     * Adds a Card to the Current Deck
     *
     * @param card The Card given to the Deck
     */
    public void addCard(Card card) {
        this.cards.add(card);
    }

}
