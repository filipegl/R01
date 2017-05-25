package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		
		T daVez;
		int j;
		
		for (int i = leftIndex + 1; i <= rightIndex; i++){
			
			daVez = array[i];
			j = i-1;
			
			while ((j >=0 ) && (daVez.compareTo(array[j]) < 0)){
				Util.swap(array, j+1, j);
				j -= 1;
			}
			array[j+1] = daVez;
		}
	}
}
