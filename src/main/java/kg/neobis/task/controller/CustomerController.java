package kg.neobis.task.controller;

import kg.neobis.task.dto.CakeDto;
import kg.neobis.task.dto.CustomerDto;
import kg.neobis.task.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping
    private List<CustomerDto> getAllCustomers() {
        return customerService.findAll();
    }
}
