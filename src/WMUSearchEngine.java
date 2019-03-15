import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WMUSearchEngine {

	public static void main(String args[]) throws FileNotFoundException {

		ArrayList<MyBestHashMap> map = new ArrayList<MyBestHashMap>();
		File file = new File(args[0]);
		Scanner scan1 = new Scanner(file);
		int j = -1;
		while (scan1.hasNext()) {
			String k = scan1.next();
			MyBestHashMap map1;
			MyBestHashMap map2;
			if (k.contains("http")) {
				map1 = new MyBestHashMap(k);
				j++;
				map.add(map1);
			} else {
				map2 = map.get(j);
				map2.add(k);
				map.set(j, map2);
			}
		}
		scan1.close();
		System.out.println("Index Created");

		Scanner scan2 = new Scanner(System.in);
		String d = "";
		ArrayList<String> strings = new ArrayList<String>();
		Stack stack1 = new Stack();
		int x = 0;
		int z = 0;

		MyBestHashMap map2;
		while (!d.contains("!")) {
			System.out.print(">");
			d = scan2.next();
			if (d.contains("&&")) {
				for (int u = 0; u < map.size(); u++) {
					int num = 0;
					map2 = map.get(u);
					for (int i = 0; i < strings.size(); i++) {
						if (map2.searchList(strings.get(i))) {
							num++;
						}
					}
					if (num >= strings.size()) {
						System.out.println(map2.getName());
					}
				}
				strings.clear();

			} else if (d.contains("||")) {
				for (int u = 0; u < map.size(); u++) {
					int num = 0;
					map2 = map.get(u);
					for (int i = 0; i < strings.size(); i++) {
						if (map2.searchList(strings.get(i))) {
							num++;
						}
					}
					if (num >= 1) {
						System.out.println(map2.getName());
					}
				}
				strings.clear();

			} else if (d.contains("?")) {

			} else {
				strings.add(d);
				stack1.push(d);
			}
		}
		scan2.close();
	}

}
