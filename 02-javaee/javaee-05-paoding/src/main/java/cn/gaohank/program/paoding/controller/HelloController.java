package cn.gaohank.program.paoding.controller;

import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;

@Path("")
public class HelloController {
    @Get("/")
    public String index() {
        return "@hello world";
    }

    @Get("/query")
    public String query() {
        return "@query";
    }

    @Get("/hello/world")
    public String hello() {
        return "@json:{\"status\": 200}";
    }
}
