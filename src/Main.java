public class Main {
    public static void main(String[] args) {
        int wagePerHour = 20;

        int attendance = (int)((Math.random()*10)%2);
        int partAttendance = (int)((Math.random()*10)%2);
    if(attendance==0) {
    System.out.println("Regular Employee is Present");
    int wage = 20*8;
        System.out.println("Daily Wage of Regular Employee : " +wage);
    }
     else {
        System.out.println("Regular Employee is Absent");
        System.out.println("Daily wage of Regular Employee : 0");
        }

    if(partAttendance==0) {
            System.out.println("Part Time Employee is Present");
            int partWage = 20*8;
            System.out.println("Daily Wage of Part Time Employee : " +partWage);
    }
     else {
            System.out.println("Part Time Employee is Absent");
            System.out.println("Daily wage of Part Time Employee : 0");
        }
      }
    }
