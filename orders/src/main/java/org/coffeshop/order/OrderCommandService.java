package org.coffeshop.order;

import org.coffeshop.event.EventPublisher;
import org.coffeshop.event.entities.BeanSpecie;
import org.coffeshop.event.entities.CoffeeType;
import org.coffeshop.event.entities.OrderPlaced;

/**
 * Created by User on 22/05/2018.
 */
public class OrderCommandService {

    private final EventPublisher eventPublisher;

    public OrderCommandService(EventPublisher eventPublisher) {
     this.eventPublisher = eventPublisher;
    }

    public void placeOrder(CoffeeType coffeeType, BeanSpecie beanSpecie) {
        eventPublisher.publish(new OrderPlaced(coffeeType, beanSpecie));
    }
}
