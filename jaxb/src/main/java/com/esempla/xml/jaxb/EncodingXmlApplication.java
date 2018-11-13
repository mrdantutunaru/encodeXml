package com.esempla.xml.jaxb;

import com.esempla.xml.jaxb.service.MarshallAndUnMarshall;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EncodingXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncodingXmlApplication.class, args);
        MarshallAndUnMarshall cool = new MarshallAndUnMarshall();
        cool.marshallExample();
        cool.unmarshallExample();
    }
}
