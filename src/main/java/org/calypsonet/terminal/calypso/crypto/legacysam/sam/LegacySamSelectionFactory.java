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

/**
 * Factory of a {@link LegacySamSelection}, a subtype of {@link
 * org.calypsonet.terminal.reader.selection.spi.CardSelection}.
 *
 * @since 0.1.0
 */
public interface LegacySamSelectionFactory {

  /**
   * Creates a new instance of {@link LegacySamSelection}.
   *
   * @return A new instance.
   * @since 0.1.0
   */
  LegacySamSelection createSamSelection();
}
