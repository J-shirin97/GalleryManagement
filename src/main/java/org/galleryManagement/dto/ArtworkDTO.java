package org.galleryManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.galleryManagement.entity.enumuration.Genre;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtworkDTO {
    @NotNull(groups = OnUpdate.class , message = "id")
    private Long id;

    @NotNull(message = "name")
    private String name;

    @NotNull(message = "description")
    private String desc;

    @NotNull(message = "genre")
    private Genre genre;
}
