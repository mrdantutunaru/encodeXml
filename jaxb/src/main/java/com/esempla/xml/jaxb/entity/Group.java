package com.esempla.xml.jaxb.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"name", "members"}, name = "group")
@XmlRootElement
@Data
public class Group {

    private String name;

    private List<Person> members = new ArrayList<Person>();

}
