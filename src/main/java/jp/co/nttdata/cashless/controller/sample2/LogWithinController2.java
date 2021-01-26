package jp.co.nttdata.cashless.controller.sample2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogWithinController2 {
    private static Logger mainLogger = LoggerFactory.getLogger("mainLogger");
    @GetMapping("/test2")
    public String input2(){

        mainLogger.info("コード（102）：LogExecutionController1-test2。");
        return "test2";
    }

}
