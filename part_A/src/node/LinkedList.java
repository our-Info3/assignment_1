package node;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	List<Node> list = new ArrayList<Node>();
	Node firstItem;
	
	public List<Node> deleteNode(Node searchedNode) {
		if (list.isEmpty()){
			return list;
		}else{
			if (searchedNode == firstItem){
				firstItem = null;
				list.remove(searchedNode);
				return list;
			}else{
				for (Node nodes : list) {
					if (nodes.next == searchedNode){
						nodes.next = searchedNode.next;
						list.remove(searchedNode);
						return list;
					}
				}	
			}
		}
		return list;
	}
	
	public void add(Node node){
		node.next = firstItem;
		firstItem = node;
		list.add(node);
	}

}
