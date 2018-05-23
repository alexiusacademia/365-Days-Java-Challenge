package Day12;/*
* Problem
* =========
* The list of strings is given.
*
* List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
*
* Convert it to the string array by name strArray.
*
* The code for displaying the array is already written.
* Sample Input:
*
* Sample Output:
*
* Mr.Green
* Mr.Yellow
* Mr.Red*/

import java.util.*;

public class ArrayListToArray {

  public static void main(String[] args) {

    List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));


    //write your code here
    Object[] strArray = nameList.toArray();


    for (int i = 0; i < strArray.length; i++) {
      System.out.println(strArray[i]);
    }

  }
}