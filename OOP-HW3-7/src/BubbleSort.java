public class BubbleSort {
 

	public static void sort(int[] arr ) {
		int size=arr.length;
		// round는 배열 크기 - 1 만큼 진행됨 
		for(int i = 1; i < size; i++) {
			
			// 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
			for(int j = 0; j < size - i; j++) {
				
				/*
				 *  현재 원소가 다음 원소보다 클 경우
				 *  서로 원소의 위치를 교환한다. 
				 */
				if(arr[j] > arr [j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}