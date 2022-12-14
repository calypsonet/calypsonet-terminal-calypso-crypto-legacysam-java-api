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
 * Factory of all input/output data of complex commands.
 *
 * @since 0.1.0
 */
public interface LSCommandDataFactory {

  /**
   * Creates a new instance of {@link BasicSignatureComputationData}.
   *
   * @return A new instance.
   * @see LSFreeTransactionManager#prepareComputeSignature(CommonSignatureComputationData)
   * @since 0.1.0
   */
  BasicSignatureComputationData createBasicSignatureComputationData();

  /**
   * Creates a new instance of {@link TraceableSignatureComputationData}.
   *
   * @return A new instance.
   * @see LSFreeTransactionManager#prepareComputeSignature(CommonSignatureComputationData)
   * @since 0.1.0
   */
  TraceableSignatureComputationData createTraceableSignatureComputationData();

  /**
   * Creates a new instance of {@link BasicSignatureVerificationData}.
   *
   * @return A new instance.
   * @see LSFreeTransactionManager#prepareVerifySignature(CommonSignatureVerificationData)
   * @since 0.1.0
   */
  BasicSignatureVerificationData createBasicSignatureVerificationData();

  /**
   * Creates a new instance of {@link TraceableSignatureVerificationData}.
   *
   * @return A new instance.
   * @see LSFreeTransactionManager#prepareVerifySignature(CommonSignatureVerificationData)
   * @since 0.1.0
   */
  TraceableSignatureVerificationData createTraceableSignatureVerificationData();
}
