
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello,World");
		System.out.println("2 + 2 = 4");
	}
	
	public static int findMax(int arr[]) {
		int max=0;
		for(int i = 0; i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			return max;
		}
		return max;
	}
		
	

}
