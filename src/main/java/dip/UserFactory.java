package dip;

public class UserFactory {

    public static UserRepository create(){

        return new LocalUserRepository();
    }
}
