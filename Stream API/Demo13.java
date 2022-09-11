package StreamAPI;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo13 {

    private static class User {

        private int id;
        private String name;
        private List<String> email;

        public User(List<String> email) {
            this.email = email;
        }

        public List<String> getEmail() {
            return email;
        }

        public void setEmail(List<String> email) {
            this.email = email;
        }
    }

    public static void main(String[] args) {
        List<User> list = List.of(new User(Collections.singletonList("abc@gmail.com")), new User(Collections.singletonList("pqr@gmail.com")), new User(Collections.singletonList("xyz@gmail.com")));
        List<String> emails = list.stream().flatMap(user -> user.getEmail().stream()).collect(Collectors.toList());
        System.out.println(emails);



    }

}
