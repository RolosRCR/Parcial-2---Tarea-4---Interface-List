package com.company.list;

public interface List<T> {
    void add(T data);

    int getSize();

    T get(int index);

    void delete(int index);

    void insert(T data, Position position, Iterator<T> it);

    Iterator<T> getIterator();


    Iterator<T> getReverseIterator();
}
