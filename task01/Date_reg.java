package selfwork07.task01;

public class Date_reg {

    public static void main(String[] args) {
        String date = "2020/12/31 21:49";
        String regex = "((19|20)\\d\\d)/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])" +
                "\s([12][1-9]|2?[0-3]):([0-5][0-9])";
        boolean matched = date.matches(regex);
        if (matched){
            System.out.println("Date: " + date);
        } else {
            System.out.println("Invalid date, return input");
        }
    }
}
