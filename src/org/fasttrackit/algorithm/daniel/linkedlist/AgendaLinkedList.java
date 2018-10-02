package org.fasttrackit.algorithm.daniel.linkedlist;

public class AgendaLinkedList {

    public static void main(String[] args) {
        ListaContacte first = new ListaContacte("Daniel", "123546");
        ListaContacte second = new ListaContacte("xyz", "123546");
        ListaContacte third = new ListaContacte("Bob Macedonski", "123546");
//attach them togheter
        first.next = second;
        second.next = third;
        AgendaLinkedList agendaLinkedList = new AgendaLinkedList();
        agendaLinkedList.display(first);
        System.out.println("Agenda length is : " + agendaLinkedList.length(first));
        ListaContacte newFirst = agendaLinkedList.insertAtBeginning(first,"Sunt nr1","00000");
        agendaLinkedList.display(newFirst);

    }



    public void display(ListaContacte first) {
        if (first == null) {
            return;
     }
        ListaContacte current = first;
        while (current != null) {
            System.out.println(current.nume + " " + current.numar);
            current = current.next;

        }
        System.out.println(current);

    }

    public int length(ListaContacte first) {
        if (first == null) {
            return 0; //no elements in list
        }
        int count = 0;
        //loop each element and increment the count till list ends:D
        ListaContacte current = first;
        while (current != null) {
            count++;
            //move to next contact
            current = current.next;
        }
        return count;
    }



    private static class ListaContacte {
        private String nume;
        private String numar;
        private ListaContacte next;

        public ListaContacte(String nume, String numar) {
            this.nume = nume;
            this.numar = numar;
            this.next = null;
        }
        }

    public ListaContacte insertAtBeginning(ListaContacte first, String nume ,String numar){
        ListaContacte newContact=new ListaContacte(nume,numar);
        if(first==null) {
            return newContact;
        }
        newContact.next=first;
        first=newContact;
        return first;//this will be new firstContact;
    }
}



