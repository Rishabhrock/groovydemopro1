package com.rishabh.example

import org.springframework.boot.json.YamlJsonParser
import org.yaml.snakeyaml.Yaml


class CtcCalculation {

  static   def map = [:]

    static void main(String[] args) {

        Yaml yaml = new Yaml();
        InputStream inputStream = Customer.class.getResourceAsStream("/ctc.yaml")
        Object obj = yaml.load(inputStream);

        println basicget(123)


        map.put("basic",basicget(123))
        println map


     //   println CtcCalculation.ctccal(15464)

    }

    static Integer basicget(Integer ctc)
    {
        def dd = ctc*12
        return dd
    }

}
