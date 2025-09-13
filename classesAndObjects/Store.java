package classesAndObjects;

import java.util.ArrayList;

class Product{

    private String productName;
    double productPrice;

    public Product(String productName, double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductDetails(){
        return "Product Name: "+ productName + "Product Price: "+"$"+ productPrice;
    }

    @Override
    public String toString(){
        return getProductDetails();
    }

}

class Store{

    private int storeID;
    private String storeName;
    private ArrayList<Product> productList;
    private double revenue;

    public Store(int storeID, String storeName){
        this.storeID = storeID;
        this.storeName = storeName;
        this.productList = new ArrayList<>();
        this.revenue = 0.0;
    }

    public void addProduct(Product product){
        productList.add(product);

        revenue +=  product.productPrice;
    }

    public double calTotalRevenue(){
        return revenue;
    }

    public void displayStoreDetails(){
        System.out.println("Store name: "+ storeName);
        System.out.println("Store ID: "+ storeID);
        System.out.println("Product List: ");
        for(Product product: productList){
            System.out.println(product.getProductDetails());
        }
        System.out.println("Total revenue: "+ calTotalRevenue());
    }

    public static void main(String[] args) {

        Product p1 = new Product("PS5", 799);
        Product p2 = new Product("MacBook M4", 999);
        Product p3 = new Product("1TB", 249);

        Store s1 = new Store(1024,"V-Electro");

        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);

        s1.displayStoreDetails();

    }
}
