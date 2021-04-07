package java8New;

interface Example1 {
		default void SampleTest() {
			System.out.println(" Default Method");
		}
	}

	interface Example2 {
		public static void printable() {
			System.out.println(" Static Method");
		}
	}

	public class InterfacePrograms implements Example1{
		
	public static void main(String[] args) {
		Example2.printable();
		InterfacePrograms obj = new InterfacePrograms();
		obj.SampleTest();

	}

}
