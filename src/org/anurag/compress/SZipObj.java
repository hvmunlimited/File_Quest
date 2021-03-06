/**
 * Copyright(c) 2014 DRAWNZER.ORG PROJECTS -> ANURAG
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *      
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *                             
 *                             anurag.dev1512@gmail.com
 *
 */

package org.anurag.compress;

import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import android.content.Context;

/**
 * 
 * @author ANURAG
 *
 */
public class SZipObj {
	
	String name,filepath,entryname;
	SevenZArchiveEntry enrt;
	Context ctx;
	boolean isFile;
	
	public SZipObj(SevenZArchiveEntry entry , String nam , String path , Context ct) {
		// TODO Auto-generated constructor stub
		this.ctx = ct;
		this.name = nam;
		this.filepath = path;
		this.enrt = entry;
		this.entryname = entry.getName();
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPath(){
		if(filepath.equalsIgnoreCase(""))
			return this.name;
		return this.filepath;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isFile(){
		return this.isFile;
	}
	
	/**
	 * 
	 * @return
	 */
	public SevenZArchiveEntry getEntry(){
		return this.enrt;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getEntryName(){
		return this.entryname;
	}
	
}
