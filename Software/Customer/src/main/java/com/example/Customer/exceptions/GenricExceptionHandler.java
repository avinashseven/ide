package com.example.Customer.exceptions;

public class GenricExceptionHandler extends RuntimeException {

        private String fieldName;
        private Object fieldValue;
        public GenricExceptionHandler(String fieldName, Object fieldValue) {
            super(String.format("%s %s is not valid ", fieldName, fieldValue));
            this.fieldName = fieldName;
            this.fieldValue = fieldValue;
        }

        public String getFieldName() {
            return fieldName;
        }

        public Object getFieldValue() {
            return fieldValue;
        }

    }
