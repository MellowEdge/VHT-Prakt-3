
public class Test {

	public static void main(String[] args) {
		helloWords(4);
	}

	private static void helloWords(int n) {
		for (int i=0; i<n; i++) {
			System.out.println("Hello world number "+i+"!");
		}
		System.out.println("Simon, i broke you project");
		
	}

	
	private static void something() {
		System.out.println("Do something");
	}

       private static void something() {
             System.out.println("Do something");
    }

}
