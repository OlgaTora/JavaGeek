package Seminar6.home;

import java.util.*;

public class ActivitiesNotebook {

    private static final Scanner iScanner = new Scanner(System.in);
    private List<ClassNotebook> listNotebooks;

    public ActivitiesNotebook(List<ClassNotebook> listNotebooks) {
        this.listNotebooks = listNotebooks;
    }

    public static String getRequest() {
        System.out.println("""
                Input your request:
                1. Print all notebooks
                2. Search by params
                3. Exit
                """);

        return iScanner.nextLine();
    }

    private static List<ClassNotebook> isAvailable(List<ClassNotebook> listNotebooks) {
        ClassNotebook notebookSearch = getInfoForSearch();
        List<ClassNotebook> availableNotebooks = new ArrayList<>();

        for (ClassNotebook notebook : listNotebooks) {
            if (Objects.equals(notebookSearch, notebook)) {
                availableNotebooks.add(notebook);
            }
        }
        return availableNotebooks;
    }

    public static String notAvailable() {
        return "We don't have such model\n" +
                "please try again!";
    }

    public static ClassNotebook getInfoForSearch() {
        ClassNotebook notebookSearch = new ClassNotebook();

        System.out.println("Input model: ");
        String request = getValidValue("[a-zA-Z]+");
        notebookSearch.setModel(request);

        System.out.println("Input RAM: ");
        request = getValidValue("[0-9]+");
        notebookSearch.setRAM(request);

        System.out.println("Input color: ");
        request = getValidValue("[a-zA-Z]+");
        notebookSearch.setColor(request);

        System.out.println("Input CPU: ");
        request = getValidValue("[0-9]+");
        notebookSearch.setCPU(request);

        return notebookSearch;
    }

    static String getValidValue(String pattern) {
        String value = null;
        while (iScanner.hasNextLine()) {
            try {
                value = iScanner.next(pattern);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value! Try again: ");
                //e.printStackTrace();
                iScanner.nextLine();
            }
        }
        return value;
    }

    public void start() {
        String request = getRequest();
        switch (request) {
            case "1" -> {
                System.out.println("List of notebooks: ");
                for (ClassNotebook notebook : listNotebooks) {
                    notebook.printInfo();
                }
            }
            case "2" -> {
                List<ClassNotebook> availableNotebooks = isAvailable(listNotebooks);

                if (availableNotebooks.isEmpty()) {
                    System.out.println(notAvailable());
                } else {
                    System.out.println("Models for your request: ");
                    for (ClassNotebook notebook : availableNotebooks) {
                        notebook.printInfo();
                    }
                }
            }
            case "3" -> {
                System.out.println("You are leaving this page... ");
                System.exit(0);
            }

            default -> System.out.println("Your operation is wrong,\n" +
                    "please, try again!");
        }
    }
}


