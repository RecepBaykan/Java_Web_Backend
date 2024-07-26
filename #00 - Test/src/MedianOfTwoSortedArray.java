import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 4, 1, 6 };
		int[] nums2 = { 3, 4 };

		double nums = findMedianSortedArrays(nums1, nums2);

		System.out.println(nums);

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		double median = 0.0;

		int[] list = new int[nums1.length + nums2.length];

		
		int a = 0;

		for (int i : nums1) {

			list[a] = i;
			a++;
		}

		for (int i : nums2) {

			list[a] = i;
			a++;
		}

		Arrays.sort(list);

		if (list.length % 2 == 0) {

			median = (double) (list[list.length / 2 - 1]) + (double) (list[list.length / 2]);
			median = median / 2;

		} else {

			median = (double) (list[(int) (list.length - 1) / 2]);
		}
		
		return median;

		/*
		 * Çözüm1:
		 * 
		 * List<Integer> list = new ArrayList<Integer>();
		 * 
		 * for(int i: nums1) {
		 * 
		 * list.add(i); }
		 * 
		 * for(int i: nums2) { list.add(i); }
		 * 
		 * 
		 * Collections.sort(list);
		 * 
		 * 
		 * 
		 * 
		 * for(int i: list) { System.out.print(i); } median = (double)
		 * (list.get(list.size()/2 -1) + list.get(list.size()/2));
		 * System.out.println(" ");
		 * 
		 * 
		 * if(list.size() % 2 == 0) {
		 * 
		 * median = (double) (list.get(list.size()/2 -1)) + (double)
		 * (list.get(list.size()/2)); median = median / 2;
		 * 
		 * }else {
		 * 
		 * median = (double) (list.get((int) (list.size()-1)/2)); }
		 * return median;
		 * 
		 */

	
	}
	
	
	
	

}
