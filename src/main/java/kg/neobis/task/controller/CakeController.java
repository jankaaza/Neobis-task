package kg.neobis.task.controller;

import kg.neobis.task.dto.CakeDto;
import kg.neobis.task.service.CakeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/cakes")
@RequiredArgsConstructor
public class CakeController {
private final CakeService cakeService;

    @GetMapping
    private List<CakeDto> getAllCakes() {
        return cakeService.findAll();
    }
}
