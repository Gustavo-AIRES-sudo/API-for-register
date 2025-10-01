package dev.jav10x.CadastroDeNinjas;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Transforma a classe em uma entidade da database. Tabela:
@Table(name = "tb_user_register") //Responsável por criar a Tabela
public class UserModel {

    @Id
    Long ID;

    String name;
    String surname;
    String gmail;
    int age;

    public UserModel(String name, String surname, String gmail, int age) {
        this.name = name;
        this.surname = surname;
        this.gmail = gmail;
        this.age = age;
    }

    public UserModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
