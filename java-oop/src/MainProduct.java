public class MainProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Nasgor", 15000);
        product1.showPrice();

        Product product2 = new Product(2, "Mie Goreng",10000);
        product2.showPrice();

        Product product3 = new Product(3, "Mie Goreng Nasi", 12000);
        product3.showPrice();
    }
}
