package com.ljo.crm.exception;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/7/29
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 *
 * Execption 定义时需要捕获， RuntimeException 定义时可以不捕获
 */
public class IllegalException extends RuntimeException {

    //无参构造方法
    public IllegalException(){
        super();
    }

    //有参的构造方法
    public IllegalException(String message){
        super(message);
    }

    // 用指定的详细信息和原因构造一个新的异常
    public IllegalException(String message, Throwable cause){
        super(message,cause);
    }

    //用指定原因构造一个新的异常
    public IllegalException(Throwable cause) {
        super(cause);
    }

}
