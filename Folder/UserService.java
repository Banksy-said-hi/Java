import java.util.HashMap;
import java.util.Map;

public class UserService {
    private static Map<String, User> users = new HashMap<>();

    static {
        User user = new User("Morteza", "Mori_Binamoos", "@BezanZiresh");

        users.put(user.getUsername(), user);

        System.out.println(user);
    }

    public Login authenticate(String username, String password) {
        User user = users.get(username);
        if (user != null && password.equals(user.getPassword())) {
            return user;
        }
        throw new RuntimeException("Authentication Error");
    }
}