public class binary {
 	public static int binary_search(int[] list, int left_index, int right_index, int target) {
 		if (right_index >= left_index) {
			// right- left gives you the length of the current array, divide by 2 to get the mid-pt
			// add the left index to provide the current array offset (if target is on right-side array)
			int middle_index = left_index + (right_index-left_index)/2;
 
			if (list[middle_index] == target) {
				return middle_index; // if target exists it will eventually be the middle index and be returned
			} else if (list[middle_index] > target) {
				return binary_search(list, left_index, middle_index - 1, target); // target is smaller than mid pt so use left-side array
			} else {
 				return binary_search(list, middle_index + 1, right_index, target);// target is larger than mid pt so use right-side array 
			}
 		}
		return -1; // target does not exist in list
	}
}
