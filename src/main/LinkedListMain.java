package main;

import listmain.MyLinkedList;
import node.Node;

public class LinkedListMain {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Node element = new Node();
        element.setData(10);
        list.insert(element);
        element = new Node();
        element.setData(11);
        list.insert(element);
        element = new Node();
        element.setData(12);
        list.insert(element);
        element = new Node();
        element.setData(15);
        list.insert(element);
        element = new Node();
        element.setData(14);
        list.insert(element);
        element = new Node();
        element.setData(13);
        list.insert(element);


        list.display();
        list.delete();
        list.display();
        list.delete();
        list.display();

        System.out.println("display by recursion");
        System.out.println(list.printData(list.getHead()));

    }
}
