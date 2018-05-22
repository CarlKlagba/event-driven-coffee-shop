package org.coffeeshop.order;

import org.coffeeshop.event.entities.OrderedBeansValidated;

/**
 * Created by User on 22/05/2018.
 */
public class OrderEventHandler {

    private final OrderCommandService orderCommandService;

    public OrderEventHandler(final OrderCommandService orderCommandService) {
        this.orderCommandService = orderCommandService;
    }


    public void handle(final OrderedBeansValidated orderedBeansValidated) {
        orderCommandService.acceptOrder(orderedBeansValidated.getCoffeeType(), orderedBeansValidated.getBeanSpecie());
    }
}
