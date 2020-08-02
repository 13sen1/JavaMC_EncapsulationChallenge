package com.company;

public class Printer {
    private double tonerLevel = 100; // set default value to 100%
    private int noOfPagesPrinted = 0; // set default to 0 (assume it is new)
    private boolean duplexPrinter; // ability to print double sided

    // constructor to allow supplied values, but if tonerLevel > 100 supplied, then use default
    public Printer(double tonerLevel, int noOfPagesPrinted, boolean duplexPrinter) {
        if (tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        this.noOfPagesPrinted = noOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public double fillToner(int amount) {
        System.out.println("Filling toner!");
        if(tonerLevel + amount > 100) {
            tonerLevel = 100;
            System.out.println("Too much added! Filled to " + tonerLevel + "%");
        }
        else {
            tonerLevel += amount;
            System.out.println(amount + "% added! Filled to " + tonerLevel + "%");
        }
        return tonerLevel;
    }

    public void printPage(int number) {
        System.out.println("Printing " + number + " page(s)");
        noOfPagesPrinted += number;
        System.out.println("Total print count = " + noOfPagesPrinted);
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
