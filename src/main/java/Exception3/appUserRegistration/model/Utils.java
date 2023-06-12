package Exception3.appUserRegistration.model;

import java.util.UUID;

public class Utils {
        public String getUniqueId() {
            return String.format("%s", UUID.randomUUID());
        }
public String firstLetterToUpperCase(String str){
    return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
