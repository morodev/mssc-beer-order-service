package guru.sfg.brewery.model.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by Luca Moro on 28/02/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ValidateOrderResult {
    private UUID orderId;
    private Boolean isValid;
}
