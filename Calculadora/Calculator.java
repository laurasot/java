public class Calculator {
    private double numero;
    private double numero2;
    private String operacion;
    private double resultado;
    
    public Calculator(){
    }
    public Calculator(double numero, double numero2, String operacion){
        this.numero = numero;
        this.numero2 = numero2;
        this.operacion = operacion;
    }
    public void setOperacion(String operacion){
    this.operacion = operacion;
    }
    public void setNumero(double numero){
        this.numero = numero;
    }
    
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }
    public double performOperation(){
        if(operacion.equals("+")){
            resultado = numero + numero2;
        }
        return resultado;
    }
    public double getResult(){
        return performOperation();
    }
}
