package com.company.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {

    @Test
    public void givenANewList_ThenListIsEmpty(){
//        Inicialización:
        ArrayList<Integer>Lista=new ArrayList<>();
//        Ejecución:
        int size=Lista.getSize();
//        Validación:
        assertEquals(size,Lista.getSize());
    }

    @Test
    public void givenANewLinkedList_when_AddElement_thenSizeIncrements(){
//        Inicialización:
        LinkedList<Integer> list = new LinkedList<>();
//        Ejecución:
        list.add(100);
        int size=list.getSize();
//        Validación:
        assertEquals(1,size);
        assertEquals(100,list.get(0),"Se esperaba 'Hola'");
    }

    @Test
    public void givenAnExistLinkedListWith1Element_whenAddElement_thenListIncrementsAndSizeIsIncrements(){
//        Inicialización:
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);

//        Ejecución:
        list.add(200);

//        Validación:
        assertEquals(2,list.getSize());
        assertEquals(100,list.get(0));
        assertEquals(200,list.get(1));
    }
//
//    @Test
//    public void givenAnExistLinkedListWithElements_whenIterator_thenIteratorIsCreated(){
////        Inicialización:
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(100);
//        list.add(200);
//        list.add(300);
////        Ejecución:
//        Iterator<Integer> it= list.getIterator();;
////        Validación:
//        assert(it);
//    }
        @Test
    public void givenAnExistLinkedListWithElements_whenIterator_thenAllElementsAreAccessible(){
//        Inicialización:
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
//        Ejecución:
        Iterator<Integer> it= list.getIterator();;
//        Validación:
        assertTrue(it.hasNext());
        assertEquals(100,it.next());
        assertTrue(it.hasNext());
        assertEquals(200,it.next());
        assertTrue(it.hasNext());
        assertEquals(300,it.next());
    }

    @Test
    public void givenAnExistLinkedListWithElements_whenReverseIterator_thenAllElementsAreAccessible(){
//        Inicialización:
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
//        Ejecución:
        Iterator<Integer> it= list.getReverseIterator();
//        Validación:
        assertTrue(it.hasNext());
        assertEquals(300,it.next());
        assertTrue(it.hasNext());
        assertEquals(200,it.next());
        assertTrue(it.hasNext());
        assertEquals(100,it.next());
    }
    @Test
    public void givenAnExistLinkedListWithOneElement_whenDelete_thenListDecrementsAndSizeIsZero(){
//        Inicialización:
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
//        Ejecución:
        list.delete(0);
//        Validación:
        assertEquals(0,list.getSize());
    }
    @Test
    public void givenAnExistLinkedListWithElements_whenDeleteHeadElement_thenListDecrementsAndSizeDecrements(){
//        Inicialización:
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
//        Ejecución:
        list.delete(0);
//        Validación:
        assertEquals(2,list.getSize());
        assertEquals(200,list.get(0));
        assertEquals(300,list.get(1));
    }

    @Test
    public void givenAnExistLinkedListWithElements_DeleteTailElement_thenListDecrementsAndSizeDecrements() {
//        Inicialización:
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
//        Ejecución:
        list.delete(2);
//        Validación:
        assertEquals(2,list.getSize());
        assertEquals(100,list.get(0));
        assertEquals(200,list.get(1));
    }

    @Test
    public void givenAnExistLinkedListWithElements_whenDeleteIntermediateElement_thenListDecrementsAndSizeDecrements(){
//        Inicialización:
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
//        Ejecución:
        list.delete(1);

        assertEquals(2,list.getSize());
        assertEquals(100,list.get(0));
        assertEquals(300,list.get(1));
    }

    @Test
    public void givenAnExistLinkedListWithElements_whenDeleteIndexDoesNotExist_ThenMyIndexOutOfExceptionIsThrown(){
//        Inicialización:
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
//        Ejecución&Validación:;
        Assertions.assertThrows(MyIndexOutOfBoundsException.class, ()->{ list.delete(5);});
    }
    @Test
    public void givenAnExistLinkedListWithElements_whenInsertsBefore_thenListIncrementsAndSizeIncrements(){
//        Inicialización:
        LinkedList<Integer> list = new LinkedList<>();
        list.add(200);
        list.add(300);
        Iterator<Integer> it= list.getIterator();
//        Ejecución:
        list.insert(100,Position.BEFORE,it);
//        Validación:
        assertEquals(3,list.getSize());
        assertEquals(100,list.get(0));
        assertEquals(200,list.get(1));
        assertEquals(300,list.get(2));
    }
    @Test
    public void givenAnExistLinkedListWithElements_whenInsertsAfter_thenListIncrementsAndSizeIncrements(){
//        Inicialización:
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(300);
        Iterator<Integer> it= list.getIterator();
//        Ejecución:
        list.insert(200,Position.AFTER,it);
//        Validación:
        assertEquals(3,list.getSize());
        assertEquals(100,list.get(0));
        assertEquals(200,list.get(1));
        assertEquals(300,list.get(2));
    }
}
