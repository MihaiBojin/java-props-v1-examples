/*
 * Copyright 2020 Mihai Bojin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com;

import com.mihaibojin.props.core.Props;
import com.mihaibojin.props.core.Props.Factory;
import com.mihaibojin.props.core.resolvers.ClasspathPropertyFileResolver;
import com.mihaibojin.props.core.types.AbstractStringProp;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/** Dummy entry-point. */
public class Main {

  /** Main entry point. */
  public static void main(String[] args) {
    Factory factory =
        Props.factory().withResolver(new ClasspathPropertyFileResolver("/some-props.properties"));

    try (Props props = factory.build()) {
      // do something
    }
  }

}



























/*
    Factory factory =
        Props.factory().withResolver(new ClasspathPropertyFileResolver("/some-props.properties"));

    try (Props props = factory.build()) {
      MySecretProp secretProp = props.bind(new MySecretProp("a.base64.prop"));
      System.out.println(secretProp);
    }
  }

  static class MySecretProp extends AbstractStringProp {
    protected MySecretProp(String key) {
      super(key, "I AM A DEFAULT", "", false, false);
    }

    @Override
    public String encode(String value) {
      return Base64.getMimeEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String decode(String value) {
      return new String(Base64.getMimeDecoder().decode(value.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
    }
  }
 */