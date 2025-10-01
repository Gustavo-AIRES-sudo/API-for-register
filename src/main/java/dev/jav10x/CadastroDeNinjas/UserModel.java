package dev.jav10x.CadastroDeNinjas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user_register")

public class UserModel {
    @Id
    Long ID;
    //------------//
    String fullName;
    String gmail;
    int age;

    public UserModel(Long ID, String fullName, String gmail, int age) {
        this.ID = ID;
        this.fullName = fullName;
        this.gmail = gmail;
        this.age = age;
    }

    public UserModel() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
