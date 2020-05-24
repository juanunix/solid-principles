# Principios Solid
Curso Udemy por Alberto Palomar
 
Cinco principios SOLID de la Programación Orientada a Objetos.
 
# Pilares de la POO
  * Abstración: Características y comportamiento de un objeto con las que se construye una clase.
  * Encapsulamiento: Acceso a la complejidad de un código desde una clase externa.
  * Herencia: Característica que permite la reutilización (heredar) del código 
  * Polimorfismo: Propiedad que permite enviar mensajes iguales a objetos de tipos diferentes.
  
# Acoplamiento:
  Nivel de interdependencia entre módulos de software. Un sistema con bajo acoplamiento viene asociado
  con alta cohesión lo que ofrece ventajas en el código.
       
# Cohesión:
  Grado en que los elementos de un módulo permanecen juntos. Un nivel alto de cohesión
  significa que los elementos están muy relacionados.  Baja cohesión es un sistema
  difícil de mantener, difícil de testear y difícil de usar.
 
## Single Responsibility Principle -- SRP
 
"Una clase debe tener una y sola una razón para cambiar"
 
### Ejercicio:
#### 1. Entity: Diseñar un Player con los siguientes atributos.
     a. id: int.
     b. name: String.
     c. win: int.
     d. lose: int.
     e. date: String.
     
#### 2. Lógica de Negocio: Diseña una opción de estadísticas de jugador
     a. Las estadísticas de victorias.
     b. Las estadísticas de las derrotas.
     
#### 3. Capa de Data: Diseña la opción de persistencia de datos.
     a. Salvar Jugador.
     b. Leer Jugador.
     
#### 4. Capa de Interfaz de Usuario: Muestra el jugador en pantalla
     a. Mostrar en HD.
     b. Mostrar normal.
     
     
## Open/Close Principle -- SRP
 
"Las entidades de software(clases, módulos, funciones) deberían ser abiertas para la extensión
pero cerradas para la modificación"

Se soluciona con las abstracciones (clases abstractas o interfaces)

### Ejercicio:
#### 1. Diseñar un descuento para lanzar nuestra app.
#### 2. Diseñar manager de Descuentos para gestionar el descuento.
#### 3. Diseña un descuento para clientes Gold
        Acá se extiende la aplicación y se ofrece un nuevo servicio.
#### 4. Diseña un descuento para BlackFriday.
#### 5. Diseña un descuento para Navidad.


## Liskov Substitution Principle -- LSP

"Cualquier clase que sea hija de una clase padre, debería poder usarse en lugar de su padre
sin ningún comportamiento inesperado"

### Ejercicio:
#### 1. Diseñar una clase base de Pista de Tennis.
#### 2. Diseñar la pista de Wimblendon.
#### 3. Diseñar la pista de Roland Garros.
#### 4. Diseñar la pista de Australian Open.
#### 5. Diseña un descuento para Navidad.
     

## Interface Segregation Principle -- ISP

"Ninguna clase debe implementar métodos que no utilice"  

Muchas interfaces específicas de clientes son mejores que una única interface de propósito general

### Ejercicio:
#### 1. Diseñar una interface de Payment para gestionar pagos.
#### 2. Diseñar la clase Visa para gestionar pagos de Tarjeta de Crédito.
#### 3. Diseñar la clase Amex para gestionar pagos de Tarjeta de Crédito.
#### 4. Diseñar la clase BankTransfer para gestionar pagos por Transferencia Bancaria.
#### 5. Diseñar la clase BankTransfer para gestionar pagos en Efectivo.


## Dependency Inversion Principle -- DIP

"Las clases de alto nivel no deben depender de las clases de bajo nivel"

"Las abstracciones NO deben depender de los detalles.
Los detalles deben depender de las abstracciones"

### Ejercicio:
#### 1. Diseñar una clase User. 
#### 2. Diseñar el acceso a la base de datos de User. (Módulo de bajo nivel)
#### 3. Diseñar un manager de User para mostrar en pantalla. (Módulo de alto nivel)

UserManager está dependiendo de UserRepository

**public class UserManager {**

    public void showUser(){
        UserRepository userRepository = new UserRepository();
        User user = userRepository.getUser(1);
        System.out.println(user.getEmail() + " : " + user.getName());
    }
**}**


Lo que genera un alto acoplamiento que se resuelve con las abstracciones creando una nueva interface y un factory


 

