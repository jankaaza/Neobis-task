package kg.neobis.task.mapper.impl;

import kg.neobis.task.dto.IngredientsDto;
import kg.neobis.task.entity.Ingredients;
import kg.neobis.task.mapper.IngredientsMapper;
import org.springframework.stereotype.Service;

@Service
public class IngredientsMapperImpl implements IngredientsMapper {

    @Override
    public IngredientsDto toIngredientsDto(Ingredients ingredients) {
        IngredientsDto ingredientsDto = new IngredientsDto();
        ingredientsDto.setId(ingredients.getId());
        ingredientsDto.setIngredient1(ingredients.getIngredient1());
        ingredientsDto.setIngredient2(ingredients.getIngredient2());
        ingredientsDto.setIngredient3(ingredients.getIngredient3());
        ingredientsDto.setIngredient4(ingredients.getIngredient4());
        return ingredientsDto;

    }
}