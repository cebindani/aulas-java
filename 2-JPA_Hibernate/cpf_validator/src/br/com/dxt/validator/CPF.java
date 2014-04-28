package br.com.dxt.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.METHOD, ElementType.FIELD })
// onde pode ser utilizado: num metodo ou campo
@Retention(RetentionPolicy.RUNTIME)
// em qual tempo vai ser executado
@Constraint(validatedBy = CPFHibernateValidator.class)
@Documented
public @interface CPF {
	String message() default "{br.dxt.validator.CPF.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
