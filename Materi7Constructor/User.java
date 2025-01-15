package Materi7Constructor;
public class User {
    private String username;
    private String password;
    
    public User(){
        System.out.println("eksekusi method constructor...");
    }
    
}

class DemoConstructor{
    public static void main(String[] args){
        User petani = new User();
    }
}