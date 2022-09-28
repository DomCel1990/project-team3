package staff;

import java.time.LocalTime;

public enum Day {
    MONDAY(LocalTime.of(9, 0), LocalTime.of(21, 30)),
    TUESDAY(LocalTime.of(9, 0), LocalTime.of(21, 30)),
    WEDNESDAY(LocalTime.of(9, 0), LocalTime.of(21, 30)),
    THURSDAY(LocalTime.of(9, 0), LocalTime.of(21, 30)),
    FRIDAY(LocalTime.of(9, 0), LocalTime.of(21, 30)),
    SATURDAY(LocalTime.of(9, 0), LocalTime.of(20, 30)),
    SUNDAY(LocalTime.of(11, 0), LocalTime.of(19, 30));
    final LocalTime openinigTime;
    final LocalTime closeningTime;

    Day(LocalTime openinigTime, LocalTime closeningTime) {
        this.openinigTime = openinigTime;
        this.closeningTime = closeningTime;
    }

}
