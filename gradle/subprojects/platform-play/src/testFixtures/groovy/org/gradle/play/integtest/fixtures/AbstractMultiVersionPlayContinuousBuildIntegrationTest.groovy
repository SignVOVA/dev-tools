/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.play.integtest.fixtures

import org.gradle.api.JavaVersion
import org.gradle.integtests.fixtures.MultiVersionSpecRunner
import org.gradle.integtests.fixtures.TargetCoverage
import org.gradle.util.VersionNumber
import org.junit.runner.RunWith

@RunWith(MultiVersionSpecRunner)
@TargetCoverage({ JavaVersion.current().isJava8Compatible() ? PlayCoverage.ALL : PlayCoverage.PLAY23_OR_EARLIER })
abstract class AbstractMultiVersionPlayContinuousBuildIntegrationTest extends AbstractPlayContinuousBuildIntegrationTest {
    static def version

    static VersionNumber getVersionNumber() {
        VersionNumber.parse(version.toString())
    }
}
