package java_projects;

import java.util.ArrayList;

public class les3_2 {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Начальный список: "); 
        array.add(42);
        array.add(80);
        array.add(87);
        array.add(101);
        array.add(-3);        
        array.add(69);
        array.add(-57);
        array.add(14);
        array.add(-15);
        array.add(28);
        array.add(6);

        for(int i = 0; i < array.size(); i++){
            System.out.print(array.get(i) + " "); 
        }
        System.out.println("\n");
        System.out.printf("Максимальное число: %d \n", MaxNum(array));
        System.out.printf("Минимальное число: %d \n", MinNum(array));
        System.out.printf("Среднее арифметическое: %.1f \n", ArithmeticMean(array));
    }

    
    public static int MaxNum(ArrayList<Integer> arr){
        int max = arr.get(0);
        for(int element : arr){
            if(element > max) max = element;
        }
        return max;
    }
    
    
    public static int MinNum(ArrayList<Integer> arr){
        int min = arr.get(0);
        for(int element : arr){
            if(element < min) min = element;
        }
        return min;
    }
    
    
    public static Double ArithmeticMean(ArrayList<Integer> arr){
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        Double am = Double.valueOf(sum)/Double.valueOf(arr.size());
        return am;
    }
}
    

