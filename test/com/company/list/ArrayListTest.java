package com.company.list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ArrayListTest {
    @Test
    public void whenArrayListIsCreated_thenSizeIsZero() {

        //inicializacion
        ArrayList<Integer> List = new ArrayList<>();

        //Ejecucion
        int size = List.getSize();

        //Validacion
        assertThat(size).isZero();
    }

    @Test
    public void givenANewArray_WhenAddElement_ThenSizeIsOne() {

        //Inicialización
        ArrayList<Integer> List = new ArrayList<>();

        //Ejecución
        List.add(500);

        //Validación
        assertThat(List.getSize()).isEqualTo(1);
    }
    @Test
    public void givenAnExistentArrayWithOneElement_WhenAddElement_ThenSizeIsTwo() {

        //Inicialización
        ArrayList<Integer> List = new ArrayList<>();
        List.add(500);
        //Ejecución
        List.add(100);

        //Validación
        assertThat(List.getSize()).isEqualTo(2);
        assertThat(List.get(0)).isEqualTo(500);
        assertThat(List.get(1)).isEqualTo(100);
    }
}
