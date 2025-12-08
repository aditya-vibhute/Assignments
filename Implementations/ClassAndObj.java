public class ClassAndObj {
    public static void main(String[] args) {
        Book book=new Book("Yugandhar", "Shivaji Sawant");
        book.displayInfo();
    }
}

class Book{
    String title;
    String author;

    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    public void displayInfo(){
        System.out.println("Book: "+ title+ ", Author: "+ author);
    }
}
