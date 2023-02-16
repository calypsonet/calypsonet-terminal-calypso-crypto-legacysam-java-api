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
 * Transaction manager dedicated to operations performed asynchronously. This manager prepares
 * commands using a control SAM, and the result is available as a string to be imported and
 * processed by a {@link LSAsyncTransactionExecutorManager}.
 *
 * <p>Use the {@link LSTransactionManagerFactory#createFreeTransactionManager(CardReader,
 * LegacySam)} method to create an instance of this interface.
 *
 * @see LSTransactionManagerFactory#createAsyncTransactionCreatorManager(String, LSSecuritySetting)
 * @see LSFreeTransactionManager#exportTargetSamContextForAsyncTransaction()
 * @see LSAsyncTransactionExecutorManager
 * @since 0.2.0
 */
public interface LSAsyncTransactionCreatorManager
    extends LSWriteTransactionManager<LSAsyncTransactionCreatorManager> {

  /**
   * Returns a string containing the prepared commands to be executed by a target SAM.
   *
   * <p>These commands can later be imported and processed by a {@link
   * LSAsyncTransactionExecutorManager}.
   *
   * @return A not empty string.
   * @see LSAsyncTransactionExecutorManager
   * @since 0.2.0
   */
  String exportCommands();
}
