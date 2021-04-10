package com.uservalidation;

public class InvalidPattern  extends Exception{
    public InvalidPattern(){
        super();
    }
    public InvalidPattern(String msg){
        super(msg);
    }
}
