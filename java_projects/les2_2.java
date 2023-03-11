package java_projects;

import java.io.BufferedReader;
import java.io.FileReader;

public class les2_2 {
    public static void main(String[] args) {
        System.out.println(parseStr());
    }

    private static String parseStr() {
        BufferedReader reader = null;
        StringBuilder str = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader("name.txt"));

            String line;
            while ((line = reader.readLine()) != null) {

                str.append(line.replace("[", "")
                        .replace("]", "")
                        .replace("{", "")
                        .replace("}", "")
                        .replace(":", " ")
                        .replace("Фамилия", "Студент")
                        .replace("оценка", "получил оценку")
                        .replace("предмет", "по предмету")
                        .replace(",", "")
                        .replace("'", "") + System.lineSeparator());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (Exception io) {
            }
        }
        return str.toString();
    }
}
