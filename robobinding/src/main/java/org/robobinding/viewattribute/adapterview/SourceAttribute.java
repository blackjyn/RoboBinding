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
package org.robobinding.viewattribute.adapterview;

import org.robobinding.presentationmodel.DataSetAdapter;
import org.robobinding.presentationmodel.PresentationModelAdapter;
import org.robobinding.property.DataSetValueModel;
import org.robobinding.viewattribute.PropertyBindingDetails;

import android.content.Context;

/**
 * 
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 */
public class SourceAttribute implements AdapterViewAttribute
{
	private final PropertyBindingDetails propertyBindingDetails;

	public SourceAttribute(String attributeValue)
	{
		this.propertyBindingDetails = PropertyBindingDetails.createFrom(attributeValue);
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	public void bind(final DataSetAdapter<?> dataSetAdapter, PresentationModelAdapter presentationModelAdapter, Context context)
	{
		DataSetValueModel dataSetValueModel = presentationModelAdapter.getDataSetPropertyValueModel(propertyBindingDetails.propertyName);
		dataSetAdapter.setValueModel(dataSetValueModel);
	}
}