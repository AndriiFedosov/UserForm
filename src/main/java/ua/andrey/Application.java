package ua.andrey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ua.andrey.configuratinon.JpaConfiguration;

/**
 * Created by Andry on 30.06.2017.
 */
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"ua.andrey"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}