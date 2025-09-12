package classesAndObjects;

import java.util.ArrayList;

class Product{
    private String prductName;
    double productPrice;

    public Product(String prductName, double productPrice) {
        this.prductName = prductName;
        this.productPrice = productPrice;
    }

    public String getProductDetails(){
        return "Product name: " + prductName + ", Price: $"+ productPrice;
    }

    @Override
    public String toString(){
        return getProductDetails();
    }

//    @Override
//    public String toString(){
//        return return "Product name: " + prductName + ", Price: $"+ productPrice;
//    }

}

class Store{

   private int storeID;
   private String storeName;
   private ArrayList<Product> productList;
   private double revenue;


    public Store(int storeID,String storeName){
        this.storeID = storeID;
        this.storeName = storeName;
        this.productList = new ArrayList<>();
        this.revenue = 0.0;
    }

    public void addProduct(Product product){
        productList.add(product);

        revenue = revenue + product.productPrice;
    }

    public double calculateTotalRevenue(){
        return revenue;
    }

    public void displayStoreInfo(){
        System.out.println("StoreID: "+ storeID);
        System.out.println("Store Name: "+ storeName);
        System.out.println("Product List: "+ productList);
        for(Product product: productList){
            System.out.println(product.getProductDetails());
        }
        System.out.println("Total revenue: $"+ calculateTotalRevenue());
    }



    public static void main(String[] args) {
        Product p1 = new Product("laptop", 599.0);
        Product p2 = new Product("PS5", 899.0);
        Product p3 = new Product("SSD 1TB", 399.0);

        Store s1 = new Store(101, "V-Electro");

        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);

        s1.displayStoreInfo();
    }
}
