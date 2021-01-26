package jp.co.nttdata.cashless.controller.sample1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogExecutionController1 {
    private static Logger mainLogger = LoggerFactory.getLogger("mainLogger");
    @GetMapping("/test3")
    public String input3() {

        mainLogger.info("コード（103）：LogExecutionController1-test3。");

        return "test3";
    }

    @GetMapping("/test5")
    public String input5() throws Exception{

        mainLogger.info("コード（105）：LogExecutionController1-test5。");
        throw new Exception("test5 exception");
    }
}
