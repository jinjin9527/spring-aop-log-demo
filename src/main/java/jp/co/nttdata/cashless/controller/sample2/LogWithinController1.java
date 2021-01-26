package jp.co.nttdata.cashless.controller.sample2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogWithinController1 {
    private static Logger mainLogger = LoggerFactory.getLogger("mainLogger");
    @GetMapping("/test1")
    public String input1() {

        mainLogger.info("コード（101）：LogExecutionController1-test1。");
        return "test1";
    }

}
