import java.io.*;
import java.util.*;

interface IBook {

    void setTitle(String title);

    String getTitle();

    void setAuthor(String author);

    String getAuthor();

    void setYear(int year);

    int getYear();
}

class Book implements IBook {

    private String title;
    private String author;
    private int year;

    public void setTitle(String title) {
        // implement
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        // implement
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        // implement
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

interface ILibrary {

    void addBook(IBook book);

    void removeBook(String title);

    List<IBook> getBooks(String query);

    List<IBook> getAllBooks();

    int getTotalBookCount();
}

class Library implements ILibrary {

    List<IBook> books = new ArrayList<>();

    public void addBook(IBook book) {
        // implement
        books.add(book);
    }

    public void removeBook(String title) {
        // implement
        Iterator<IBook> it = books.iterator();
        while(it.hasNext()){
            IBook b = it.next();
            if(b.getTitle().equalsIgnoreCase(title)){
                it.remove();
                break;
            }
        }
    }

    public List<IBook> getBooks(String query) {
        List<IBook> result = new ArrayList<>();
        for(IBook b : books){
            if(b.getTitle().toLowerCase().contains(query.toLowerCase()) ||
            b.getAuthor().toLowerCase().contains(query.toLowerCase())){
                result.add(b);
            }
        }
        return result;
    }

    public List<IBook> getAllBooks() {
        return books;
    }

    public int getTotalBookCount() {
        return books.size();
    }
}

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Library library = new Library();

        for(int i=0;i<n;i++){

            String line = br.readLine();

            String[] parts = line.split(" ");

            if(parts[0].equals("addBook")){

                Book b = new Book();

                b.setTitle(parts[1]);
                b.setAuthor(parts[2]);
                b.setYear(Integer.parseInt(parts[3]));

                library.addBook(b);
            }

            else if(parts[0].equals("removeBook")){

                library.removeBook(parts[1]);
            }

            else if(parts[0].equals("search")){

                List<IBook> res = library.getBooks(parts[1]);

                for(IBook b:res)
                    System.out.println(b.getTitle());
            }

            else if(parts[0].equals("count")){

                System.out.println("Total books: "+library.getTotalBookCount());
            }
        }
    }
}