package ru.ibs.happynes.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class ProjectTableMainEntity {

    @Id
    @GeneratedValue(generator = "sequence")
    private Long id;

    private String firm;

    private String name;

    private String creatorName;

    private String projectStatus;

    public ProjectTableMainEntity(String firm, String name, String projectStatus,  String creatorName) {
        this.firm = firm;
        this.name = name;
        this.projectStatus = projectStatus;
        this.creatorName = creatorName;
    }

    @Override
    public String toString() {
        return String.join("", firm, name, projectStatus, creatorName);
    }

}
