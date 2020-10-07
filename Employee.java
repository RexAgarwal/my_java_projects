import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class Employee {
    private String Id;
    private String name;
    private int dept;
    private float basic;
    private float allowance;
    private float totalSalary;

    protected Employee(String ename, String eid, int edept, int basicsal){
        name = ename;
        id = eid;
        dept = edept;
        basic = basicsal;
        if (dept == 1)
        allowance = 1500 ;
        else if(dept == 2)
        allowance = 2500; 
        else if (dept ==3 )
        allowance = 3500;
        else
        System.out.println("Wrong dept number..\n");

    }
    protected calculateSalary(){
        totalSalary = 1.4*basic + allowance;

    }
    protected displayDetails(){
        System.out.println(" Name:" + name + "\n Id" + Id + "\n Dept" + dept + "\n"
                + " Basic" + basic + "\n total Salary" + totalSalary);
    }
}