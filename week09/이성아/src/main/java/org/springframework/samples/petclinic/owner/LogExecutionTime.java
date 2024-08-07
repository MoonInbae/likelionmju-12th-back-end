package org.springframework.samples.petclinic.owner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 어디에 쓸 것인가?
@Retention(RetentionPolicy.RUNTIME) // 이 애노테이션 정보를 언제까 유지할 것인가?
public @interface LogExecutionTime {
}
