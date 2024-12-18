package ElectionDirectory;

import java.time.Year;

public class DateOfBirth {
    Year currentYear = Year.now();
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public DateOfBirth(int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.dayOfBirth = Integer.parseInt(String.valueOf(dayOfBirth));
        this.monthOfBirth = Integer.parseInt(String.valueOf(monthOfBirth));
        this.yearOfBirth = Integer.parseInt(String.valueOf(yearOfBirth));
    }


    public DateOfBirth() {

    }

    private void validateDateOfBirth(String dayOfBirth) {
        int dayOfBirthInt = Integer.parseInt(dayOfBirth);
        boolean dayOfBirthIsValid = dayOfBirthInt >= 1 && dayOfBirthInt <= 31;
        if (!dayOfBirthIsValid)
            throw new IllegalArgumentException("Invalid date of birth");

    }

    public void setDayOfBirth(String dayOfBirth) {
        validateDateOfBirth(dayOfBirth);
        this.dayOfBirth = Integer.parseInt(dayOfBirth);
    }

    private void validateMonthOfBirth(String monthOfBirth) {
        int monthOfBirthInt = Integer.parseInt(monthOfBirth);
        boolean monthOfBirthIsValid = monthOfBirthInt >= 1 && monthOfBirthInt <= 12;
        if (!monthOfBirthIsValid)
            throw new IllegalArgumentException("Month of birth must be between 1 and 12");
        monthOfBirth = Integer.toString(monthOfBirthInt);
    }

    public void setMonthOfBirth(String monthOfBirth) {
        validateMonthOfBirth(monthOfBirth);
        this.monthOfBirth = Integer.parseInt(monthOfBirth);
    }

    public void setYearOfBirth(String yearOfBirth) {
        validateYearOfBirth(yearOfBirth);
        this.yearOfBirth = Integer.parseInt(yearOfBirth);
    }

    private void validateYearOfBirth(String yearOfBirth) {
        int currentYearInt = currentYear.getValue();
        int yearOfBirthInt = Integer.parseInt(yearOfBirth);
        boolean yearOfBirthIsValid = yearOfBirthInt >= currentYearInt && yearOfBirthInt <= 1900;
        if (!yearOfBirthIsValid)
            throw new IllegalArgumentException("Invalid year\nYear must not be below 1900 or above"+currentYearInt);
        yearOfBirth = Integer.toString(yearOfBirthInt);
    }
    public String getDateOfBirth() {
        return dayOfBirth + "-" + monthOfBirth + "-" + yearOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
