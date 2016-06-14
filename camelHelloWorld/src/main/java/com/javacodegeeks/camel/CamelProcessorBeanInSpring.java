package com.javacodegeeks.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelProcessorBeanInSpring {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("processorApplicationContext.xml");
			CamelContext camelContext = SpringCamelContext.springCamelContext(appContext,false);
			try{
				camelContext.start();
				Thread.sleep(8000);
			}
			finally{
				camelContext.stop();
				appContext.close();
			}
	}

}
