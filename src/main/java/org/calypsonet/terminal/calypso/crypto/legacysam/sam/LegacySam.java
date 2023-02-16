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
package org.calypsonet.terminal.calypso.crypto.legacysam.sam;

import java.util.SortedMap;
import org.calypsonet.terminal.calypso.crypto.legacysam.SystemKeyType;
import org.calypsonet.terminal.reader.selection.spi.SmartCard;

/**
 * A partial image of the legacy SAM's content.
 *
 * @since 0.1.0
 */
public interface LegacySam extends SmartCard {

  /**
   * Returns the SAM product type.
   *
   * @return The identified product type.
   * @since 0.1.0
   */
  ProductType getProductType();

  /**
   * Returns a text description of the SAM.
   *
   * @return A not null String.
   * @since 0.1.0
   */
  String getProductInfo();

  /**
   * Returns the SAM serial number as an array of bytes
   *
   * @return A not null array of bytes
   * @since 0.1.0
   */
  byte[] getSerialNumber();

  /**
   * Returns the platform identifier
   *
   * @return A byte
   * @since 0.1.0
   */
  byte getPlatform();

  /**
   * Returns the application type
   *
   * @return A byte
   * @since 0.1.0
   */
  byte getApplicationType();

  /**
   * Returns the application subtype
   *
   * @return A byte
   * @since 0.1.0
   */
  byte getApplicationSubType();

  /**
   * Returns the software issuer identifier
   *
   * @return A byte
   * @since 0.1.0
   */
  byte getSoftwareIssuer();

  /**
   * Returns the software version number
   *
   * @return A byte
   * @since 0.1.0
   */
  byte getSoftwareVersion();

  /**
   * Returns the software revision number
   *
   * @return A byte
   * @since 0.1.0
   */
  byte getSoftwareRevision();

  /**
   * Returns the value of a counter.
   *
   * @param counterNumber The number of the counter (in range [0..26]).
   * @return Null if the counter value is not set.
   * @since 0.1.0
   */
  Integer getCounter(int counterNumber);

  /**
   * Returns the value of known counters in a sorted map where {@code key} is the counter number and
   * {@code value} is the counter value.
   *
   * @return A not null map.
   * @since 0.1.0
   */
  SortedMap<Integer, Integer> getCounters();

  /**
   * Check if manual incrementation of the counter is authorized.
   *
   * @param counterNumber The number of the counter being checked.
   * @return null if the incrementing state is unknown, true if manual incrementing is authorized,
   *     false otherwise.
   * @since 0.2.0
   */
  Boolean isManualCounterIncrementAuthorized(int counterNumber);

  /**
   * Returns the value of an counter ceiling.
   *
   * @param counterNumber The number of the counter ceiling (in range [0..26]).
   * @return Null if the counter ceiling value is not set.
   * @since 0.1.0
   */
  Integer getCounterCeiling(int counterNumber);

  /**
   * Returns the value of known counter ceilings in a sorted map where {@code key} is the ceiling
   * number and {@code value} is the ceiling value.
   *
   * @return A not null map.
   * @since 0.1.0
   */
  SortedMap<Integer, Integer> getCounterCeilings();

  /**
   * Returns the parameters of the system key whose type is provided.
   *
   * @param systemKeyType The type of system key.
   * @return null if there is no parameter available for the specified key type.
   * @since 0.2.0
   */
  KeyParameter getSystemKeyParameter(SystemKeyType systemKeyType);

  /**
   * All Calypso SAM products supported by this API.
   *
   * @since 0.1.0
   */
  enum ProductType {

    /**
     * SAM C1
     *
     * @since 0.1.0
     */
    SAM_C1,

    /**
     * SAM C1 HSM
     *
     * @since 0.1.0
     */
    HSM_C1,

    /**
     * SAM S1E1
     *
     * @since 0.1.0
     */
    SAM_S1E1,

    /**
     * SAM S1Dx
     *
     * @since 0.1.0
     */
    SAM_S1DX,

    /**
     * Unidentified smart card.
     *
     * @since 0.1.0
     */
    UNKNOWN
  }
}
