package af.mcit.springboot.FirstClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Hadi";
    }
    @Bean
    public Integer age(){
        return 25;
    }

    @Bean
    public Person person(){
        return  new Person("Mahdi", 30, new Address("Kabul Afghanistan", "Kabul city"));
    }

    @Bean
    public Address address(){
        return new Address("Kabul Afghanistan", "Kabul city");
    }
    @Bean(name = "address2")
    public Address address2(){
        return new Address("Dasht e barchi", "Kabul");
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address2){
        return new Person(name, age, address2);
    }

}
