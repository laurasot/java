public class CalculatorTest {
    public static void main(String[] args) {
       Calculator calculadora = new Calculator(10.5, 19, "+");
       double resultado = calculadora.getResult();
       System.out.println(resultado);
    }
}
