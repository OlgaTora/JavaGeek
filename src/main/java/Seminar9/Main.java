package Seminar9;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    User user1 = new User("Kot", "Kotov", 25);
    User user2 = new User("Donald", "Duck", 77);
    User user3 = new User("Leonel", "Messi", 32);
    User user4 = new User("Leonel", "Messi", 31);
    User user5 = new User("Leonel", "Petrov", 43);
    User user6 = new User("Larisa", "Ivanovna", 90);


    Personal personal = new Personal(List.of(user1, user2, user3, user4, user5, user6));

//        List<User> users = personal.toList();
//        Collections.sort(users);
//        System.out.println("\n~~~~~~~~~~~~");
//        for (User user: users
//             ) {
//            System.out.println(user);
//        }

    User bigBoss = new User("Madam (boss)", "Broshkina", 65);
    User ceo = new User("Gay (seo)", "Ricci", 56);
    User comerce = new User("Baba(comerce)", "Yaga", 99);
    User manager1 = new User("Ivan", "Ivanov", 25);
    User manager2 = new User("Sidor", "Sidorov", 23);
    User manager3 = new User("Petr", "Petrov", 32);

    Personal managers1 = new Personal(List.of(manager1, manager2));
    Personal managers2 = new Personal(List.of(manager3));
    Personal bosses = new Personal(List.of(ceo, comerce));
    bigBoss.setPersonal(bosses);
    ceo.setPersonal(managers1);
    comerce.setPersonal(managers2);

    Company company = new Company(bigBoss);
        for (User user: company
             ) {
            System.out.println(user);

        }
    }
}
