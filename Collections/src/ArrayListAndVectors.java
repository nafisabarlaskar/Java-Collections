import java.util.*;

/**
 * Created by NafisaBarlaskar on 09-01-2017.
 */
public class ArrayListAndVectors {

    public static void main(String args[]){

        List<String> arrayList = new ArrayList<String>();

        arrayList.add("Nafisa");
        arrayList.add("Munawar");
        arrayList.add("Barlaskar");

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Vector<String> vector = new Vector<String>();

        vector.add("State Bank of India");
        vector.addElement("Citibank");
        vector.addElement("ICICI");

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        Iterator iterator1 = vector.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
            iterator1.remove();
        }

        if(iterator1.hasNext())
            System.out.println("True");
        else
            System.out.println("False");


        List<Book> bookArrayList = new ArrayList<Book>();

        Book book1 = new Book(1, "Nafisa", "Geometry", "HCM" );
        Book book2 = new Book(2,"Maina","Algebra", "KLF");
        Book book3 = new Book(3,"Aman","Calculus", "TGF");

        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);

        for(Book b: bookArrayList) {
            System.out.println("Book Id: " + b.bookId + " Book Name: " + b.bookName + "Book Author: " + b.bookAuthor + "Book Publisher: " + b.bookPublisher);
        }

        ListIterator<Book> bookListIterator = bookArrayList.listIterator();

        while(bookListIterator.hasNext()){
            Book bookItr = (Book) bookListIterator.next();
            System.out.println("Book Id: " + bookItr.bookId + " Book Name: " + bookItr.bookName + "Book Author: " + bookItr.bookAuthor + "Book Publisher: "
                    + bookItr.bookPublisher );

        }

        Map<Integer,String> map = Collections.synchronizedMap(new HashMap<Integer, String>());

    }
}
