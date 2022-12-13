/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.symbols;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fe10.test.configurator.AnalysisApiFe10TestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.symbols.AbstractSymbolByPsiTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/symbols/symbolByPsi")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleSymbolByPsiTestGenerated extends AbstractSymbolByPsiTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFe10TestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fe10,
                TestModuleKind.Source,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInSymbolByPsi() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByPsi"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("annotations.kt")
    public void testAnnotations() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/annotations.kt");
    }

    @Test
    @TestMetadata("anonymousObject.kt")
    public void testAnonymousObject() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/anonymousObject.kt");
    }

    @Test
    @TestMetadata("backingField.kt")
    public void testBackingField() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/backingField.kt");
    }

    @Test
    @TestMetadata("class.kt")
    public void testClass() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/class.kt");
    }

    @Test
    @TestMetadata("classInitializer.kt")
    public void testClassInitializer() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/classInitializer.kt");
    }

    @Test
    @TestMetadata("classMembes.kt")
    public void testClassMembes() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/classMembes.kt");
    }

    @Test
    @TestMetadata("classPrimaryConstructor.kt")
    public void testClassPrimaryConstructor() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/classPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("classSecondaryConstructors.kt")
    public void testClassSecondaryConstructors() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/classSecondaryConstructors.kt");
    }

    @Test
    @TestMetadata("classWithTypeParams.kt")
    public void testClassWithTypeParams() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/classWithTypeParams.kt");
    }

    @Test
    @TestMetadata("delegateField.kt")
    public void testDelegateField() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/delegateField.kt");
    }

    @Test
    @TestMetadata("deprecated.kt")
    public void testDeprecated() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/deprecated.kt");
    }

    @Test
    @TestMetadata("destructuringDeclaration.kt")
    public void testDestructuringDeclaration() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/destructuringDeclaration.kt");
    }

    @Test
    @TestMetadata("dynamic.kt")
    public void testDynamic() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/dynamic.kt");
    }

    @Test
    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/enum.kt");
    }

    @Test
    @TestMetadata("enumValueMember.kt")
    public void testEnumValueMember() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/enumValueMember.kt");
    }

    @Test
    @TestMetadata("explicitBackingField.kt")
    public void testExplicitBackingField() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/explicitBackingField.kt");
    }

    @Test
    @TestMetadata("extensionFunction.kt")
    public void testExtensionFunction() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/extensionFunction.kt");
    }

    @Test
    @TestMetadata("forLoopVariable.kt")
    public void testForLoopVariable() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/forLoopVariable.kt");
    }

    @Test
    @TestMetadata("function.kt")
    public void testFunction() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/function.kt");
    }

    @Test
    @TestMetadata("functionWithTypeParams.kt")
    public void testFunctionWithTypeParams() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/functionWithTypeParams.kt");
    }

    @Test
    @TestMetadata("implicitConstructorDelegationCall.kt")
    public void testImplicitConstructorDelegationCall() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/implicitConstructorDelegationCall.kt");
    }

    @Test
    @TestMetadata("implicitReturn.kt")
    public void testImplicitReturn() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/implicitReturn.kt");
    }

    @Test
    @TestMetadata("implicitReturnInLambda.kt")
    public void testImplicitReturnInLambda() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/implicitReturnInLambda.kt");
    }

    @Test
    @TestMetadata("jvmField.kt")
    public void testJvmField() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/jvmField.kt");
    }

    @Test
    @TestMetadata("jvmName.kt")
    public void testJvmName() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/jvmName.kt");
    }

    @Test
    @TestMetadata("localDeclarations.kt")
    public void testLocalDeclarations() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/localDeclarations.kt");
    }

    @Test
    @TestMetadata("memberFunctions.kt")
    public void testMemberFunctions() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/memberFunctions.kt");
    }

    @Test
    @TestMetadata("memberProperties.kt")
    public void testMemberProperties() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/memberProperties.kt");
    }

    @Test
    @TestMetadata("outerAndInnerClasses.kt")
    public void testOuterAndInnerClasses() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/outerAndInnerClasses.kt");
    }

    @Test
    @TestMetadata("topLevelFunctions.kt")
    public void testTopLevelFunctions() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/topLevelFunctions.kt");
    }

    @Test
    @TestMetadata("topLevelProperties.kt")
    public void testTopLevelProperties() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/topLevelProperties.kt");
    }

    @Test
    @TestMetadata("typeAlias.kt")
    public void testTypeAlias() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/typeAlias.kt");
    }

    @Test
    @TestMetadata("typeAnnotations.kt")
    public void testTypeAnnotations() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/typeAnnotations.kt");
    }

    @Test
    @TestMetadata("varargFunctions.kt")
    public void testVarargFunctions() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByPsi/varargFunctions.kt");
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/symbols/symbolByPsi/contextReceivers")
    @TestDataPath("$PROJECT_ROOT")
    public class ContextReceivers {
        @Test
        public void testAllFilesPresentInContextReceivers() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByPsi/contextReceivers"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("contextReceiversOnClass.kt")
        public void testContextReceiversOnClass() throws Exception {
            runTest("analysis/analysis-api/testData/symbols/symbolByPsi/contextReceivers/contextReceiversOnClass.kt");
        }

        @Test
        @TestMetadata("contextReceiversOnFunction.kt")
        public void testContextReceiversOnFunction() throws Exception {
            runTest("analysis/analysis-api/testData/symbols/symbolByPsi/contextReceivers/contextReceiversOnFunction.kt");
        }

        @Test
        @TestMetadata("contextReceiversOnProperty.kt")
        public void testContextReceiversOnProperty() throws Exception {
            runTest("analysis/analysis-api/testData/symbols/symbolByPsi/contextReceivers/contextReceiversOnProperty.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters")
    @TestDataPath("$PROJECT_ROOT")
    public class ValueParameters {
        @Test
        public void testAllFilesPresentInValueParameters() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("parameterInlining.kt")
        public void testParameterInlining() throws Exception {
            runTest("analysis/analysis-api/testData/symbols/symbolByPsi/valueParameters/parameterInlining.kt");
        }
    }
}