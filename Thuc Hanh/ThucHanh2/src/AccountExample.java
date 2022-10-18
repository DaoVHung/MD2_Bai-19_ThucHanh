import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUT_REGEX = "^[_a-z0-9]{6,}$";
    public AccountExample(){
    }
    public boolean validate(String regex ){
        Pattern pattern = Pattern.compile(ACCOUT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
