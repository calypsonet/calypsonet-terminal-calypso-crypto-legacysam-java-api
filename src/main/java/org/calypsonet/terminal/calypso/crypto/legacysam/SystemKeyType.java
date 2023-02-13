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
package org.calypsonet.terminal.calypso.crypto.legacysam;

/**
 * Enumeration of the system key types of a Legacy Sam.
 *
 * <p>Each type corresponds to a specific use.
 *
 * @since 0.2.0
 */
public enum SystemKeyType {
  /**
   * Personalization key, to decipher and authorize the writing of parameters and system keys.
   *
   * @since 0.2.0
   */
  PERSONALIZATION,
  /**
   * Work file key, to decipher and authorize the writing of work keys.
   *
   * @since 0.2.0
   */
  KEY_MANAGEMENT,
  /**
   * Reloading key, to decipher and authorize the writing of counter ceilings.
   *
   * @since 0.2.0
   */
  RELOADING,
  /**
   * Authentication key, to generate the signature of data read from the SAM.
   *
   * @since 0.2.0
   */
  AUTHENTICATION,
}
