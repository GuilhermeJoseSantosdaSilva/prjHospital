package prjhospital;

public class ProntoSocorro {

    Hospital matriz;
    int idFilial;
    String endereco;

    public Hospital getMatriz() {
        return matriz;
    }

    public void setMatriz(Hospital matriz) {
        this.matriz = matriz;
    }

    public int getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(int idFilial) {
        this.idFilial = idFilial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ProntoSocorro(Hospital matriz, int idFilial, String endereco) {
        this.matriz = matriz;
        this.idFilial = idFilial;
        this.endereco = endereco;
    }
}
