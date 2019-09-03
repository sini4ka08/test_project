package com.lern.homeWork.lesson7.arrayList;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    Object arr[];

    private int size = 0;  // а не -1!
    private int capacity;

    public MyArrayList() {
        this.arr = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }//!

    @Override
    public void clear() {
        this.arr = new Object[capacity];
    }//!

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                return true;
            }
        }
        return false;
    }//!

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[size];
        for (int i = 0; i < objects.length; i++) {
            arr[i] = objects[i];
        }
        return objects;
    }//!

    @Override
    public E get(int index) {
        if (index < size) {
            return (E) arr[index];
        } /*else {
            throw //Дописать проверку!
        }*/
        return (E) arr[index++];  //не верно!
    }//!

    @Override
    public E set(int index, E element) {
        arr[index] = element;   // Дописать проверку!
        return element;
    }//!

    @Override
    public E remove(int index) {
        if (index == size - 1) {
            // arr[index] = null;
            size--;
        } else {
            for (int i = index; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    arr[i] = arr[j];
                }
                size--;
            }
        }
        return (E) arr[index];   // который удали...
    }//!

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size - 1; i++) {   //сначала где находиться, метод remove exchenge доделать! Повторяющая логика
            for (int j = i + 1; j < size; j++) {
            if (arr[i].equals(o)) {
                arr[i] = arr[j];
            }
            size--;
            }
        }
        return false;
    }//!

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }//!!!!!

    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                lastIndex = i;   // !!!!!!!!
            }
        }
        return lastIndex;
    }//!

    @Override
    public void add(int index, E element) {   // проверку на индекс!!
        size++;
        if (size == arr.length) {
            restructarizateArr();
        }
        for (int i = size - 1; i > index; i--) {
            arr[i + 1] = arr[i];   //???????????????????????
        }
        arr[index] = element;
    }//!

    @Override
    public boolean add(E e) {
        size++;
        if (size == arr.length) {
            restructarizateArr();
        }
        arr[size - 1] = e;
        return true;
    }

    private void restructarizateArr() {
        Object newArr[] = new Object[size + capacity];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

}
