package com.ljo.crm.util;

import org.springframework.util.StringUtils;

/**
 * creator : jb.liang
 * time : 13:05
 */
public class MapUtil {

    public static String safeToString(String obj, String defaultValue) {
        String val = defaultValue;
        if(obj != null){
            val = String.valueOf(obj);
            if(StringUtils.isEmpty(val)){
                val = defaultValue;
            }
        }
        return val;
    }
}
