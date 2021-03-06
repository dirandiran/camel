/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.guava.eventbus.GuavaEventBusComponent;

/**
 * Send and receive messages to/from Guava EventBus.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface GuavaEventbusComponentBuilderFactory {

    /**
     * Guava EventBus (camel-guava-eventbus)
     * Send and receive messages to/from Guava EventBus.
     * 
     * Category: eventbus
     * Since: 2.10
     * Maven coordinates: org.apache.camel:camel-guava-eventbus
     */
    static GuavaEventbusComponentBuilder guavaEventbus() {
        return new GuavaEventbusComponentBuilderImpl();
    }

    /**
     * Builder for the Guava EventBus component.
     */
    interface GuavaEventbusComponentBuilder
            extends
                ComponentBuilder<GuavaEventBusComponent> {
        /**
         * To use the given Guava EventBus instance.
         * 
         * The option is a: <code>com.google.common.eventbus.EventBus</code>
         * type.
         * 
         * Group: common
         */
        default GuavaEventbusComponentBuilder eventBus(
                com.google.common.eventbus.EventBus eventBus) {
            doSetProperty("eventBus", eventBus);
            return this;
        }
        /**
         * The interface with method(s) marked with the Subscribe annotation.
         * Dynamic proxy will be created over the interface so it could be
         * registered as the EventBus listener. Particularly useful when
         * creating multi-event listeners and for handling DeadEvent properly.
         * This option cannot be used together with eventClass option.
         * 
         * The option is a: <code>java.lang.Class<java.lang.Object></code> type.
         * 
         * Group: common
         */
        default GuavaEventbusComponentBuilder listenerInterface(
                java.lang.Class<java.lang.Object> listenerInterface) {
            doSetProperty("listenerInterface", listenerInterface);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GuavaEventbusComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default GuavaEventbusComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default GuavaEventbusComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class GuavaEventbusComponentBuilderImpl
            extends
                AbstractComponentBuilder<GuavaEventBusComponent>
            implements
                GuavaEventbusComponentBuilder {
        @Override
        protected GuavaEventBusComponent buildConcreteComponent() {
            return new GuavaEventBusComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "eventBus": ((GuavaEventBusComponent) component).setEventBus((com.google.common.eventbus.EventBus) value); return true;
            case "listenerInterface": ((GuavaEventBusComponent) component).setListenerInterface((java.lang.Class) value); return true;
            case "bridgeErrorHandler": ((GuavaEventBusComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((GuavaEventBusComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((GuavaEventBusComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}