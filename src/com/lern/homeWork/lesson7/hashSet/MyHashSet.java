package com.lern.homeWork.lesson7.hashSet;

import java.util.*;

public class MyHashSet<E> implements Set {

    LinkedList nodes[];
    private int size = 0;
    static final int INITIAL_CAPACITY = 16;

    public MyHashSet() {
        this.nodes = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new LinkedList();
        }
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
        this.nodes = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new LinkedList();
        }
        size = 0;
    }

    @Override
    public boolean add(Object o) {
        if (nodes[o.hashCode() % (nodes.length - 1)].contains(o)) {
            return false;
        } else {
            size++;
            nodes[o.hashCode() % (nodes.length - 1)].add(o);
            if ((size + 5) > nodes.length) {
                restructarizateNodes();
            }
            return true;
        }
    }

    private void restructarizateNodes() {
        LinkedList newNodes [] = new LinkedList[nodes.length + INITIAL_CAPACITY];
        for (int i = 0; i < newNodes.length; i++) {
            newNodes[i] = new LinkedList();
        }
        for (int i = 0; i < nodes.length; i++) {
            for (Object element : nodes[i]) {
                 int index = element.hashCode() % (newNodes.length - 1);
                 newNodes[index].add(element);
            }
        }
        nodes = newNodes;
    }

    @Override
    public boolean contains(Object o) {
        if (nodes[o.hashCode() % (nodes.length - 1)].contains(o)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if (nodes[o.hashCode() % (nodes.length - 1)].contains(o)) {
            nodes[o.hashCode() % (nodes.length - 1)].remove(o);
            size--;
            return true;
        }
        return false;
    }


    private List<Object> collectAllValue() {

        List<Object> arr = new ArrayList<Object>(size);

        for (int i = 0; i < nodes.length; i++) {
            if (! nodes[i].isEmpty()) {
                arr.addAll(nodes[i]);
            }
        }
        return arr;
    }

    @Override
    public Iterator iterator() {
        return collectAllValue().iterator();
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[size];
        int j = 0;
        for (int i = 0; i < nodes.length; i++) {
            for (Object element : nodes[i]) {
                objects[j] = element;
                j++;
            }
        }
        return objects;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
