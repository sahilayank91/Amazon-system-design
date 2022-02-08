package com.example.amazonsystemdesign;

import com.example.amazonsystemdesign.Controller.ItemController;
import com.example.amazonsystemdesign.Model.Item;
import com.example.amazonsystemdesign.Model.ItemGenre;
import com.example.amazonsystemdesign.Model.Seller;
import com.example.amazonsystemdesign.Repository.ItemRepository;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class AmazonSystemDesignApplicationTests {


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }


    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }


    @Test
    void contextLoads() {
    }

    @LocalServerPort
    private int port;

    @Autowired
    private ItemController controller;

    @MockBean
    private ItemRepository repo;

    @Test
    public void testItem() {
//        this.restTemplate.getForObject("ht
//        tp://localhost:" + port + "/getAllItems", Item.class).getCountOfItemInStock()
        List<Item> itemlist = new ArrayList<>();
        itemlist.add(new Item());
        itemlist.add(new Item());
        when(repo.findAll()).thenReturn(itemlist);
        assertIterableEquals(itemlist, this.controller.getAllItem());
    }


    @Test
    public void testAddItem() {
        Set<Seller> set = new HashSet<>();
        set.add(new Seller());
        Item item = new Item("sdfs", "sdfa", ItemGenre.ELECTRONICS, new Long(123) , 13, new Timestamp(123456), set);
        when(repo.save(item)).thenReturn(item);
        assertEquals(true, controller.addItem(item));
    }

}
