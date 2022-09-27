package dev.kevinbatchelor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( value = HttpStatus.BAD_REQUEST, reason = "Please enter an integer (0 - 3999) inclusive.")
public class InvalidIntegerException extends RuntimeException{}
