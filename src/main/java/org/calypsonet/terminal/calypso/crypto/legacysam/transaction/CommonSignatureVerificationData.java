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
 * Contains the input/output data of the {@link
 * LSFreeTransactionManager#prepareVerifySignature(CommonSignatureVerificationData)} method for
 * common signature verification modes.
 *
 * @param <T> The type of the lowest level child object.
 * @since 0.1.0
 */
public interface CommonSignatureVerificationData<T extends CommonSignatureVerificationData<T>> {

  /**
   * Sets the signed data, the associated signature and the KIF/KVC of the key to be used for the
   * signature verification.
   *
   * @param data The signed data.
   * @param signature The associated signature.
   * @param kif The KIF of the key to be used for the signature verification.
   * @param kvc The KVC of the key to be used for the signature verification.
   * @return The current instance.
   * @since 0.1.0
   */
  T setData(byte[] data, byte[] signature, byte kif, byte kvc);

  /**
   * Sets a specific key diversifier to use before verifying the signature (optional).
   *
   * <p>By default, the key diversification is performed with the full serial number of the target
   * card or SAM depending on the transaction context (Card or SAM transaction).
   *
   * @param diversifier The diversifier to be used (from 1 to 8 bytes long).
   * @return The current instance.
   * @since 0.1.0
   */
  T setKeyDiversifier(byte[] diversifier);

  /**
   * Returns the result of the signature verification process by indicating if the signature is
   * valid or not.
   *
   * @return True if the signature is valid.
   * @throws IllegalStateException If the command has not yet been processed.
   * @since 0.1.0
   */
  boolean isSignatureValid();
}
