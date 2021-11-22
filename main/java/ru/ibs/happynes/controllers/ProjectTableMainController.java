package ru.ibs.happynes.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.ibs.happynes.configuration.MapperUtil;
import ru.ibs.happynes.dto.ProjectTableDTO;
import ru.ibs.happynes.entities.ProjectTableMainEntity;
import ru.ibs.happynes.services.intefaces.ProjectTableMainService;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping(value ="/api/table", consumes = {MediaType.ALL_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class ProjectTableMainController {

    @Autowired
    ProjectTableMainService projectTableMainService;
    @Autowired
    ModelMapper modelMapper;

    @PostConstruct
    private void postConstruct(){
        projectTableMainService.createTable("Intel", "New processor", "Development", "Anna");
        projectTableMainService.createTable("AMD", "New graphic card", "Development", "Dima");
    }

    @GetMapping("read")
    private Object readCard(@RequestParam(required = false) Long id){
        if (id != null){
            return projectTableMainService.readTable(id);
        }
        else {
            return projectTableMainService.readAllTables();
        }
    }

    @PostMapping("create")
    private void createCard(@RequestBody ProjectTableMainEntity body){
        projectTableMainService.createTable(body.getFirm(), body.getName(), body.getProjectStatus(), body.getCreatorName());
    }

    @PostMapping("delete")
    private void deleteCard(@RequestParam Long id){
        projectTableMainService.deleteTable(id);
    }

    @PostMapping("update")
    private void updateCard(@RequestParam Long id, @RequestBody ProjectTableMainEntity projectTableMainEntity){
        projectTableMainService.updateTable(id, projectTableMainEntity.getFirm(), projectTableMainEntity.getName(),
                projectTableMainEntity.getProjectStatus(), projectTableMainEntity.getCreatorName());
    }

    private ProjectTableDTO convertToDTO(ProjectTableMainEntity projectTableMainEntity){
        return modelMapper.map(projectTableMainEntity, ProjectTableDTO.class);
    }

    @GetMapping("read/dto")
    private List<ProjectTableDTO> readDTOCard(){
        List<ProjectTableMainEntity> tables = projectTableMainService.readAllTables();
        return MapperUtil.convertList(tables, this::convertToDTO);
    }
}
