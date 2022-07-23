package org.galleryManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtworkArtistId implements Serializable {
    @Column(name = "artwork_id")
    private Long artworkId;

    @Column(name = "artist_id")
    private Long artistId;

}
