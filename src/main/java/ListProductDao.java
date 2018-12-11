import java.util.ArrayList;
import java.util.List;

public class ListProductDao {

    private List<Product> products;

    public ListProductDao() {
        products = new ArrayList<>();
        products.add(new Product(1,200,"widget 1", "Some cool widget"));
        products.add(new Product(1,100,"widget 2", "Some cool widget2"));
        products.add(new Product(1,400,"widget 3", "Some cool widget3"));
    }

//    add new products
//    delete products
//    edit products
//    find one
//    find all

    public static void main(String[] args) {
        ListProductDao pdao = new ListProductDao();
        for( Product p : pdao.products) {
            System.out.println(p.getName());
        }
    }

}
