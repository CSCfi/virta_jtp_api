package fi.csc.virta.julkaisut.annotation;

import javax.ws.rs.NameBinding;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for organization restricted methods.
 * Restriction check is performed in {@link fi.csc.virta.julkaisut.filter.OrganizationRestrictedFilter}.
 */
@NameBinding
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OrganizationRestricted {
}
