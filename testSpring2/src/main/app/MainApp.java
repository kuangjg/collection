package main.app;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello2";
		final String b = "hello";
		String d = "hello";
		String c = b + 2;
		String e = d + 2;
		System.out.println((a == c));
		System.out.println((a == e));
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println( "a.hashCode:"+ ( a.hashCode()) );
		System.out.println( "b.hashCode:"+ ( b.hashCode()) );
		System.out.println( "c.hashCode:"+ ( c.hashCode()) );
		System.out.println( "s1.hashCode:"+ ( s1.hashCode()) );
		System.out.println( "s2.hashCode:"+ ( s2.hashCode()) );
		System.out.println("s1==s2?" + (s1==s2) );
		
		final T  i =  new T();
		i.n = 1000;
		
		System.out.println(i.n);
		
		int arry[] = {10,11};
		int a2[] = {12,13};
		a2 = arry;
		System.out.println(a2);
		arry[0] = 100;
		
		
	}

}


class T {
	int n = 100;
}
