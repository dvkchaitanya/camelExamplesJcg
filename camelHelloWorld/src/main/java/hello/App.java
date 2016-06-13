package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javacodegeeks.camel.TestBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = (TestBean)appContext.getBean("testBean");
        System.out.println(testBean.hello("chaitanya"));
        
        appContext.close();
    }
}
