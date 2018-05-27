package org.coffeeshop.event.entities;

public class OrderFinished {
    private final CoffeeType coffeeType;
    private final BeanSpecie beanSpecie;

    public OrderFinished(final CoffeeType coffeeType, final BeanSpecie beanSpecie) {
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

        final OrderFinished that = (OrderFinished) o;

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
