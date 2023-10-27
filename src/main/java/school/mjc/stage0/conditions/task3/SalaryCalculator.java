package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float taxes;
        if(salary<=10000)
            taxes=salary*0.15f;
        else if(salary<=20000 || salary>10000)
            taxes=salary*0.18f;
        else if(salary>20000 )
            taxes=salary*0.2f;
        else if(salary==0)
            System.out.println("wrong input");

    }
}
