package com.cueparse.media;

public class CueParseException extends Exception{
	
	private static final long serialVersionUID = 1L;

    public CueParseException() {}

    public CueParseException(String message){
       super(message);
    }
}
