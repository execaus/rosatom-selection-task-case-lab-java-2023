package tasks.impl.third.linked_list;

public class LinkedListNode<ValueType> {
    public ValueType value;
    public LinkedListNode<ValueType> next;

    public LinkedListNode(ValueType value) {
        this.next = null;
        this.value = value;
    }
}
