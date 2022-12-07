/* **************************************************************************************
 * Copyright (c) 2022 Calypso Networks Association https://calypsonet.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ************************************************************************************** */
package org.calypsonet.terminal.calypso.crypto.legacysam.transaction;

/**
 * Indicates the detection of inconsistent data related to one of the following cases:
 *
 * <ul>
 *   <li>A de-synchronization of the APDU exchanges. This means that the number of APDU responses is
 *       different from the number of APDU requests.
 *   <li>An inconsistency in the card data. This can happen, for example, if the data read in
 *       session is different from the data read outside the session.
 * </ul>
 *
 * @since 0.1.0
 */
public class InconsistentDataException extends RuntimeException {

  /**
   * @param message The message to identify the exception context.
   * @since 0.1.0
   */
  public InconsistentDataException(String message) {
    super(message);
  }
}
