import java.util.Scanner;

public class WMUSearchEngine {
	
	public static void main(String args[]) {
	
	Scanner scan1 = new Scanner(System.in);
	
	int x = scan1.nextInt();
	
	MyBestHashMap map1 = new MyBestHashMap();
	
	map1.intializeArray();
	map1.add("Hello");
	map1.add("Hi");
	map1.add("Bye");
	
	
	for(int i = 0; i < map1.hashList.length; i++) {	
		map1.hashList[i].printList();
	}
	
	}

}
