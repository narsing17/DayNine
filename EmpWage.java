package Employye.com;

public class EmpWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int TOTAL_WORKING_HOURS = 100;

    public static void computeEmpWage(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHrPerMonth) {

        int dailyWage;
        int dailyWageFullTime = 0;
        int dailyWagePartTime = 0;
        int fullTimePresentDays = 0;
        int partTimePresentDays = 0;
        int absentDays = 0;
        int monthlyWage;
        int workingHours = 0;
        int fullHours = 0;
        int partHours = 0;


        for (int day = 1; day <= WORKING_DAYS_PER_MONTH && workingHours <= 100; day++) {
            int attendance = (int) (Math.floor(Math.random() * 10)) % 3;
            if (attendance == 2) {

                dailyWageFullTime = WAGE_PER_HOUR * FULL_DAY_HOUR;
                fullTimePresentDays = fullTimePresentDays + 1;
                fullHours = fullHours + 8;

            } else if (attendance == 1) {
                dailyWagePartTime = WAGE_PER_HOUR * PART_TIME_HOUR;
                partTimePresentDays = partTimePresentDays + 1;
                partHours = partHours + 4;
            } else {

                dailyWage = 0;
                absentDays = absentDays + 1;
                int hours = 0;
            }
            workingHours = fullHours + partHours;
        }
        monthlyWage = (fullTimePresentDays * dailyWageFullTime + partTimePresentDays * dailyWagePartTime);

        System.out.println("Total Emp wage for company " + companyName + " is " + monthlyWage);

    }

    public static void main(String[] args) {
        computeEmpWage("jio", 20, 20, 100);
        computeEmpWage("Airtel", 20, 20, 100);
        computeEmpWage("bsnl", 20, 20, 100);
    }
}
