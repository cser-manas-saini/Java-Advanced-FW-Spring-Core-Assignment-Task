package execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.JavaConfigurationFile;
import entity.Student;

public class JavaApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfigurationFile.class);

        Student s1 = context.getBean("student1", Student.class);
        Student s2 = context.getBean("student2", Student.class);
        Student s3 = context.getBean("student3", Student.class);

        System.out.println("\n========= STUDENT DETAILS =========");

        System.out.println(s1.getName() + " -> " + s1.getAddress());
        System.out.println(s2.getName() + " -> " + s2.getAddress());
        System.out.println(s3.getName() + " -> " + s3.getAddress());

        System.out.println("===================================");
    }
}