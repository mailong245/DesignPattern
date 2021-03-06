package mailong245.VisitorPattern.SingleDispatch;

import mailong245.VisitorPattern.SingleDispatch.book.Book;
import mailong245.VisitorPattern.SingleDispatch.book.BusinessBook;
import mailong245.VisitorPattern.SingleDispatch.customer.Customer;
import mailong245.VisitorPattern.SingleDispatch.customer.Developer2;
import mailong245.VisitorPattern.SingleDispatch.customer.Developer;

public class SingleDispatchApplication {
    /**
     * Trong Java, chúng ta có thể định nghĩa các phương thức cùng tên nhưng khác nhau về tham số (tính đa hình).
     * Một phương thức được gọi sẽ dựa trên 2 yếu tố: Tên của phương thức và kiểu đối tượng gọi nó
     * <p>
     * - Tên phương thức: developer.buy
     * - Kiểu đối tượng gọi nó: Book book
     * <p>
     * ===> phương thức sẽ trỏ đến buy(Book book)
     */
    public static void main(String[] args) {
        Book book = new BusinessBook();   //Trong ví dụ này, do chúng ta đã cast nó về Book nên phương thức buy(Book book) được gọi
        Customer developer = new Developer();
        System.out.print("Developer 1: ");
        developer.buy(book);

        Customer developer2 = new Developer2();

        System.out.print("Developer 2: ");
        developer2.buy(book);
    }
}
