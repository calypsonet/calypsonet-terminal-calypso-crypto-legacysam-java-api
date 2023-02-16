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

/**
 * Transaction manager dedicated to write operations.
 *
 * @param <T> The type of the lowest level child object.
 * @since 0.2.0
 */
public interface LSWriteTransactionManager<T extends LSWriteTransactionManager<T>>
    extends LSTransactionManager<T> {

  /**
   * Schedules the execution of a <b>Write Ceilings</b> command to write a single counter ceiling.
   *
   * <p>Warning: in the case of an asynchronous transaction the content of the {@link LegacySam}
   * object will not be updated.
   *
   * @param counterNumber The number of the counter whose ceiling is to be written (in range
   *     [0..26]).
   * @param ceilingValue The desired value for the ceiling. The ceiling value is defined as a
   *     positive integer less than or equal to 16777210 (in hexadecimal: FFFFFAh).
   * @return The current instance.
   * @throws IllegalArgumentException If one of the provided argument is out of range.
   * @since 0.2.0
   */
  T prepareWriteCounterCeiling(int counterNumber, int ceilingValue);

  /**
   * Schedules the execution of a <b>Write Ceilings</b> command to write a counter ceiling and its
   * free incrementation configuration.
   *
   * <p>Note: as this command generates the writing of a full record corresponding to 9 counters, it
   * is necessary either to have read the status of the counters beforehand, or to have called this
   * method for each of the 8 other counters of the same record. Otherwise, an exception will be
   * raised when processing the command.
   *
   * <p>Warning: in the case of an asynchronous transaction the content of the {@link LegacySam}
   * object will not be updated.
   *
   * @param counterNumber The number of the counter whose ceiling is to be written (in range
   *     [0..26]).
   * @param ceilingValue The desired value for the ceiling. The ceiling value is defined as a
   *     positive integer less than or equal to 16777210 (in hexadecimal: FFFFFAh).
   * @param isManualCounterIncrementAuthorized true to authorize the free counter incrementation.
   * @return The current instance.
   * @throws IllegalArgumentException If one of the provided argument is out of range.
   * @since 0.2.0
   */
  T prepareWriteCounterConfiguration(
      int counterNumber, int ceilingValue, boolean isManualCounterIncrementAuthorized);
}
