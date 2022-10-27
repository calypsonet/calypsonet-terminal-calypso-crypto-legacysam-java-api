/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://calypsonet.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ************************************************************************************** */
package org.calypsonet.terminal.calypso.crypto.legacysam;

import java.util.SortedMap;
import org.calypsonet.terminal.calypso.sam.CalypsoSam;

/**
 * A static and partial view of the legacy SAM's content.
 *
 * @since 0.1.0
 */
public interface LegacySam extends CalypsoSam {

  /**
   * Returns the value of an event counter.
   *
   * @param eventCounterNumber The number of the event counter (in range [0..26]).
   * @return null if the event counter value is not set.
   * @since 0.1.0
   */
  Integer getEventCounter(int eventCounterNumber);

  /**
   * Returns the value of known event counters in a sorted map where {@code key} is the counter
   * number and {@code value} is the counter value.
   *
   * @return a not null map.
   * @since 0.1.0
   */
  SortedMap<Integer, Integer> getEventCounters();

  /**
   * Returns the value of an event ceiling.
   *
   * @param eventCeilingNumber The number of the event ceiling (in range [0..26]).
   * @return null if the event ceiling value is not set.
   * @since 0.1.0
   */
  Integer getEventCeiling(int eventCeilingNumber);

  /**
   * Returns the value of known event ceilings in a sorted map where {@code key} is the ceiling
   * number and {@code value} is the ceiling value.
   *
   * @return a not null map.
   * @since 0.1.0
   */
  SortedMap<Integer, Integer> getEventCeilings();
}
