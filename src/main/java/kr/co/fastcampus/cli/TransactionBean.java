package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;


/**
 * Created by mileNote on 2020-10-24
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Slf4j
@Aspect
public class TransactionBean {
//    private Connection connection;
//
//    public TransactionBean(Connection connection) {
//        this.connection = connection;
//    }
//
//    @Around("execution(* kr.co.fastcampus.cli.Dao.insert(..))")
//    public Object aroundTransaction(ProceedingJoinPoint pjp) throws SQLException {
//        log.error(">>>before aop transaction");
//        connection.setAutoCommit(false);
//        try {
//            Object procced = pjp.proceed();
//            log.error(">>>commit");
//            connection.commit();
//
//            return procced;
//        } catch (Throwable throwable) {
//            log.error(">>>rollback");
//            connection.rollback();
//        }
//        log.error(">>>after aop");
//        return null;
//    }
}