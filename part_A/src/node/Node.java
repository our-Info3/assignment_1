package node;

public class Node {
  Node next;
  String data;

  public Node(String data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Node(String data) {
    this.data = data;
  }
}