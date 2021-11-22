package ru.ibs.happynes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ibs.happynes.entities.ProjectTableMainEntity;

import java.util.List;

public interface ProjectTableMainRepository extends JpaRepository<ProjectTableMainEntity, Long> {

    ProjectTableMainEntity findProjectTableMainEntityById(Long id);
    void deleteProjectTableMainEntitiesById(Long id);

}
