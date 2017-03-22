package com.gic.api.rest;

import com.gic.exception.GicException;
import com.gic.service.template.ICommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pgolovenkov on 13.03.2017.
 */
@Controller
@RequestMapping("/api/rest/v0")
public class CommonController {

    @Autowired
    ICommonService commonService;

    @RequestMapping(path = "/public/hello", method = RequestMethod.GET)
    public ResponseEntity hello() throws GicException {
        return ResponseEntity.ok(commonService.hello());
    }

    @ExceptionHandler
    public ResponseEntity handleErrors(GicException e){
        try{
            if (e != null) {
                throw e;
            }
            return ResponseEntity.ok(null);
        } catch (GicException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
