package com.Calendar;


public abstract class CalendarCustom {
    private static final String[] days = {"po","út","st","čt","pá","so","ne"};
    private static final String[] months = {"Leden","Únor","Březen","Duben","Květen","Červen","Červenec","Srpen","Září","Říjen","Listopad","Prosinec"};
    private static final int[] numbersMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static int getNumberMonth(String month){
        for(int i = 0;i< CalendarCustom.months.length;i++){
            if(month.equals(CalendarCustom.months[i])){
                return i + 1;
            }
        }
        return 0;
    }

    public static String getTextMonth(int month){
        if(month > CalendarCustom.months.length || month <= 0){
            return "Neplatný výstup.";
        } else {
            return CalendarCustom.months[month - 1];
        }
    }




    public static void printCalendar(int month){
        StringBuilder resultCalendar = new StringBuilder();
        for (int i = 0;i < CalendarCustom.days.length;i++){
            if(i == (CalendarCustom.days.length - 1)){
                resultCalendar.append(CalendarCustom.days[i]).append("\n");
            } else {
                resultCalendar.append(CalendarCustom.days[i]).append(" ");
            }
        }

        int c  = 0;
        for (int i = 0;i < 6;i++){
            for (int j = 0;j < CalendarCustom.days.length;j++){

                if(c < 10){
                    resultCalendar.append("0").append(c).append(" ");
                } else {
                    resultCalendar.append(c).append(" ");
                }
                c++;

            }
            resultCalendar.append("\n");
        }

        System.out.println(resultCalendar);
    }
}
