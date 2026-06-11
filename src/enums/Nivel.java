package enums;

// ENUM COMPLETO: representa o nível do esporte com código e descrição.
public enum Nivel {
    AMADOR(1, "Nível amador"),
    SEMIPROFISSIONAL(2, "Nível semiprofissional"),
    PROFISSIONAL(3, "Nível profissional");

    private final int codigo;
    private final String descricao;

    // Construtor do enum completo.
    Nivel(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    // Retorna a descrição do nível.
    public String getDescricao() {
        return descricao;
    }

    // Retorna o código do nível.
    public int getCodigo() {
        return codigo;
    }
}