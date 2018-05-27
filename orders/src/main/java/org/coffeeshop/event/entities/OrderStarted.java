package org.coffeeshop.event.entities;

import org.coffeeshop.event.entities.BeanSpecie;
import org.coffeeshop.event.entities.CoffeeType;

/**
 * Created by User on 27/05/2018.
 */
public class OrderStarted {
    private final CoffeeType coffeeType;
    private final BeanSpecie beanSpecie;

    public OrderStarted(final CoffeeType coffeeType, final BeanSpecie beanSpecie) {
        this.coffeeType = coffeeType;
        this.beanSpecie = beanSpecie;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public BeanSpecie getBeanSpecie() {
        return beanSpecie;
    }
}
