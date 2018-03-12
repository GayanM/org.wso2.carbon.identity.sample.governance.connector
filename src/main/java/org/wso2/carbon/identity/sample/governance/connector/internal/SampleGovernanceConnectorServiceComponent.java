/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations und
 */

package org.wso2.carbon.identity.sample.governance.connector.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.identity.governance.common.IdentityConnectorConfig;
import org.wso2.carbon.identity.sample.governance.connector.SampleGovernanceConnector;

/**
 * @scr.component name="sample.governance.connector"
 * immediate="true"
 */
public class SampleGovernanceConnectorServiceComponent {

    private static Log log = LogFactory.getLog(SampleGovernanceConnectorServiceComponent.class);

    protected void activate(ComponentContext context) {

        SampleGovernanceConnector sampleEventHandler = new SampleGovernanceConnector();
        context.getBundleContext().registerService(IdentityConnectorConfig.class.getName(), sampleEventHandler,
                null);

        log.info("SampleGovernanceConnectorServiceComponent is registered");

    }

    protected void deactivate(ComponentContext context) {
        log.info("SampleGovernanceConnectorServiceComponent is de-activated");

    }

}
