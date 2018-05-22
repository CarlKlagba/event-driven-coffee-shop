package org.coffeeshop.order;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;
import org.coffeeshop.event.entities.BeanSpecie;
import org.coffeeshop.event.entities.CoffeeType;
import org.coffeeshop.event.EventPublisher;
import org.coffeeshop.event.entities.OrderPlaced;
import org.coffeshop.event.entities.OrderAccepted;
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
}
