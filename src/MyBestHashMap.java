import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyBestHashMap implements Map {

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

	public String toString() {
		String s = "";
		for (int i = 0; i < hashList.length; i++) {
			LinkedList list = hashList[i];
			for (int j = 0; j < hashList[i].size(); j++) {
				s = s + list.head.dataValue;
				list.head = list.next;
			}
		}
		return s;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

}
