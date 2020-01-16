package com.zr.controller;

import org.springframework.boot.web.servlet.error.ErrorController;

public class GlobalErrorController implements ErrorController {


    @Override
    public String getErrorPath() {

        return null;
    }
}
