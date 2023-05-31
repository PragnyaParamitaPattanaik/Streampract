import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HundredSorted {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<Product>();
        productList.add(new Product(1,"Rim",45000f));
        productList.add(new Product(2,"Sim",89000f));
        productList.add(new Product(3,"Rin",34000f));
        productList.add(new Product(4,"Sony",90000f));
        productList.add(new Product(5,"Apple",560000f));
        List<Float> productPriceLis2=productList.stream()
                .filter(p->p.price>3000)
                .map(p->p.price)
                .collect(Collectors.toList());
        System.out.println(productPriceLis2);

    }

}
