public class Sorts{

	public static void bubbleSort(int[] data){
		int storage = 0;
		boolean noswap = false;
		for(int i = data.length; i >= 0; i--){
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
}