package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FruitPropertyTest {
    @Autowired
    FruitProperty fruitProperty;

    @Test
    public void testFruitProperty() {
        List<Fruit> fruitData = fruitProperty.getList();
        Assertions.assertEquals(fruitData.get(0).getName(), "banana");
    }
}