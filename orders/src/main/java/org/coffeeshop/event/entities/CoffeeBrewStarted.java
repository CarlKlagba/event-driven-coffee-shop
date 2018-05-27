package org.coffeeshop.event.entities;

import org.coffeeshop.event.entities.BeanSpecie;
import org.coffeeshop.event.entities.CoffeeType;

public class CoffeeBrewStarted {
    private final BeanSpecie beanSpecie;
    private final CoffeeType coffeeType;

    public CoffeeBrewStarted(final CoffeeType coffeeType, final BeanSpecie beanSpecie) {
        this.coffeeType = coffeeType;
        this.beanSpecie = beanSpecie;
    }

    public BeanSpecie getBeanSpecie() {
        return beanSpecie;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }
}
