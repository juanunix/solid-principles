package dip;

public class UserRepository  {

    // 2. Diseñar el acceso a la base de datos de User.
    public User getUser(int id){
        
        //Lógica para traer usuario de la base de datos
        User user =new User(1, "Mauricio", "ramirezmauricio@hotmail.com");
        return user;
    }
}

