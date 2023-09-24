package com.example.lab5_1_shipcostcalculator;

import java.util.Scanner;
    public class Lab5_1_ShipCostCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the price of the item: $");
            double itemPrice = scanner.nextDouble();

            double shippingCost;
            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * 0.02;
            }

            double totalPrice = itemPrice + shippingCost;

            System.out.println("Shipping Cost: $" + String.format("%.2f", shippingCost));
            System.out.println("Total Price: $" + String.format("%.2f", totalPrice));

            scanner.close();
        }

}
