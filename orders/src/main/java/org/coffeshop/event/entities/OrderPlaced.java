package org.coffeshop.event.entities;

/**
 * Created by User on 22/05/2018.
 */
public class OrderPlaced {
    private final CoffeeType coffeeType;
    private final BeanSpecie beanSpecie;

    public OrderPlaced(CoffeeType coffeeType, BeanSpecie beanSpecie) {
        this.coffeeType = coffeeType;
        this.beanSpecie = beanSpecie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPlaced that = (OrderPlaced) o;

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
