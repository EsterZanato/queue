public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Adicionando elementos no final
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Adicionando elementos no início
        list.addFirst(5);
        list.addFirst(2);

        // Imprimindo a lista
        System.out.println("Lista em ordem:");
        list.printList(); // Saída: 2 5 10 20 30

        // Imprimindo a lista reversa
        System.out.println("Lista reversa:");
        list.printReverse(); // Saída: 30 20 10 5 2

        // Removendo elementos
        list.remove(10); // Remove o elemento 10
        list.remove(2);  // Remove o elemento 2

        // Imprimindo novamente
        System.out.println("Lista após remoções:");
        list.printList(); // Saída: 5 20 30
    }
}