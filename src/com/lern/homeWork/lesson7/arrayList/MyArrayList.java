package com.lern.homeWork.lesson7.arrayList;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    Object arr[];

    private int size = 0;
    static final int CAPACITY = 10;

    public MyArrayList() {
        this.arr = new Object[CAPACITY];
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
        this.arr = new Object[CAPACITY];
    } // не работает!

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
    public Object[] toArray() {                  // не работает!
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
            throw new RuntimeException("this index -> " + index + " not exist");
        }
    }

    @Override
    public E set(int index, E element) {
        if (index < size) {
            arr[index] = element;
            return element;
        } else {
            throw new RuntimeException("this index -> " + index + " not exist");
        }
    }

    @Override
    public E remove(int index) {
        E remember = (E) arr[index];
        if (index == size - 1) {
            arr[index] = null;
            size--;
            return remember;
        } else if (index < size - 1) {
            removeExchange(index);
            return remember;
        } else {
            throw new RuntimeException("this index -> " + index + " not exist");
        }
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index == size - 1) {
            arr[index] = null;
            size--;
            return true;
        } else if (index < size - 1 && index >= 0) {
            removeExchange(index);
            return true;
        } else {
            return false;
        }
    }

    private void removeExchange(int index) {
        for (int i = index; i < size - 1; i++) {
            E prev = (E) arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = prev;
        }
        arr[size - 1] = null;
        size--;
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
        E remember = (E) arr[index];
        if (index <= size - 1) {
            size++;
            if (size == arr.length) {
                restructarizateArr();
            }
            addExchange(index);
            arr[index] = element;
        } else {
            throw new RuntimeException("this index -> " + index + " not exist");
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

    private void addExchange(int index) {
        E remember = (E) arr[index];
        for (int i = size - 1; i > index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index + 1] = remember;
    }

    private void restructarizateArr() {
        Object newArr[] = new Object[size + CAPACITY];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public String toString() {
        return "String{" + Arrays.toString(arr) + '}';
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
