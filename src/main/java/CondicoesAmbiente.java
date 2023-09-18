public class CondicoesAmbiente {

    private CondicoesAmbiente() {}

    private static CondicoesAmbiente instance = new CondicoesAmbiente();

    public static CondicoesAmbiente getInstance() {
        return instance;
    }

    private int temperaturaIdeal;
    private int umidadeIdeal;
    private int luminosidadeIdeal;

    public boolean isTemperaturaOk(int temperaturaLida){
        boolean isOk = true;
        if(this.temperaturaIdeal != temperaturaLida){
            isOk = false;
        }
        return isOk;
    }

    public boolean isUmidadeOk(int umidadeLida){
        boolean isOk = true;
        if(this.umidadeIdeal != umidadeLida){
            isOk = false;
        }
        return isOk;
    }

    public boolean isLuminosidadeOk(int luminosidadeLida){
        boolean isOk = true;
        if(this.luminosidadeIdeal != luminosidadeLida){
            isOk = false;
        }
        return isOk;
    }

    public int getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    public void setTemperaturaIdeal(int temperaturaIdeal) {
        this.temperaturaIdeal = temperaturaIdeal;
    }

    public int getUmidadeIdeal() {
        return umidadeIdeal;
    }

    public void setUmidadeIdeal(int umidadeIdeal) {
        this.umidadeIdeal = umidadeIdeal;
    }

    public int getLuminosidadeIdeal() {
        return luminosidadeIdeal;
    }

    public void setLuminosidadeIdeal(int luminosidadeIdeal) {
        this.luminosidadeIdeal = luminosidadeIdeal;
    }
}
