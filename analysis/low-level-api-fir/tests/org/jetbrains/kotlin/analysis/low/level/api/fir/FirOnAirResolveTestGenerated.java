/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testdata/onAirResolve")
@TestDataPath("$PROJECT_ROOT")
public class FirOnAirResolveTestGenerated extends AbstractFirOnAirResolveTest {
    @Test
    public void testAllFilesPresentInOnAirResolve() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testdata/onAirResolve"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("classInClass.kt")
    public void testClassInClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/classInClass.kt");
    }

    @Test
    @TestMetadata("fileAnnotation.kt")
    public void testFileAnnotation() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/fileAnnotation.kt");
    }

    @Test
    @TestMetadata("identifierInContext.kt")
    public void testIdentifierInContext() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/identifierInContext.kt");
    }

    @Test
    @TestMetadata("inParameter.kt")
    public void testInParameter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/inParameter.kt");
    }

    @Test
    @TestMetadata("incompleteIdentifier.kt")
    public void testIncompleteIdentifier() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/incompleteIdentifier.kt");
    }

    @Test
    @TestMetadata("localClass.kt")
    public void testLocalClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/localClass.kt");
    }

    @Test
    @TestMetadata("localFunction.kt")
    public void testLocalFunction() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/localFunction.kt");
    }

    @Test
    @TestMetadata("loopConstruction.kt")
    public void testLoopConstruction() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/loopConstruction.kt");
    }

    @Test
    @TestMetadata("memberInClass.kt")
    public void testMemberInClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/memberInClass.kt");
    }

    @Test
    @TestMetadata("memberPropertyInClass.kt")
    public void testMemberPropertyInClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/memberPropertyInClass.kt");
    }

    @Test
    @TestMetadata("memberWithOverride.kt")
    public void testMemberWithOverride() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/memberWithOverride.kt");
    }

    @Test
    @TestMetadata("onAirTypesResolve.kt")
    public void testOnAirTypesResolve() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/onAirTypesResolve.kt");
    }

    @Test
    @TestMetadata("replacementInHeader.kt")
    public void testReplacementInHeader() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/replacementInHeader.kt");
    }

    @Test
    @TestMetadata("replacementInsidePropertyBody.kt")
    public void testReplacementInsidePropertyBody() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/replacementInsidePropertyBody.kt");
    }

    @Test
    @TestMetadata("replacementInsidePropertyBody2.kt")
    public void testReplacementInsidePropertyBody2() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/replacementInsidePropertyBody2.kt");
    }

    @Test
    @TestMetadata("topLevelFunction.kt")
    public void testTopLevelFunction() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/topLevelFunction.kt");
    }

    @Test
    @TestMetadata("typeAlias.kt")
    public void testTypeAlias() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/onAirResolve/typeAlias.kt");
    }
}
