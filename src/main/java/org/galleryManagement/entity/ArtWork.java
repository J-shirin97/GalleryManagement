package org.galleryManagement.entity;


import lombok.Data;
import org.galleryManagement.entity.enumuration.Genre;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "artwork")
@Data
public class ArtWork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private Date date;

    @Column(name = "description")
    private String desc;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    private Genre genre;
}
