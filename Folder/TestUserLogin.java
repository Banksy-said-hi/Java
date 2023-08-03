public class TestUserLogin {
    public static void main(String[] args) {
        UserService userSevice = new UserService();
        Login login = userSevice.authenticate("Mori_Binamoos", "@BezanZiresh");

        User user = (User) login;

        System.out.println("Please come inside " + user.getName());
    }
}
