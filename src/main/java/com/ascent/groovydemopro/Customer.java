package com.ascent.groovydemopro;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

public class Customer {
    public static void main(String[] args) {


        Yaml yaml = new Yaml();
        try (InputStream in = Customer.class.getResourceAsStream("/customer.yaml")) {
            Object obj = yaml.load(in);
            System.out.println("Loaded object type:" + obj.getClass());
            System.out.println(obj);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//        Yaml yaml = new Yaml();
//        InputStream inputStream = this.getClass()
//                .getClassLoader()
//                .getResourceAsStream("customer.yaml");
//        Customer customer = yaml.load(inputStream);
