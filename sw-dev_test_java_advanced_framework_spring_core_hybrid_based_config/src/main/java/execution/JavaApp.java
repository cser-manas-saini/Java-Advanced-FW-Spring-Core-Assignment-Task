package execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.JavaConfigurationFile;
import entity.Student;
import entity.Course;

public class JavaApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfigurationFile.class);

        Student s1 = context.getBean("student1", Student.class);
        Student s2 = context.getBean("student2", Student.class);

        printStudent(s1);
        printStudent(s2);
    }

    public static void printStudent(Student student) {

        System.out.println("\n===== STUDENT DETAILS =====");
        System.out.println("ID      : " + student.getId());
        System.out.println("Name    : " + student.getName());
        System.out.println("Address : " + student.getAddress());

        System.out.println("Courses :");

        for (Course c : student.getCourseList()) {
            System.out.println("   " + c);
        }

        System.out.println("============================");
    }
}