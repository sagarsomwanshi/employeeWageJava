public class Main {
    public static void main(String[] args) {
        int wagePerHour = 20;

        int attendance = (int)((Math.random()*10)%2);
    if(attendance==0) {
    System.out.println("Employee is Present");
    int wage = 20*8;
        System.out.println("Daily Wage of Employee : " +wage);
    }
    else {
        System.out.println("Employee is Absent");
        System.out.println("Daily wage of Employee : 0");
        }
      }
    }
