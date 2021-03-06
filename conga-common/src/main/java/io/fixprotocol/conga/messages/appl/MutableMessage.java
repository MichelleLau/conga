/*
 * Copyright 2018 FIX Protocol Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package io.fixprotocol.conga.messages.appl;

import java.nio.ByteBuffer;

/**
 * A message structure to populate
 * 
 * @author Don Mendelson
 *
 */
public interface MutableMessage extends Message {

  /**
   * Release the underlying buffer and any other resources
   */
  void release();



  /**
   * The originator of this Message, e.g. session, firm or user ID
   * 
   * @param source ID of the Message originator
   */
  void setSource(String source);


  /**
   * Returns a buffer suitable for transmission
   * 
   * @return a populated buffer
   */
  ByteBuffer toBuffer();
}
