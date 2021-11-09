package org.sandeep.singlyLinkedList;

public class Deletion {

    static Node deleteAtStart(Node head){
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }

    static  Node deleteAtEnd(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp = head;
        Node preTemp=head;
        while(temp.next!=null){
            preTemp=temp;
            temp=temp.next;
        }
        preTemp.next=null;
        return head;
    }

    static Node deleteAtPosition(Node head,int pos){
        if(head==null){
            return null;
        }
        if(pos==1){
            return deleteAtStart(head);
        }
        Node cur = head;
        Node pre = null;
        int k=1;
        while (cur.next!=null && k<pos){
            pre=cur;
            cur=cur.next;
            k++;
        }
        pre.next=cur.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = Insertion.asLinkedList(4, 5, 6, 7, 8, 9, 10,11,12);
        Insertion.printAll(head);
        System.out.println();
        head=deleteAtStart(head);
        Insertion.printAll(head);

        System.out.println();
        head=deleteAtEnd(head);
        Insertion.printAll(head);

        System.out.println();
        head=deleteAtPosition(head,4);
        Insertion.printAll(head);
    }
}
