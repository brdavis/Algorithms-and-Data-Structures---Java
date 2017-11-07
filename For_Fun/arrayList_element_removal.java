import java.util.ArrayList;

public class arrayList_element_removal {
	public static void main(String[] args) {
		// Create array list
		ArrayList<Object> my_list = new ArrayList<Object>(3);
		my_list.clear();
		my_list.add("first element");
		my_list.add("second element");
		my_list.add("third element");

		// Print the list
		System.out.println("Before removail: " + my_list);

		// Remove element
		my_list.remove("second element");

		// Print list after removal
		System.out.println("After removal of second element: " + my_list);
	}
}
