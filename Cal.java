package day1;


public class CalculateUserInput {

	public static void main(String[] args) {

		// Scanner class is bultin class in java which is used for user input
		// (Constructor)  //System.in is input stream
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		// Class referance //Object of the class
		CalculateUserInput ref = new CalculateUserInput();
		ref.addnum(num1, num2);
		ref.sub(num1, num2);
		ref.div(num1, num2);
		ref.reminder(num1, num2);
		sc.close();

	}

	// Methods
	public void addnum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is---> " + sum);
	}

	public void sub(int a, int b) {
		int sub = a - b;
		System.out.println("Sub of " + a + " and " + b + " is---> " + sub);
	}

	public void div(int a, int b) {
		int div = a / b;
		System.out.println("Div of " + a + " and " + b + " is---> " + div);
	}

	public void reminder(int a, int b) {
		int rem = a % b;
		System.out.println("Rem of " + a + " and " + b + " is---> " + rem);
	}
	
	public void mul(int a, int b) {
		int mul = a * b;
		System.out.println("Mul of " + a + " and " + b + " is---> " + mul);