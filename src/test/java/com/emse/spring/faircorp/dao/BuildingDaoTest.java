package com.emse.spring.faircorp.dao;


import com.emse.spring.faircorp.model.Building;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BuildingDaoTest {

    @Autowired BuildingDao buildingDao;

    @Test
    public void ShouldFindABuilding(){
        Building building =buildingDao.getReferenceById(-10L);
        Assertions.assertThat(building.getId()).isEqualTo(-10L);
        Assertions.assertThat(building.getName()).isEqualTo("Building 1");

    }

    @Test
    public void shouldFindAllBuilding() {
        List<Building> buildings = buildingDao.findAll();
        Assertions.assertThat(buildings.size()).isEqualTo(3);

    }

    @Test
    public void ShouldCreateBuilding() {
        Building newBuilding = new Building();
        newBuilding.setName("Test");
        Building building = buildingDao.save(newBuilding);
        Assertions.assertThat(newBuilding.getName()).isEqualTo(building.getName());

    }
}
