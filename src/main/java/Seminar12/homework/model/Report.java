package Seminar12.homework.model;

public class Report implements Reportable {

    public void report(User user) {

        System.out.println("Report for user: " + user.getName());
    }

}