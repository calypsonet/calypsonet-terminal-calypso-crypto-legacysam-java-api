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
package org.calypsonet.terminal.calypso.crypto.legacysam.sam;

/**
 * This POJO holds the parameters for a key managed by SAM, whether it's a system key or a work key.
 *
 * @since 0.2.0
 */
public interface KeyParameter {

  /**
   * Gets the raw data of the key's parameters.
   *
   * @return a byte array of 13 bytes representing the key's parameters, including KIF, KVC,
   *     algorithm, and PAR1 to PAR10.
   * @since 0.2.0
   */
  byte[] getRawData();

  /**
   * Returns the key identifier (KIF).
   *
   * @return The KIF value.
   * @since 0.2.0
   */
  byte getKif();

  /**
   * Returns the key version (KVC).
   *
   * @return The KVC value.
   * @since 0.2.0
   */
  byte getKvc();

  /**
   * Returns the key algorithm.
   *
   * @return The algorithm identification byte.
   * @since 0.2.0
   */
  byte getAlgorithm();

  /**
   * Returns the value of the parameter whose number is provided.
   *
   * @param parameterNumber The number of the parameter to get (in range [1..10])
   * @return The parameter value.
   * @throws IllegalArgumentException If the argument is out of range.
   * @since 0.2.0
   */
  byte getParameterValue(int parameterNumber);
}
