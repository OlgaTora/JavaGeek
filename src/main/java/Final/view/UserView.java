package Final.view;


import Final.controller.Controller;
import Final.model.Note;

import java.util.List;
import java.util.Scanner;

public class UserView {

    private final Controller controller;

    public UserView(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        Menu com = Menu.NONE;

        while (true) {
            try {
                String command = input("Input command: ");
                com = Menu.valueOf(command.replace(" ", "")
                        .toUpperCase());
                if (com == Menu.EXIT) return;
                switch (com) {
                    case CREATE -> create();
                    case HELP -> help();
                    case UPDATE -> update();
                    case DELETE -> delete();
                    case READALL -> readAll();
                    case READ -> read();
                    case CONTACT -> contact();
                }
            } catch (Exception e) {
                System.out.printf("Error: %s\n ", e.getMessage());
            }
        }
    }

    private void contact() {
    }

    private void create() {
        String heading = input("Input heading:\n");
        String context = input("Input note:\n");
        controller.createNote(new Note(heading, context));
    }

    private void help() {
        controller.help();
    }

    private void update() throws Exception {
        String id = input("Input ID for update note: ");
        String choice = choiceToUpdate();
        if (choice.equals("1")) {
            String heading = input("Input new heading: ");
            controller.updateHeading(id, heading);
            System.out.println("You've update note ID: " + id);
        } else if (choice.equals("2")) {
            String text = input("Input new text: ");
            controller.updateContent(id, text);
            System.out.println("You've update note ID: " + id);
        }
    }

    private String choiceToUpdate() {
        String choiceUpdate = input("Choose field to update: " +
                "1 - to update heading" +
                "2- to update note");
        return choiceUpdate;
    }

    private void delete() throws Exception {
        String id = input("Input ID for delete note: ");
        controller.deleteNote(id);
        System.out.println("You've delete note ID: " + id);
    }

    private void readAll() {
        List<Note> notes = controller.readNotes();
        System.out.println("List of notes:");
        for (Note note : notes
        ) {
            System.out.println(note);
        }
    }

    private void read() throws Exception {
        String id = input("Input ID for search note: ");
        Note result = controller.readNote(id);
        System.out.println("Searching note is:\n" + result);
    }

    private String input(String message) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print(message);
        return iScanner.nextLine();
    }
}
