package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Address;
import entity.Course;
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
    public Course course1() {
        return new Course(201, "Java");
    }

    @Bean
    public Course course2() {
        return new Course(202, "Spring");
    }

    @Bean
    public Course course3() {
        return new Course(203, "Python");
    }

    @Bean
    public Student student1() {

        List<Course> courses = Arrays.asList(course1(), course2());

        return new Student(1, "Raja", address1(), courses);
    }

    @Bean
    public Student student2() {

        List<Course> courses = Arrays.asList(course2(), course3());

        return new Student(2, "Aman", address1(), courses);
    }
}