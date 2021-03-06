/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.protocol.servlet_2_5;

import java.util.ArrayList;
import java.util.List;

import org.jboss.arquillian.spi.TestResult;
import org.jboss.arquillian.spi.TestRunner;

/**
 * MockTestRunner
 * 
 * TestRunner that will return what you want for testing
 *
 * @author <a href="mailto:aslak@conduct.no">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class MockTestRunner implements TestRunner
{
   public static List<TestResult> wantedResults = new ArrayList<TestResult>();
   
   public static void add(TestResult wantedTestResult) 
   {
      wantedResults.add(wantedTestResult);
   }
   
   public TestResult execute(Class<?> testClass, String methodName)
   {
      return wantedResults.get(0);
   }
   
//   public void execute(TestResultCallback callback, Class<?>... classes) 
//   {
//      for(TestResult result : wantedResults)
//      {
//         callback.handle(result);
//      }
//   }
}
