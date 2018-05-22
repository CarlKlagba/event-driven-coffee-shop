package org.coffeeshop.event.entities;

/**
 * Created by User on 22/05/2018.
 */
public class OrderedBeansValidated {
    private final CoffeeType coffeeType;
    private final BeanSpecie beanSpecie;

    public OrderedBeansValidated(CoffeeType coffeeType, BeanSpecie beanSpecie) {
        this.coffeeType = coffeeType;
        this.beanSpecie = beanSpecie;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public BeanSpecie getBeanSpecie() {
        return beanSpecie;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final OrderedBeansValidated that = (OrderedBeansValidated) o;

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
