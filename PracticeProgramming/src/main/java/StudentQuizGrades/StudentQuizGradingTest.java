/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentQuizGrades;

import userio.UserIO;
import userio.UserIOImpl;

/**
 *
 * @author DivyaDeverapally
 */
public class StudentQuizGradingTest {

    public static void main(String[] args) {
        UserIO userIO = new UserIOImpl();
        StudentsQuizGrading grading= new StudentsQuizGrading();
        userIO.print("Choose options below");
        userIO.print(" 1: View a list of students in the system");
        userIO.print(" 2: Remove a student from the system");
        userIO.print(" 3: View a list of quiz scores for a given student");
        userIO.print(" 4 : View the average quiz score for a given student");

        int userChoice = userIO.readInt("Give me a small number :");
        switch (userChoice) {
            case 1:
                grading.addStudent();
                break;                    
            case 2:
                grading.removeStudent();
                break;
            case 3:
                grading.viewListOfQuizesForStudent();
                break;
            case 4:
                grading.viewAverageQuizScoreOfStudent();
                break;
            default :
                break;
                       
        }



        
    }
     
             
    
}
