package adapter;

public class AnguloAdapter extends AnguloGrau{

    private  IAngulo anguloRadiano;

    public AnguloAdapter(IAngulo anguloRadiano) {
        this.anguloRadiano = anguloRadiano;
    }

    public double recuperarGrau() {
        return anguloRadiano.setAngulo(this.getGrau()*(180/3.14));
    }

    public void salvarGrau(){
        this.setGrau(anguloRadiano.getAngulo()*(3.14/180));
    }
}

