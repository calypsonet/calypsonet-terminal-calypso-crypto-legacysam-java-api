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
public interface LSTransactionManagerFactory {

  /**
   * Creates an instance of {@link LSFreeTransactionManager}.
   *
   * @param samReader The reader to use to communicate with the SAM.
   * @param sam The SAM image.
   * @return A new instance of {@link LSFreeTransactionManager}.
   * @throws IllegalArgumentException If an argument is null.
   * @since 0.1.0
   */
  LSFreeTransactionManager createFreeTransactionManager(CardReader samReader, LegacySam sam);

  /**
   * Creates an instance of {@link LSAsyncTransactionCreatorManager}.
   *
   * <p>The target SAM context can be retrieved with the method {@link
   * LSFreeTransactionManager#exportTargetSamContextForAsyncTransaction()}.
   *
   * @param targetSamContext The target SAM context.
   * @param securitySetting The security settings.
   * @return A new instance of {@link LSAsyncTransactionCreatorManager}.
   * @throws IllegalArgumentException If an argument is null.
   * @see LSFreeTransactionManager#exportTargetSamContextForAsyncTransaction()
   * @since 0.2.0
   */
  LSAsyncTransactionCreatorManager createAsyncTransactionCreatorManager(
      String targetSamContext, LSSecuritySetting securitySetting);

  /**
   * Creates an instance of {@link LSAsyncTransactionExecutorManager}.
   *
   * <p>The SAM commands must be prepared using a {@link LSAsyncTransactionCreatorManager}.
   *
   * @param samReader The reader to use to communicate with the SAM.
   * @param sam The SAM image.
   * @param samCommands A string containing the prepared commands.
   * @return A new instance of {@link LSAsyncTransactionExecutorManager}.
   * @throws IllegalArgumentException If an argument is null.
   * @see LSAsyncTransactionCreatorManager
   * @since 0.2.0
   */
  LSAsyncTransactionExecutorManager createAsyncTransactionExecutorManager(
      CardReader samReader, LegacySam sam, String samCommands);
}
