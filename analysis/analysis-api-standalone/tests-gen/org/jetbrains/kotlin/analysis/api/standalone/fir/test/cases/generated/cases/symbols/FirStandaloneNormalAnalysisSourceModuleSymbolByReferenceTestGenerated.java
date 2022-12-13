/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.standalone.fir.test.cases.generated.cases.symbols;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.standalone.fir.test.AnalysisApiFirStandaloneModeTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.symbols.AbstractSymbolByReferenceTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/symbols/symbolByReference")
@TestDataPath("$PROJECT_ROOT")
public class FirStandaloneNormalAnalysisSourceModuleSymbolByReferenceTestGenerated extends AbstractSymbolByReferenceTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirStandaloneModeTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Standalone
            )
        );
    }

    @Test
    @TestMetadata("accessorField.kt")
    public void testAccessorField() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/accessorField.kt");
    }

    @Test
    public void testAllFilesPresentInSymbolByReference() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByReference"), Pattern.compile("^(.+)\\.kt$"), null, true, "withTestCompilerPluginEnabled");
    }

    @Test
    @TestMetadata("constructorViaTypeAlias.kt")
    public void testConstructorViaTypeAlias() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/constructorViaTypeAlias.kt");
    }

    @Test
    @TestMetadata("explicitLambdaParameter.kt")
    public void testExplicitLambdaParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/explicitLambdaParameter.kt");
    }

    @Test
    @TestMetadata("functionReceiverParameter.kt")
    public void testFunctionReceiverParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/functionReceiverParameter.kt");
    }

    @Test
    @TestMetadata("genericFromFunctionInLocalClass.kt")
    public void testGenericFromFunctionInLocalClass() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/genericFromFunctionInLocalClass.kt");
    }

    @Test
    @TestMetadata("genericFromOuterClassInInnerClass.kt")
    public void testGenericFromOuterClassInInnerClass() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/genericFromOuterClassInInnerClass.kt");
    }

    @Test
    @TestMetadata("implicitLambdaParameter.kt")
    public void testImplicitLambdaParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/implicitLambdaParameter.kt");
    }

    @Test
    @TestMetadata("propertyReceiverParameter.kt")
    public void testPropertyReceiverParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/propertyReceiverParameter.kt");
    }

    @Test
    @TestMetadata("samConstructor.kt")
    public void testSamConstructor() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/samConstructor.kt");
    }
}
