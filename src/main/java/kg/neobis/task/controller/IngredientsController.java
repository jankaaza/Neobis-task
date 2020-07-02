package kg.neobis.task.controller;

import kg.neobis.task.dto.CakeDto;
import kg.neobis.task.dto.IngredientsDto;
import kg.neobis.task.entity.Ingredients;
import kg.neobis.task.service.IngredientsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/ingredients")
@RequiredArgsConstructor
public class IngredientsController {
    private final IngredientsService ingredientsService;
    @GetMapping
    private List<IngredientsDto> getAllIngredients() {
        return ingredientsService.findAll();
    }
}
