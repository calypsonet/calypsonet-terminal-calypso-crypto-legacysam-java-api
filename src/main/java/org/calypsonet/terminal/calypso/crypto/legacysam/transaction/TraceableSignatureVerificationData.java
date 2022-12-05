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

import org.calypsonet.terminal.calypso.crypto.legacysam.spi.LegacySamRevocationServiceSpi;

/**
 * Contains the input/output data of the {@link
 * LegacySamFreeTransactionManager#prepareVerifySignature(CommonSignatureVerificationData)} method
 * for traceable signature verification using the "PSO Verify Signature" SAM command.
 *
 * @since 0.1.0
 */
public interface TraceableSignatureVerificationData
    extends CommonSignatureVerificationData<TraceableSignatureVerificationData> {

  /**
   * Indicates that the signature has been computed in "SAM traceability" mode and therefore whether
   * the revocation status of the signing SAM should be checked or not.
   *
   * <p>By default, the signature is not supposed to have been computed in "SAM traceability" mode.
   *
   * @param offset The offset in bits of the SAM traceability data.
   * @param isPartialSamSerialNumber True if only the 3 LSBytes of the SAM serial number have been
   *     used.
   * @param samRevocationService If it is provided, then the revocation status of the SAM that
   *     signed the data will be checked by the SAM revocation service.
   * @return The current instance.
   * @see TraceableSignatureComputationData#withSamTraceabilityMode(int, boolean)
   * @see LegacySamFreeTransactionManager
   * @since 0.1.0
   */
  TraceableSignatureVerificationData withSamTraceabilityMode(
      int offset,
      boolean isPartialSamSerialNumber,
      LegacySamRevocationServiceSpi samRevocationService);

  /**
   * Indicates that the signature has been computed in non "Busy" mode.
   *
   * <p>By default, the signature is supposed to have been computed in "Busy" mode.
   *
   * <p>The signature may have been generated with "Busy mode" enabled. In this mode, after a "PSO
   * Verify Signature" failing because of an incorrect signature, during a few seconds the SAM
   * rejects any "PSO Verify Signature" commands with "Busy" mode by responding with the "busy"
   * status word.
   *
   * <p>When a "PSO Verify Signature" fails with the busy status, the terminal should repeat the
   * command until the SAM is not busy anymore.
   *
   * <p>The busy mode duration is typically of a few seconds, and it is never of greater than ten
   * seconds.
   *
   * <p>Note that after a reset of the SAM, "PSO Verify Signature" commands being in "Busy" mode
   * fail with the busy status until the end of the busy mode duration.
   *
   * @return The current instance.
   * @see TraceableSignatureComputationData#withoutBusyMode()
   * @since 0.1.0
   */
  TraceableSignatureVerificationData withoutBusyMode();
}
