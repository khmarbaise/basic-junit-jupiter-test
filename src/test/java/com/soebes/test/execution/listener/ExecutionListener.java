package com.soebes.test.execution.listener;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;

public class ExecutionListener implements TestExecutionListener {

  public void testPlanExecutionStarted(TestPlan testPlan) {
    System.out.println("ExecutionListener.testPlanExecutionStarted");
  }

  public void testPlanExecutionFinished(TestPlan testPlan) {
    System.out.println("ExecutionListener.testPlanExecutionFinished");
  }

  public void dynamicTestRegistered(TestIdentifier testIdentifier) {
    System.out.println("ExecutionListener.dynamicTestRegistered");
  }

  public void executionSkipped(TestIdentifier testIdentifier, String reason) {
    System.out.println("ExecutionListener.executionSkipped");
  }

  public void executionStarted(TestIdentifier testIdentifier) {
    System.out.println("ExecutionListener.executionStarted");
  }

  public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
    System.out.println("ExecutionListener.executionFinished");
  }

}
