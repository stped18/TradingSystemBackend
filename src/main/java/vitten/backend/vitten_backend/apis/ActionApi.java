package vitten.backend.vitten_backend.apis;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionApi {

    @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }
}
