package com.ascent.groovydemopro;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class GroovydemoproApplication {

	public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
		SpringApplication.run(GroovydemoproApplication.class, args);


		Class scriptClass = new GroovyClassLoader().parseClass( new File("/home/rishabh/Downloads/groovydemopro/groovy/com/rishabh/example/Example.groovy")) ;
		GroovyObject scriptInstance = (GroovyObject) scriptClass.newInstance() ;
		System.out.println(scriptInstance);
	//	scriptClass.getDeclaredMethod( "printword", new Class[] {} ).invoke( scriptInstance, new Object[] {} ) ;
//		scriptClass.getDeclaredMethod( "sum", new Class[] {} ).invoke( scriptInstance, new Object[] {5,5} ) ;
		System.out.println(scriptInstance.getClass());
		System.out.println(scriptInstance);
	//	scriptClass.getDeclaredMethod( "printword", new Class[] {} ).invoke( scriptInstance, new Object[] {12,13} ) ;
		Integer a =(Integer) scriptInstance.invokeMethod("sum", new Object[] { 12, 13 });
		//System.out.println(a);
		//scriptClass.getDeclaredMethod("hello_world", new Class[] {}).invoke( scriptInstance, new Object[] {});
	}

}
