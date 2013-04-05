package node;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {
	
	LinkedList list;
	Node node;
	
	@Before
	public void initial(){
		list = new LinkedList();
		node = new Node("S", null);
		
	}
	
	@Test
	public void deleteNodeFromEmptyList() {
		assertEquals(false, list.deleteNode(node));
	}
	
	@Test
	public void deleteFirstNode() {
		list.add(node);
		assertEquals(true, list.deleteNode(node));
	}
	
	@Test
	public void deleteSearchedNode() {
		Node node2 = new Node("T", null);
		Node node3 = new Node("U", null);
		Node node4 = new Node("V", null);
		list.add(node);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		assertEquals(true, list.deleteNode(node3));
	}
	
	@Test
	public void deleteLastNode() {
		Node node2 = new Node("T", null);
		Node node3 = new Node("U", null);
		Node node4 = new Node("V", null);
		list.add(node);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		assertEquals(true, list.deleteNode(node4));
	}
}
