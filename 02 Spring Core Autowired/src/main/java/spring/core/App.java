package spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.model.Personel;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Personel personel = (Personel) config.getBean(Personel.class);
        
        
       System.out.println(personel.getAdress().getApt());
        
       
        
       
    }
}
