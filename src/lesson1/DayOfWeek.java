package lesson1;

public enum DayOfWeek {
    MONDAY("Понедельник", 40), TUESDAY("Вторник", 32), WEDNESDAY("Среда", 24), THURSDAY("Четверг", 16), FRIDAY("Пятница", 8), SATURDAY("Суббота", 0), SUNDAY("Воскресенье", 0);
    private int workHours;
    private String name;

    DayOfWeek(String name, int workHours) {
        this.name = name;
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public String getName() {
        return name;
    }
}
