//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String prompt = "Enter your name:";
        String input = System.console().readLine(prompt);
        User newUser = new User(input);
        String pwPrompt = "Welcome" + newUser + "!!" + " . Please set password:";
        String pw = System.console().readLine(pwPrompt);
        newUser.SetPassword(pw);
        loginHandler handler = new loginHandler();
        handler.AddUser(0, newUser);
        System.out.println(handler.GetUserCount() + " User in array");
        for (int i = 0; i < handler.GetUserCount(); i++) {
            User current = handler.GetUser(i);
            if (current != null) {
                System.out.println("User " + i + "has username : " + current.Username + " and Password : " + current.GetPassword());
            }
        }
    }
}