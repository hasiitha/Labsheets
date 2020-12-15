package linklists;

public class TheLinkApp {

	public static void main(String[] args) {
		LinkLists lists= new LinkLists();
		
		lists.insertFirstLink(23);
		lists.insertFirstLink(89);
		lists.insertFirstLink(12);
		lists.insertFirstLink(55);
		
		System.out.println("Display");
		lists.displayLinklist();
		
		System.out.println("-----------------------------");
		
		while(!lists.isEmpty()) {
			Links dislink = lists.deleteFirstLink();
			System.out.println("Deleted");
			dislink.displayLink();
		}
	}

}
