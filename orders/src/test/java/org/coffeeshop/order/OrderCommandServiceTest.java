package org.coffeeshop.order;

import org.coffeshop.event.entities.BeanSpecie;
import org.coffeshop.event.entities.CoffeeType;
import org.coffeshop.event.EventPublisher;
import org.coffeshop.event.entities.OrderPlaced;
import org.coffeshop.order.OrderCommandService;
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

}
