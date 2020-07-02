package kg.neobis.task.mapper;

import kg.neobis.task.dto.CakeDto;
import kg.neobis.task.dto.IngredientsDto;
import kg.neobis.task.entity.Cake;
import kg.neobis.task.entity.Ingredients;
import org.springframework.stereotype.Service;

@Service
public interface IngredientsMapper {
    IngredientsDto toIngredientsDto(Ingredients ingredients);
}
