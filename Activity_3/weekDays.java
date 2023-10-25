public class weekDays{

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
         Day weekDay = Day.MONDAY; 

        switch (weekDay) {
            case MONDAY:
                System.out.println("It's Monday! Get ready to school.");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday! Thank God I've survived Monday.");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday! You're half-way to a weekend.");
                break;
            case THURSDAY:
                System.out.println("It's a Thursday!. Keep up the good work!");
                break;
            case FRIDAY:
                System.out.println("It's Friday! Let's take a break!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's Sunday! Happy weekend.");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}