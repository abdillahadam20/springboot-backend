package com.javaguides.springbootbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
Class ini digunakan apabila dalam resource database tidak
ditemukan makan akan dijalankan dan bernilai true
*/
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourcesNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourcesNotFoundException(String message) {
        super(message);
    }
}
