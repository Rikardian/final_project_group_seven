package ru.ibs.happynes.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectTableMainEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String firm;

    private String name;

    private String creatorName;

    private String projectStatus;

    @JoinColumn
    @OneToOne(cascade = CascadeType.ALL)
    private ProjectTableDetailEntity projectTableDetailEntity;

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
