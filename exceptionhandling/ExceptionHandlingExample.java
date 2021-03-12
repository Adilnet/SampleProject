package exceptionhandling;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int list[] = new int[4];
		try {
		list[0] =10;
		list[1] =10;
		list[2] =10;
		list[3] =10;
		list[4] =10;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Program Terminated");
		//try {} catch(Exception e)
		
	}

}
