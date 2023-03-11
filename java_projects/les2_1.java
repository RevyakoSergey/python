// Задача 1
package java_projects;


import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class les2_1 {
    
 
    public static int[] sortArray(int[] array) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(les2_1.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        String mesage;
        int temp;
        int count = 0;        
        for (int i = array.length - 1; i >= 1; i--) {
            
            for (int j = 0; j < i; j++) {
                count++;
                mesage = " логирование, итерация " + count + "\n" 
                        + "Массив : " + Arrays.toString(array) + "\n";
                logger.info(mesage);
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        } return array;
    }

    public static void main(String[] args) throws SecurityException, IOException {
        int[] array = {-4, 2, 55, 0, 8, 47, 93, 3};
        sortArray(array);
    }
}




