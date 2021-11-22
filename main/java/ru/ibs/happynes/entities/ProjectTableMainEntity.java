package ru.ibs.happynes.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

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

    private boolean isProjectFix = true;

    private boolean onlyPO = true;

    private boolean isProjectMVP = true;

    private boolean isProjectStart = true;

    private String funcDirection;

    private String projectArea;

    private String description;

    private String tasks;

    private String stage;

    private String date;

    private String technologies;

    private int howManyHolders;

    private boolean methodology = true;

    private boolean isProductDevelop = true;

    private String developRatio;

    private boolean hasTesters = true;

    private boolean hasTechWriter = true;

    private boolean isTeamFormed = true;

    private String location;

    private String deadlineSplit;

    private String overtimes;

    private String headHuntingProcedure;

    private boolean isDocumented = true;

    private boolean isArchived = false;

    public ProjectTableMainEntity(String firm, String name, String creatorName, String projectStatus, boolean isProjectFix,
                                  boolean onlyPO, boolean isProjectMVP, boolean isProjectStart, String funcDirection,
                                  String projectArea, String description, String tasks, String stage, String date,
                                  String technologies, int howManyHolders, boolean methodology, boolean isProductDevelop,
                                  String developRatio, boolean hasTesters, boolean hasTechWriter, boolean isTeamFormed,
                                  String location, String deadlineSplit, String overtimes, String headHuntingProcedure,
                                  boolean isDocumented, boolean isArchived) {
        this.firm = firm;
        this.name = name;
        this.creatorName = creatorName;
        this.projectStatus = projectStatus;
        this.isProjectFix = isProjectFix;
        this.onlyPO = onlyPO;
        this.isProjectMVP = isProjectMVP;
        this.isProjectStart = isProjectStart;
        this.funcDirection = funcDirection;
        this.projectArea = projectArea;
        this.description = description;
        this.tasks = tasks;
        this.stage = stage;
        this.date = date;
        this.technologies = technologies;
        this.howManyHolders = howManyHolders;
        this.methodology = methodology;
        this.isProductDevelop = isProductDevelop;
        this.developRatio = developRatio;
        this.hasTesters = hasTesters;
        this.hasTechWriter = hasTechWriter;
        this.isTeamFormed = isTeamFormed;
        this.location = location;
        this.deadlineSplit = deadlineSplit;
        this.overtimes = overtimes;
        this.headHuntingProcedure = headHuntingProcedure;
        this.isDocumented = isDocumented;
        this.isArchived = isArchived;
    }

    public ProjectTableMainEntity(String firm, String name, String creatorName, String projectStatus) {
        this.firm = firm;
        this.name = name;
        this.creatorName = creatorName;
        this.projectStatus = projectStatus;
    }

    @Override
    public String toString() {
        return String.join("", firm, name, projectStatus, creatorName);
    }

}
