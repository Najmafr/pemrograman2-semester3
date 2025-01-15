package Materi8MethodGetterdanSetter;
public class Main {
    public static void main(String[] args) {
        User user = new User();
        
        user.SetUsername("jeny");
        user.SetPassword("1234");
        
        System.out.println("Usernamenya = " + user.GetUsername());
        System.out.println("Psswordnya = " + user.GetPassword());
    }
    
}
