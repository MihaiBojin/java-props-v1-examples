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
import com.mihaibojin.props.core.RefactoredProp;
import com.mihaibojin.props.core.converters.Cast;
import com.mihaibojin.props.core.resolvers.ClasspathPropertyFileResolver;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/**
 * Dummy entry-point.
 */
public class Main {

  /**
   * Main entry point.
   */
  public static void main(String[] args) {
    Factory factory = Props.factory().withResolver(new ClasspathPropertyFileResolver("/some-props.properties"));

    try (Props props = factory.build()) {
      // do something
    }
  }
}

























/*
      Prop<Integer> propOld = props.prop("an.old.prop", Cast.asInteger()).build();
      Prop<Boolean> propNew = props.prop("a.new.prop", Cast.asBoolean()).build();

      RefactoredProp<Boolean, Integer> prop =
          new RefactoredProp<>(
              props,
              propNew,
              propOld,
              value -> Objects.equals(value, 0));
      System.out.println(prop.value());

 */