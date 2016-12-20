package worksheet.whatswrong;

import java.util.*;

/**
 * Created by jeff on 12/19/16.
 */
public class FixMeExamples {
    public static void main(String[] args) {

        /*
         * This block is trying to find the maximum number in an array of numbers. The answer should be 20
         * fix it.
         */
        int[] nums = {4, 5, 2, 10, 1, 20, 6, 8};

        int max = 0;
        for(int num : nums){
            if(num > max){
                max++;
            }

        }
        System.out.println("Max of array is: " + max);

        /*
         * This section of code is supposed to loop through all of the values in the grades hashmap to get the total
         * of all of the grades then divide it by the total size of the grades list.  Assume the hashmap is correct.
         * Fix it.
         */
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Sally", 95);
        grades.put("Fred", 80);
        grades.put("Jim", 88);
        grades.put("Jen", 76);

        int total = 0;
        for(Integer val : grades.values()){
            total = val;
        }
        Integer avg = total/grades.values().size();
        System.out.println("The average grade is: " + avg);

        /*
         * The following is more complex.  it is looping through each of the keys then getting the average grade
         * and putting it into a new hashmap with the student name as the key and the average as the value. Assume
         * the first hashmap is correct and fix the code.
         */
        HashMap<String, List<Integer>> gradeBook = new HashMap<>();
        gradeBook.put("Sally", Arrays.asList(90, 93, 99, 85, 88));
        gradeBook.put("Fred", Arrays.asList(75, 82, 78, 90, 88));
        gradeBook.put("Jim", Arrays.asList(90, 93, 80, 85, 78));
        gradeBook.put("Bill", Arrays.asList(64, 77, 83, 80, 72));

        HashMap<String, Integer> avgGrades = new HashMap<>();
        for(String name : gradeBook.keySet()){
            List<Integer> studentGrades = gradeBook.get("Sally");

            int sum = 0;
            for(Integer grade : studentGrades){
                sum += grade;
            }
            avgGrades.put(name, sum/studentGrades.size());
        }


    }

}
