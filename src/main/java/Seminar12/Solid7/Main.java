package Seminar12.Solid7;


import Seminar12.Solid7.dip.DisplayReport;
import Seminar12.Solid7.dip.Output;
import Seminar12.Solid7.dip.PrintReport;
import Seminar12.Solid7.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        Output printReport = new PrintReport();
        Output displayReport = new DisplayReport();
        report.output(printReport);
        report.output(displayReport);

    }
}