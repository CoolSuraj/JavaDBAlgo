import java.util.Iterator;
import java.util.Vector;

/**
 * 
 */

/**
 * @author root
 *
 */
public class VectorUse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Vector is same as ArrayList but this is Thread Safe
		
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add(6);
		
		Iterator<Integer> iter = vector.iterator();
		
//		for (Iterator iterator = vector.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			
//		}
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		
	}

}
