package cn.gaohank.program.controller;

import cn.gaohank.program.module.SleepMonitor;
import cn.gaohank.program.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private LogService logService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "hello world";
    }

    @RequestMapping("/ids")
    @ResponseBody
    List<String> ids() {
        List<String> ret = new ArrayList<String>();
        List<SleepMonitor> all = logService.findAll();
        for (SleepMonitor sleepMonitor : all) {
            ret.add(sleepMonitor.get_id());
        }
        return ret;
    }

    @RequestMapping("/all")
    @ResponseBody
    List<String> all() {
        List<SleepMonitor> all = logService.findAll();
        List<String> ret = new ArrayList<String>();
        for (SleepMonitor sleepMonitor : all) {
            ret.add(sleepMonitor.getSleepStage());
        }
        return ret;
    }
}
