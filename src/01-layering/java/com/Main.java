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
import com.mihaibojin.props.core.resolvers.ClasspathPropertyFileResolver;
import com.mihaibojin.props.core.resolvers.EnvResolver;
import com.mihaibojin.props.core.resolvers.PropertyFileResolver;
import com.mihaibojin.props.core.resolvers.SystemPropertyResolver;
import java.nio.file.Path;
import java.util.Properties;

/** Dummy entry-point. */
public class Main {

  /** Main entry point. */
  public static void main(String[] args) {

  }

}



































/*
    Factory factory =
        Props.factory()
            .withResolver(new SystemPropertyResolver())
            .withResolver(new EnvResolver())
            .withResolver(new ClasspathPropertyFileResolver("/some-props.properties"))
            .withResolver(new PropertyFileResolver(Path.of("/Users/mihaibojin/git/props-examples/src/01-layering/resources/other-props.properties")))
        ;

    try (Props props = factory.build()) {
      Prop<String> prop = props.prop("a.duration").build();
      System.out.println(prop.value().get());

      Prop<String> cp = props.prop("java.class.path").build();
      System.out.println(cp.value().get());
    }

 */