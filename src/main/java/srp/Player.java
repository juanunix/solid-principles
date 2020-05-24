package srp;

public class Player {

    // 1. Entity: Diseñar un Player con los siguientes atributos.
    int id;
    String name;
    int win;
    int lose;
    String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // 2. Lógica de Negocio: Diseña una opción de estadísticas de jugador
    Double winPercentage(Player player){
        return Double.valueOf(player.getWin()/(player.getWin() + player.getLose()));
    }

    Double lossPercentage(Player player){
        return 0.0;
    }

    // 3. Capa de Data: Diseña la opción de persistencia de datos.
    void savePlayer(Player player){
        // Salva el jugador
    }

    void deletePlayer(Player player){
        // Borra el jugador de la base de datos
    }

    // 4. Capa de Interfaz de Usuario: Muestra el jugador en pantalla
    void showPlayerHD(Player player){

    }

    void showPlayer(Player player){

    }
}
