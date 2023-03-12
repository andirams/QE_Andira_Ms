public class Main {
    public static void main(String[] args) throws Exception {
        Product prod1 = new Product();
        prod1.setName("coffee");
        prod1.setDeskripsi("this is coffee");
        prod1.setHarga(15000);
        prod1.setStock(10);
        prod1.getInfo();
        
        Product prod2 = new Product();
        prod2.setName("milk");
        prod2.setDeskripsi("this is fresh milk");
        prod2.setHarga(25000);
        prod2.setStock(10);
        prod2.getInfo();
        
        Product prod3 = new Product();
        prod3.setName("apple juice");
        prod3.setDeskripsi("this is juice");
        prod3.setHarga(18000);
        prod3.setStock(20);
        prod3.getInfo();
    }
}
