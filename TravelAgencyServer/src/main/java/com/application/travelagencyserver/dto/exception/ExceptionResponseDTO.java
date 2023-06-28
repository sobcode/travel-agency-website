package com.application.travelagencyserver.dto.exception;

public class ExceptionResponseDTO {
    private int status;
    private String message;
    private String exceptionName;

    public ExceptionResponseDTO() {
    }

    public ExceptionResponseDTO(int status, String message, String exceptionName) {
        this.status = status;
        this.message = message;
        this.exceptionName = exceptionName;
    }

    @Override
    public String toString() {
        return "ExceptionResponseDTO{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", exceptionName='" + exceptionName + '\'' +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExceptionName() {
        return exceptionName;
    }

    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }
}
