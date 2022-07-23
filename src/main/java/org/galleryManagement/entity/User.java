package org.galleryManagement.entity;

import lombok.Data;
import org.galleryManagement.entity.enumuration.Nationality;
import org.galleryManagement.entity.enumuration.Type;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "nationalCode")
    private String nationalCode;

    @Column(name = "nationality")
    private Nationality nationality;

    @Column(name = "avator")
    private String avator;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private Type type;

}
