package lesson1;

public class Main {

    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.getWorkHours() > 0) {
                System.out.println(day.getName() + ". На этой неделе осталось работать: " + day.getWorkHours() + " часов");
            } else {
                System.out.println(day.getName() + ". Сегодня выходной!");
            }
        }
    }
}
