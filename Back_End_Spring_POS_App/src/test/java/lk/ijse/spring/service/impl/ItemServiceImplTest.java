package lk.ijse.spring.service.impl;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.service.ItemService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class})
@ExtendWith({SpringExtension.class})
class ItemServiceImplTest {

    @Autowired
    ItemService service;

    public ItemServiceImplTest() {

    }

    @Test
    void addItem() {
    }

    @Test
    void deleteItem() {
    }

    @Test
    void getAllItem() {
    }

    @Test
    void findItem() {
    }

    @Test
    void updateItem() {
    }

    @Test
    void editItemQty() {
    }
}