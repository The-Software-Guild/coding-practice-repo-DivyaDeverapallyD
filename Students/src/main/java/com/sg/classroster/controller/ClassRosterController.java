/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.controller;

import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterDaoException;
import com.sg.classroster.dao.ClassRosterDaoFileImpl;
import com.sg.classroster.dto.Student;
import com.sg.classroster.ui.ClassRosterView;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.ui.UserIOConsoleImpl;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DivyaDeverapally
 */
public class ClassRosterController {
    private UserIO io ;
private ClassRosterView view;
public ClassRosterController(ClassRosterDao dao, ClassRosterView view) {
    this.dao = dao;
    this.view = view;
}
private ClassRosterDao dao = new ClassRosterDaoFileImpl();

    public void run() {
       boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

           try {
               menuSelection = getMenuSelection();
               switch (menuSelection) {
                   case 1:
                       listStudents();
                       break;
                   case 2:
                       createStudent();
                       break;
                   case 3:
                       viewStudent();
                       break;
                   case 4:
                       removeStudent();
                       break;
                   case 5:
                       keepGoing = false;
                       break;
                   default:
                       unknownCommand();
               }
           } catch (ClassRosterDaoException e) {
              view.displayErrorMessage(e.getMessage());
           }

        }
       exitMessage();
    }
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private void createStudent() throws ClassRosterDaoException{
    view.displayCreateStudentBanner();
    Student newStudent = view.getNewStudentInfo();
    dao.addStudent(newStudent.getStudentId(), newStudent);
    view.displayCreateSuccessBanner();
}
    private void listStudents()throws ClassRosterDaoException {
    view.displayDisplayAllBanner();
    List<Student> studentList = dao.getAllStudents();
    view.displayStudentList(studentList);
}
    private void viewStudent() throws ClassRosterDaoException{
    view.displayDisplayStudentBanner();
    String studentId = view.getStudentIdChoice();
    Student student = dao.getStudent(studentId);
    view.displayStudent(student);
}
    private void removeStudent()throws ClassRosterDaoException {
    view.displayRemoveStudentBanner();
    String studentId = view.getStudentIdChoice();
    Student removedStudent = dao.removeStudent(studentId);
    view.displayRemoveResult(removedStudent);
}
    private void unknownCommand() {
    view.displayUnknownCommandBanner();
}

private void exitMessage() {
    view.displayExitBanner();
}
}
