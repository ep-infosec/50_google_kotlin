/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.samWithReceiver;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/sam-with-receiver/testData/diagnostics")
@TestDataPath("$PROJECT_ROOT")
public class FirSamWithReceiverTestGenerated extends AbstractFirSamWithReceiverTest {
    @Test
    public void testAllFilesPresentInDiagnostics() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/sam-with-receiver/testData/diagnostics"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), true);
    }

    @Test
    @TestMetadata("noParameters.kt")
    public void testNoParameters() throws Exception {
        runTest("plugins/sam-with-receiver/testData/diagnostics/noParameters.kt");
    }

    @Test
    @TestMetadata("noReturnType.kt")
    public void testNoReturnType() throws Exception {
        runTest("plugins/sam-with-receiver/testData/diagnostics/noReturnType.kt");
    }

    @Test
    @TestMetadata("samConversionNoParameters.kt")
    public void testSamConversionNoParameters() throws Exception {
        runTest("plugins/sam-with-receiver/testData/diagnostics/samConversionNoParameters.kt");
    }

    @Test
    @TestMetadata("samConversionSimple.kt")
    public void testSamConversionSimple() throws Exception {
        runTest("plugins/sam-with-receiver/testData/diagnostics/samConversionSimple.kt");
    }

    @Test
    @TestMetadata("samConversionSimpleWithoutAnnotation.kt")
    public void testSamConversionSimpleWithoutAnnotation() throws Exception {
        runTest("plugins/sam-with-receiver/testData/diagnostics/samConversionSimpleWithoutAnnotation.kt");
    }

    @Test
    @TestMetadata("samWithAnnotation.kt")
    public void testSamWithAnnotation() throws Exception {
        runTest("plugins/sam-with-receiver/testData/diagnostics/samWithAnnotation.kt");
    }

    @Test
    @TestMetadata("samWithoutAnnotation.kt")
    public void testSamWithoutAnnotation() throws Exception {
        runTest("plugins/sam-with-receiver/testData/diagnostics/samWithoutAnnotation.kt");
    }

    @Test
    @TestMetadata("singleParameter.kt")
    public void testSingleParameter() throws Exception {
        runTest("plugins/sam-with-receiver/testData/diagnostics/singleParameter.kt");
    }

    @Test
    @TestMetadata("singleParameterWithoutAnnotation.kt")
    public void testSingleParameterWithoutAnnotation() throws Exception {
        runTest("plugins/sam-with-receiver/testData/diagnostics/singleParameterWithoutAnnotation.kt");
    }
}