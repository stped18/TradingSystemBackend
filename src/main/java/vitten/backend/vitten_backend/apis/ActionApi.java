package vitten.backend.vitten_backend.apis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionApi {

    @GetMapping("/test")
    String  test() {
        return "hello world kubernetsv";
    }
}
