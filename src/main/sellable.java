package main;

import creatures.Human;

public interface sellable {
    public void sell(Human buyer, Human seller, Double price);
}
