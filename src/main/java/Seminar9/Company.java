package Seminar9;

import java.util.*;

public class Company implements Iterable<User>{

    public Company(User user) {
        this.user = user;
    }

    private User user;

    private List<User> getSubordinatesRecursive(User user){
        List<User> users = new ArrayList<>();
        users.add(user);
        if(!user.getPersonal().iterator().hasNext()){
            return users;
        }
        for (User subordinate: user.getPersonal()
             ) {users.addAll(getSubordinatesRecursive(subordinate));

        }
        return users;

    }
    /** Wide search is possible without recursion*/
    private List<User> getSubordinatesWide(User user){
        List<User> users = new ArrayList<>();
        Queue<User> queueUsers = new ArrayDeque<>();
        queueUsers.offer(user);
        while(!queueUsers.isEmpty()){
            User item = queueUsers.poll();
            users.add(item);
            for (User subordinate: item.getPersonal()
                 ) {queueUsers.offer(subordinate);

            }
        } return users;
    }
    @Override
    public Iterator<User> iterator() {
        //List<User> users = getSubordinatesRecursive(user);
        List<User> users = getSubordinatesWide(user);
        return users.iterator();
    }
}
