package tasks.impl.third.linked_list;

/**
 * Односвязный список с динамическим типом элементов.
 * @param <ValueType> тип элементов коллекции.
 */
public class LinkedList<ValueType> {
    private LinkedListNode<ValueType> head;
    private LinkedListNode<ValueType> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Добавить значение в конец списка.
     * @param value новое значение.
     * @return измененный односвязный список.
     */
    public LinkedList<ValueType> append(ValueType value) {
        var node = new LinkedListNode<ValueType>(value);

        if (this.head == null) {
            this.head = node;
        }

        if (this.tail != null) {
            this.tail.next = node;
        }
        this.tail = node;

        return this;
    }

    @Override
    public String toString() {
        if (this.head == null) {
            return "";
        }

        StringBuilder str = new StringBuilder("[");
        var currentNode = this.head;

        while (currentNode != null) {
            str.append(currentNode.value).append(" ");
            currentNode = currentNode.next;
        }

        str.replace(str.length() - 1, str.length(), "]");

        return str.toString();
    }

    /**
     * Инвертирует односвязный список.
     */
    public void reverse() {
        if (this.head == null) {
            return;
        }

        var currentNode = this.head;
        var nextNode = this.head.next;
        LinkedListNode<ValueType> prevNode = null;

        while (nextNode != null) {
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
            nextNode = currentNode.next;
        }
        currentNode.next = prevNode;

        this.head = currentNode;
    }
}
