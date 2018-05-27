package org.coffeeshop.order;

import org.coffeeshop.event.EventPublisher;
import org.coffeeshop.event.entities.*;

public class OrderCommandService {

    private final EventPublisher eventPublisher;

    public OrderCommandService(EventPublisher eventPublisher) {
     this.eventPublisher = eventPublisher;
    }

    public void placeOrder(CoffeeType coffeeType, BeanSpecie beanSpecie) {
        eventPublisher.publish(new OrderPlaced(coffeeType, beanSpecie));
    }

    public void acceptOrder(final CoffeeType coffeeType, final BeanSpecie beanSpecie) {
        eventPublisher.publish(new OrderAccepted(coffeeType, beanSpecie));
    }

    public void startOrder(final CoffeeType coffeeType, final BeanSpecie beanSpecie) {
        eventPublisher.publish(new OrderStarted(coffeeType, beanSpecie));
    }

    public void finishOrder(final CoffeeType coffeeType, final BeanSpecie beanSpecie) {
        eventPublisher.publish(new OrderFinished(coffeeType, beanSpecie));
    }
}
