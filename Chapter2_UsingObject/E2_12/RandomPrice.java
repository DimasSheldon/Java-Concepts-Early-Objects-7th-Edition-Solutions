package EKPL.Chapter2_UsingObject.E2_12;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Created by Sheldon on 10/23/2016.
 * E2.12
 * Generate random price from bound given
 */
public class RandomPrice {
    public static void main(String[] args) {
        double maxPrice = 19.95;
        double minPrice = 10.00;
        double priceRange = maxPrice - minPrice;

        Random generatePrice = new Random();
        double inRangePrice = generatePrice.nextDouble() * priceRange + minPrice;

        DecimalFormat rounder = new DecimalFormat(".##");
        System.out.println("Price generated: $" + rounder.format(inRangePrice));
    }
}