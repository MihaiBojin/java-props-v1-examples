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

import static java.lang.String.format;

import com.mihaibojin.props.core.Prop;
import com.mihaibojin.props.core.Props;
import com.mihaibojin.props.core.Props.Factory;
import com.mihaibojin.props.core.resolvers.ResolverUtils;
import java.util.stream.Stream;

/** Dummy entry-point. */
public class Main {

  /** Main entry point. */
  public static void main(String[] args) {
    // choose which layers to load
    String env = Stream.of(args).findFirst().orElse("dev");
    String resolver = format("/resolvers-%s.conf", env);

    // load resolvers
    Factory factory =
        Props.factory()
            .withResolvers(
                // read multiple resolvers from a conf file
                ResolverUtils.readResolverConfig(Main.class.getResourceAsStream(resolver)));

    try (Props props = factory.build()) {
      Prop<String> prop = props.prop("a.prop").build();
      System.out.println(prop);
    }
  }
}
