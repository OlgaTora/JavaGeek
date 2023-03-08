package Final.model.help;

public class HelpMenuImpl implements HelpMenu {
    public void help() {
        System.out.println("""
                I could help you! Look at my menu, user:\s
                READALL - read all notes;
                CREATE - create new note;
                UPDATE - update any note by ID;
                DELETE delete note by ID;
                READ - read any note by ID
                CONTACT - contact with my owner;
                EXIT - exit from notes\s""");
    }
}
