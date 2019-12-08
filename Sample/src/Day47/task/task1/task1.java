package Day47.task.task1;

public class task1 {
    // Create abstract class AbstractLogin
    // add abstract method: testLogin
    // create 3 subclasses as AdminLogin, ManagerLogin, UserLogin
    // and implement method testLogin
    public static void main(String[] args) {

        AbstractLogin admin = new AdminLogin();
        AbstractLogin user = new UserLogin();
        AbstractLogin manager = new ManagerLogin();
        admin.testLogin();
        admin.testPassword();

        user.testLogin();
        user.testPassword();

        manager.testPassword();
        manager.testLogin();

    }
}
