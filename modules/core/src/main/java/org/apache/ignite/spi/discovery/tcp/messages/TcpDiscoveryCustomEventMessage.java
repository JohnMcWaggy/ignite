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

package org.apache.ignite.spi.discovery.tcp.messages;

import org.apache.ignite.internal.util.typedef.internal.*;

import java.util.*;

/**
 * Wrapped for custom message.
 */
@TcpDiscoveryEnsureDelivery
public class TcpDiscoveryCustomEventMessage extends TcpDiscoveryAbstractMessage {
    /** */
    private static final long serialVersionUID = 0L;

    /** */
    private final byte[] msgBytes;

    /**
     * @param creatorNodeId Creator node id.
     * @param msgBytes Serialized message.
     */
    public TcpDiscoveryCustomEventMessage(UUID creatorNodeId, byte[] msgBytes) {
        super(creatorNodeId);

        this.msgBytes = msgBytes;
    }

    /**
     * @return Serialized message.
     */
    public byte[] messageBytes() {
        return msgBytes;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return S.toString(TcpDiscoveryCustomEventMessage.class, this, "super", super.toString());
    }
}
