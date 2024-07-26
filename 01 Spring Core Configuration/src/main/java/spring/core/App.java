package spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.model.Personal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Personal personel = (Personal) config.getBean("personalBean");
        
        personel.setName("Recep");
        personel.setSurname("Baykan");
        personel.setAge(26);
        
        System.out.print(personel.getName() + " "  + personel.getSurname() + " " + personel.getAge() );
        
        config.close();
    }
}
