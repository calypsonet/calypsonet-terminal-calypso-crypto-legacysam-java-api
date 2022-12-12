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

/**
 * Transaction manager dedicated to read operations.
 *
 * @param <T> The type of the lowest level child object.
 * @since 0.1.0
 */
public interface LSReadTransactionManager<T extends LSReadTransactionManager<T>>
    extends LSTransactionManager<T> {

  /**
   * Schedules the execution of a <b>Read Event Counter</b> command to read a single event counter.
   *
   * <p>Once this command is processed, the result is available in {@link LegacySam}.
   *
   * @param eventCounterNumber The number of the event counter to read (in range [0..26]).
   * @return The current instance.
   * @throws IllegalArgumentException If the provided argument is out of range.
   * @since 0.1.0
   */
  T prepareReadEventCounter(int eventCounterNumber);

  /**
   * Schedules the execution of a <b>Read Event Counter</b> command to read one or more consecutive
   * event counters.
   *
   * <p>Once this command is processed, the result is available in {@link LegacySam}.
   *
   * @param fromEventCounterNumber The number of the first event counter to read (in range [0..26]).
   * @param toEventCounterNumber The number of the last event counter to read (in range [0..26]).
   * @return The current instance.
   * @throws IllegalArgumentException If one of the provided argument is out of range.
   * @since 0.1.0
   */
  T prepareReadEventCounters(int fromEventCounterNumber, int toEventCounterNumber);

  /**
   * Schedules the execution of a <b>Read Ceilings</b> command to read a single event ceiling.
   *
   * <p>Once this command is processed, the result is available in {@link LegacySam}.
   *
   * @param eventCeilingNumber The number of the event ceiling to read (in range [0..26]).
   * @return The current instance.
   * @throws IllegalArgumentException If the provided argument is out of range.
   * @since 0.1.0
   */
  T prepareReadEventCeiling(int eventCeilingNumber);

  /**
   * Schedules the execution of a <b>Read Ceilings</b> command to read one or more consecutive event
   * ceilings.
   *
   * <p>Once this command is processed, the result is available in {@link LegacySam}.
   *
   * @param fromEventCeilingNumber The number of the first event ceiling to read (in range [0..26]).
   * @param toEventCeilingNumber The number of the last event ceiling to read (in range [0..26]).
   * @return The current instance.
   * @throws IllegalArgumentException If one of the provided argument is out of range.
   * @since 0.1.0
   */
  T prepareReadEventCeilings(int fromEventCeilingNumber, int toEventCeilingNumber);

  //  /**
  //   * Schedules the execution of a <b>Write Ceilings</b> command to write a single event ceiling.
  //   *
  //   * <p>Once this command is processed, the ceiling value available in {@link LegacySam} is
  // updated.
  //   *
  //   * @param eventCeilingNumber The number of the event ceiling to write.
  //   * @param newValue The desired value for the event ceiling (defined as a positive int {@code
  // <=}
  //   *     16777215 [FFFFFFh]).
  //   * @return The current instance.
  //   * @throws IllegalArgumentException If the provided argument is out of range.
  //   * @since 0.1.0
  //   */
  //  T prepareWriteEventCeiling(int eventCeilingNumber, int newValue);
  //
  //  /**
  //   * Schedules the execution of a <b>Write Ceilings</b> command to write multiple event
  // ceilings.
  //   *
  //   * <p>Once this command is processed, the ceiling values available in {@link LegacySam} are
  //   * updated.
  //   *
  //   * @param fromEventCeilingNumber The number of the first event ceiling to write.
  //   * @param newValues A list of event ceilings values to be written from the indicated position
  //   *     (each event ceiling value is defined as a positive int {@code <=} 16777215 [FFFFFFh]).
  //   * @return The current instance.
  //   * @throws IllegalArgumentException If one of the provided argument is out of range.
  //   * @since 0.1.0
  //   */
  //  T prepareWriteEventCeilings(int fromEventCeilingNumber, List<Integer> newValues);
}
