package sort;

public class BubbleTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 99, 87, 45, 21, 5, 2 };
		//int arr[] = { 2, 5, 21, 45,87, 99};
		// 0 1
		// 1 2
		// 2 3
		// 3 4
		System.out.println(0 + " " + 1);
		System.out.println(1 + " " + 2);
		System.out.println(2 + " " + 3);
		System.out.println(3 + " " + 4);

		for (int i = 0; i < 4; i++) {
			System.out.println(i + " " + (i + 1));
		}

		int 책상;
		int count=0 , total=0 , ifCount=0;
		for (int r = 0; r < arr.length; r++) {
			// ==> 반복할 덩어리#1
			//count = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				total++;
				System.out.println("비교전 " + arr[i] + " " + arr[i + 1]);
				if (arr[i] > arr[i + 1]) {
					책상 = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = 책상;
					count++;
					ifCount++;
					//++count;
				}
//				count =4;
//				System.out.println(count++);
//				int a1 =count++;
//				
//				count =4;
//				System.out.println(++count);
//				int a =++count;
				
				System.out.println("비교후 " + arr[i] + " " + arr[i + 1]);
			}// for i 안쪽1  end

			for (int i = 0; i < arr.length - 1; i++) {
				System.out.println("====>" + arr[i] + " " + arr[i + 1] + "\n");
			}// 안쪽2
			//count 0보다 큰지 아닌지
//			if(count==0) {
//				break;
//			}
			System.err.println("바깥for회전수: "+(r+1) +"교체 수 :"+count + " 안쪽 for 문 실행수:"+total+"  ifCount:"+ifCount);
			// <== 반복할 덩어리#1
		}// for r 바깥 end

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.err.println("총 교체 수 :"+count+" ===="+total+"  ifCount:"+ifCount);
	}// main() 

}