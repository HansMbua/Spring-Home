package com.Love.ToCode.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyPointcutAOPExpressions {

    @Pointcut("execution(* com.Love.ToCode.dao.*.*(..))")
    public void forDaoPackage() {}
    //create pointcut for getter methods
    @Pointcut("execution(* com.Love.ToCode.dao.*.*get*(..))")
    public  void getter() {}
    //create pointcut for setter methods
    @Pointcut("execution(* com.Love.ToCode.dao.*.*set*(..))")
    public  void setter() {}
    //create pointcut: include package .. exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public  void  forDaoPackageNoGetterSetter(){}
}
