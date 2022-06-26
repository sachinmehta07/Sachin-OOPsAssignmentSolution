package com.gl.project;

public class TechDepartment extends SuperDepartment {

    //Declaring  Methods
    public String departmentName() {
        return "Tech Department ";
    }

    public String getTodaysWork() {
        return "Complete coding of module 1";
    }

    public String getWorkDeadline() {
        return "Complete by EOD ";
    }

    public String getTechStackInformation() {
        return "core Java";
    }

    public String isTodayAHoliday() {
        return super.isTodayAHoliday();
    }

}
