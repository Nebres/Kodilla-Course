package com.kodilla.patterns2.facade.shopFacade;

import com.kodilla.patterns2.facade.kodillaExample.Order;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Watcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.shopFacade.OrderFacade.processOrder(..)) && args(order)" +
            " && args(orderId) && target(object)")
    public void logEvent(Order order, Long orderId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + ", Args: " + order.toString() + " " + orderId);

    }

    @Around("execution(* com.kodilla.patterns2.facade.shopFacade.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed: " + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }

}
