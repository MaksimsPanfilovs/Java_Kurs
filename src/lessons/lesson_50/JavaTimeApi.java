package lessons.lesson_50;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTimeApi {

        // Java Time Api / java.time

    /*
    util.Date
    util.Calender
    text.SimpleDateFormat

    Joda-Time
     */

    public static void main(String[] args) {

        // localDate - представляет дату (год, месяц, день) без времени.

        LocalDate date = LocalDate.now(); // возвращает текущую дату.
        System.out.println("Date: " + date);

        // Прибавить 1 день к дате.
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("plusWeeks: " + date.plusWeeks(4)); // плюс 4 недели к дате.
        System.out.println("date.minusMonths(2): " + date.minusMonths(2)); // минус 2 месяца.

        LocalDate date1 = LocalDate.of(2002, 2, 15); // Установить дату (год, месяц, день).
        System.out.println("date1: " + date1);

        // Можно использовать Enum, с названием месяца
        date1 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println("date1: " + date1);

        System.out.println("Год: " + date.getYear() + "; месяц: " + date.getMonth() +
                "; месяц цифра: " + date.getMonthValue());
        System.out.println("Число: " + date.getDayOfMonth() + "; День недели: " + date.getDayOfWeek() +
                "; День-года: " + date.getDayOfYear());
        System.out.println("Сколько дней в месяце: " + date.lengthOfMonth() + "; Сколько дней в году: " +
                date.lengthOfYear() + "; Был ли год високосным: " + date.isLeapYear());

        // Преобразование строки в объект даты.
        String dateString = "2000-10-25";
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println(date2.getDayOfMonth() + "/" + date2.getMonthValue() + "/" + date2.getYear());

        System.out.println("\n=============== LocalTime ==================");
        // LocalTime - представляет время (часы, минуты, секунды, наносекунды).
        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("Time: " + time);

        LocalTime time1 = LocalTime.of(21, 33); // часы и минуты
        time1 = LocalTime.of(21, 33, 44);
        time1 = LocalTime.of(21, 33, 44, 54875);

        System.out.println("Time1: " + time1);

        LocalTime time2 = time.plusHours(1); // добавляет 1 час к объекту времени
        System.out.println("nowPlusHours: " + time2);
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65));
        System.out.println("time.minusSeconds(30): " + time.minusSeconds(30));

        System.out.println(time.getHour() + " | " + time.getMinute() + " | " + time.getSecond() + " | " + time.getNano());

        String timeString = "12:13:45";
        LocalTime parseTime = LocalTime.parse(timeString);
        System.out.println(parseTime);

        System.out.println("\n=============== LocalDateTime =====================");
        // LocalDateTime - представляет дату и время без учета часового пояса.
        LocalDateTime now = LocalDateTime.now(); // Текущее дата-время.
        System.out.println("Now: " + now);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 22, 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime: " + dateTime);
        dateTime = LocalDateTime.of(2025, 12, 31, 23, 59);
        System.out.println("dateTime.getDayOfWeek(): " + dateTime.getDayOfWeek());
        System.out.println("dateTime.getDayOfWeek().getValue(): " + dateTime.getDayOfWeek().getValue());
        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(1): " + dateTime.minusYears(1));

        System.out.println("\n================= ZoneDateTime ===================");
        // ZoneDateTime - представляет дату и время с часовым поясом.

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());

        System.out.println("\n================ isAfter, isBefore, until, equals ==================");

        LocalDate date3 = LocalDate.of(2020, 10, 16);
        LocalDate date4 = LocalDate.of(2020, 6, 25);

        // isAfter, isBefore, until, equals - есть у всех объектов, представляющих дату и/или время.

        // boolean isAfter - проверяет, что текущий объект после (позже) указанного объекта.
        boolean isAfter = date3.isAfter(date4);
        System.out.println("date3.isAfter(date4): " + isAfter);

        // isBefore - проверяет, что текущий объект до (раньше) указанного объекта.
        System.out.println("date3.isBefore(date4): " + date3.isBefore(date4));

        // equals - проверяет даты/время на равенство.
        System.out.println("date3.equals(date4): " + date3.equals(date4));

        // long until - метод измеряет время между текущим и указанным объектом даты/времени.

        long between = date3.until(date4, ChronoUnit.DAYS);
        System.out.println("date3.until(date4, ChronoUnit.DAYS): " + between);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.minusDays(15);
        System.out.println("untilDates: " + dateTime2.until(dateTime1, ChronoUnit.DAYS));
        System.out.println("untilSeconds: " + dateTime2.until(dateTime1, ChronoUnit.SECONDS));

        LocalDateTime dateTime3 = dateTime1.plus(10, ChronoUnit.DAYS);
        System.out.println("dateTime1.plus(10, ChronoUnit.DAYS): " + dateTime3);
        dateTime3 = dateTime1.minus(10, ChronoUnit.MINUTES);
        System.out.println("dateTime1.plus(10, ChronoUnit.MINUTES): " + dateTime3);

        // Метод ChronoUnit - .between() -> long
        long hoursBetween = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        System.out.println("hoursBetween: " + hoursBetween);

        System.out.println("\n================= Instant, Duration, Period ================");

        // Instant - представляет собой точку на временной шкале в Григорианском календаре с точностью до наносекунд.
        // Unix epoch (Epoch time) - Эпоха юникс. Началась с 1 января 1970 года.
        // Момент времени, он основан на количестве секунд и наносекунд, прошедших с 1 января 1970 года.

        Instant nowInstant = Instant.now();

        long millis = nowInstant.toEpochMilli(); // получаем кол-во миллисекунд с 1970-01-01.
        System.out.println("nowInstant.toEpochMilli(): " + millis);

        Instant instant = Instant.ofEpochMilli(millis); // получить из миллисекунд объект инстанта.
        System.out.println(instant);

        // Duration, Period - представляет собой отрезки времени (временные интервалы), но используется для разных типов временных единиц.
        // Duration - продолжительность в секундах и наносекундах.
        // Period - разница (продолжительность) в днях, месяцах, годах.
        //Todo

        System.out.println("\n================= DateTimeFormatter =================");

        // DateTimeFormatter - форматирование даты и времени.
        LocalDateTime nowLDT = LocalDateTime.now();
        System.out.println("nowLDT: " + nowLDT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedString = nowLDT.format(formatter);
        System.out.println("formattedString: " + formattedString);

        /*
        y - год
        M - месяц
        d - день
        H - час в формате от 0 до 23
        h - час в формате от 0 до 12, флаг "a"
        m - минута
        s - секунда

        Количество повторений символа определяет формат отображения значение.
        yyyy - 4-х значный год
        yy - двухзначный год, например "23" для 2023 года.
        M - месяц в сыром формате -> "2", "12"
        MM - месяц в двухзначном формате -> "02", "12"
        d - сырой номер дня -> "3", "29"
        dd - двухзначный день -> "03", "29"

         */

        // Есть строка с датой - создать объект LDT соответствующий этой дате.
        String dateForParse = "23-10-26 19:15";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDate = LocalDateTime.parse(dateForParse, formatter1);
        System.out.println("LocalDateTime.parse(dateForParse, formatter1): " + parseDate);
        System.out.println(parseDate.getDayOfWeek() + " | " + parseDate.getHour());

        System.out.println("\n=================== Task1=================");

        // "15-12-2022 20-46"
        // запарсить строку в формат LocalDateTime
        // распечатать отдельно месяц, день, час

        // 13-01-2023 00-47
//        Какому дню недели соответствует вторая дата
        // сколько дней между этими датами?

        String dateStr1 = "15-12-2022 20-46";
        String dateStr2 = "13-01-2023 00-47";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parseDateFirst = LocalDateTime.parse(dateStr1, formatter2);
        System.out.println("parseDate2: " + parseDateFirst);
        System.out.println(parseDateFirst.getMonth() + " | " + parseDateFirst.getDayOfMonth() + " | " + parseDateFirst.getHour());
        LocalDateTime parseDateSecond = LocalDateTime.parse(dateStr2, formatter2);
        System.out.println("день недели второй даты" + parseDateSecond.getDayOfWeek());
        System.out.println(parseDateSecond.getDayOfWeek().getValue());
        System.out.println("дней между датами: " + parseDateFirst.until(parseDateSecond, ChronoUnit.DAYS));















    }
}
