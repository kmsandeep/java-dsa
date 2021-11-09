package org.sandeep.singlyLinkedList;

import java.util.Arrays;
import java.util.List;

public class Insertion {

    static void printAll(Node head){
        while(head!=null){
            System.out.print(" "+head.data);
            head=head.next;
        }
    }

    static Node insertAtStart(Node head, int x){
        Node newNode = new Node(x);
        newNode.next=head;
        head=newNode;
        return head;
    }
    static Node insertAtEnd(Node head, int x){
        Node newNode = new Node(x);
        if(head==null){
            return newNode;
        }
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

        return head;
    }

    static Node insertAtPosition(Node head,int x, int pos){
        Node newNode = new Node(x);
        if(head==null){
            return newNode;
        }
        if(pos==1){
            return insertAtStart(head,x);
        }


        int i=1;
        Node cur=head;
        Node pre=head;
        while (cur.next!=null && i<pos){
            pre=cur;
            cur = cur.next;
            i++;
        }
        if(i==pos){
            pre.next=newNode;
            newNode.next = cur;
        }


        return head;
    }

    static Node asLinkedList(int... numbers){
        Node head = null;
        for (int n : numbers){
            head=insertAtStart(head,n);
        }
        return head;
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 5, 7, 8, 9, 11);
        // inserting from start
        Node head = null;
        for(Integer x : nums){
            head = insertAtStart(head,x);
        }

        printAll(head);
        System.out.println();
        head=insertAtPosition(head,23,1);

        printAll(head);
//
//        System.out.println();
//        insertAtEnd(head,88);
//        printAll(head);
    }
}
