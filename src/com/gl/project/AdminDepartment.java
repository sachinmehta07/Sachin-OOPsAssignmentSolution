package com.gl.project;

public class AdminDepartment extends SuperDepartment {

    //Declaring Methods

    public String departmentName() {
        return "Admin Department";
    }

    public String getTodaysWork() {
        return "Complete your documnets Submission";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String isTodayAHoliday() {
        return super.isTodayAHoliday();
    }


}
