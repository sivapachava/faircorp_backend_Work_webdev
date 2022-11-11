package com.emse.spring.faircorp.api;


import com.emse.spring.faircorp.dao.BuildingDao;
import com.emse.spring.faircorp.dto.BuildingDto;
import com.emse.spring.faircorp.model.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RestController // (1)
@RequestMapping("/api/buildings") // (2)
@Transactional

public class BuildingController {

    @Autowired
    private BuildingDao buildingDao;

    @GetMapping // (5)
    public List<BuildingDto> findAll() {
        return buildingDao.findAll().stream().map(BuildingDto::new).collect(Collectors.toList());  // (6)
    }

    @GetMapping(path = "/{id}")
    public BuildingDto findById(@PathVariable Long id) {
        return buildingDao.findById(id).map(BuildingDto::new).orElse(null); // (7)
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        buildingDao.deleteById(id);
    }

    @PostMapping(path = "/")
    public BuildingDto create(@RequestBody BuildingDto dto) {
        Building building;
        if (dto.getId() == null) {
            building = buildingDao.save(new Building(dto.getName()));
        } else {
            building = buildingDao.getById(dto.getId());
            building.setName(dto.getName());
        }
        return new BuildingDto(building);
    }

}
