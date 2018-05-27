package org.coffeeshop.order;

import org.coffeeshop.event.EventPublisher;
import org.coffeeshop.event.entities.BeanSpecie;
import org.coffeeshop.event.entities.CoffeeType;
import org.coffeeshop.event.entities.OrderPlaced;
import org.coffeshop.event.entities.OrderAccepted;

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

    public void acceptOrder(final CoffeeType coffeeType, final BeanSpecie beanSpecie) {
        eventPublisher.publish(new OrderAccepted(coffeeType, beanSpecie));
    }

    public void startOrder(final CoffeeType longo, final BeanSpecie robusto) {

    }
}
