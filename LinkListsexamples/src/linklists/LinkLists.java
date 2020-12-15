package linklists;

public class LinkLists {

	private Links First;

	public LinkLists() {
	First = null;
	}
	public void displayLinklist() {
		Links current = First;
		while(current != null) {
			current.displayLink();
			System.out.println();
			current = current.next;
		}
		System.out.println(" ");
	}
	
	public boolean isEmpty() {
		if(First == null) {
			return true;
		}
		else
			return false;
	}
	
	public void insertFirstLink(int iDAta) {
		
		Links newLink = new Links(iDAta);
		newLink.next =First;
		First = newLink;
		
		
		
	}
	public Links deleteFirstLink() {
		Links temp = First;
		First = First.next;
		return temp;
	}
}

