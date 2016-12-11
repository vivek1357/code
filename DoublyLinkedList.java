/* A basic linked list implementation */
public class DoublyLinkedList <E> {

    // private Nested Node Class

    private static class Node <E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        // Constructor.
        public Node(E e, Node<E> p, Node<E> n){
            element = e;
            prev = p;
            next = n;
        }

        // Public Methods.
        public E getElement() { return element; }
        public Node<E> getPrev() { return prev; }
        public Node<E> getNext() { return next; }
        public void setPrev( Node<E> p) { prev = p; }
        public void setNext( Node<E> n) { next = n; }

    } // End of Nested Node Class.

    // instance variables for the DLL class.
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    //Constructor - initialize the sentinels.
    public DoublyLinkedList() {
        header  = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    // DoublyLinkedList public methods.

    // Returns the # of elements in the list.
    public int size() { return size; }

    // Checks for empitness.
    public boolean isEmpty() { return size == 0; }

    // Returns but does not remove the element.
    public E first() {
        if ( isEmpty() ) return null;

        return header.getNext().getElement();   // Element is after the header.
    }

    // Returns the last element but does not remove.
    public E last() {
        if (isEmpty()) return null;
        
        return trailer.getPrev().getElement();  // Element is before the trailer.

    }

    // Add the element e to the beginning on the list.
    public void addFirst(E e){
        addBetween(e, header, header.getNext());   // Adds after the header.
    }

    // Adds the element e to the end of the list.
    public void addLast(E e){
        addBetween(e, trailer.getPrev(), trailer);
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.getPrev());
    }

    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        // create and link a new node.
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    private E remove( Node<E> node ){
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();

        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }



}


