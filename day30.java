abstract class User{
    abstract void UserName(String UsersName);
    void Name(String name){
        System.out.println(name);
    }
}
class Users extends User{
    void UserName(String UsersName){
        System.out.println(UsersName);
    }
}
class Mains{
    public static void main(String[] args) {
        Users obj = new Users();
        obj.UserName("Santosh Rana");
        obj.Name("Vikram Rathod");
    }
}
