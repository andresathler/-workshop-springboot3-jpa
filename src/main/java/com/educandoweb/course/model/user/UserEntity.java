package com.educandoweb.course.model.user;

import java.io.Serializable;
import java.util.Objects;

public class UserEntity implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String passsword;

    public UserEntity() {}


    public UserEntity(Long id, String name, String email, String phone, String passsword) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passsword = passsword;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
