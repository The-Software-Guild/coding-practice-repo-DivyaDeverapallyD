/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DivyaDeverapally
 */
public class ClassRosterDaoFileImpl implements ClassRosterDao {

    private Map<String, Student> students = new HashMap<>();
    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";

    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterDaoException {
    loadRoster();
    Student newStudent = students.put(studentId, student);
    writeRoster();
    return newStudent;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterDaoException{
        loadRoster();
        return new ArrayList<Student>(students.values());
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterDaoException {
         loadRoster();
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterDaoException {
         loadRoster();
        Student removedStudent = students.remove(studentId);
         writeRoster();
        return removedStudent;
    }

    private Student unmarshallStudent(String studentAsText) {

        String[] studentTokens = studentAsText.split(DELIMITER);

        // Given the pattern above, the student Id is in index 0 of the array.
        String studentId = studentTokens[0];

        Student studentFromFile = new Student(studentId);

        studentFromFile.setFirstName(studentTokens[1]);

        studentFromFile.setLastName(studentTokens[2]);

        studentFromFile.setCohort(studentTokens[3]);

        return studentFromFile;
    }
private void loadRoster() throws ClassRosterDaoException {
    Scanner scanner;

    try {
        scanner = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
    } catch (FileNotFoundException e) {
        throw new ClassRosterDaoException("-_- Could not load roster data into memory.", e);
    }
   
    String currentLine;
   
    Student currentStudent;
   
    while (scanner.hasNextLine()) {
        
        currentLine = scanner.nextLine();
       
        currentStudent = unmarshallStudent(currentLine);

        students.put(currentStudent.getStudentId(), currentStudent);
    }
    // close scanner
    scanner.close();
}
private void writeRoster() throws ClassRosterDaoException {
       PrintWriter out;

    try {
        out = new PrintWriter(new FileWriter(ROSTER_FILE));
    } catch (IOException e) {
        throw new ClassRosterDaoException(
                "Could not save student data.", e);
    }

    // Write out the Student objects to the roster file.
    // NOTE TO THE APPRENTICES: We could just grab the student map,
    // get the Collection of Students and iterate over them but we've
    // already created a method that gets a List of Students so
    // we'll reuse it.
    String studentAsText;
    List<Student> studentList = this.getAllStudents();
    for (Student currentStudent : studentList) {
        // turn a Student into a String
        studentAsText = marshallStudent(currentStudent);
        // write the Student object to the file
        out.println(studentAsText);
        // force PrintWriter to write line to the file
        out.flush();
    }
    // Clean up
    out.close();
}
private String marshallStudent(Student aStudent){
   
    String studentAsText = aStudent.getStudentId() + DELIMITER;

    studentAsText += aStudent.getFirstName() + DELIMITER;

  
    studentAsText += aStudent.getLastName() + DELIMITER;

  
    studentAsText += aStudent.getCohort();


    return studentAsText;
}
}
