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
 * basic signature verification using the "Data Cipher" SAM command.
 *
 * <p>Use method {@link LSCommandDataFactory#createBasicSignatureVerificationData()} to create an
 * instance of this object.
 *
 * @since 0.1.0
 */
public interface BasicSignatureVerificationData
    extends CommonSignatureVerificationData<BasicSignatureVerificationData> {}
