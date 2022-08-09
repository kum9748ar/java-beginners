package Java_Basics;

public class ProfitPercentage {
    public static void main(String[] args) {
        int cost_price = 7000;
        int selling_price = 10000;
        int profit = selling_price - cost_price;
        double profit_percentage = (profit * 100) / cost_price;
        System.out.println("Profit is " + profit);
        System.out.println("Profit percentage is " + profit_percentage + "%");

    }
}