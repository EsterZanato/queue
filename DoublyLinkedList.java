import java.sql.SQLOutput;
public class DoublyLinkedList {
    private static class Node {
        int data; //valor do nó
        Node prev; //"ponteiro" para o nó anterior
        Node next; //"ponteiro" "para o próximo nó

        //Construtor que inicializa os objetos
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }


    private Node head; //referencia ao primeiro nó da lista
    private Node tail; //referencia ao ultimo nó da lista

    //construtor que garante que elas serão inicializadas vazias
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }


    //adiciona um nó no final da lista
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }


    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) { // Lista vazia
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }


    public boolean remove(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printReverse() {
        Node current = tail;
        while(current != null){
            System.out.println(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}