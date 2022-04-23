package in.bhushansirgur.springrestapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name="table_employe")
public class Employee {

    @Column(name="name")
    @NotNull
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="age")
    private int age;

    @Column(name="location")
    private String location;

    @Column(name="email")
    @Email(message = "Please enter valid email address ")
    private String email;

    @Column(name="department")
    @NotNull
    private String department;

//    @CreationTimestamp
//    @Column(name="created_at",nullable = false,updatable = false)
//    private Date createdAt;
//
//    @UpdateTimestamp
//    @Column(name = "updated_at")
//    private Date updatedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Employee() {

        super();
    }

    public Employee(String name, int id, int age, String location, String email, String department) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.location = location;
        this.email = email;
        this.department = department;
    }
}
