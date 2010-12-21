/**
 * 	Copyright (c) 2010 Philipp Giese
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.orm.androrm;

/**
 * This class represents an AND statement. The characteristics of this
 * statement are, that it's left and right side are also statements, 
 * that are separated by the word AND.
 * 
 * @author Philipp Giese
 */
public class AndStatement extends ComposedStatement{
	
	/**
	 * This constructor is only a convenience constructor. 
	 * It will construct a basic statement with key and value 
	 * but <b>NOT</b> an actual AND statement.
	 * <br /><br />
	 * Usage is discouraged. 
	 * @param key	Key for the statement.
	 * @param value	Value of the statement.
	 * 
	 * @deprecated
	 */
	public AndStatement(String key, String value) {
		super(key, value);
	}
	
	public AndStatement(Statement left, Statement right) {
		super(left, right);
		
		mSeparator = " AND ";
	}
}