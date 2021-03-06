package ru.ibs.happynes.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.happynes.entities.ProjectTableMainEntity;
import ru.ibs.happynes.repositories.ProjectTableMainRepository;
import ru.ibs.happynes.services.intefaces.ProjectTableMainService;

import java.util.List;

@Service
public class ProjectTableMainServiceImpl implements ProjectTableMainService {

    @Autowired
    ProjectTableMainRepository projectTableMainRepository;

    @Override
    public void createTable(String firm, String name, String creatorName, String projectStatus, boolean isProjectFix,
                            boolean onlyPO, boolean isProjectMVP, boolean isProjectStart, String funcDirection,
                            String projectArea, String description, String tasks, String stage, String date,
                            String technologies, String bodyTechnologies, int howManyHolders, boolean methodology, boolean isProductDevelop,
                            String developRatio, boolean hasTesters, boolean hasTechWriter, boolean isTeamFormed,
                            String location, String deadlineSplit, String overtimes, String headHuntingProcedure, boolean isDocumented, boolean isArchived) {
        ProjectTableMainEntity projectTableMainEntity = new ProjectTableMainEntity(firm, name, creatorName, projectStatus, isProjectFix, onlyPO, isProjectMVP,
                isProjectStart, funcDirection, projectArea, description, tasks, stage, date, technologies, howManyHolders, methodology, isProductDevelop, developRatio,
                hasTesters, hasTechWriter, isTeamFormed, location, deadlineSplit, overtimes, headHuntingProcedure, isDocumented, isArchived);
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

    @Override
    public void updateTable(Long id, String firm, String name, String status, String creatorName) {
        ProjectTableMainEntity projectTableMainEntity = projectTableMainRepository.findProjectTableMainEntityById(id);

        if (firm != null) {
            projectTableMainEntity.setFirm(firm);
        }

        if (name != null) {
            projectTableMainEntity.setName(name);
        }

        if (status != null) {
            projectTableMainEntity.setProjectStatus(status);
        }

        if (creatorName != null) {
            projectTableMainEntity.setCreatorName(creatorName);
        }
        projectTableMainRepository.save(projectTableMainEntity);
    }

    @Override
    public void deleteTable(Long id) {
        projectTableMainRepository.deleteById(id);
    }
}
