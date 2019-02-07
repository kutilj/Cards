package io.kutilj.cards;

/**
 * A simple class that represents a Card in a card game
 */
public class Card {

    /**
     * The Name of the Card
     */
    private String name;

    /**
     * The Suit of the Card
     */
    private String suit;

    /**
     * The value of the Card
     */
    private int value;

    /**
     * Default constructor
     */
    public Card() {
    }

    /**
     * Constructs a card with a Name, Suit, and value
     *
     * @param name  The Name of the Card
     * @param suit  The Suit of the Card
     * @param value The value of the Card
     */
    public Card(String name, String suit, int value) {
        this.name = name;
        this.suit = suit;
        this.value = value;
    }

    /**
     * Gets the Name of the Card
     *
     * @return Returns the Name of the Card
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the Name of the Card
     *
     * @param name The Name given to the Card
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Builder method
     * <p>
     * Builds a Card with the given Name
     *
     * @param name The Name given to the Card
     * @return Returns a Car
     */
    public Card withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Gets the Suit of the Card
     *
     * @return Returns the Suit of the Card
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Sets the Suit of the Card
     *
     * @param suit The Suit given to the Card
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * Builder method
     * <p>
     * Builds a Card with the given Suit
     *
     * @param suit The Suit given to the Card
     * @return Returns a Card
     */
    public Card withSuit(String suit) {
        this.suit = suit;
        return this;
    }

    /**
     * Gets the value of the Card
     *
     * @return Returns the value of the Card
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the Card
     *
     * @param value The value given to the card
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Builder method
     * <p>
     * Builds a Card with the given value
     *
     * @param value The value given to the Card
     * @return Returns a Card
     */
    public Card withValue(int value) {
        this.value = value;
        return this;
    }

}
