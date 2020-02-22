package com.ascent.groovydemopro;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class GroovydemoproApplication {

	public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
		SpringApplication.run(GroovydemoproApplication.class, args);


//		Class scriptClass = new GroovyClassLoader().parseClass( new File("/home/rishabh/Downloads/groovydemopro/groovy/com/rishabh/example/Example.groovy")) ;
//		GroovyObject scriptInstance = (GroovyObject) scriptClass.newInstance() ;
//		System.out.println(scriptInstance);
//		System.out.println(scriptInstance.getClass());
//		System.out.println(scriptInstance);
//
//		Integer a =(Integer) scriptInstance.invokeMethod("sum", new Object[] { 12, 13 });



		Customer customer = new Customer();



	}

}
