/* **************************************************************************************
 * Copyright (c) 2023 Calypso Networks Association https://calypsonet.org/
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

import org.calypsonet.terminal.calypso.crypto.legacysam.sam.LegacySam;
import org.calypsonet.terminal.reader.CardReader;

/**
 * Data to manage the security operations of a Legacy SAM transaction.
 *
 * @since 0.2.0
 */
public interface LSSecuritySetting {

  /**
   * Defines the control SAM and the reader through which it can be accessed. It will be utilized to
   * perform all necessary cryptographic operations.
   *
   * @param samReader The reader to use to communicate with the SAM.
   * @param controlSam The control Legacy SAM.
   * @return The object instance.
   * @throws IllegalArgumentException If one of the arguments is null or if the product type of
   *     {@link LegacySam} is equal to {@link LegacySam.ProductType#UNKNOWN}.
   * @since 0.2.0
   */
  LSSecuritySetting setControlSamResource(CardReader samReader, LegacySam controlSam);
}
