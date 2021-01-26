package jp.co.nttdata.cashless.controller.sample1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogExecutionController2 {
    private static Logger mainLogger = LoggerFactory.getLogger("mainLogger");
    @GetMapping("/test4")
    public String input3() {
        mainLogger.info("コード（104）：LogExecutionController1-test4。");
        return "test4";
    }
}
