public class Lanche {
    private String nomeLanche;
    private double precoLanche;
    private int idLanc;

    public Lanche(){

    }

    public String getNomeLanche() {
        return nomeLanche;
    }
    public double getPrecoLanche() {
        return precoLanche;
    }

    public Lanche(int idLanc, String nomeLanche, double precoLanche){
        this.idLanc = idLanc;
        this.nomeLanche = nomeLanche;
        this.precoLanche = precoLanche;
    }

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public void setPrecoLanche(double precoLanche) {
        this.precoLanche = precoLanche;
    }

    public void setIdLanc(int idLanc) {
        this.idLanc = idLanc;
    }

    @Override
    public String toString() {
        return "\t"+idLanc+"\t\t"+nomeLanche+"\t\t"+precoLanche;
    }
}
