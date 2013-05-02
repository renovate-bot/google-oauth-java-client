/*
 * Copyright (c) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.client.auth.oauth2;


import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Tests {@link AuthorizationRequestUrl}.
 *
 * @author Yaniv Inbar
 */
public class AuthorizationRequestUrlTest extends TestCase {

  private static final String EXPECTED =
      "https://server.example.com/authorize?client_id=s6BhdRkqt3&"
      + "redirect_uri=https://client.example.com/rd&response_type=code%20token"
      + "&scope=a%20b%20c&state=xyz";

  public AuthorizationRequestUrlTest(String name) {
    super(name);
  }

  public void testBuild() {
    AuthorizationRequestUrl url = new AuthorizationRequestUrl(
        "https://server.example.com/authorize", "s6BhdRkqt3",
        Arrays.asList("code", "token")).setState("xyz")
        .setRedirectUri("https://client.example.com/rd").setScopes(Arrays.asList("a", "b", "c"));
    assertEquals(EXPECTED, url.build());
  }
}
