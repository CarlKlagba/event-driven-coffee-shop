package org.coffeeshop.order;

import org.coffeeshop.event.entities.BeanSpecie;
import org.coffeeshop.event.entities.CoffeeType;
import org.coffeeshop.event.entities.OrderedBeansValidated;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class OrderEventHandlerTest {

    final OrderCommandService orderCommandService = mock(OrderCommandService.class);
    OrderEventHandler sut = new OrderEventHandler(orderCommandService);

    @Test
    public void should_handle_when_ordered_beans_are_validated() throws Exception {
        //GIVEN
        OrderedBeansValidated orderedBeansValidated = new OrderedBeansValidated(CoffeeType.LONGO, BeanSpecie.ROBUSTO);
        //WHEN
        sut.handle(orderedBeansValidated);
        //THEN
        verify(orderCommandService, times(1)).acceptOrder(CoffeeType.LONGO, BeanSpecie.ROBUSTO);
    }
}
