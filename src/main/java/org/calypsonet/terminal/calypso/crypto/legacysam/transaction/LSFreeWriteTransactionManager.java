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
 * Transaction manager dedicated to free write operations.
 *
 * @param <T> The type of the lowest level child object.
 * @since 0.1.0
 */
public interface LSFreeWriteTransactionManager<T extends LSFreeWriteTransactionManager<T>>
    extends LSTransactionManager<T> {}
