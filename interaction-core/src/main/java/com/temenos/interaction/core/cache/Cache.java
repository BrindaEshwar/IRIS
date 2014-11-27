package com.temenos.interaction.core.cache;

/*
 * #%L
 * interaction-core
 * %%
 * Copyright (C) 2012 - 2014 Temenos Holdings N.V.
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


/**
 * Interface to the response cache used by HttpHypermediaRIM
 *
 * @author amcguinness
 *
 */
public interface Cache {
	/** Insert into cache
	 * @param key declared as Object since it can be Uri, etc. toString() is used internally as key
	 * @param data
	 * @param maxAge in seconds
	 */
	public void put( Object key, javax.ws.rs.core.Response.ResponseBuilder data, int maxAge);
	public javax.ws.rs.core.Response.ResponseBuilder get( Object key );
}
