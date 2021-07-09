class Deque {
    private Node head;
    private Node tail;
    public long dData;// data item
    public Node next;// next link in list
    public Node previous; // previous link in list
    
//------------------------------------------------------
    public Deque() // constructor
    {
        head = null; // no items on list yet
        tail = null;
    }
//-------------------------------------------------------------
    public void Node(long d) // constructor
    {
        dData = d;
    }
//-------------------------------------------------------------
    public void displayLink() {// display this link
        System.out.print(dData + " ");
    }
//-------------------------------------------------------------
    public boolean isEmpty() // true if no links
    {
        return head == null;
    }
//--------------------------------------------------------------
    public void insertLeft(long dd) // insert at left of list
    {
        Node newLink = new Node(dd);

        if (isEmpty()) // if empty list,
            tail = newLink;// newLink <-- tail
        else
            head.previous = newLink; // newLink <-- old head
        newLink.next = head; // newLink --> old head
        head = newLink; // head -->newLink
    }
//-------------------------------------------------------------
    public void insertRight(long dd) // insert at end of list
    {
        Node newLink = new Node(dd); // make new link
        if (isEmpty()) // if empty list,
            head = newLink; // head --> newLink
        else {
            tail.next = newLink; // old tail -->newLink
            newLink.previous = tail;// old tail <-- newLink
        }
        tail = newLink; // newLink <-- tail
    }
//-------------------------------------------------------------
    public Node removeLeft() // delete head link
    {
// (assumes non-empty list)
        Node temp = head;
        if (head.next == null) // if only one item
            tail = null;
// null <-- tail
        else
            head.next.previous = null; // null <-- old next
        head = head.next; // head --> old next
        return temp;

    }
//-------------------------------------------------------------
    public Node removeRight() // delete tail link
    {
        // (assumes non-empty list)
        Node temp = tail;
        if (head.next == null) // if only one item


            head = null;// head --> null
        else
            tail.previous.next = null; // old previous --> null
        tail = tail.previous; // old previous <-- tail
        return temp;
    }
//-------------------------------------------------------------
    public void displayForward()
    {
        System.out.print("Deque (head-->tail): ");
        Node current = head; // start at beginning
        while(current != null) // until end of list
        {
            current.displayLink();// display data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
//-------------------------------------------------------------
    public void displayBackward() 
    {
        System.out.print("Deque (tail-->head): ");
        Node current = tail; // start at end
        while (current != null) // until start of list,
        {
            current.displayLink(); // display data
            current = current.previous;//move to previous link
        }
        System.out.println("");
    }
//-------------------------------------------------------------
    public static void main(String[] args)
    {
        // make a new list
        Deque theList = new Deque();
        theList.insertLeft(99); // insert at left
        theList.insertLeft(73);
        theList.insertLeft(24);
        theList.insertRight(96); // insert at right
        theList.insertRight(47);
        theList.insertRight(16);
        theList.displayForward(); // display list forward
        theList.displayBackward(); // display list backward
        theList.removeLeft(); // delete head item

        theList.removeRight(); // delete tail item
        theList.displayForward(); // display list forward
        theList.displayBackward();// display list forward
        //end main
        //end class DequeApp
    }
}
// end class Deque