package Seminar12.homework;

import Seminar12.homework.model.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Reportable displayReport = new Report();
        displayReport.report(user);
        Saveable displayPersister = new Persister();
        displayPersister.save(user);
    }
}

