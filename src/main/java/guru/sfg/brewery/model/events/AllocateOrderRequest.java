package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.BeerOrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Luca Moro on 28/02/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllocateOrderRequest {
    private BeerOrderDto beerOrderDto;
}
