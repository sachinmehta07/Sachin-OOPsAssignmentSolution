package com.gl.project;

public class HrDepartment extends SuperDepartment {

    //Declaring  Methods

    public String departmentName() {
        return "Hr Department";
    }
    public String getTodaysWork() {
        return "Fill today’s worksheet and mark your attendance";
    }
    public String getWorkDeadline() {
        return "Complete by EOD ";
    }
    public String doActivity() {
        return "Team Lunch";
    }

    public String isTodayAHoliday() {

        return super.isTodayAHoliday();
    }

}


