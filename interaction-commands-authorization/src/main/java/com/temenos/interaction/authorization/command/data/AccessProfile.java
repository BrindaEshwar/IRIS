package com.temenos.interaction.authorization.command.data;

/*
 * #%L
 * interaction-commands-authorization
 * %%
 * Copyright (C) 2012 - 2015 Temenos Holdings N.V.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */


import java.util.List;
import java.util.Set;

/**
 * Class to contain full user access profile information for consumers.
 * 
 * @author sjunejo
 *
 */
public class AccessProfile {

	// List of filter conditions
	private List<RowFilter> rowFilters;
	// Set of field/column to select 
	private Set<FieldName> fieldNames;
	
	public AccessProfile(List<RowFilter> rowFilters, Set<FieldName> fieldNames) {
		this.rowFilters = rowFilters;
		this.fieldNames = fieldNames; 
	}
	
	public List<RowFilter> getRowFilters() {
		return rowFilters;
	}
	
	public void setRowFilters(List<RowFilter> rowFilters) {
		this.rowFilters = rowFilters;
	}
	
	public Set<FieldName> getFieldNames() {
		return fieldNames;
	}
	
	public void setFieldNames(Set<FieldName> fieldNames) {
		this.fieldNames = fieldNames;
	}
}
