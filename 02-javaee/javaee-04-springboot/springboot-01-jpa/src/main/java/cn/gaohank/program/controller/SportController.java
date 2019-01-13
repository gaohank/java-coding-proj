package cn.gaohank.program.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = "sport api")
@RequestMapping("sport")
public class SportController {
    @ApiOperation("获得比赛选手信息")
    @GetMapping("players")
    public List<String> getPlayers() {
        return null;
    }
}
