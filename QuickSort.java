import java.util.*;
import java.io.*;

public class QuickSort {

  public static void main(String [] args) {
    ArrayList<Integer> collection = loadFile(args[0]);
    sortCollection(collection);
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

  public static ArrayList<Integer> sortCollection(ArrayList<Integer> collection){
    ArrayList<Integer> leftSide;
    ArrayList<Integer> equal;
    ArrayList<Integer> rightSide;
    ArrayList<Integer> newCollection;
    Integer pivot;
    leftSide = new ArrayList();
    equal = new ArrayList();
    rightSide = new ArrayList();
    pivot = collection.get(0);
    newCollection = new ArrayList();

    if(collection.size() > 1) {
      for(Integer element : collection) {
        if(element < pivot) {
          leftSide.add(element);
        }
        else {
          if(element > pivot) {
            rightSide.add(element);
          }
          else {
            equal.add(element);
          }
        }
      }
      System.out.println(sortCollection(leftSide));
      newCollection.addAll(sortCollection(leftSide));
      newCollection.addAll(equal);
      newCollection.addAll(sortCollection(rightSide));
      return sortCollection(newCollection);
    }
    else {
      return collection;
    }
  }
}
