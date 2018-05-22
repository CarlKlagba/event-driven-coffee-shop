package org.coffeeshop.order;

import org.coffeeshop.event.EventPublisher;
import org.coffeeshop.event.entities.BeanSpecie;
import org.coffeeshop.event.entities.CoffeeType;
import org.coffeeshop.event.entities.OrderPlaced;

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
