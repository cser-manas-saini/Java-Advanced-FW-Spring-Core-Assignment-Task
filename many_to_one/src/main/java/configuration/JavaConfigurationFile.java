package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Address;
import entity.Student;

@Configuration
public class JavaConfigurationFile {

    @Bean
    public Address address1() {
        return new Address(101, "Jaipur", "Rajasthan");
    }

    @Bean
    public Student student1() {
        return new Student(1, "Raja", "raja@gmail.com", 9876543210L, address1());
    }

    @Bean
    public Student student2() {
        return new Student(2, "Aman", "aman@gmail.com", 9876543211L, address1());
    }

    @Bean
    public Student student3() {
        return new Student(3, "Rohit", "rohit@gmail.com", 9876543212L, address1());
    }
}