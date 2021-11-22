package ru.ibs.happynes.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectTableMainEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String firm;

    private String name;

    public ProjectTableMainEntity(String firm, String name){
        this.firm = firm;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.join("", firm, name);
    }
}
