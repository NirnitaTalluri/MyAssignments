package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library obj= new Library();
		System.out.println(obj.addBook("fairytales"));
		obj.issueBook();
	}

}
