import Models.Cart;
import Models.Product;
import Models.Variant;

public class Main {

    public static void main(String[] args){

    Cart cart = new Cart();




    Product product = new Product("Strawberry");
    Variant variant = new Variant("1kg",200);
    Variant variant_2 = new Variant("2kg",300);

    System.out.println(cart.addToCart(product,variant));
        System.out.println(cart.addToCart(product,variant));
        System.out.println(cart.addToCart(product,variant));
        System.out.println(cart.addToCart(product,variant));
        System.out.println(cart.addToCart(product,variant_2));
        System.out.println(cart.addToCart(product,variant_2));

        System.out.println(cart.getData(product));

        System.out.println(cart.removeFromCart(product,variant));
        System.out.println(cart.removeFromCart(product,variant));
        System.out.println(cart.removeFromCart(product,variant_2));
        System.out.println(cart.removeFromCart(product,variant_2));





        Product wbp = new Product("Onion",50,1.0f);
        cart.updateWeightBasedQty(wbp,2);
        cart.updateWeightBasedQty(wbp,4);
        System.out.println(cart.getData(wbp));








}
}