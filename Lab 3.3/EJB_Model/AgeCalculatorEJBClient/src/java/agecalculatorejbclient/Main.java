/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agecalculatorejbclient;

import codabook.agecalculator.ejb.AgeCalculatorBeanRemote;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.ejb.EJB;

/**
 *
 * @author sangeethas
 */
public class Main {

    @EJB
    private static AgeCalculatorBeanRemote ageCalculatorBeanRemote;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your year of birth?");
        int year = scanner.nextInt();

        System.out.println("What is your month of birth (1-12)?");
        int month = scanner.nextInt();

        System.out.println("What is your date of birth (1-31)?");
        int date = scanner.nextInt();

        Calendar dateOfBirth = new GregorianCalendar();
        dateOfBirth.clear();
        dateOfBirth.set(year, month - 1, date);

        int age = ageCalculatorBeanRemote.calculateAge(dateOfBirth);

        System.out.println("Your age is " + age);
    }
}
