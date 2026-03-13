package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Course;
import entity.Student;

import java.util.Arrays;
import java.util.List;

@Configuration
public class JavaConfigurationFile {

    @Bean
    public Course course1() {
        return new Course(101, "Java");
    }

    @Bean
    public Course course2() {
        return new Course(102, "Spring");
    }

    @Bean
    public Course course3() {
        return new Course(103, "Python");
    }

    @Bean
    public Student student1() {

        List<Course> courses = Arrays.asList(course1(), course2());

        return new Student(1, "Raja", courses);
    }

    @Bean
    public Student student2() {

        List<Course> courses = Arrays.asList(course1(), course3());

        return new Student(2, "Aman", courses);
    }

    @Bean
    public Student student3() {

        List<Course> courses = Arrays.asList(course2(), course3());

        return new Student(3, "Rohit", courses);
    }
}