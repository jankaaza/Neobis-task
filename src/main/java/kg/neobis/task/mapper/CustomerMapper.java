package kg.neobis.task.mapper;

import kg.neobis.task.dto.CustomerDto;
import kg.neobis.task.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerMapper {
    CustomerDto toCustomerDto(Customer customer);
}
