package Seminar9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Personal implements Iterable<User>{
    List<User> users = new ArrayList<>();

    public Personal(List<User> users) {
        this.users = users;
    }

    public Personal() {
    }
    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            private int ind = 0;
            @Override
            public boolean hasNext() {
                return ind < users.size();
            }

            @Override
            public User next() {
                return users.get(ind ++);
            }
        };
    }
    public List<User> toList(){
        List<User> result = new ArrayList<>();
        for (User user: this
             ) {result.add(user);
            
        }
        return result;
    }
}
