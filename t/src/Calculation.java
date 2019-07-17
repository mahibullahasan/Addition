import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		int Add,Sub,Multi,Div;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		Add = a+b;
		Sub= a-b;
		Multi = a * b;
		Div = a/b;
		System.out.println(Add);
		System.out.println(Sub);
		System.out.println(Multi);
		System.out.println(Div);
	}

}
