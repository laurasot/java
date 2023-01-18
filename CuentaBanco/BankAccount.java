public class BankAccount {
    private String numeroCuenta;
    private double saldoCuentaCorriente;
    private double saldoCuentaAhorro;
    public static int cantidadDeCuentas;  
    public static int cantidadDineroEnCuenta;
    
	public BankAccount() {
        //toString metodo de integer q transforma de int a string
		numeroCuenta = Integer.toString(this.retornaNumeroDeCuenta());
        this.cantidadDineroEnCuenta += saldoCuentaAhorro + saldoCuentaCorriente;
        cantidadDeCuentas++;
	}

    public BankAccount(double saldoCuentaAhorro, double saldoCuentaCorriente){
        this.saldoCuentaAhorro = saldoCuentaAhorro;
        this.saldoCuentaCorriente = saldoCuentaCorriente;
        this.numeroCuenta = Integer.toString(this.retornaNumeroDeCuenta());
        this.cantidadDineroEnCuenta += saldoCuentaAhorro + saldoCuentaCorriente;
        cantidadDeCuentas++;
    }

    public String getNumeroDeCuenta(){
        return numeroCuenta;
    }
    public double getSaldoCuentaCorriente(){
		return saldoCuentaCorriente;
	}
    
	public double getSaldoCuentaAhorro(){
		return saldoCuentaAhorro;
	}
    //metodo private
    private int retornaNumeroDeCuenta(){
        // Math.random() devuelve un número aleatorio entre 0.0 y 1.0,incluido en 0 pero no el 1
        // un double?
        double numeroCuenta = Math.random()*9 + 5;
        //casting de double a int, se  convierte un double a int --> (int), al igual que el metodo Math.floor, que devuelve un entero??
        System.out.println((int) numeroCuenta);
        return (int) numeroCuenta;
    }

    public void depositaDinero(int deposito, String tipoCuenta){
        if(tipoCuenta.equals("cuenta de ahorro")){
            this.saldoCuentaAhorro += deposito;
            System.out.println("deposito agregado: " + deposito);
        }
        if(tipoCuenta.equals("cuenta corriente")){
            this.saldoCuentaCorriente += deposito;
        }
    }

    public void retiraDinero(int montoRetirar, String tipoCuenta){
        if(tipoCuenta.equals("cuenta de ahorro") && saldoCuentaAhorro > montoRetirar){
                this.saldoCuentaAhorro -= montoRetirar;       
        }
        if(tipoCuenta.equals("cuenta corriente")&& saldoCuentaCorriente > montoRetirar){
            this.saldoCuentaCorriente -= montoRetirar;   
        }
    }

    
    public void verSaldo(String tipoCuenta){
        if(tipoCuenta.equals("cuenta de ahorro")){
            System.out.println("tu saldo en la cuenta de ahorro es" + this.getSaldoCuentaAhorro());
        }
        if(tipoCuenta.equals("cuenta corriente")){
            System.out.println("tu saldo en la cuenta corriente es" + this.getSaldoCuentaCorriente());
        }
    }
}
