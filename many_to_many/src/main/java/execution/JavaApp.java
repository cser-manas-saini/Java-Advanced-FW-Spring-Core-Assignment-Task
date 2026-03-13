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
        Student s3 = context.getBean("student3", Student.class);

        printStudentCourses(s1);
        printStudentCourses(s2);
        printStudentCourses(s3);
    }

    public static void printStudentCourses(Student student) {

        System.out.println("\nStudent: " + student.getName());

        for (Course course : student.getCourseList()) {
            System.out.println("   " + course);
        }
    }
}