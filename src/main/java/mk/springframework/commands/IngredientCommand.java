package mk.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mk.springframework.domain.UnitOfMeasure;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand unitOfMeasure;
}
