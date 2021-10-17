package com.gupaoedu.vip.spring.framework.aop;

import com.gupaoedu.vip.spring.framework.aop.support.GPAdvisedSupport;

/**
 * Created by Tom.
 */
public class GPDefaultAopProxyFactory {
    public GPAopProxy createAopProxy(GPAdvisedSupport config) throws Exception {
        Class targetClass = config.getTargetClass();
        // 有接口实现
        if (targetClass.getInterfaces().length > 0) {
            return new GPJdkDynamicAopProxy(config);
        }
        // 没有接口实现
        return new GPCglibAopPorxy();
    }
}
