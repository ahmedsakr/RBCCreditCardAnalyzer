/**
 * Copyright (c) 2015 Ahmed Sakr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ccstats.input.exceptions;


/**
 *
 * @author Ahmed Sakr
 * @since November 29, 2015
 */
public class InvalidStatementPathException extends Exception {


    /**
     * Default Exception constructor.
     *
     * @param error The error that triggered a InvalidStatementPathException.
     */
    public InvalidStatementPathException(String error) {
        super(error);
    }
}
