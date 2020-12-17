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
		int storage = 0;
		int min = data[0];
		for(int i = 0; i < data.length; i++){
			if(i > 0){
				storage = data[i - 1];
				data[i - 1] = min;
			}
			for(int j = i; j < data.length; j++){
				if(data[j] <= min)
					min = data[j];
			}
		}
	}
}