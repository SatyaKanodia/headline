package com.til.controller.v1;

import com.til.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by Satya on 31-07-2018.
 */
@ControllerAdvice
public class ErrorController{

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ResponseDTO> handleAllExceptions(Exception ex, WebRequest request) {
     ResponseDTO responseDTO=new ResponseDTO();
     responseDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
     responseDTO.setMessage(ex.getMessage());
        return new ResponseEntity<>(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
