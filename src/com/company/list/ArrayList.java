package com.company.list;

public class ArrayList<T> implements List<T> {

    private Object array[] = new Object[2];
    ;
    private int size=0;

    @Override
    public void add(T data) {
        if (size == array.length) {
            Object aux[] = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                aux[i] = array[i];
            }
            this.array = new Object[aux.length];

            for (int i = 0; i < array.length; i++) {
                array[i] = aux[i];
            }
        }
        this.array[size] = data;
        size++;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        if(index>=size||index<0){
            throw new MyIndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    @Override
    public void delete(int index) {
        if(array.length-(index+1)>=0){
        for (int i=index+1;i<array.length;i++){
        this.array[i-1]=this.array[i];
        }}else{
            throw new MyIndexOutOfBoundsException();
            }
        size--;
    }

    @Override
    public void insert(T data, Position position, com.company.list.Iterator<T> it) {

    }

    @Override
    public com.company.list.Iterator<T> getIterator() {
        return new Iterator();
    }

    @Override
    public com.company.list.Iterator<T> getReverseIterator() {
        return new ReverseIterator();
    }

    public class Iterator implements com.company.list.Iterator<T> {
        private int pos;

        public Iterator() {
            this.pos = 0;
        }

        public Iterator(int position) {
            this.pos = position;
        }

        @Override
        public boolean hasNext() {
            return pos < size;
        }

        @Override
        public T next() {
            T data = (T) array[pos];
            pos++;
            return data;
        }
    }

    public class ReverseIterator implements com.company.list.Iterator<T> {
        private int pos;

        public ReverseIterator() {
            this.pos = size - 1;
        }

        public ReverseIterator(int position) {
            this.pos = position;
        }

        @Override
        public boolean hasNext() {
            return pos >= 0;
        }

        @Override
        public T next() {
            T data = (T) array[pos];
            pos--;
            return data;
        }
    }
}

