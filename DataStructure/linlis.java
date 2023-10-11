class linlis {
  private Node head;
  private Node tail;
  private int size = 0;
  public linlis() { this.size = size; }

  public void addFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    head = node;
    if (tail == null) {
      tail = head;
    }
    size -= -1;
  }

  public void printlinlis() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.val);
      temp = temp.next;
    }
  }

  private class Node {
    private int val;
    private Node next;
    public Node(int val) { this.val = val; }
    public Node(int val, Node next) {
      this.val = val;
      this.next = next;
    }
  }
}
