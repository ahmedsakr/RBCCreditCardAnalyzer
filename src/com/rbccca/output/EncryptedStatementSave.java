/**
 * Copyright (c) 2016 Ahmed Sakr
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

package com.rbccca.output;


import com.rbccca.analysis.data.Statement;

/**
 *
 * @author Ahmed Sakr
 * @since January 2, 2016.
 */
public class EncryptedStatementSave {

    private Statement statement;

    public EncryptedStatementSave(Statement statement) {
        this.statement = statement;
    }
}
