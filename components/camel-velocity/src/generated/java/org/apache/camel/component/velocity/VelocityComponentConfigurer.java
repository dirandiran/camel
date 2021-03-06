/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.velocity;

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
public class VelocityComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        VelocityComponent target = (VelocityComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": target.setAllowTemplateFromHeader(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "velocityengine":
        case "velocityEngine": target.setVelocityEngine(property(camelContext, org.apache.velocity.app.VelocityEngine.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("allowTemplateFromHeader", boolean.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("velocityEngine", org.apache.velocity.app.VelocityEngine.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        VelocityComponent target = (VelocityComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowtemplatefromheader":
        case "allowTemplateFromHeader": return target.isAllowTemplateFromHeader();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "velocityengine":
        case "velocityEngine": return target.getVelocityEngine();
        default: return null;
        }
    }
}

