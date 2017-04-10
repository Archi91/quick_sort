import java.util.*;
import java.io.*;

public class QuickSort {

  public static void main(String [] args) {
    loadFile(args[0]);
    System.out.println(loadFile(args[0]));

  }

  public static ArrayList<Integer> loadFile(String filename) {
    ArrayList<Integer> numbers;
    numbers = new ArrayList();
    try {
          FileReader numbersFile = new FileReader(filename);
          Scanner fileToParse = new Scanner(numbersFile);
          while(fileToParse.hasNext()) {
            String numberToconvert = fileToParse.next();
            Integer number = Integer.valueOf(numberToconvert);
            numbers.add(number);
          }
          return numbers;
    }
    catch (FileNotFoundException e) {
        return numbers;
    }
  }

}
