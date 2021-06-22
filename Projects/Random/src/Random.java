import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map creation and iteration
				Map<String,String> rando = new HashMap<String,String>();
				
				rando.put("Dennis", "noodles");
				rando.put("Ancy", "rice");
				rando.put("chicken", "little");
				
				for (Map.Entry<String,String> entry : rando.entrySet()) {
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
				
				
				//Set creation and iteration 
				Set<String> veg = new HashSet<String>();
				veg.add("Ginger");
				veg.add("Garlic");
				veg.add("Onion");
				veg.add("Cilantro");
				veg.add("Carrot");
				veg.add("potato");
				
				System.out.println(veg);

				//String iteration
				String name = "Dennis";
				
				for (int i = 0; i < name.length();i++) {
					System.out.println(name.charAt(i));
				}
				
				//list creation and iteration 
				List<String> names = new ArrayList<String>();
				
				names.add("Dennis");
				names.add("Ancy");
				names.add("Brian");
				
				for(int i = 0; i < names.size();i++) {
					System.out.println(names.get(i));
				}
				
				for (String i : names) {
					System.out.println(i);
				}
				
				ArrayList<String> things = new ArrayList<String>();
				
				things.add("Chicken");
				things.add("rum");
				things.add("broccoli");
				things.add("chair");
				
				System.out.println(things);
				
				//array creation and iteration
				//Advantages: random access, easy sorting and iteration, replacement of multiple variables
				//Disadvantages: size is fixed, difficult to insert and delete, if capacity is more and occupancy less, most of the array gets wasted, needs contiguous memory to get allocated
				//Applications: for storing information in a linear fashion, suitable for applications that require frequent searching
				int[] numbers = new int[5];
				
				System.out.println("Array");
				for (int i = 0; i < numbers.length;i++) {
					numbers[i] = i;
					System.out.println(numbers[i] + " ");
				}
				
				
				//Queue creation and functions
				Queue<Integer> q = new LinkedList<>();
				
				q.add(1);
				q.add(2);
				q.add(3);
				q.add(4);
				q.add(5);
				
				System.out.println("Elements of the queue: " + q);
				
				int head = q.peek();
				System.out.println("head of the queue is " + head);
				
				q.poll();
				System.out.println("Elements of the queue: " + q);
	}

}
