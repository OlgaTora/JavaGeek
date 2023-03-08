package Final.model.contacts;

public class ContactMenuImpl implements ContactMenu {
    @Override
    public void contacts() {
        System.out.println("""
                        Contuct us:\s
                        WHATSAPP - 1111;
                        TELEPHONE - 2222;
                        ADRESS - SPB street, 11-22
                """);
    }
}
