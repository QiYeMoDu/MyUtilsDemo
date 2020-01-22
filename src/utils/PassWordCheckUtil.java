package utils;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来:验证密码格式
 * ===========================================================
 * @date 2019/12/20 22:14
 */
public class PassWordCheckUtil {

    public static void main(String[] args) {
        System.out.println(Check());
    }

    private static boolean Check() {
        /*
         * 密码格式验证:包括大小写字母,数字,字符的八位以上的密码
         * */
        String rexg = "^(?![A-Za-z0-9]+$)(?![a-z0-9\\\\W]+$)(?![A-Za-z\\\\W]+$)(?![A-Z0-9\\\\W]+$)[a-zA-Z0-9\\\\W]{8,}$";
        String result = "12!!";
        if (result.matches(".*[a-z]{1,}.*") && result.matches(".*[A-Z]{1,}.*") && result.matches(".*[0-9]{1,}.*") && result.matches(".*[~!@#$%^&*\\.?]{1,}.*")) {
            return true;
        } else {
            return false;
        }
    }
}
