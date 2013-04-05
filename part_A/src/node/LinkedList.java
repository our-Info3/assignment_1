package node;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	List<Node> list = new ArrayList<Node>();
	Node firstItem;
	
	public boolean deleteNode(Node searchedNode) {
		if (list.isEmpty()){
			return false;
		}else{
			if (searchedNode == firstItem){
				firstItem = searchedNode.next;
				return true;
			}else{
				for (Node nodes : list) {
					if (nodes.next == searchedNode){
						nodes.next = searchedNode.next;
						return true;
					}
				}	
			}
		}
		return false;
	}
	
	public void add(Node node){
		list.add(node);
		node.next = firstItem;
		firstItem = node;
	}

}
