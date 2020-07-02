package kg.neobis.task.mapper;

import kg.neobis.task.dto.CakeDto;
import kg.neobis.task.entity.Cake;

public interface CakeMapper {
    CakeDto toCakeDto(Cake cake);
}
