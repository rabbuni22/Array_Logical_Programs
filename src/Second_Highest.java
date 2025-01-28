
public class Second_Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,3,6,7,9};
		highest(arr);

	}

	private static void highest(int[] arr) {
		// TODO Auto-generated method stub
		int highest=Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>highest) {
				secondHighest=highest;
				highest=num;
			}else if(num>secondHighest&& num!=highest) {
				secondHighest=num;
			}
		}
		System.out.println("The Second Highest value in the given array: "+secondHighest);
	}

}
