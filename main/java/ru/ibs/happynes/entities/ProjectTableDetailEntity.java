package ru.ibs.happynes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProjectTableDetailEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String firm;

    private String name;

    private String creatorName;

    private String projectStatus;
}
