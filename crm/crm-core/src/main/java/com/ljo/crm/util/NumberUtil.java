package com.ljo.crm.util;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/18
 * Time: 18:44
 * To change this template use File | Settings | File Templates.
 */
public class NumberUtil {

    public static Integer safeToInteger(Object obj, Integer defaultValue){
        Integer result = defaultValue;
        if(obj != null){
            try{
                result = Integer.parseInt(String.valueOf(obj));
            } catch (Exception e){
                result = defaultValue;
            }
        }
        return result;
    }
}
