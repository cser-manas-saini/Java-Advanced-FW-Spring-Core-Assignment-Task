package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Address;
import entity.Student;

import java.util.Arrays;
import java.util.List;

@Configuration
public class JavaConfigurationFile {

    @Bean
    public Address address1() {
        return new Address(101, "Jaipur", "Rajasthan");
    }

    @Bean
    public Address address2() {
        return new Address(102, "Udaipur", "Rajasthan");
    }

    @Bean
    public Student student1() {

        List<Address> addresses = Arrays.asList(address1(), address2());

        return new Student(1, "Raja", "raja@gmail.com", 9876543210L, addresses);
    }
}