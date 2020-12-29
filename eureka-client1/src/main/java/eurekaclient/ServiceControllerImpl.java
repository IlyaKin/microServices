package eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceControllerImpl implements ServiceController{
    @Override
    @GetMapping("/first")
    public String firstMethodService() {
        return new String("Hello_World!");
    }

    @Override
    @GetMapping("/parameter/{id}")
    public String secondMethodService(@PathVariable Integer id) {
        return String.format("Hello_World_from #%s", id);
    }
}
