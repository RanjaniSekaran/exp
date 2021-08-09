package exceptions;

public class Exceptions {
	public static void main(String[] args) {
		String string="Malls & Theatres";
		try {
			System.out.println(string.charAt(6));
			System.out.println(string.substring(22, 30));
		} catch (NullPointerException e) {
			System.out.println("Null");
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index");
		}
//		catch (IndexOutOfBoundsException e) {
//			System.out.println("Index");
//		}
		finally {
			System.out.println("Will Executed");
		}
	
		System.out.println("one");
		System.out.println("Two");
	}
	

}
