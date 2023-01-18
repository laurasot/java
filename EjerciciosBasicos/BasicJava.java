import java.util.ArrayList;
public class BasicJava {
    public void imprimir_1_255(){
        
        for(int i = 1; i <= 255; i++)
        {
            System.out.println(i);
        }
    }

    public void impares255(){
        for(int i = 1; i <= 255; i++)
        {
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }


    public void imprimeSuma(){
        int sum = 0;
        for(int i = 0; i <= 255; i++)
        {
            sum = sum + i;
            System.out.println("Nuevo numero: "+ i + " suma: " + sum);
        }
    }

    public void recorreArreglo(int[] x){
        for(int num : x){
            System.out.println(num);
        }
    }

    public void max(int[] array){
        int max = array[0]; 
        for(int num : array){
            if(max < num){
                max = num;
            }
        }
        System.out.println(max);
    }

    
    public void avg(int[] array){
        int sum = 0; 
        for(int num : array){
            sum = sum + num;
        }
        int prom = sum/array.length;
        System.out.println("promedio de " + prom);
    }

    public void arrImpares(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i++)
        {
            if(i%2 == 1){
                y.add(i);
            }
        }
        System.out.println(y);
    }
    public void mayorQueY(int [] array, int y){
        int count = 0;
        for(int num : array){
            if(num > y){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
    public void valorAlCuadrado(int [] array){
        ArrayList<Double> nuevoArray = new ArrayList<>();
        for(int num : array){
            double eleva = Math.pow(num, 2);
            nuevoArray.add(eleva);
        }
        System.out.println(nuevoArray);
    }
    
    public void eliminaNumNegativo(int [] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                array[i] = 0;
            }
        }
        for(int num : array){
            System.out.println(num);
        }
        
    }
    public void maxMinAvg(int [] array){
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for(int num : array){
            sum = sum + num; // [1,2, 5]------> 1 > 1 no -------> 1 <= 1 si min = 1
            if(num > max){ // 2 > 1 si max = 2 ------> 2 <= 2 no
                max = num; // 5> 2 si max = 5 -------> 5 <= 1 no ---consola-- max=5, min=1
            }
            if( num <= min){
                min = num;
            }
        }
        double avg = sum/array.length; 
        System.out.println("max " + max);
        System.out.println("min " + min);
        System.out.println("el promedio es " + avg);
    }

    public void cambiarValorArreglo(int [] array){
        ArrayList<Integer> nuevoArray = new ArrayList<>();
        for (int i = 1; i < array.length ; i++) {
            nuevoArray.add(array[i]);
        }
        nuevoArray.add(0);
        System.out.println(nuevoArray);
        
    }
}
