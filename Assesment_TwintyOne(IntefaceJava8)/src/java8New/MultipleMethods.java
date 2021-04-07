package java8New;


	interface DefaultInterface{
		default void defaultMethods() {
			System.out.println("DefaultMethods");
		}
	}
	interface Second{
		public int show();
		abstract void Book();
	}
	interface ThirdInterface{
		default void ThirdDefault() {
			System.out.println("ThirdDefaultMethods");
		}
		public int show();
		abstract void book();
		
	}
	public class MultipleMethods implements DefaultInterface,Second,ThirdInterface {
		
		public static void main(String[] args) {
			MultipleMethods Obj = new MultipleMethods();
			Obj.show();
			Obj.defaultMethods();
			Obj.ThirdDefault();
		}

		@Override
		public void book() {
			System.out.println("Book Price List");
			
		}

		@Override
		public int show() {
			System.out.println("Show Time Schedule");
			return 0;
		}

		@Override
		public void Book() {
		System.out.println("Edward DeBono Book Collection");
		}
	}

