package lk.ijse.spring.repo;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class})
@ExtendWith({SpringExtension.class})
@Transactional
class ItemRepoTest {

    @Autowired
    ItemRepo itemRepo;

    ItemRepoTest() {

    }

    @Test
    public void testGetAllItems() {
        List<Item> all = this.itemRepo.findAll();
        for(Item item : all){
            System.out.println(item.toString());
        }
    }

    @Test
    public void testAddItems() {
        Item item=new Item("I006","milo",540,new BigDecimal(200.00));
        itemRepo.save(item);
    }


}