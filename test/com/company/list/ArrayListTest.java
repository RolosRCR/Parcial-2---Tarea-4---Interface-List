package com.company.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {
    @Test
    public void whenArrayListIsCreated_thenSizeIsZero() {

        //inicializacion
        ArrayList<Integer> List = new ArrayList<>();

        //Ejecucion
        int size = List.getSize();

        //Validacion
        assertEquals(0,size,"size no es 0");
    }

    @Test
    public void givenANewArray_WhenAddElement_ThenSizeIsOne() {

        //Inicialización
        ArrayList<Integer> List = new ArrayList<>();

        //Ejecución
        List.add(500);

        //Validación
        assertEquals(List.getSize(),1);
    }
    @Test
    public void givenAnExistentArrayWithOneElement_WhenAddElement_ThenSizeIsTwo() {

        //Inicialización
        ArrayList<Integer> List = new ArrayList<>();
        List.add(500);

        //Ejecución
        List.add(100);

        //Validación
        assertEquals(List.getSize(),2);
        assertEquals(500,List.get(0));
        assertEquals(100,List.get(1));
    }
    @Test
    public void givenAnExistentArrayWithNoCapacity_WhenAddElement_ThenSizeIncrementsAndCapacityIncrements() {

        //Inicialización
        ArrayList<Integer> List = new ArrayList<>();
        List.add(100);
        List.add(200);

        //Ejecución
        List.add(300);

        //Validación
        assertEquals(3,List.getSize(),"Deberia tener 3 elementos");
        assertEquals(100,List.get(0));
        assertEquals(200,List.get(1));
        assertEquals(300,List.get(2));
    }
    @Test
    public void givenAnExistentArrayWithElements_WhenIterator_ThenAllElementsAreAccessible() {

        //Inicialización
        ArrayList<Integer> List = new ArrayList<>();
        List.add(100);
        List.add(200);
        List.add(300);
        List.add(400);
        List.add(500);
        //Ejecución
        Iterator<Integer> it=List.getIterator();
        //Validación
        assertTrue(it.hasNext());
        assertEquals(100,it.next());
        assertTrue(it.hasNext());
        assertEquals(200,it.next());
        assertTrue(it.hasNext());
        assertEquals(300,it.next());
        assertTrue(it.hasNext());
        assertEquals(400,it.next());
        assertTrue(it.hasNext());
        assertEquals(500,it.next());
    }
    @Test
    public void givenAnExistentArrayWithElements_WhenReverseIterator_ThenAllElementsAreAccesible() {

        //Inicialización
        ArrayList<Integer> List = new ArrayList<>();
        List.add(100);
        List.add(200);
        List.add(300);
        List.add(400);
        List.add(500);
        //Ejecución
        Iterator<Integer> it=List.getReverseIterator();
        //Validación
        assertTrue(it.hasNext());
        assertEquals(500,it.next());
        assertTrue(it.hasNext());
        assertEquals(400,it.next());
        assertTrue(it.hasNext());
        assertEquals(300,it.next());
        assertTrue(it.hasNext());
        assertEquals(200,it.next());
        assertTrue(it.hasNext());
        assertEquals(100,it.next());
    }
    @Test
    public void givenAnExistentArrayWithFourElements_WhenDeleteElementHead_ThenSizeDecrements() throws MyIndexOutOfBoundsException {

        //Inicialización
        ArrayList<Integer> List = new ArrayList<>();
        List.add(100);
        List.add(200);
        List.add(300);
        List.add(400);
        //Ejecución
        List.delete(0);

        //Validación
        assertEquals(3,List.getSize());
        assertEquals(200,List.get(0));
        assertEquals(300,List.get(1));
        assertEquals(400,List.get(2));
    }
    @Test
    public void givenAnExistentArrayWithFourElements_WhenDeleteElementTail_ThenSizeDecrements() {

        //Inicialización
        ArrayList<Integer> List = new ArrayList<>();
        List.add(100);
        List.add(200);
        List.add(300);
        List.add(400);
        //Ejecución
        List.delete(3);

        //Validación
        assertEquals(3,List.getSize());
        assertEquals(100,List.get(0));
        assertEquals(200,List.get(1));
        assertEquals(300,List.get(2));
    }
    @Test
    public void givenAnExistentArrayWithFourElements_whenDeleteIndexDoesNotExist_ThenIndexOutOfExceptionIsThrown() {

        //Inicialización
        ArrayList<Integer> List = new ArrayList<>();
        List.add(100);
        List.add(200);
        List.add(300);
        List.add(400);
        //Ejecución

        //Validación
//        try{
//            List.delete(5);
//            Assertions.fail("MyIndexOutOfBoundsException should be thrown");
//        }catch(MyIndexOutOfBoundsException ex){
//
//        }
        Assertions.assertThrows(MyIndexOutOfBoundsException.class,()->List.delete(5));
    }
}
