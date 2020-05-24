package lsp;

public class AustralianOpenCourt extends Court{

    // 4. Diseñar la pista de Australian Open.
    @Override
    public void cutGrass() {
        // Lógica que corta el Césped.
        throw new IllegalArgumentException("Pista dura, no tiene césped para cortar");
    }
}
