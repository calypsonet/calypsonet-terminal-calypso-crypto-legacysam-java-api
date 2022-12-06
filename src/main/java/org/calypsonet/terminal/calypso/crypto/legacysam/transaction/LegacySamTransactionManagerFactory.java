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

import org.calypsonet.terminal.calypso.crypto.legacysam.sam.LegacySam;
import org.calypsonet.terminal.reader.CardReader;

/**
 * Factory of all SAM transaction managers.
 *
 * @since 0.1.0
 */
public interface LegacySamTransactionManagerFactory {

  /**
   * Creates an instance of {@link LegacySamFreeTransactionManager}
   *
   * @param samReader The reader to use to communicate with the SAM.
   * @param sam The SAM image.
   * @return A new instance of {@link LegacySamFreeTransactionManager}.
   * @throws IllegalArgumentException If one the arguments is null.
   * @since 0.1.0
   */
  LegacySamFreeTransactionManager createFreeTransactionManager(CardReader samReader, LegacySam sam);
}
