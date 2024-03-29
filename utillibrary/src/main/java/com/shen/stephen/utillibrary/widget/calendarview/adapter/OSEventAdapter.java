/*
 *  Copyright 2011 Yuri Kanivets
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.shen.stephen.utillibrary.widget.calendarview.adapter;

import android.database.DataSetObserver;

/**
 * Wheel items adapter interface
 */
public interface OSEventAdapter {
	/**
	 * Gets all of events count
	 * @return the count of wheel items
	 */
	int getEventsCount();

	/**
	 * return the event for specified index.
	 * @param index
	 * @return
	 */
	Object getEvent(int index);
	
	/**
	 * Register an observer that is called when changes happen to the data used by this adapter.
	 * @param observer the observer to be registered
	 */
	void registerDataSetObserver(DataSetObserver observer);
	
	/**
	 * Unregister an observer that has previously been registered
	 * @param observer the observer to be unregistered
	 */
	void unregisterDataSetObserver(DataSetObserver observer);

	/**
	 * Notifies observers about data changing
	 */
	void notifyDataSetChanged();

	/**
	 * Notifies observers about invalidating data
	 */
	void notifyDataInvalidatedEvent();
}
