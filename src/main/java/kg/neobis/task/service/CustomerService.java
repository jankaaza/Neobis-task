package kg.neobis.task.service;

import kg.neobis.task.dto.CustomerDto;
import kg.neobis.task.mapper.CustomerMapper;
import kg.neobis.task.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;
    public List<CustomerDto> findAll() {
        return customerRepository.findAll()
                .stream()
                .map(customerMapper::toCustomerDto)
                .collect(Collectors.toList());
    }

}
