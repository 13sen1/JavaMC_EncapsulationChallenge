package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer myPrinter = new Printer(75, 10, false);
        System.out.println(myPrinter.getNoOfPagesPrinted());
        System.out.println(myPrinter.getTonerLevel());
        System.out.println(myPrinter.isDuplexPrinter());

        myPrinter.fillToner(10);
        myPrinter.printPage(10);
        myPrinter.fillToner(100);
        System.out.println(myPrinter.getTonerLevel());

    }
}
