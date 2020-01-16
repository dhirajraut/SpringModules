package com.galaxy.spring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = Constants.URL_ROOT)
public class SpringBootRestController {

	@RequestMapping(path = Constants.URL_APPNAME, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String sayHello() {
		return "Welcome to SimpleSpringBootWebAppApplication";
	}
}
