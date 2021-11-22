package ru.ibs.happynes.services.intefaces;

import ru.ibs.happynes.entities.ProjectTableMainEntity;

import java.util.List;

public interface ProjectTableMainService {
    void createTable(String firm, String name, String creatorName, String projectStatus, boolean isProjectFix,
                     boolean onlyPO, boolean isProjectMVP, boolean isProjectStart, String funcDirection,
                     String projectArea, String description, String tasks, String stage, String date,
                     String technologies, String bodyTechnologies, int howManyHolders, boolean methodology, boolean isProductDevelop,
                     String developRatio, boolean hasTesters, boolean hasTechWriter, boolean isTeamFormed,
                     String location, String deadlineSplit, String overtimes, String headHuntingProcedure, boolean isDocumented, boolean isArchived);
    ProjectTableMainEntity readTable(Long id);
    List<ProjectTableMainEntity> readAllTables();
    void updateTable(Long id, String firm, String name, String status, String creatorName); //TODO: доделать update
    void deleteTable(Long id);
}
