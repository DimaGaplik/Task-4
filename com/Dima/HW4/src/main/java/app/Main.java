package app;

public class Main {
    public static void main(String[] args) {
        String productName;
        int quantity;
        double price;
        double totalSales;
        double avgSales;

        productName = "Play Station 5";
        quantity = 25;
        price = 400.99;
        totalSales = quantity * price;
        avgSales = totalSales / 5;

        System.out.printf("Product No 1: %s,%n", productName);
        System.out.printf("total sales for 5 days is EUR %.2f,%n", totalSales);
        System.out.printf("sales by day is EUR %.2f.%n", avgSales);

        productName = "Samsung TV";
        quantity = 12;
        price = 255.99;
        totalSales = quantity * price;
        avgSales = totalSales / 7;

        System.out.printf("Product No 2: %s,%n", productName);
        System.out.printf("total sales for 7 days is EUR %.2f,%n", totalSales);
        System.out.printf("sales by day is EUR %.2f.%n", avgSales);

    }
}

