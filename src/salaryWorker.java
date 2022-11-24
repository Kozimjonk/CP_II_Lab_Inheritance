public class salaryWorker extends Worker{
    private double annualSalary;
    
    public salaryWorker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(IDnum, firstName, lastName, title, 1994, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }
    
    public double getAnnualSalary() {
        return  annualSalary;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public double calculateWeeklySalary(double hoursWorked)
    {
        return annualSalary / 52;
    }
    public String displayWeeklyPay(double hoursWorked)
    {
        double weeklySalary = calculateWeeklySalary(hoursWorked);
        String weeklySalaryRound = String.format("%2f", weeklySalary);
        return "The weekly salary is " + weeklySalaryRound + " Which is annual salary " + annualSalary + "Divided by 52";
    }
}
