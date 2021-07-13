package selfwork07.task02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchDomen {

    public static void main(String[] args) {

        String email = "abc@mail.com";
        String regex = "(.*)@(.*)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.find()) {
            String group3 = matcher.group(2);
            System.out.println(group3);
        }
        else {
            System.out.println("Email must contains @");
        }
    }
}
