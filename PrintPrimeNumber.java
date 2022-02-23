public class PrintPrimeNumber {

	//check weather a number is prime or not
	public static boolean Is_prime(int num_to_check){
		for(int i =2; i<num_to_check; i++){
			if(num_to_check%i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
		//check number upto 100 and print if it is prime
		int max_check=100;
		System.out.println("Prime number beetween 1 to 100 are : ");
		for(int i=1; i<=max_check;i++){
			if(Is_prime(i)){
				System.out.print(i + ", ");
			}
		}
	}
}
