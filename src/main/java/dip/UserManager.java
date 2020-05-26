package dip;

public class UserManager {

    // 3. Diseñar un manager de User para mostrar en pantalla.
    public void showUser(){
        
        UserRepository userRepository = UserFactory.create();  //Usando el factory
        //LocalUserRepository userRepository = new LocalUserRepository();  //Sin el factory
        User user = userRepository.getUser(1);
        System.out.println(user.getEmail() + " : " + user.getName());
    }
}
