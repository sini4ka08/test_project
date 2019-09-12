package com.lern.homeWork.lesson7.linkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {

    Node<E> head;
    Node<E> tail;

    public MyLinkedList() {
        head = new Node();
        tail = new Node();
    }

    private int size = 0;

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
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("this index -> " + index + " not exist");
        } else if (index == 0) {
            return head.getValue();
        } else if (index == size - 1) {
            return tail.getValue();
        } else {
            return findNodeWithDesiredIndex(index).getValue();
        }
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("this index -> " + index + " not exist");
        } else if (index == 0) {
            head.setValue(element);
            return head.getValue();
        } else if (index == size - 1) {
            tail.setValue(element);
            return tail.getValue();
        } else {
            findNodeWithDesiredIndex(index).setValue(element);
            return findNodeWithDesiredIndex(index).getValue();
        }
    }

    @Override
    public int indexOf(Object o) {
        Node<E> nodeFoll = head;
        int countIndex = 0;
        while (nodeFoll != null) {
            if (nodeFoll.getValue().equals(o)) {
                return countIndex;
            }
            nodeFoll = nodeFoll.getNext();
            countIndex++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node<E> nodeFoll = head;
        int countIndex = 0;
        int lastIndex = -1;
        while (nodeFoll != null) {
            if (nodeFoll.getValue().equals(o)) {
                lastIndex = countIndex;
            }
            nodeFoll = nodeFoll.getNext();
            countIndex++;
        }
        return lastIndex;
    }

    @Override
    public boolean contains(Object o) {
        Node<E> nodeFoll = head;
        while (nodeFoll != null) {
            if (nodeFoll.getValue().equals(o)) {
                return true;
            }
            nodeFoll = nodeFoll.getNext();
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            Node<E> foll = head;

            @Override
            public boolean hasNext() {
                return foll != null;
            }

            @Override
            public E next() {
                if (foll == null) {
                    throw new NullPointerException("No next item");
                }
                E remem = (E) foll.getValue();
                foll = foll.getNext();
                return remem;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[size];
        int i = 0;
        for (E elem : this) {
            objects[i] = elem;
            i++;
        }
        return objects;
    }

    @Override
    public boolean add(E e) {
        if (size == 0) {
            head.setValue(e);
            tail = head;
        } else if (size == 1) {
            head.setNext(new Node<E>(head, e,null));
            tail = head.getNext();
        } else {
            Node<E> nodeFoll = new Node<>(tail, e, null);
            tail.setNext(nodeFoll);
            tail = nodeFoll;
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, E element) {
        Node<E> nodeBeforeFoll;
        Node<E> nodeFoll;
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("this index -> " + index + " not exist");
        } else if (index == 0) {
            head = new Node(null, element, head);
        } else if (index == size - 1) {
            nodeBeforeFoll = tail.getPrev();
            nodeFoll = new Node<>(nodeBeforeFoll, element, tail);
            tail.setPrev(nodeFoll);
            nodeBeforeFoll.setNext(nodeFoll);
        } else {
            nodeFoll = findNodeWithDesiredIndex(index);
            nodeBeforeFoll = nodeFoll.getPrev();
            Node<E> noderezalt = new Node<E>(nodeBeforeFoll, element, nodeFoll);
            nodeFoll.setPrev(noderezalt);
            nodeBeforeFoll.setNext(noderezalt);
        }
        size++;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index == size - 1) {
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
            return true;
        } else if (index == 0) {
            head = head.getNext();
            head.setPrev(null);
            size--;
            return true;
        } else if (index < size - 1 && index >= 0) {
            Node<E> nodeFoll = findNodeWithDesiredIndex(index);
            Node<E> nodeBeforeFoll = nodeFoll.getPrev();
            nodeFoll = nodeFoll.getNext();
            nodeFoll.setPrev(nodeBeforeFoll);
            nodeBeforeFoll.setNext(nodeFoll);
            size--;
            return true;
        }
        return false;
    }

    @Override
    public E remove(int index) {
        E remem;
        if (index >= size || index < 0) {
            throw new RuntimeException("this index ->" + index + " not exist");
        } else if (index == size - 1) {
            remem = (E) tail.getValue();
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
            return remem;
        } else if (index == 0) {
            remem = (E) head.getValue();
            head = head.getNext();
            head.setPrev(null);
            size--;
            return remem;
        } else {
            Node<E> nodeFoll = findNodeWithDesiredIndex(index);
            Node<E> nodeBeforeFoll = nodeFoll.getPrev();
            remem = nodeFoll.getValue();
            nodeFoll = nodeFoll.getNext();
            nodeFoll.setPrev(nodeBeforeFoll);
            nodeBeforeFoll.setNext(nodeFoll);
            size--;
            return remem;
        }
    }

    private Node<E> findNodeWithDesiredIndex(int index) {
        int countIndex;
        Node<E> nodeFoll;
        if (index < size / 2) {
            countIndex = 0;
            nodeFoll = head;
            while (countIndex != index) {
                nodeFoll = nodeFoll.getNext();
                countIndex++;
            }
            return nodeFoll;
        } else {
            countIndex = size - 1;
            nodeFoll = tail;
            while (countIndex != index) {
                nodeFoll = nodeFoll.getPrev();
                countIndex--;
            }
            return nodeFoll;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        int i = 0;
        for (E elem : this) {
            str.append(elem);
            str.append(", ");
            i++;
        }
        return "String{" + str + '}';
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

}
