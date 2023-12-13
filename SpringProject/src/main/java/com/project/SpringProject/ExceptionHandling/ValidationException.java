package com.project.SpringProject.ExceptionHandling;

public class ValidationException extends RuntimeException
{
    public ValidationException(String message)
    {
        super(message);

    }
}
