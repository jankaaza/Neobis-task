package kg.neobis.task.mapper.impl;

import kg.neobis.task.dto.CakeDto;
import kg.neobis.task.entity.Cake;
import kg.neobis.task.mapper.CakeMapper;
import org.springframework.stereotype.Service;

@Service
public class CakeMapperImpl implements CakeMapper {
    @Override
    public CakeDto toCakeDto(Cake cake) {
        CakeDto cakeDto = new CakeDto();
        cakeDto.setId(cake.getId());
        cakeDto.setName(cake.getName());
        cakeDto.setOrigin(cake.getOrigin());
        cakeDto.setPrice(cake.getPrice());
        cakeDto.setQuantity(cake.getQuantity());
        cakeDto.setWeight(cake.getWeight());
        return cakeDto;
    }
}
