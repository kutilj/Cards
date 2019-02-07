package io.kutilj.cards;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class representing a Player in a card game
 */
public class Player {

    /**
     * The Name of the Player
     */
    private String name;

    /**
     * The Cards that the Player currently has
     */
    private List<Card> hand;

    /**
     * Default constructor
     */
    public Player() {
        hand = new ArrayList<>();
    }

    /**
     * Constructs a Player with a name and an empty hand
     *
     * @param name The Name of the Player
     */
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    /**
     * Initializes a Player with a name and whatever hand is given to them
     *
     * @param name The Name of the Player
     * @param hand The Hand given to the Player
     */
    public Player(String name, List<Card> hand) {
        this.name = name;
        this.hand = hand;
    }

    /**
     * Gets the Name of the Player
     *
     * @return Returns the Name of the Player
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the Name of the Player
     *
     * @param name The Name of the Player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Builder method
     * <p>
     * Builds a Player with a Name
     *
     * @param name The Name of the Player
     * @return Returns a Player
     */
    public Player withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Gets the current Hand of the Player
     *
     * @return Returns the current Hand
     */
    public List<Card> getHand() {
        return hand;
    }

    /**
     * Sets the current Hand of the Player
     *
     * @param cards The Hand given to the Player
     */
    public void setHand(List<Card> cards) {
        this.hand = cards;
    }

    /**
     * Builder method
     * <p>
     * Builds a Player with the given Hand
     *
     * @param hand The Hand given to the Player
     * @return Returns a Player
     */
    public Player withHand(List<Card> hand) {
        this.hand = hand;
        return this;
    }

    /**
     * Adds a Card to the Player's current Hand
     *
     * @param card The Card given to the Player
     */
    public void addCard(Card card) {
        this.hand.add(card);
    }

}
