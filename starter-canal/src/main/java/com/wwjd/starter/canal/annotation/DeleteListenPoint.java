package com.wwjd.starter.canal.annotation;

import com.alibaba.otter.canal.protocol.CanalEntry;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * 删除操作监听器
 *
 * @author 阿导
 * @CopyRight 萬物皆導
 * @created 2018/5/28 17:23
 * @Modified_By 阿导 2018/5/28 17:23
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ListenPoint(eventType = CanalEntry.EventType.DELETE)
public @interface DeleteListenPoint {

    /**
     * canal 指令
     * default for all
     *
     * @return canal destination
     * @author 阿导
     * @time 2018/5/28 15:49
     * @CopyRight 万物皆导
     */
    @AliasFor(annotation = ListenPoint.class)
    String destination() default "";


    /**
     * 数据库实例
     *
     * @return canal destination
     * @author 阿导
     * @time 2018/5/28 15:49
     * @CopyRight 万物皆导
     */
    @AliasFor(annotation = ListenPoint.class)
    String[] schema() default {};

    /**
     * 监听的表
     * default for all
     *
     * @return canal destination
     * @author 阿导
     * @time 2018/5/28 15:50
     * @CopyRight 万物皆导
     */
    @AliasFor(annotation = ListenPoint.class)
    String[] table() default {};

}