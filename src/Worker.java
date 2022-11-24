public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String IDNum, String firstName, String lastName, String title, int yob, int YOB, double hourlyPayRate) {
        super(IDNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hourWorked) {
        if (hourWorked > 40) {
            double regPay = hourlyPayRate * 40;
            double overPay = (hourWorked - 40) * 1.5;
            return regPay + overPay;
        } else {

            return hourlyPayRate * hourWorked;
        }

    }

    public String displayWeeklyPay(double hourWorked) {
        if (hourWorked > 40) {
            double regHoursWorked = 40;
            double regPay = hourlyPayRate * regHoursWorked;
            double overHoursWorked = hourlyPayRate - 40;
            double overPay = overHoursWorked * hourlyPayRate * 1.5;
            double totalPay = overPay + regPay;
            double totalHours = overHoursWorked + regHoursWorked;
            String output = new String("A total of " + regHoursWorked + "regular hours were worked, which earned " + regPay +
                    " dollars. A total of " + overHoursWorked + " overtime hours were worked, which earned " +
                    " dollars. The total number of hours was " + totalHours + ". The total pay was " + totalPay);
            return output;

        } else {
            double regHoursWorked = hourWorked;
            double regPay = hourlyPayRate + regHoursWorked;
            String output = ("A total of " + "hours were worked, which earned a total of " + regPay + " dollars. No overtime hours were worked");
            return output;
        }


    }
}
