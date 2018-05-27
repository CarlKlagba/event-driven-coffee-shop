package org.coffeeshop.order;

import org.coffeeshop.event.entities.BeanSpecie;
import org.coffeeshop.event.entities.CoffeeType;
import org.coffeeshop.event.entities.OrderedBeansValidated;
import org.coffeeshop.event.entities.CoffeeBrewFinished;
import org.coffeeshop.event.entities.CoffeeBrewStarted;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class OrderEventHandlerTest {

    final OrderCommandService orderCommandService = mock(OrderCommandService.class);
    OrderEventHandler sut = new OrderEventHandler(orderCommandService);

    @Test
    public void should_accept_order_when_ordered_beans_are_validated() throws Exception {
        //GIVEN
        OrderedBeansValidated orderedBeansValidated = new OrderedBeansValidated(CoffeeType.LONGO, BeanSpecie.ROBUSTO);
        //WHEN
        sut.handle(orderedBeansValidated);
        //THEN
        verify(orderCommandService, times(1)).acceptOrder(CoffeeType.LONGO, BeanSpecie.ROBUSTO);
    }

    @Test
    public void should_start_order_when_coffee_brew_has_started() throws Exception {
        //GIVEN
        CoffeeBrewStarted coffeeBrewStarted = new CoffeeBrewStarted(CoffeeType.LONGO, BeanSpecie.ROBUSTO);
        //WHEN
        sut.handle(coffeeBrewStarted);
        //THEN
        verify(orderCommandService, times(1)).startOrder(CoffeeType.LONGO, BeanSpecie.ROBUSTO);
    }

    @Test
    public void should_finish_order_when_coffee_brew_has_finished() throws Exception {
        //GIVEN
        CoffeeBrewFinished coffeeBrewFinished = new CoffeeBrewFinished(CoffeeType.LONGO, BeanSpecie.ROBUSTO);
        //WHEN
        sut.handle(coffeeBrewFinished);
        //THEN
        verify(orderCommandService, times(1)).finishOrder(CoffeeType.LONGO, BeanSpecie.ROBUSTO);
    }
}
