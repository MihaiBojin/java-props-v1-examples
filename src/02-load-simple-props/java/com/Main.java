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

import com.mihaibojin.props.core.Prop;
import com.mihaibojin.props.core.Props;
import com.mihaibojin.props.core.Props.Factory;
import com.mihaibojin.props.core.converters.Cast;
import com.mihaibojin.props.core.resolvers.ClasspathPropertyFileResolver;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

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
      Prop<Duration> prop = props.prop("a.duration", Cast.asDuration()).build();
      System.out.println(prop);

      Prop<Duration> prop =
          props
              .prop("a.numeric.duration.seconds", Cast.asNumericDuration(ChronoUnit.SECONDS))
              .build();
      System.out.println(prop);

      Prop<List<Integer>> prop = props.prop("an.integer.list", Cast.asListOfInteger()).build();
      System.out.println(prop.value().get());

      Prop<Path> prop = props.prop("the.home.dir", Cast.asPath(true)).build();
      System.out.println(prop.value().get());

      Prop<Instant> prop = props.prop("an.instant", Cast.asInstant()).build();
      System.out.println(prop);
    }
 */