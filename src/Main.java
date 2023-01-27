public class Main {

    public static void main(String[] args) {
        regularEmp();
        partEmp();
    }
    public static void regularEmp(){
        int wagePerDay = 160;
        int workingDay = 0;
        int absDays = 0;
        int month = 0;

        while(workingDay <=20 && month <30 ) {

            int attendance = (int) ((Math.random() * 10) % 2);

            switch (attendance) {
                case 0:
                    workingDay++;
                    month++;
                    break;
                default:
                    month++;
                    absDays++;
            }

        }
        System.out.println("Regular Employee was Present for " +workingDay+ " Days");
        int wage = wagePerDay * workingDay;
        System.out.println("Monthly Wage of Regular Employee : " + wage);
        System.out.println("Regular Employee is Absent for " +absDays+ " Days");
        System.out.println("  ");
    }
    public static void partEmp(){
        int wagePerDay = 160;
        int partWorkingDay = 0;
        int partMonth = 0;
        int partAbsDays = 0;

        while(partWorkingDay <= 20 && partMonth<30) {

            int partAttendance = (int) ((Math.random() * 10) % 2);

            switch (partAttendance) {
                case 0:
                    partMonth++;
                    partWorkingDay++;
                    break;
                default:
                    partMonth++;
                    partAbsDays++;
            }
        }
        System.out.println("Part Time Employee is Present for "+partWorkingDay+ " Days");
        int partWage = wagePerDay * partWorkingDay;
        System.out.println("Daily Wage of Part Time Employee : " + partWage);
        System.out.println("Part Time Employee was Absent for " +partAbsDays+ " Days");

    }

    }
