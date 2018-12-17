package com.hackli.girl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Girl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    private String cupsize;

    @Min(value = 18, message = "未成年少女禁止入内")
    private Integer age;

    public Girl() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupsize() {
        return cupsize;
    }

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupsize='" + cupsize + '\'' +
                ", age=" + age +
                '}';
    }
}
