package fi.csc.virta.julkaisut.oai;

import com.lyncode.xoai.dataprovider.data.Filter;
import com.lyncode.xoai.dataprovider.filter.conditions.AndCondition;
import com.lyncode.xoai.dataprovider.filter.conditions.NotCondition;
import com.lyncode.xoai.dataprovider.filter.conditions.OrCondition;
import com.lyncode.xoai.dataprovider.services.api.FilterResolver;
import com.lyncode.xoai.dataprovider.xml.xoaiconfig.parameters.ParameterMap;

public class JulkaisutFilterResolver implements FilterResolver {
    @Override
    public Filter getFilter(Class<? extends Filter> filterClass, ParameterMap configuration) {
        return null;
    }

    @Override
    public Filter getFilter(AndCondition andCondition) {
        return null;
    }

    @Override
    public Filter getFilter(OrCondition orCondition) {
        return null;
    }

    @Override
    public Filter getFilter(NotCondition notCondition) {
        return null;
    }
}
