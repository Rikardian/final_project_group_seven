package ru.ibs.happynes.services.intefaces;

import ru.ibs.happynes.entities.ProjectTableMainEntity;
import ru.ibs.happynes.entities.UserEntity;

import java.util.List;

public interface ProjectTableMainService {
    void createTable(String firm, String name, String status, String creatorName);
    ProjectTableMainEntity readTable(Long id);
    List<ProjectTableMainEntity> readAllTables();
    void updateTable(Long id);
    void deleteTable(Long id);
}
