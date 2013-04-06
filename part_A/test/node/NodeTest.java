package node;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {
	
	LinkedList list;
	
	@Before
	public void initial(){
		list = new LinkedList();
	}
	
	@Test
	public void deleteNodeFromEmptyList() {
		Node node = null;
		assertEquals("null", nodes(list.deleteNode(node)));
	}
	
	@Test
	public void deleteFirstNode() {
		Node node = new Node("A", null);
		list.add(node);
		assertEquals("null", nodes(list.deleteNode(node)));
	}
	
	@Test
	public void deleteSearchedNode() {
		Node node = new Node("A", null);
		Node node2 = new Node("B", null);
		Node node3 = new Node("C", null);
		Node node4 = new Node("D", null);
		list.add(node);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		assertEquals("A B D " , nodes(list.deleteNode(node3)));
	}
	
	@Test
	public void deleteLastNode() {
		Node node = new Node("A", null);
		Node node2 = new Node("B", null);
		Node node3 = new Node("C", null);
		Node node4 = new Node("D", null);
		list.add(node);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		assertEquals("B C D " , nodes(list.deleteNode(node)));
	}
	
	public String nodes(List<Node> list2){
		String string = "";
		
		if (list2.isEmpty()){
			return "null";
		}
		
		for (Node node : list2) {
			string += node.data.toString() + " ";
		}
		
		return string;
	}
}
