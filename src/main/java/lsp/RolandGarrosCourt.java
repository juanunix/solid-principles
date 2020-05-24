package lsp;

public class RolandGarrosCourt extends Court{

    // 3. Diseñar la pista de Roland Garros.
    @Override
    public void cutGrass() {
        // Lógica que corta el Césped.
        throw new IllegalArgumentException("Tierra batida, no tiene césped para cortar");
    }
}
