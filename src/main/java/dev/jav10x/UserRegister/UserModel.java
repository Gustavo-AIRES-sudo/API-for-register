package dev.jav10x.UserRegister;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_user_register") //Dentro do escopo temos o nome da Table//

public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gerando o valor de ID / / IDENTITY: NUMEROS.
    private Long ID;

    private String fullName;
    private String gmail;
    private int age;

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