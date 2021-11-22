package ru.ibs.happynes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ibs.happynes.services.ProjectTableMainService;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping(value ="/api/table", consumes = {MediaType.ALL_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class ProjectTableMainController {

    @Autowired
    ProjectTableMainService projectTableMainService;

    @PostConstruct
    private void postConstruct(){
        projectTableMainService.createTable("Apple", "IPhone");
        projectTableMainService.createTable("AMD", "GraphicCard");
    }
}
