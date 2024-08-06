package ds.java.Part2;

public class BookExam {
    public static void main(String[] args) {
      Book b = new Book();
        b.title = "자바";
        b.price = 30000;
        b.company = "패스트캠퍼스";
        b.author = "dongseon";
        b.page = 700;
        b.isbn = "1199110";

        System.out.println(b.title + b.price + b.company + b.author + b.page + b.isbn);
    }

}
