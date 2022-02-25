package LamdaExpressionWithList;

import java.util.ArrayList;
import java.util.List;


public class BookDAO {

	public List<Book> getBooks()
	{
		List<Book> books =new ArrayList<>();
		
		books.add(new Book(101, "Core java ", 800));
		books.add(new Book(102, " Sellinum", 600));
		books.add(new Book(103, "Manual", 400));
		books.add(new Book(104, "Half GirlFriend", 200));
		return books;
		
	}
}
