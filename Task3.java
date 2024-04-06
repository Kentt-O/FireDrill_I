public class Task3 {
	public static void main(String... args){

		int counter = 1;
		int number = 0;
  

		while (counter <= 10) {
			number++;
			counter++;
			if (number % 2 != 0){
				System.out.printf("%d ",number);
			}
		}
		

	}


}