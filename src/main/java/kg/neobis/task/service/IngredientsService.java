package kg.neobis.task.service;

import kg.neobis.task.dto.CakeDto;
import kg.neobis.task.dto.IngredientsDto;
import kg.neobis.task.entity.Ingredients;
import kg.neobis.task.mapper.IngredientsMapper;
import kg.neobis.task.repository.IngredientsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IngredientsService {
    private final IngredientsMapper ingredientsMapper;
    private final IngredientsRepository ingredientsRepository;

    public List<IngredientsDto> findAll() {
        return ingredientsRepository.findAll()
                .stream()
                .map(ingredientsMapper::toIngredientsDto)
                .collect(Collectors.toList());
    }

}
