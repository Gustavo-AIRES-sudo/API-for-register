package dev.jav10x.CadastroDeNinjas;
<<<<<<< HEAD

=======
>>>>>>> 08a3b5af92ca60e2ec91c3f72b5017800697a6b5
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

<<<<<<< HEAD
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
=======
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
>>>>>>> 08a3b5af92ca60e2ec91c3f72b5017800697a6b5
        this.gmail = gmail;
        this.age = age;
    }

    public UserModel() {
    }

<<<<<<< HEAD
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
=======
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
>>>>>>> 08a3b5af92ca60e2ec91c3f72b5017800697a6b5
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
