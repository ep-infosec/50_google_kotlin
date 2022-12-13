/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.testOld.wasm.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateJsTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/box/kotlin.test")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JsTranslatorUnitWasmTestGenerated extends AbstractJsTranslatorUnitWasmTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest0(this::doTest, TargetBackend.WASM, testDataFilePath);
    }

    public void testAllFilesPresentInKotlin_test() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/kotlin.test"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true);
    }

    @TestMetadata("beforeAfter.kt")
    public void testBeforeAfter() throws Exception {
        runTest("js/js.translator/testData/box/kotlin.test/beforeAfter.kt");
    }

    @TestMetadata("ignore.kt")
    public void testIgnore() throws Exception {
        runTest("js/js.translator/testData/box/kotlin.test/ignore.kt");
    }

    @TestMetadata("illegalParameters.kt")
    public void testIllegalParameters() throws Exception {
        runTest("js/js.translator/testData/box/kotlin.test/illegalParameters.kt");
    }

    @TestMetadata("incremental.kt")
    public void testIncremental() throws Exception {
        runTest("js/js.translator/testData/box/kotlin.test/incremental.kt");
    }

    @TestMetadata("inherited.kt")
    public void testInherited() throws Exception {
        runTest("js/js.translator/testData/box/kotlin.test/inherited.kt");
    }

    @TestMetadata("mpp.kt")
    public void testMpp() throws Exception {
        runTest("js/js.translator/testData/box/kotlin.test/mpp.kt");
    }

    @TestMetadata("nested.kt")
    public void testNested() throws Exception {
        runTest("js/js.translator/testData/box/kotlin.test/nested.kt");
    }

    @TestMetadata("returnTestResult.kt")
    public void testReturnTestResult() throws Exception {
        runTest("js/js.translator/testData/box/kotlin.test/returnTestResult.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("js/js.translator/testData/box/kotlin.test/simple.kt");
    }
}