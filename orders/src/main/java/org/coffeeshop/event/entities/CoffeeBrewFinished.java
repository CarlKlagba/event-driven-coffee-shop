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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final CoffeeBrewFinished that = (CoffeeBrewFinished) o;

        if (coffeeType != that.coffeeType) return false;
        return beanSpecie == that.beanSpecie;
    }

    @Override
    public int hashCode() {
        int result = coffeeType != null ? coffeeType.hashCode() : 0;
        result = 31 * result + (beanSpecie != null ? beanSpecie.hashCode() : 0);
        return result;
    }
}
