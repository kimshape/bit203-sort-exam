package sort;

public class BubbleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 99, 87, 45, 21, 5, 2 };

//		System.out.println(0 + " " + 1);
//		System.out.println(1 + " " + 2);
//		System.out.println(2 + " " + 3);
//		System.out.println(3 + " " + 4);
//
//		for (int i = 0; i < 4; i++) {
//			System.out.println(arr[i] + " " + arr[i + 1]);
//		}

		int 책상, flag;
		int count=0;
		//boolean isSwap = false;
		for (int r = 0; r < arr.length; r++) {
			flag = 1;
			// 반복할 덩어리#1 시작
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.println("비교전 " + arr[i] + " " + arr[i + 1]);

				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[i] > arr[i + 1]) {
						flag = 0;
						//isSwap = true;
						책상 = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = 책상;
						count ++;
					}
				}
				
				System.out.println("비교후 " + arr[i] + " " + arr[i + 1]);
				//isSwap = false;
			}

//			for (int i = 0; i < arr.length - 1; i++) {
//				System.out.println(arr[i] + " " + arr[i + 1] + "\n");
//			}
			// 반복할 덩어리#1 끝

			// 불필요한 반복이 반복되지 않도록
//			if(!isSwap) {
//				break;
//			}
//			if (flag == 1)
//				break;
		}

		for (int number : arr) {
			System.out.println(number);

		}
		System.out.println(count);
	}
}