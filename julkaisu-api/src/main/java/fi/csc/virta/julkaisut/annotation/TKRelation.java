package fi.csc.virta.julkaisut.annotation;

import fi.csc.virta.julkaisut.domain.BaseTK;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TKRelation {
    Class<? extends BaseTK> type();
}
