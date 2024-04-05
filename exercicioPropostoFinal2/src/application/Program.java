package application;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

            List<TaxPayer> list = new ArrayList<>();

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of taxpayers: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println("Tax player #" + i + " data:");
                System.out.print("Individual or company (i/c)?: ");
                char ch = sc.next().charAt(0);
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Annual income: ");
                Double annualIncome = sc.nextDouble();
                if (ch == 'i') {
                    System.out.print("Health spending: ");
                    Double healthSpending = sc.nextDouble();
                    list.add(new Individual(name, annualIncome, healthSpending));
                }
                if (ch == 'c') {
                    System.out.print("Number of employees: ");
                    Integer numberOfEmployees = sc.nextInt();
                    list.add(new Company(name, annualIncome, numberOfEmployees));
                }
        }

        System.out.println("TAXES PAID:");

        double sum = 0.0;
        for (TaxPayer payer : list) {
            System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
            sum += payer.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
