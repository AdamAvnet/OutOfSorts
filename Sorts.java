public class Sorts{

	public static void bubbleSort(int[] data){
		int storage = 0;
		boolean noswap = false;
		for(int i = data.length; i > 0; i--){
			if(noswap)
				break;
			noswap = true;
			for(int j = 0; j < i - 1; j++){
				if(data[j] > data[j + 1]){
					noswap = false;
					storage = data[j];
					data[j] = data[j + 1];
					data[j + 1] = storage;
				}
			}
		}		
	}

	public static void selectionSort(int[] data){
		int storeval = 0;
		int storeindex = 0;
		int min = data[0];
		for(int i = 0; i < data.length; i++){
			if(i > 0 && min != data[i - 1]){
				storeval = data[i - 1];
				data[i - 1] = min;
				data[storeindex] = storeval;
			}
			min = data[i];
			for(int j = i; j < data.length; j++){
				if(data[j] <= min){
					min = data[j];
					storeindex = j;
				}
			}
		}
	}

	public static void insertionSort(int[] data){
		int storage = 0;
		for(int i = 1; i < data.length; i++){
			if(data[i] < data[i - 1]){
				for(int j = i; j >= 0; j--){
					if(data[j] < data[i]){
						storage = data[i];
						for(int k = j; k < i; k++){
							data[k] = data[k + 1];
						}
						data[j] = storage;
					}
				}
			}
		}
	}
						
			
}