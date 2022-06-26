package com.gl.project;

public class Driver{

    public static void main(String[] arg) {

        //initialization of Object of AdminDep
        AdminDepartment adminDep = new AdminDepartment();
        {
            System.out.println("Welcome to " + adminDep.departmentName());
            System.out.println(adminDep.getTodaysWork());
            System.out.println(adminDep.getWorkDeadline());
            System.out.println(adminDep.isTodayAHoliday());

            System.out.println("   ");

            //initialization of Object of HR-Dep

            HrDepartment hrDep = new HrDepartment();

            System.out.println("Welcome to " + hrDep.departmentName());
            System.out.println(hrDep.doActivity());
            System.out.println(hrDep.getTodaysWork());
            System.out.println(hrDep.getWorkDeadline());
            System.out.println(hrDep.isTodayAHoliday());
            System.out.println("   ");

            //initialization of Object of Tech-Dep

            TechDepartment techDep = new TechDepartment();

            System.out.println("Welcome to " + techDep.departmentName());
            System.out.println(techDep.getTodaysWork());
            System.out.println(techDep.getWorkDeadline());
            System.out.println(techDep.isTodayAHoliday());

        }
    }
}

/*
Output:-
Welcome to Admin Department
Complete your documnets Submission
Complete by EOD
Today is not a holiday
   
Welcome to Hr Department
Team Lunch
Fill today�s worksheet and mark your attendance
Complete by EOD
Today is not a holiday

Welcome to Tech Department
Complete coding of module 1
Complete by EOD
Today is not a holiday

Process finished with exit code 0


 */

