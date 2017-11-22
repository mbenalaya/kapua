/*******************************************************************************
 * Copyright (c) 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.commons.event.module;

import org.eclipse.kapua.service.event.ServiceEventBusListener;

public class ServiceEventListenerConfiguration {

    private String address;
    private String subscriberName;
    private ServiceEventBusListener eventListener;

    public ServiceEventListenerConfiguration(String address, String subscriberName, ServiceEventBusListener eventListener) {
        this.address = address;
        this.subscriberName = subscriberName;
        this.eventListener = eventListener;
    }

    public String getAddress() {
        return address;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public ServiceEventBusListener getEventListener() {
        return eventListener;
    }
}
