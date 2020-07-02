package kg.neobis.task.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CakeDto {
    private Long id;
    private String name;
    private String origin;
    private Integer price;
    private Integer weight;
    private Integer quantity;
}
