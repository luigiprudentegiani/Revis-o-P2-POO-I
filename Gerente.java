package luigi;

public class Gerente extends Funcionario {
    private String setor;
    private Double bonus;

    public Gerente(Long id, String nome, String email, NivelAcesso nivelAcesso, String setor, Double bonus) {
        super(id, nome, email, nivelAcesso);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
