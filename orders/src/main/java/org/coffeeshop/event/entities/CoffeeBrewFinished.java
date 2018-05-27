package org.coffeeshop.event.entities;

import org.coffeeshop.event.entities.BeanSpecie;
import org.coffeeshop.event.entities.CoffeeType;

public class CoffeeBrewFinished {
    private final CoffeeType coffeeType;
    private final BeanSpecie beanSpecie;

    public CoffeeBrewFinished(final CoffeeType coffeeType, final BeanSpecie beanSpecie) {
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
