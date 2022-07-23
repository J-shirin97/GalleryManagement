package org.galleryManagement.entity;

import lombok.Data;
import org.galleryManagement.entity.enumuration.Status;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event")
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private Date date;

    @Column(name = "location")
    private String location;

    //Do Not Use List for Status!!
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;


}
