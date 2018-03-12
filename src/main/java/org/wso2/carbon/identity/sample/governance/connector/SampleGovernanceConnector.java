package org.wso2.carbon.identity.sample.governance.connector;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.governance.IdentityGovernanceException;
import org.wso2.carbon.identity.governance.common.IdentityConnectorConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class SampleGovernanceConnector implements IdentityConnectorConfig {

    private static final Log log = LogFactory.getLog(SampleGovernanceConnector.class);

    @Override
    public String getName() {
        return "Sample_Connector";
    }

    @Override
    public String getFriendlyName() {
        return "Sample Connector";
    }

    @Override
    public String getCategory() {
        return "Account Management Policies";
    }

    @Override
    public String getSubCategory() {
        return "DEFAULT";
    }

    @Override
    public int getOrder() {
        return 0;
    }

    @Override
    public Map<String, String> getPropertyNameMapping() {
        Map<String, String> nameMapping = new HashMap();
        nameMapping.put(SampleGovernanceConnectorConstants.SAMPLE_CONNECTOR_ENABLE, "Enable Sample Connector");
        nameMapping.put(SampleGovernanceConnectorConstants.SAMPLE_CONNECTOR_VALUE, "Sample Connector Value");
        return nameMapping;
    }

    @Override
    public Map<String, String> getPropertyDescriptionMapping() {
        Map<String, String> descriptionMapping = new HashMap();
        descriptionMapping.put(SampleGovernanceConnectorConstants.SAMPLE_CONNECTOR_ENABLE, "Enable Sample Connector");
        descriptionMapping.put(SampleGovernanceConnectorConstants.SAMPLE_CONNECTOR_VALUE, "Sample Connector Value");
        return descriptionMapping;
    }

    @Override
    public String[] getPropertyNames() {
        List<String> properties = new ArrayList();
        properties.add(SampleGovernanceConnectorConstants.SAMPLE_CONNECTOR_ENABLE);
        properties.add(SampleGovernanceConnectorConstants.SAMPLE_CONNECTOR_VALUE);
        return properties.toArray(new String[properties.size()]);
    }

    @Override
    public Properties getDefaultPropertyValues(String s) throws IdentityGovernanceException {
        Map<String, String> defaultProperties = new HashMap();
        defaultProperties.put(SampleGovernanceConnectorConstants.SAMPLE_CONNECTOR_ENABLE, "true");
        defaultProperties.put(SampleGovernanceConnectorConstants.SAMPLE_CONNECTOR_VALUE, "5");
        Properties properties = new Properties();
        properties.putAll(defaultProperties);
        return properties;
    }

    @Override
    public Map<String, String> getDefaultPropertyValues(String[] strings, String s) throws IdentityGovernanceException {
        return null;
    }
}
