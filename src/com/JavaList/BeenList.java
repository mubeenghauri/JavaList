package com.JavaList;


import javax.swing.*;

/**
 *
 * List class for the main List
 *
 * */

class BeenList {

    private BeenNode head;

    BeenList() {
        System.out.println("[*] List Object Created Succexfully ;) \n");
        // head of list
        this.head = null;
    }

    /**
     * @param x : the value to be inserted into the list
     * */
    public void append(int x) {

        if (this.head == null) {
            System.out.println("[*] Head is Null, adding a value into it !! \n");
            this.head = new BeenNode();
            this.head.val = x;
            this.head.next = null;
        }
        else {
            System.out.println("[*] Head is not null, adding value into the list \n");

            BeenNode temp = new BeenNode();
            temp = this.head;

            while(temp.next != null) {
                temp = temp.next;
            }

            BeenNode temp2 = new BeenNode();
            temp2.val = x;
            temp2.next = null;
            temp.next = temp2;

            System.out.println("[*] Value inserted into the list");

        }
    }

    /**
     * Print content of list
     * */
    public void print() {
        BeenNode temp = new BeenNode();
        temp = this.head;
        System.out.println("\n[*] Printing content of List \n");
        while (temp != null){
            System.out.println("\t -> " + temp.val);
            temp = temp.next;
        }
    }
}
