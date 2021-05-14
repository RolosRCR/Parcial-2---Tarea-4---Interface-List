package com.company.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    @Test
    public void givenANewList_ThenListIsEmpty(){
//        Given:

//        When:
        ArrayList<Integer>Lista=new ArrayList<>();
//        Then:
//        asersiones Asserts
        assertEquals(0,Lista.getSize());

    }
}
