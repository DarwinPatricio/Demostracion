package Clases;

public class Persona {
    private int resultado;
    public int pesoIdeal(double peso,double altura){
        double imc;
        if (peso<= 0||altura<=0){
            System.out.println("Error en datos");
            resultado=0;
        }else {
            imc=peso/(altura*altura);
            if (imc<18.5){
                resultado=1;
            }else{
                if (imc<=25){
                    resultado=2;
                }else {
                    resultado=3;
                }
            }
        }
        return resultado;
    }
}
