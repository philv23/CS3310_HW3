
public class MyBestHashMap {

	String name;
	public LinkedList[] hashList = new LinkedList[10];

	public MyBestHashMap(String name) {
		this.name = name;

		for (int i = 0; i < hashList.length; i++) {
			hashList[i] = new LinkedList();
		}
	}

	public void add(String k) {
		int x = stringHash(k);
		int n = x % 10;

		hashList[n].insertLast(x);
	}

	public int stringHash(String s) {
		double sum = 0, mul = 1;
		for (int i = 0; i < s.length(); i++) {
			mul = (i % 4 == 0) ? 1 : mul * 256;
			sum += s.charAt(i) * mul;
		}
		return (int) (Math.abs(sum) % 10000);
	}

	public boolean searchList(String s) {
		int z = stringHash(s);
		int n = z % 10;

		return hashList[n].search(z);

	}

	public String getName() {
		return name;
	}

}
