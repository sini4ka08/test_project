package com.lern.homeWork.lesson7.arrayList;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    Object arr[];

    private int size = 0;
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
    }

    @Override
    public void clear() {
        this.arr = new Object[capacity];
    }  

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[size];
        for (int i = 0; i < objects.length; i++) {
            arr[i] = objects[i];
        }
        return objects;
    }

    @Override
    public E get(int index) {
        if (index < size) {
            return (E) arr[index];
        } else {
            throw new RuntimeException("this index -> " + index + "not exist");
        }
    }

    @Override
    public E set(int index, E element) {
        if (index < size) {
            arr[index] = element;
            return element;
        } else {
            throw new RuntimeException("this index -> " + index + "not exist");
        }
    }

    @Override
    public E remove(int index) {
        E remember = (E) arr[index];
        if (index == size - 1) {
            size--;
            return remember;
        } else if (index < size - 1) {
            removeExchange(index);
            size--;
            return remember;
        } else {
            throw new RuntimeException("this index -> " + index + "not exist");
        }
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index == size - 1) {
            size--;
            return true;
        } else if (index < size - 1) {
            removeExchange(index);
            size--;
            return true;
        } else {
            return false;
        }
    }

    private void removeExchange(int index) {
        for (int i = index; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                arr[i] = arr[j];
            }
        }
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public void add(int index, E element) {
        if (index <= size - 1) {
            size++;
            if (size == arr.length) {
                restructarizateArr();
            }
            for (int i = size - 1; i > index; i--) {
                arr[i + 1] = arr[i];
            }
            arr[index] = element;
        } else {
            throw new RuntimeException("this index -> " + index + "not exist");
        }
    }

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
