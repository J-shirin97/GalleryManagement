package org.galleryManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ArtworkAtrist {
    @EmbeddedId
    private ArtworkArtistId artworkArtistId;

    @ManyToOne
    @JoinColumn(name = "artwork_id", referencedColumnName = "id", insertable = false, updatable = false)
    private ArtWork artWork;

    @ManyToOne
    @JoinColumn(name = "artist_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Artist artist;


}
