/*******************************************************************************
 * Copyright (c) 2011, 2011 Andrew Gvozdev and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Andrew Gvozdev - initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.internal.core.language.settings.providers;

import org.eclipse.cdt.core.settings.model.ICLanguageSettingEntry;

/**
 * Contains the details of changes that occurred as a result of modifying
 * language settings entries {@link ICLanguageSettingEntry}. The event is
 * associated with a project.
 *
 * API notes: this interface probably is not stable yet as it is not currently
 * clear how it may need to be used in future. Only bare minimum is provided
 * here at this point.
 *
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ILanguageSettingsChangeEvent {
	/**
	 * @return project name where the event occurred.
	 */
	public String getProjectName();

	/**
	 * @return configuration IDs which are affected by the language settings changes.
	 */
	public String[] getConfigurationDescriptionIds();

}
