package com.javacodegeeks.camel.routes;

import org.apache.camel.builder.RouteBuilder;

public class ActiveMqRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("activemq:queue:start").to("bean:testBean?method=hello").to(
				"stream:out");
	}

}
