package codingChallenges;

public class Time{
    private int hour;
    private int minute;
    private int second;
    public void CheckHourValidity(int hour){
        boolean checkHourLessThan0 = hour < 0;
        if(checkHourLessThan0){
            throw new IllegalArgumentException("Hour must be greater than zero");
        }
        boolean checkHourGreaterThan23 = hour > 23;
        if(checkHourGreaterThan23){
            throw new IllegalArgumentException("Hour must be less than 24");
        }
    }
    public void CheckMinuteValidity(int minute){
        boolean checkMinuteLessThan0 = minute < 0;
        if(checkMinuteLessThan0){
            throw new IllegalArgumentException("Minute must be greater than zero");
        }
        boolean checkMinuteGreaterThan59 = minute > 59;
        if(checkMinuteGreaterThan59){
            throw new IllegalArgumentException("Minute must be less than 60");
        }
    }

    public void CheckSecondValidity(int second){
        boolean checkSecondLessThan0 = second < 0;
        if(checkSecondLessThan0){
            throw new IllegalArgumentException("Second must be greater than zero");
        }
        boolean checkSecondGreaterThan59 = second > 59;
        if(checkSecondGreaterThan59){
            throw new IllegalArgumentException("Second must be less than 60");
        }
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
}

