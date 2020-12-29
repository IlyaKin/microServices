package zoolClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceSecondApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceSecondApp.class, args);
    }
}
