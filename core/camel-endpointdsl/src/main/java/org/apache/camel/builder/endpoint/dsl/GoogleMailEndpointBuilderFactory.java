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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The google-mail component provides access to Google Mail.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleMailEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Google Mail component.
     */
    public interface GoogleMailEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGoogleMailEndpointConsumerBuilder advanced() {
            return (AdvancedGoogleMailEndpointConsumerBuilder) this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointConsumerBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Google mail application name. Example would be camel-google-mail/1.0.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointConsumerBuilder applicationName(
                String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * Client ID of the mail application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointConsumerBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client secret of the mail application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointConsumerBuilder clientSecret(
                String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointConsumerBuilder inBody(String inBody) {
            doSetProperty("inBody", inBody);
            return this;
        }
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointConsumerBuilder refreshToken(
                String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
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
         * Group: consumer
         */
        default GoogleMailEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default GoogleMailEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Google Mail component.
     */
    public interface AdvancedGoogleMailEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default GoogleMailEndpointConsumerBuilder basic() {
            return (GoogleMailEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGoogleMailEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGoogleMailEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGoogleMailEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGoogleMailEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Google Mail component.
     */
    public interface GoogleMailEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGoogleMailEndpointProducerBuilder advanced() {
            return (AdvancedGoogleMailEndpointProducerBuilder) this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointProducerBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Google mail application name. Example would be camel-google-mail/1.0.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointProducerBuilder applicationName(
                String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * Client ID of the mail application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointProducerBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client secret of the mail application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointProducerBuilder clientSecret(
                String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointProducerBuilder inBody(String inBody) {
            doSetProperty("inBody", inBody);
            return this;
        }
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointProducerBuilder refreshToken(
                String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
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
         * Group: producer
         */
        default GoogleMailEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default GoogleMailEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Google Mail component.
     */
    public interface AdvancedGoogleMailEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default GoogleMailEndpointProducerBuilder basic() {
            return (GoogleMailEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Google Mail component.
     */
    public interface GoogleMailEndpointBuilder
            extends
                GoogleMailEndpointConsumerBuilder, GoogleMailEndpointProducerBuilder {
        default AdvancedGoogleMailEndpointBuilder advanced() {
            return (AdvancedGoogleMailEndpointBuilder) this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Google mail application name. Example would be camel-google-mail/1.0.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointBuilder applicationName(String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * Client ID of the mail application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client secret of the mail application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointBuilder clientSecret(String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointBuilder inBody(String inBody) {
            doSetProperty("inBody", inBody);
            return this;
        }
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleMailEndpointBuilder refreshToken(String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google Mail component.
     */
    public interface AdvancedGoogleMailEndpointBuilder
            extends
                AdvancedGoogleMailEndpointConsumerBuilder, AdvancedGoogleMailEndpointProducerBuilder {
        default GoogleMailEndpointBuilder basic() {
            return (GoogleMailEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleMailEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Google Mail (camel-google-mail)
     * The google-mail component provides access to Google Mail.
     * 
     * Category: api,cloud,mail
     * Available as of version: 2.15
     * Maven coordinates: org.apache.camel:camel-google-mail
     * 
     * Syntax: <code>google-mail:apiName/methodName</code>
     * 
     * Path parameter: apiName (required)
     * What kind of operation to perform
     * The value can be one of: THREADS, MESSAGES, ATTACHMENTS, LABELS, HISTORY,
     * DRAFTS, USERS
     * 
     * Path parameter: methodName (required)
     * What sub operation to use for the selected operation
     * The value can be one of: attachments, create, delete, get, getProfile,
     * gmailImport, insert, list, modify, patch, send, trash, untrash, update
     */
    default GoogleMailEndpointBuilder googleMail(String path) {
        class GoogleMailEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleMailEndpointBuilder, AdvancedGoogleMailEndpointBuilder {
            public GoogleMailEndpointBuilderImpl(String path) {
                super("google-mail", path);
            }
        }
        return new GoogleMailEndpointBuilderImpl(path);
    }
}