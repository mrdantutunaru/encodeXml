package com.esempla.xml.jaxb.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(propOrder = {"lastName", "firstName", "birthDate"}, name = "person")
@Data
public class Person {

    private Date birthDate;

    private String firstName;

    private String lastName;


}
