package LamdaExpressionWithList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService
{
	public List<Book> getBooksInSorting()
	{
		List<Book> books=new BookDAO().getBooks();
		Collections.sort(books, new MYComparator());
		return books;
	
	}


	public static void main(String args[])
	{
		System.out.println(new BookService().getBooksInSorting());
	}
}
class MYComparator implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2)
	{
		
		return o1.getName().compareTo(o2.getName());
	}
	
}