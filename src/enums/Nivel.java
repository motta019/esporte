package enums;

public enum Nivel {
    AMADOR(1, "Nível amador"),
    SEMIPROFISSIONAL(2, "Nível semiprofissional"),
    PROFISSIONAL(3, "Nível profissional");

    private final int codigo;
    private final String descricao;

    Nivel(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }
}