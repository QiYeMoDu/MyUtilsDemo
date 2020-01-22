package utils;

import java.util.UUID;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来:尝试UUID的相关操作
 * ===========================================================
 * @date 2019/12/20 22:14
 */
public class UUIDDemo {
    public static void main(String[] args) {
        //随机生成一个UUID
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString().length());
        System.out.println(uuid);
    }
}
