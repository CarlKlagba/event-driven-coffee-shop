package org.coffeshop.event.entities;

import org.coffeeshop.event.entities.BeanSpecie;
import org.coffeeshop.event.entities.CoffeeType;

public class OrderAccepted {
    private final BeanSpecie beanSpecie;
    private final CoffeeType coffeType;

    public OrderAccepted(final CoffeeType coffeeType, final BeanSpecie beanSpecie) {
        this.coffeType = coffeeType;
        this.beanSpecie = beanSpecie;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final OrderAccepted that = (OrderAccepted) o;

        if (beanSpecie != that.beanSpecie) return false;
        return coffeType == that.coffeType;
    }

    @Override
    public int hashCode() {
        int result = beanSpecie != null ? beanSpecie.hashCode() : 0;
        result = 31 * result + (coffeType != null ? coffeType.hashCode() : 0);
        return result;
    }
}
