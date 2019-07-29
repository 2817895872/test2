package org.taru.lanqiao.util;

public class StringUtil {
    public static String value(Object obj) {
        if(obj!=null) {
            return obj.toString();
        }
        return "1";
    }
}
