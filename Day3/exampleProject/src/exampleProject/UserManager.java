package exampleProject;


public class UserManager {

    public void add(User user){
        System.out.println(user.getUsername() + " kullanıcısı eklendi.");
    }
    public void delete(User user){
        System.out.println(user.getUsername() + " kullanıcısı silindi.");
    }
    public void update(User user){
        System.out.println(user.getUsername() + " kullanıcısı güncellendi.");
    }


}