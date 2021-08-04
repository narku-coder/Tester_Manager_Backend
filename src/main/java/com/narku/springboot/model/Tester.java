package com.narku.springboot.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Tester implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String relation;
    private String phone;
    private String imageUrl;
    private String testerCode;

    public String getTesterCode() {
        return testerCode;
    }

    public void setTesterCode(String testerCode) {
        this.testerCode = testerCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Tester()
    {

    }

    public Tester(Long id, String name, String email, String relation, String phone, String imageUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.relation = relation;
        this.phone = phone;
        this.imageUrl = imageUrl;
    }
}
