package ru.ibs.happynes.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.happynes.entities.ProjectTableMainEntity;
import ru.ibs.happynes.entities.UserEntity;
import ru.ibs.happynes.repositories.ProjectTableMainRepository;
import ru.ibs.happynes.services.intefaces.ProjectTableMainService;

import java.util.List;

@Service
public class ProjectTableMainServiceImpl implements ProjectTableMainService {

    @Autowired
    ProjectTableMainRepository projectTableMainRepository;

    @Override
    public void createTable(String firm, String name, String status, String creatorName) {
        final ProjectTableMainEntity projectTableMainEntity = new ProjectTableMainEntity(firm, name, status, creatorName);
        projectTableMainRepository.save(projectTableMainEntity);
    }

    @Override
    public ProjectTableMainEntity readTable(Long id) {
        return projectTableMainRepository.findProjectTableMainEntityById(id);
    }

    @Override
    public List<ProjectTableMainEntity> readAllTables() {
        return projectTableMainRepository.findAll();
    }
}
