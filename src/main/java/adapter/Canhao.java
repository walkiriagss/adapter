package adapter;

public class Canhao {
    IAngulo angulo;
    AnguloAdapter persistencia;

    public Canhao(){
        angulo = new AnguloRadiano();
        persistencia = new AnguloAdapter(angulo);
    }

    public void setAngulo(double radiano){
        angulo.setAngulo(radiano);
        persistencia.salvarGrau();
    }
    public  double getAngulo(){
        return persistencia.recuperarGrau();
    }

    public  double getGrau(){
        return persistencia.getGrau();
    }
}
