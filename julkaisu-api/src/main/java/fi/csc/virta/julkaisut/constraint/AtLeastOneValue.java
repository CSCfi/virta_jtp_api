package fi.csc.virta.julkaisut.constraint;

import org.apache.commons.lang3.reflect.FieldUtils;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AtLeastOneValue.Validator.class)
public @interface AtLeastOneValue {

    String message() default "At least one property should have value";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    class Validator implements ConstraintValidator<AtLeastOneValue, Object> {

        @Override
        public void initialize(AtLeastOneValue constraintAnnotation) {
        }

        @Override
        public boolean isValid(Object value, ConstraintValidatorContext context) {
            if (value == null) {
                return false;
            }
            Field[] fields = FieldUtils.getAllFields(value.getClass());
            for (Field field : fields) {
                try {
                    Object o = FieldUtils.readField(field, value);
                    if (o != null) {
                        return true;
                    }
                } catch (IllegalAccessException ignored) {}
            }
            return false;
        }
    }
}
