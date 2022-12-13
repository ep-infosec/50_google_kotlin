/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.standalone.fir.test.cases.generated.cases.scopes;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.scopes.AbstractTypeScopeTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/scopeProvider/typeScope")
@TestDataPath("$PROJECT_ROOT")
public class FirStandaloneNormalAnalysisSourceModuleTypeScopeTestGenerated extends AbstractTypeScopeTest {
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
    public void testAllFilesPresentInTypeScope() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/scopeProvider/typeScope"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("errorType.kt")
    public void testErrorType() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/typeScope/errorType.kt");
    }

    @Test
    @TestMetadata("innerClassTypeParamsSubstitution.kt")
    public void testInnerClassTypeParamsSubstitution() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/typeScope/innerClassTypeParamsSubstitution.kt");
    }

    @Test
    @TestMetadata("intList.kt")
    public void testIntList() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/typeScope/intList.kt");
    }

    @Test
    @TestMetadata("outerClassTypeParamsSubstitution.kt")
    public void testOuterClassTypeParamsSubstitution() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/typeScope/outerClassTypeParamsSubstitution.kt");
    }

    @Test
    @TestMetadata("outerTypeParamsSubstitution.kt")
    public void testOuterTypeParamsSubstitution() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/typeScope/outerTypeParamsSubstitution.kt");
    }

    @Test
    @TestMetadata("typeParamList.kt")
    public void testTypeParamList() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/typeScope/typeParamList.kt");
    }
}
