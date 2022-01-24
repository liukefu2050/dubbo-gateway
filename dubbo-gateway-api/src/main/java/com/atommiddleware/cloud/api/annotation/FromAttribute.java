package com.atommiddleware.cloud.api.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ParamAttribute(type = 6)
public @interface FromAttribute {
	
	/**
	 * attribute 名称
	 */
	@AliasFor(annotation = ParamAttribute.class)
	String value() default "";

	/**
	 * attribute 名称
	 */
	@AliasFor(annotation = ParamAttribute.class)
	String name() default "";

	/**
	 * 是否检查参数
	 */
	@AliasFor(annotation = ParamAttribute.class)
	boolean required() default true;
}
