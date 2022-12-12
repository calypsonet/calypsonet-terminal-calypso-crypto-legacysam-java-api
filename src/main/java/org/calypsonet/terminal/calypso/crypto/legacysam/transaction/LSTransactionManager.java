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
 * Common API for all legacy SAM transaction managers.
 *
 * @param <T> The type of the lowest level child object.
 * @since 0.1.0
 */
public interface LSTransactionManager<T extends LSTransactionManager<T>> {

  /**
   * Process all previously prepared commands.
   *
   * @return The current instance.
   * @throws ReaderIOException If a communication error with the card reader or SAM reader occurs.
   * @throws SamIOException If a communication error with the SAM occurs.
   * @throws InvalidSignatureException If a signature associated to a prepared signature
   *     verification SAM command is invalid.
   * @throws UnexpectedCommandStatusException If a command returns an unexpected status.
   * @throws InconsistentDataException If inconsistent data have been detected.
   * @since 0.1.0
   */
  T processCommands();
}
