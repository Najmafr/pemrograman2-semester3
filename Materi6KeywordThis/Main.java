package Materi6KeywordThis;
public class Main {
    public static void main(String[] args){
        //Membuat objek dari kelas user
        User user = new User();
        
        user.setUsername("Jeny");
        user.setPassword("12345");
        
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
    
}
