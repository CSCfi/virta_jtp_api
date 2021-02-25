package fi.csc.virta.julkaisut.oai;

import com.lyncode.xoai.dataprovider.core.DeleteMethod;
import com.lyncode.xoai.dataprovider.core.Granularity;
import com.lyncode.xoai.dataprovider.services.api.RepositoryConfiguration;
import java.util.ArrayList;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class JulkaisuRepositoryConfiguration implements RepositoryConfiguration {

    public static final String REPOSITORY_NAME = "repository.name";
    public static final String ADMIN_EMAILS = "admin.emails";
    public static final String BASEURL = "baseurl";
    public static final String DEFAULT_NAME = "OAI 2.0 Repository";
    public static final String DESCRIPTIONS = "descriptions";
    private String baseUrl;
    private Configuration config;

    public JulkaisuRepositoryConfiguration(String baseUrl, Configuration config) {
        this.baseUrl = baseUrl;
        this.config = config;
    }

    @Override
    public String getRepositoryName() {
        String name = config.getString(REPOSITORY_NAME, DEFAULT_NAME);
        return StringUtils.isEmpty(name) ? DEFAULT_NAME : name;
    }

    @Override
    public List<String> getAdminEmails() {
        String[] emails = config.getStringArray(ADMIN_EMAILS);
        if (emails.length < 1) {
            emails = new String[]{""};
        }
        return Arrays.asList(emails);
    }

    @Override
    public String getBaseUrl() {
        String url = config.getString(BASEURL, baseUrl);
        return StringUtils.isEmpty(url) ? baseUrl : url;
    }

    @Override
    public Date getEarliestDate() {
        return new Date();
    }

    @Override
    public DeleteMethod getDeleteMethod() {
        return DeleteMethod.NO;
    }

    @Override
    public Granularity getGranularity() {
        return Granularity.Day;
    }

    @Override
    public List<String> getDescription() {
        String[] descriptions = config.getStringArray(DESCRIPTIONS);
        if (descriptions.length < 1) {
            return null;
        }
        return Arrays.asList(descriptions);


        //return null;
    }
}
