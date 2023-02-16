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
import org.calypsonet.terminal.reader.CardReader;

/**
 * Transaction manager dedicated to execute commands prepared asynchronously using {@link
 * LSAsyncTransactionCreatorManager#exportCommands()}.
 *
 * <p>Use the {@link LSTransactionManagerFactory#createAsyncTransactionExecutorManager(CardReader,
 * LegacySam, String)} method to create an instance of this transaction manager.
 *
 * @see LSTransactionManagerFactory#createAsyncTransactionExecutorManager(CardReader, LegacySam,
 *     String)
 * @see LSFreeTransactionManager#exportTargetSamContextForAsyncTransaction()
 * @see LSAsyncTransactionCreatorManager
 * @since 0.2.0
 */
public interface LSAsyncTransactionExecutorManager
    extends LSTransactionManager<LSAsyncTransactionExecutorManager> {}
