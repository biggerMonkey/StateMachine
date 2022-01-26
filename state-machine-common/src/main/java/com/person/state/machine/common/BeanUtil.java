package com.person.state.machine.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author huangwenjun16
 * @date 2020/8/25 14:30:59
 * description: BeanUtil
 */
@Component
public class BeanUtil implements ApplicationContextAware {

    /**
     * Spring上下文
     */
    private ApplicationContext applicationContext;

    /**
     * 构造方法
     */
    public BeanUtil() {
    }

    /**
     * 构造方法
     * @param applicationContext applicationContext
     */
    public BeanUtil(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * getBeanByName
     * @param beanName beanName
     * @param <T> <T>
     * @return T
     */
    public <T> T getBeanByName(String beanName) {
        T bean = null;
        if (this.applicationContext != null) {
            bean = (T) this.applicationContext.getBean(beanName);
        }
        return bean;
    }
}
