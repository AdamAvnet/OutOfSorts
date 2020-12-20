import java.util.Arrays;
import java.util.Random;
public class SortTester{
	
	public static void bubblySort(int[] data){
		int storage = 0;
		boolean noswap = false;
		for(int i = data.length; i > 0; i--){
			if(noswap)
				break;
			noswap = true;
			System.out.println(Arrays.toString(data));
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

	public static void selSort(int[] data){
		int storeval = 0;
		int storeindex = 0;
		int min = data[0];
		for(int i = 0; i < data.length; i++){
			if(i > 0 && min != data[i - 1]){
				storeval = data[i - 1];
				data[i - 1] = min;
				data[storeindex] = storeval;
			}
			System.out.println(Arrays.toString(data));
			min = data[i];
			for(int j = i; j < data.length; j++){
				if(data[j] <= min){
					min = data[j];
					storeindex = j;
				}
			}
		}
	}
	
	public static void inSort(int[] data){
		int storage = 0;
		for(int i = 1; i < data.length; i++){
			if(data[i] < data[i - 1]){
				storage = data[i];
				int j = i - 1;
				while(j >= 0 && data[j] > storage){
					data[j + 1] = data[j];
					j--;
				}
				data[j + 1] = storage;
			}
			System.out.println(Arrays.toString(data));
		}
	}


	public static void main(String[] args){
		System.out.println("bubbleSort");
		int[] test = new int[] {5, 4, 3, 2, 1};
		Sorts.bubbleSort(test);
		System.out.println(Arrays.toString(test));
		int[] test1 = new int[] {1, 2, 3, 4, 5};
		Sorts.bubbleSort(test1);
		System.out.println(Arrays.toString(test1));
		int[] testr = new int[5];
		Random rtest = new Random(101);
		for(int i = 0; i < 5; i++){
			testr[i] = rtest.nextInt() % 1000;
		}
		Sorts.bubbleSort(testr);
		System.out.println(Arrays.toString(testr));
		int[] test2 = new int[] {2, 2, 2, 2, 2};
		Sorts.bubbleSort(test2);
		System.out.println(Arrays.toString(test2));
		int[] testr2 = new int[10];
		Random rtest2 = new Random(11);
		for(int i = 0; i < 10; i++){
			testr2[i] = rtest2.nextInt() % 1000;
		}
		Sorts.bubbleSort(testr2);
		System.out.println(Arrays.toString(testr2));
		int[] test0 = new int[] {34, -495, 87, -123, -56, 34, 87, -90, -56, 134};
		Sorts.bubbleSort(test0);
		System.out.println(Arrays.toString(test0));


		System.out.println();
		System.out.println("selectionSort");
		boolean printtest = true;
		if(printtest){
			int[] test3 = new int[] {5, 4, 3, 2, 1};
			System.out.println(Arrays.toString(test3));
			Sorts.selectionSort(test3);
			System.out.println(Arrays.toString(test3));
			int[] test4 = new int[] {5, 5, 5, 5, 5};
			System.out.println(Arrays.toString(test4));
			Sorts.selectionSort(test4);
			System.out.println(Arrays.toString(test4));

			int[] testr3 = new int[10];
			Random rtest3 = new Random(257);
			for(int i = 0; i < 10; i++){
				testr3[i] = rtest3.nextInt() % 1000;
			}
			System.out.println(Arrays.toString(testr3));
			Sorts.selectionSort(testr3);
			System.out.println(Arrays.toString(testr3));
			int[] testr4 = new int[10];
			Random rtest4 = new Random(83);
			for(int i = 0; i < 10; i++){
				testr4[i] = rtest4.nextInt() % 1000;
			}
			System.out.println(Arrays.toString(testr4));
			Sorts.selectionSort(testr4);
			System.out.println(Arrays.toString(testr4));
			int[] testo = new int[] {3};
			Sorts.selectionSort(testo);
			System.out.println(Arrays.toString(testo));
		}else{
			int[] test3 = new int[] {5, 4, 3, 2, 1};
			selSort(test3);
			int[] test4 = new int[] {5, 28, -54, 2, 17};
			selSort(test4);
			int[] testr3 = new int[10];
			Random rtest3 = new Random(257);
			for(int i = 0; i < 10; i++){
				testr3[i] = rtest3.nextInt() % 1000;
			}
			selSort(testr3);
			int[] testr4 = new int[10];
			Random rtest4 = new Random(83);
			for(int i = 0; i < 10; i++){
				testr4[i] = rtest4.nextInt() % 1000;
			}
			selSort(testr4);
			
		}

			System.out.println();
			System.out.println("insertionSort");
		boolean printer = false;
		if(printer){
			int[] test5 = new int[] {5, 4, 3, 2, 1};
			inSort(test5);
			int[] test6 = new int[] {4, 9, 5, 3, 4, 7, -40, 5, -10, 192, 43, -10, 7};
			inSort(test6);
			int[] testr5 = new int[10];
			Random rtest5 = new Random(71);
			for(int i = 0; i < 10; i++){
				testr5[i] = rtest5.nextInt() % 1000;
			}
			inSort(testr5);
			int[] testr6 = new int[10];
			Random rtest6 = new Random(54);
			for(int i = 0; i < 10; i++){
				testr6[i] = rtest6.nextInt() % 1000;
			}
			inSort(testr6);
		}else{		

			int[] test5 = new int[] {5, 4, 3, 2, 1};
			System.out.println(Arrays.toString(test5));
			Sorts.insertionSort(test5);
			System.out.println(Arrays.toString(test5));
			int[] test6 = new int[] {4, 9, 5, 3, 4, 7, -40, 5, -10, 192, 43, -10, 7};
			System.out.println(Arrays.toString(test6));
			Sorts.insertionSort(test6);
			System.out.println(Arrays.toString(test6));
			int[] testr5 = new int[10];
			Random rtest5 = new Random(71);
			for(int i = 0; i < 10; i++){
				testr5[i] = rtest5.nextInt() % 1000;
			}
			System.out.println(Arrays.toString(testr5));
			Sorts.insertionSort(testr5);
			System.out.println(Arrays.toString(testr5));

			int[] testr6 = new int[10];
			Random rtest6 = new Random(54);
			for(int i = 0; i < 10; i++){
				testr6[i] = rtest6.nextInt() % 1000;
			}
			System.out.println(Arrays.toString(testr6));
			Sorts.insertionSort(testr6);
			System.out.println(Arrays.toString(testr6));
			int[] test7 = new int[] {5, 5, 5, 5, 5};
			System.out.println(Arrays.toString(test7));
			Sorts.insertionSort(test7);
			System.out.println(Arrays.toString(test7));
		}
	}
}