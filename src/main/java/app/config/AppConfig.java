package app.config;

import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {


    //fixme можно сделать Timer компонентом, тогда Spring сам создаст бин
    @Bean("timer")
    public Timer getTimer() {
        return new Timer();
    }
}