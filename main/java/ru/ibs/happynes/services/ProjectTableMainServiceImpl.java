package ru.ibs.happynes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.happynes.entities.ProjectTableMainEntity;
import ru.ibs.happynes.repositories.ProjectTableMainRepository;

@Service
public class ProjectTableMainServiceImpl implements ProjectTableMainService{

    @Autowired
    ProjectTableMainRepository projectTableMainRepository;

    @Override
    public void createTable(String firm, String name) {
        final ProjectTableMainEntity projectTableMainEntity = new ProjectTableMainEntity(firm, name);
        projectTableMainRepository.save(projectTableMainEntity);
    }
}
