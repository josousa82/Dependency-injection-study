package com.springstudy.sfdistudy.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by sousaJ on 24/08/2020
 * in package - com.springstudy.sfdistudy.services
 **/
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean) bean).afterInit();
        }
        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof LifeCycleDemoBean)
            ((LifeCycleDemoBean)bean).afterInit();
        return bean;
    }

}
