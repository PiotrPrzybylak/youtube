package dev.danvega;

import dev.danvega.config.AppConfig;
import dev.danvega.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


    public static void main(String[] args) {
//        CourseService dev.danvega.service = new CourseService(); // How do I want to explain this?
//        System.out.println(dev.danvega.service.list());

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-config.xml");
        CourseService service = applicationContext.getBean("courseService", CourseService.class);
        System.out.println(service.list());

    }

}
