/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.spring.batch;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SpringBatchEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SpringBatchEndpoint target = (SpringBatchEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "jobfromheader":
        case "jobFromHeader": target.setJobFromHeader(property(camelContext, boolean.class, value)); return true;
        case "joblauncher":
        case "jobLauncher": target.setJobLauncher(property(camelContext, org.springframework.batch.core.launch.JobLauncher.class, value)); return true;
        case "jobregistry":
        case "jobRegistry": target.setJobRegistry(property(camelContext, org.springframework.batch.core.configuration.JobRegistry.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("jobFromHeader", boolean.class);
        answer.put("jobLauncher", org.springframework.batch.core.launch.JobLauncher.class);
        answer.put("jobRegistry", org.springframework.batch.core.configuration.JobRegistry.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SpringBatchEndpoint target = (SpringBatchEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "jobfromheader":
        case "jobFromHeader": return target.isJobFromHeader();
        case "joblauncher":
        case "jobLauncher": return target.getJobLauncher();
        case "jobregistry":
        case "jobRegistry": return target.getJobRegistry();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

