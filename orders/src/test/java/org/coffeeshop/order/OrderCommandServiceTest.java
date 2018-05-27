package org.coffeeshop.order;

import org.coffeeshop.event.entities.*;
import org.coffeeshop.event.EventPublisher;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class OrderCommandServiceTest {
    EventPublisher eventPublisher = mock(EventPublisher.class);
    OrderCommandService sut = new OrderCommandService(eventPublisher);

    @Test
    public void order_should_be_placed_when_an_order_is_commanded(){
        //GIVEN
        OrderPlaced expectedOrderPlaced = new OrderPlaced(CoffeeType.LONGO, BeanSpecie.ARABICA);
        //WHEN
        sut.placeOrder(CoffeeType.LONGO, BeanSpecie.ARABICA);
        //THEN
        verify(eventPublisher,times(1)).publish(expectedOrderPlaced);
    }

    @Test
    public void should_accept_an_order_when_the_order_has_been_accepted() throws Exception {
        //GIVEN
        OrderAccepted orderAccepted = new OrderAccepted(CoffeeType.LONGO, BeanSpecie.ARABICA);
        //WHEN
        sut.acceptOrder(CoffeeType.LONGO, BeanSpecie.ARABICA);
        //THEN
        verify(eventPublisher, times(1)).publish(orderAccepted);
    }

    @Test
    public void should_start_an_order_when_coffee_brew_started() throws Exception {
        //GIVEN
        final OrderStarted orderStarted = new OrderStarted(CoffeeType.LONGO, BeanSpecie.ARABICA);
        //WHEN
        sut.startOrder(CoffeeType.LONGO, BeanSpecie.ARABICA);
        //THEN
        verify(eventPublisher, times(1)).publish(orderStarted);
    }

    @Test
    public void should_finish_order() throws Exception {
        //GIVEN
        final OrderFinished orderFinished = new OrderFinished(CoffeeType.LONGO, BeanSpecie.ARABICA);
        //WHEN
        sut.finishOrder(CoffeeType.LONGO, BeanSpecie.ARABICA);
        //THEN
        verify(eventPublisher, times(1)).publish(orderFinished);
    }
}
