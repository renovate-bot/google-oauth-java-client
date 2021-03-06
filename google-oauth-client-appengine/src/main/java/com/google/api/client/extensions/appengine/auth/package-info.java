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

/**
 * {@link com.google.api.client.util.Beta} <br>
 * These servlets will allow an App Engine user to quickly get started with the auth object
 * interface from the main client. They will utilize the App Engine Datastore and Credentials to
 * manage credentials on behalf of users.
 *
 * <p>Warning: starting with version 1.7, usage of this for OAuth 2.0 is deprecated. Instead use
 * {@link com.google.api.client.extensions.appengine.auth.oauth2}.
 *
 * @since 1.4
 * @author moshenko@google.com (Jacob Moshenko)
 */
@com.google.api.client.util.Beta
package com.google.api.client.extensions.appengine.auth;
