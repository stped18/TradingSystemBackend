package vittech.backend.tradingwebbackend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/services")
public class TestAPI {

    @GetMapping("/test")
    String test() {
        return "det virker";
    }

    @GetMapping("/")
    String index() {
        return "api system for trading";
    }
}
