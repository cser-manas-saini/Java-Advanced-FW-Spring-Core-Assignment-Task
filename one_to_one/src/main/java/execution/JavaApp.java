package execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.JavaConfigurationFile;
import entity.Student;

public class JavaApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfigurationFile.class);

        Student student = context.getBean(Student.class);

        System.out.println("\n===== STUDENT DETAILS =====");
        System.out.println("ID      : " + student.getId());
        System.out.println("Name    : " + student.getName());
        System.out.println("Email   : " + student.getEmail());
        System.out.println("Phone   : " + student.getPhone());

        System.out.println("\nAddress : " + student.getAddress());

        System.out.println("============================");
    }
}