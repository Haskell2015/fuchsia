/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.google.code.cxf.protobuf;

import com.google.protobuf.Message;

/**
 * An implementor of this interface defines a strategy for dispatching incoming
 * protobuf messages to service bean methods. This is the server side
 * equivalent of {@link com.google.protobuf.RpcChannel}.
 * 
 * @author Gyorgy Orban
 */
public interface RpcDispatcher {

	Message dispatchMessage(Message message, Object serviceBean);
}
