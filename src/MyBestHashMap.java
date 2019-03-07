
public class MyBestHashMap {
	
	public LinkedList[] hashList = new LinkedList[10];
	
	public void add(String k) {
		int x = stringHash(k);
		int n = x % 10;
		
		hashList[n].insertFirst(x);
	}
	
	int stringHash(String s) {
		  long sum = 0, mul = 1;
		  for (int i = 0; i < s.length(); i++) {
		    mul = (i % 4 == 0) ? 1 : mul * 256;
		    sum += s.charAt(i) * mul;
		  }
		  return (int)(Math.abs(sum) % 100);
		}
	
}
