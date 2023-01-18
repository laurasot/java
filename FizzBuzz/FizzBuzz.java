public class FizzBuzz {
    
    public String fizzBuzz(int number) {
            //lógica de fizzbuzz aquí
            if(number%3 == 0 && number%5 == 0){
                return "FizzBuzz";
            }
            if(number%3 == 0){
                return "Fizz";
            }
            if(number%5 == 0){
                return "Buzz";
            }
            else{
                String num = ""+number;
                return num;
            }
    }
    
}
