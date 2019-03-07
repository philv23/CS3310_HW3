
public class WMUSearchEngine {
	
	public static void main(String args[]) {
	
	MyBestHashMap map1 = new MyBestHashMap();
	
	map1.add("Hello");
	map1.add("Hi");
	map1.add("Hello");
	
	
	for(int i = 0; i < map1.hashList.length; i++) {
		
		map1.hashList[i].printList();
	
	}
	
	
	
	}

}
