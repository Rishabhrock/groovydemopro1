package com.rishabh.example

import org.yaml.snakeyaml.Yaml

class Customer {

    public static void main(String[] args) {




        Yaml yaml = new Yaml();
        InputStream inputStream = Customer.class.getResourceAsStream("/customer.yaml")
            Object obj = yaml.load(inputStream);
            System.out.println("Loaded object type:" + obj.getClass());
            System.out.println(obj);


    }
}
