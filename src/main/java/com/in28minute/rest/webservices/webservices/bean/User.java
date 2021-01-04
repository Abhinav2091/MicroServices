package com.in28minute.rest.webservices.webservices.bean;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;

//@JsonFilter("dynamicFilter")
@ApiModel(description = "All description")
@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Size(min = 2, message = "Size of name cannot be less that 2 char")
    @ApiModelProperty(notes = "name should be more than 2 char")
    private String name;

    @Past
    @ApiModelProperty(notes = "Birth_date should be less than current date")
    private Date birthDate;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Post> post;

    public User() {
    }

    public User(int id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("birthDate=" + birthDate)
                .toString();
    }
}
