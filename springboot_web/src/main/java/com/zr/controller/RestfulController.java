package com.zr.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class RestfulController {

    @GetMapping("/get")
    public String get(String msg) {
        log.info("get方式!");
        return msg;
    }

    @PostMapping("/post")
    public String post(@RequestBody String msg) {
        log.info("post方式!");
        return msg;
    }

    @PutMapping("/put")
    public String put(@RequestBody String msg) {
        log.info("put方式!");
        return msg;
    }

    @DeleteMapping("/delete")
    public String delete(String msg) {
        log.info("delete方式!");
        return "delete " + msg + " success!";
    }

    /**
     * 设置返回状态为417
     *
     * @param msg
     * @return
     */
    @GetMapping("/status")
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public String status(String msg) {
        log.info("status方式!");
        return msg;
    }
}