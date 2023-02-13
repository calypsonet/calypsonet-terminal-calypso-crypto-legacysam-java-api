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

import org.calypsonet.terminal.calypso.crypto.legacysam.SystemKeyType;
import org.calypsonet.terminal.calypso.crypto.legacysam.sam.LegacySam;

/**
 * Transaction manager dedicated to read operations.
 *
 * @param <T> The type of the lowest level child object.
 * @since 0.1.0
 */
public interface LSReadTransactionManager<T extends LSReadTransactionManager<T>>
    extends LSTransactionManager<T> {

  /**
   * Schedules the execution of a <b>Read Key Parameters</b> command for a system key.
   *
   * <p>Once this command is processed, the result is accessible with {@link
   * LegacySam#getSystemKeyParameter(SystemKeyType)}.
   *
   * @param systemKeyType The type of system key.
   * @return The current instance.
   * @throws IllegalArgumentException If the provided argument is null.
   * @since 0.2.0
   */
  T prepareReadSystemKeyParameters(SystemKeyType systemKeyType);

  /**
   * Schedules the execution of a <b>Read Event Counter</b> and <b>Read Ceiling</b> commands to read
   * the status of a counter.
   *
   * <p>Note: the status of each counter of the record to which the targeted counter belongs will be
   * read. The number of commands actually transmitted to the SAM will be optimized when the {@link
   * #processCommands()} method is executed.
   *
   * <p>Once this command is processed, the result is available in {@link LegacySam}.
   *
   * @param counterNumber The number of the counter whose status is to be read (in range [0..26]).
   * @return The current instance.
   * @throws IllegalArgumentException If the provided argument is out of range.
   * @since 0.2.0
   */
  T prepareReadCounterStatus(int counterNumber);

  /**
   * Schedules the execution of a <b>Read Event Counter</b> and <b>Read Ceiling</b> commands to read
   * the status of all counters.
   *
   * <p>Once this command is processed, the result is available in {@link LegacySam}.
   *
   * @return The current instance.
   * @since 0.2.0
   */
  T prepareReadAllCountersStatus();
}
