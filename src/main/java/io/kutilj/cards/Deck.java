package io.kutilj.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
     * Adds a Card to the current Deck
     *
     * @param card The Card given to the Deck
     */
    public void addCard(Card card) {

        if (!(this.cards.size() < 52)) throw new IllegalArgumentException("A Deck cannot be larger than 52 Cards");

        if (!this.cards.contains(card)) {
            this.cards.add(card);
        } else {
            throw new IllegalArgumentException("A duplicate Card cannot be added to the Deck");
        }

    }

    /**
     * Removes the Card on top of the Deck
     */
    public void removeCard() {
        this.cards.remove(0);
    }

    /**
     * Removes a Card from the current Deck
     *
     * @param card The Card to be removed
     */
    public void removeCard(Card card) {

        if (!cards.contains(card)) throw new IllegalArgumentException("This Card isn't in the Deck");

        this.cards.remove(card);

    }

    @Override
    public String toString() {
        return cards.stream().map(Card::toString).collect(Collectors.joining(","));
    }

}
