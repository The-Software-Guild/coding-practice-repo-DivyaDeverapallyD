/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentQuizGrades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import userio.UserIO;
import userio.UserIOImpl;

/**
 *
 * @author DivyaDeverapally
 */
public class StudentsQuizGrading {

    Map<String, List<Integer>> studentsMap = new HashMap<>();
    UserIO userIO = new UserIOImpl();

    public StudentsQuizGrading() {

        studentsMap.put("Divya", Arrays.asList(new Integer[]{1, 2, 3}));
        studentsMap.put("Sandeep", Arrays.asList(new Integer[]{4, 5, 6}));
        studentsMap.put("Sindhu", Arrays.asList(new Integer[]{7, 8, 9}));

    }

    void addStudent() {
        String studentName = userIO.readString("Enter Student Name ");
        List<Integer> quizeScores = new ArrayList<>();
        int numberOfScores = userIO.readInt("How many scores you want to enter ?");
        for (int n = 1; n <= numberOfScores; n++) {
            quizeScores.add(userIO.readInt("Enter score" + n));
        }
        studentsMap.put(studentName, quizeScores);

    }

    void removeStudent() {
         String studentName = userIO.readString("Enter Student Name  to Remove ");
         studentsMap.remove(studentName);
         userIO.print("Done!!!");
         
    }

    void viewListOfQuizesForStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void viewAverageQuizScoreOfStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
