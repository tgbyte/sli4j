/*
 *    Copyright 2010 The sli4j Team
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.googlecode.sli4j.log4j;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.inject.TypeLiteral;
import com.google.inject.matcher.Matchers;
import com.googlecode.sli4j.log4j.Log4jLoggingModule;
import com.googlecode.sli4j.testfw.AbstractLoggerInectionTestCase;

/**
 * 
 *
 * @author Simone Tripodi
 * @version $Id: Log4jLoggingTestCase.java 241 2010-06-05 14:18:22Z simone.tripodi $
 */
public final class Log4jLoggingTestCase extends AbstractLoggerInectionTestCase<Logger> {

    private Logger logger;

    @BeforeTest
    public void setUp() {
        super.setUp(new Log4jLoggingModule(Matchers.only(TypeLiteral.get(this.getClass()))));
    }

    @Test
    public void injectAndVerify() {
        this.injectAndVerify(this.logger);
    }

}
