package com.yang.portal.core.annotation;

import com.yang.portal.Yang;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootApplication(scanBasePackageClasses = Yang.class)
public @interface YangApplication {
}
