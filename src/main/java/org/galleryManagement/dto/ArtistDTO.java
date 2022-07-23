package org.galleryManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.galleryManagement.entity.enumuration.Nationality;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtistDTO {
    @NotNull(groups = OnUpdate.class)
    private Long id;

    @NotNull(message ="fullName" )
    private String fullName;

    @NotNull(message = "nationality")
    private Nationality nationality;

}
