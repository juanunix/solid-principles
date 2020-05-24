package srp;

public class PlayerDomain {

    // 2. Lógica de Negocio: Diseña una opción de estadísticas de jugador
    Double winPercentage(Player player){
        return Double.valueOf(player.getWin()/(player.getWin() + player.getLose()));
    }

    Double lossPercentage(Player player){
        return 0.0;
    }
}
