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
 * The google-calendar component provides access to Google Calendar.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleCalendarEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Google Calendar component.
     */
    public interface GoogleCalendarEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGoogleCalendarEndpointConsumerBuilder advanced() {
            return (AdvancedGoogleCalendarEndpointConsumerBuilder) this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointConsumerBuilder accessToken(
                String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Google calendar application name. Example would be
         * camel-google-calendar/1.0.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointConsumerBuilder applicationName(
                String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * Client ID of the calendar application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointConsumerBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client secret of the calendar application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointConsumerBuilder clientSecret(
                String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * The emailAddress of the Google Service Account.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointConsumerBuilder emailAddress(
                String emailAddress) {
            doSetProperty("emailAddress", emailAddress);
            return this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointConsumerBuilder inBody(String inBody) {
            doSetProperty("inBody", inBody);
            return this;
        }
        /**
         * The name of the p12 file which has the private key to use with the
         * Google Service Account.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointConsumerBuilder p12FileName(
                String p12FileName) {
            doSetProperty("p12FileName", p12FileName);
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
        default GoogleCalendarEndpointConsumerBuilder refreshToken(
                String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
        /**
         * Specifies the level of permissions you want a calendar application to
         * have to a user account. You can separate multiple scopes by comma.
         * See https://developers.google.com/google-apps/calendar/auth for more
         * info.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointConsumerBuilder scopes(String scopes) {
            doSetProperty("scopes", scopes);
            return this;
        }
        /**
         * The email address of the user the application is trying to
         * impersonate in the service account flow.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointConsumerBuilder user(String user) {
            doSetProperty("user", user);
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
        default GoogleCalendarEndpointConsumerBuilder bridgeErrorHandler(
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
        default GoogleCalendarEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Google Calendar
     * component.
     */
    public interface AdvancedGoogleCalendarEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default GoogleCalendarEndpointConsumerBuilder basic() {
            return (GoogleCalendarEndpointConsumerBuilder) this;
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
        default AdvancedGoogleCalendarEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedGoogleCalendarEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedGoogleCalendarEndpointConsumerBuilder exchangePattern(
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
        default AdvancedGoogleCalendarEndpointConsumerBuilder exchangePattern(
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
        default AdvancedGoogleCalendarEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedGoogleCalendarEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedGoogleCalendarEndpointConsumerBuilder synchronous(
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
        default AdvancedGoogleCalendarEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Google Calendar component.
     */
    public interface GoogleCalendarEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGoogleCalendarEndpointProducerBuilder advanced() {
            return (AdvancedGoogleCalendarEndpointProducerBuilder) this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointProducerBuilder accessToken(
                String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Google calendar application name. Example would be
         * camel-google-calendar/1.0.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointProducerBuilder applicationName(
                String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * Client ID of the calendar application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointProducerBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client secret of the calendar application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointProducerBuilder clientSecret(
                String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * The emailAddress of the Google Service Account.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointProducerBuilder emailAddress(
                String emailAddress) {
            doSetProperty("emailAddress", emailAddress);
            return this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointProducerBuilder inBody(String inBody) {
            doSetProperty("inBody", inBody);
            return this;
        }
        /**
         * The name of the p12 file which has the private key to use with the
         * Google Service Account.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointProducerBuilder p12FileName(
                String p12FileName) {
            doSetProperty("p12FileName", p12FileName);
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
        default GoogleCalendarEndpointProducerBuilder refreshToken(
                String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
        /**
         * Specifies the level of permissions you want a calendar application to
         * have to a user account. You can separate multiple scopes by comma.
         * See https://developers.google.com/google-apps/calendar/auth for more
         * info.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointProducerBuilder scopes(String scopes) {
            doSetProperty("scopes", scopes);
            return this;
        }
        /**
         * The email address of the user the application is trying to
         * impersonate in the service account flow.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointProducerBuilder user(String user) {
            doSetProperty("user", user);
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
        default GoogleCalendarEndpointProducerBuilder lazyStartProducer(
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
        default GoogleCalendarEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Google Calendar
     * component.
     */
    public interface AdvancedGoogleCalendarEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default GoogleCalendarEndpointProducerBuilder basic() {
            return (GoogleCalendarEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleCalendarEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedGoogleCalendarEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedGoogleCalendarEndpointProducerBuilder synchronous(
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
        default AdvancedGoogleCalendarEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Google Calendar component.
     */
    public interface GoogleCalendarEndpointBuilder
            extends
                GoogleCalendarEndpointConsumerBuilder, GoogleCalendarEndpointProducerBuilder {
        default AdvancedGoogleCalendarEndpointBuilder advanced() {
            return (AdvancedGoogleCalendarEndpointBuilder) this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Google calendar application name. Example would be
         * camel-google-calendar/1.0.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointBuilder applicationName(
                String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * Client ID of the calendar application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client secret of the calendar application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointBuilder clientSecret(String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * The emailAddress of the Google Service Account.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointBuilder emailAddress(String emailAddress) {
            doSetProperty("emailAddress", emailAddress);
            return this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointBuilder inBody(String inBody) {
            doSetProperty("inBody", inBody);
            return this;
        }
        /**
         * The name of the p12 file which has the private key to use with the
         * Google Service Account.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointBuilder p12FileName(String p12FileName) {
            doSetProperty("p12FileName", p12FileName);
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
        default GoogleCalendarEndpointBuilder refreshToken(String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
        /**
         * Specifies the level of permissions you want a calendar application to
         * have to a user account. You can separate multiple scopes by comma.
         * See https://developers.google.com/google-apps/calendar/auth for more
         * info.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointBuilder scopes(String scopes) {
            doSetProperty("scopes", scopes);
            return this;
        }
        /**
         * The email address of the user the application is trying to
         * impersonate in the service account flow.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default GoogleCalendarEndpointBuilder user(String user) {
            doSetProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google Calendar component.
     */
    public interface AdvancedGoogleCalendarEndpointBuilder
            extends
                AdvancedGoogleCalendarEndpointConsumerBuilder, AdvancedGoogleCalendarEndpointProducerBuilder {
        default GoogleCalendarEndpointBuilder basic() {
            return (GoogleCalendarEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGoogleCalendarEndpointBuilder basicPropertyBinding(
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
        default AdvancedGoogleCalendarEndpointBuilder basicPropertyBinding(
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
        default AdvancedGoogleCalendarEndpointBuilder synchronous(
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
        default AdvancedGoogleCalendarEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Google Calendar (camel-google-calendar)
     * The google-calendar component provides access to Google Calendar.
     * 
     * Category: api,cloud
     * Available as of version: 2.15
     * Maven coordinates: org.apache.camel:camel-google-calendar
     * 
     * Syntax: <code>google-calendar:apiName/methodName</code>
     * 
     * Path parameter: apiName (required)
     * What kind of operation to perform
     * The value can be one of: ACL, LIST, CALENDARS, CHANNELS, COLORS,
     * FREEBUSY, EVENTS, SETTINGS
     * 
     * Path parameter: methodName (required)
     * What sub operation to use for the selected operation
     * The value can be one of: calendarImport, clear, delete, get, insert,
     * instances, list, move, patch, query, quickAdd, stop, update, watch
     */
    default GoogleCalendarEndpointBuilder googleCalendar(String path) {
        class GoogleCalendarEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleCalendarEndpointBuilder, AdvancedGoogleCalendarEndpointBuilder {
            public GoogleCalendarEndpointBuilderImpl(String path) {
                super("google-calendar", path);
            }
        }
        return new GoogleCalendarEndpointBuilderImpl(path);
    }
}