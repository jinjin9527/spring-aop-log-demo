package jp.co.nttdata.cashless.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdvice {
    private static Logger mainLogger = LoggerFactory.getLogger("mainLogger");
    private static Logger errorLogger = LoggerFactory.getLogger("errorLogger");

    @Around("within(jp.co.nttdata.cashless.controller.sample1.*)")
    public Object withinAround(ProceedingJoinPoint joinPoint) throws Throwable{
        String name = joinPoint.getSignature().getName();
        try {
            mainLogger.info("コード（004）：within-Around-Before-" + name);
            Object object = joinPoint.proceed();
            mainLogger.info("コード（005）：within-Around-After-" + name);
            return object;
        } catch (Exception e) {
            errorLogger.error("コード（006）：within-Around-システム例外。", e);
            throw e;
        }
    }

    @Around("execution(public String jp.co.nttdata.cashless.controller.sample2..*(..))")
    public Object executionAround(ProceedingJoinPoint joinPoint) throws Throwable{
        String name = joinPoint.getSignature().getName();
        try {
            mainLogger.info("コード（007）：execution-Around-Before-" + name);
            Object object = joinPoint.proceed();
            mainLogger.info("コード（008）：execution-Around-After-" + name);
            return object;
        } catch (Exception e) {
            errorLogger.error("コード（009）：execution-Around-システム例外。", e);
            throw e;
        }
    }

}
