package fi.csc.virta.julkaisut.provider;

import fi.csc.virta.julkaisut.annotation.OrganizationRestricted;
import fi.csc.virta.julkaisut.filter.OrganizationRestrictedFilter;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;
import java.lang.reflect.Method;

/**
 * Creates dynamic binding for all methods with decorated with
 * {@link fi.csc.virta.julkaisut.annotation.OrganizationRestricted} annotation.
 */
@Provider
public class OrganizationRestrictedFeature implements DynamicFeature {
    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext context) {
        final Method resourceMethod = resourceInfo.getResourceMethod();
        if (!resourceMethod.isAnnotationPresent(OrganizationRestricted.class)) {
            return;
        }
        context.register(OrganizationRestrictedFilter.class);
    }
}
