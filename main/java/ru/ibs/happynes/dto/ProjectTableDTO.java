package ru.ibs.happynes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.ibs.happynes.entities.ProjectTableMainEntity;

@Data
@NoArgsConstructor
public class ProjectTableDTO {

    private Long id;

    private String firm;

    private String name;

    private String creatorName;

    private String projectStatus;

}
