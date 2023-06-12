package Exception3.appUserRegistration.model;

public class AppExceptions {

    public static class WrongDateFormat extends RuntimeException {
        public WrongDateFormat(String message) {
            super(message);
        }

    }
    public static class WrongFIOFormat extends RuntimeException{
        public WrongFIOFormat(){
            super("Invalid FIO");
        }
    }
    public static class WrongPhoneFormat extends RuntimeException{
        public WrongPhoneFormat(){
            super("You've input wrong phone format. Input 10 symbols please");
        }
    }
}

