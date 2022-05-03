public class BubbleSort {
 

	public static void sort(int[] arr ) {
		int size=arr.length;
		// round�� �迭 ũ�� - 1 ��ŭ ����� 
		for(int i = 1; i < size; i++) {
			
			// �� ���庰 ��Ƚ���� �迭 ũ���� ���� ���带 �� ��ŭ ����
			for(int j = 0; j < size - i; j++) {
				
				/*
				 *  ���� ���Ұ� ���� ���Һ��� Ŭ ���
				 *  ���� ������ ��ġ�� ��ȯ�Ѵ�. 
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