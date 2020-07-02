package kg.neobis.task.mapper.impl;

import kg.neobis.task.dto.CustomerDto;
import kg.neobis.task.entity.Customer;
import kg.neobis.task.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapperImpl implements CustomerMapper {
    @Override
    public CustomerDto toCustomerDto(Customer customer) {
        CustomerDto customerDto=new CustomerDto();
        customerDto.setId(customer.getId());
                customerDto.setName(customer.getName());
        customerDto.setAddress(customer.getAddress());
        customerDto.setPhoneNumber(customer.getPhoneNumber());
        return customerDto;
    }
}
