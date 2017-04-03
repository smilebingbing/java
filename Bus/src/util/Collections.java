package util;

import java.util.Collection;
import java.util.Iterator;

public class Collections {

	public static <T> void Print(Collection<T> con) {
		Iterator <T> iter = con.iterator();
		System.out.print("[ ");
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println("]");
	}
	
	
	
}
