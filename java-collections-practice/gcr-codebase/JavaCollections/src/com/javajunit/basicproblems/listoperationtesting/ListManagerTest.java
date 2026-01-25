package com.javajunit.basicproblems.listoperationtesting;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListManagerTest {
	ListManager manager;
    List<Integer> list;

    @BeforeEach
    void setUp() {
        manager = new ListManager();
        list = new ArrayList<>();
    }

    //Test adding elements
    @Test
    void testAddElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertEquals(2, manager.getSize(list));
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    //Test removing elements
    @Test
    void testRemoveElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        manager.removeElement(list, 10);

        assertEquals(1, manager.getSize(list));
        assertFalse(list.contains(10));
    }

    //Test list size
    @Test
    void testGetSize() {
        assertEquals(0, manager.getSize(list));

        manager.addElement(list, 5);
        manager.addElement(list, 15);

        assertEquals(2, manager.getSize(list));
    }
}
