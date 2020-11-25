package appcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public MyRepository myRepository(){
        return new MyRepository();
    }

    @Bean
    public MyService myService(){
        return new MyService();
    }
}
