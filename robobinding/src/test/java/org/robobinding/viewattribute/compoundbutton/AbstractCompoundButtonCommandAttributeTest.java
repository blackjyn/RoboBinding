/**
 * Copyright 2011 Cheng Wei, Robert Taylor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.robobinding.viewattribute.compoundbutton;

import org.junit.Before;
import org.robobinding.viewattribute.ViewCommandAttributeTester;

import android.app.Activity;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.xtremelabs.robolectric.Robolectric;
import com.xtremelabs.robolectric.shadows.ShadowCompoundButton;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
public class AbstractCompoundButtonCommandAttributeTest
{
	protected ViewCommandAttributeTester commandAttributeTester;
	protected String commandName;
	protected ShadowCompoundButton shadowCompoundButton;
	protected CompoundButton compoundButton;

	@Before
	public void setUp()
	{
		commandAttributeTester = new ViewCommandAttributeTester();
		commandName = commandAttributeTester.commandName;
		
		compoundButton = new CheckBox(new Activity());
		
		shadowCompoundButton = Robolectric.shadowOf_(compoundButton);
	}
	
}
