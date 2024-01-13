package com.chuwa.hw.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private String resourceName;
    private String fieldName;
    private long fileValue;

    public ResourceNotFoundException(String resourceName, String fieldName, long fileValue){
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fileValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fileValue = fileValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public long getFileValue() {
        return fileValue;
    }

    public void setFileValue(long fileValue) {
        this.fileValue = fileValue;
    }
}
