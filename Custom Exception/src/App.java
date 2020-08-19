
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			CustomException t = new CustomException();
				t.throwCustomException();
				
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
