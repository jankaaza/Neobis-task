package kg.neobis.task.service;

import kg.neobis.task.dto.CakeDto;
import kg.neobis.task.mapper.CakeMapper;
import kg.neobis.task.repository.CakeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CakeService {
private final CakeMapper cakeMapper;
private final CakeRepository cakeRepository;

    public List<CakeDto> findAll() {
        return cakeRepository.findAll()
                .stream()
                .map(cakeMapper::toCakeDto)
                .collect(Collectors.toList());
    }

}
