package com.rishabh.example


import org.yaml.snakeyaml.Yaml


class CtcCalculation {

  static   def map = [:]

    static void main(String[] args) {

        Yaml yaml = new Yaml();
        InputStream inputStream = Customer.class.getResourceAsStream("/ctc.yaml")
        Object obj = yaml.load(inputStream);

        obj.component.each
                {
                   map.put("basic",basicget(123))

//                    obj.put("fdfd",54)
//                    print obj
                }
        println map
        println obj

       // println obj.size()
        println basicget(123)


        map.put("basic",basicget(123))
       // map.put("dfdf",basicget(123))
        println map
        println map.getClass()

      //  println CtcCalculation.ctccal(15464)

    }

    static Integer basicget(Integer ctc)
    {
        def dd = ctc*12
        return dd
    }

}
