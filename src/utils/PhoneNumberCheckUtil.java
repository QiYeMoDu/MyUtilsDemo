package utils;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来:验证电话号码格式
 * ===========================================================
 * @date 2019/12/20 22:14
 */
public class PhoneNumberCheckUtil {

    public static void main(String[] args) {
        System.out.println(checkPhoneNumber("177297200159"));
    }

    static boolean checkPhoneNumber(String phone) {
        //以1开头的11位数字
        if (phone.matches("^1[0-9]{10}$")) {
            return true;
        }
        return false;
    }

}
