package com.in28minute.rest.webservices.webservices.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.minidev.json.annotate.JsonIgnore;

//Static Filtering

//You can ignore key by two way first is @JsonIgnore
//else @JsonIgnoreProperties
//this will exclude the value from list of this object too
//you can use one at a time
//@JsonIgnoreProperties(value = {"field1"})
public class SomeBean {
    private String field1;
    private String field2;
    @JsonIgnore
    private String field3;

    public SomeBean() {
    }

    public SomeBean(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }
}
