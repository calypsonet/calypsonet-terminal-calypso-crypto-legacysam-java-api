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

/**
 * Factory of {@link LSSecuritySetting} to be used by transaction managers performing secure
 * operations with a control SAM.
 *
 * @since 0.2.0
 */
public interface LSSecuritySettingFactory {

  /**
   * Returns a new instance of {@link LSSecuritySetting}.
   *
   * @return A not null reference.
   * @since 0.2.0
   */
  LSSecuritySetting createSecuritySetting();
}
