/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/resolve")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ResolveTestGenerated extends AbstractResolveTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInResolve() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolve"), Pattern.compile("^(.+)\\.resolve$"), null, true);
    }

    @TestMetadata("Basic.resolve")
    public void testBasic() throws Exception {
        runTest("compiler/testData/resolve/Basic.resolve");
    }

    @TestMetadata("ClassObjects.resolve")
    public void testClassObjects() throws Exception {
        runTest("compiler/testData/resolve/ClassObjects.resolve");
    }

    @TestMetadata("Classifiers.resolve")
    public void testClassifiers() throws Exception {
        runTest("compiler/testData/resolve/Classifiers.resolve");
    }

    @TestMetadata("DefaultParamsOfLocalFunctions.resolve")
    public void testDefaultParamsOfLocalFunctions() throws Exception {
        runTest("compiler/testData/resolve/DefaultParamsOfLocalFunctions.resolve");
    }

    @TestMetadata("ErrorSupertype.resolve")
    public void testErrorSupertype() throws Exception {
        runTest("compiler/testData/resolve/ErrorSupertype.resolve");
    }

    @TestMetadata("ExtensionFunctions.resolve")
    public void testExtensionFunctions() throws Exception {
        runTest("compiler/testData/resolve/ExtensionFunctions.resolve");
    }

    @TestMetadata("FunctionVariable.resolve")
    public void testFunctionVariable() throws Exception {
        runTest("compiler/testData/resolve/FunctionVariable.resolve");
    }

    @TestMetadata("ImportFromRootScope.resolve")
    public void testImportFromRootScope() throws Exception {
        runTest("compiler/testData/resolve/ImportFromRootScope.resolve");
    }

    @TestMetadata("ImportingRootScopeWhenProcessingImports.resolve")
    public void testImportingRootScopeWhenProcessingImports() throws Exception {
        runTest("compiler/testData/resolve/ImportingRootScopeWhenProcessingImports.resolve");
    }

    @TestMetadata("kt304.resolve")
    public void testKt304() throws Exception {
        runTest("compiler/testData/resolve/kt304.resolve");
    }

    @TestMetadata("LocalObjects.resolve")
    public void testLocalObjects() throws Exception {
        runTest("compiler/testData/resolve/LocalObjects.resolve");
    }

    @TestMetadata("NestedObjects.resolve")
    public void testNestedObjects() throws Exception {
        runTest("compiler/testData/resolve/NestedObjects.resolve");
    }

    @TestMetadata("NoReferenceForErrorAnnotation.resolve")
    public void testNoReferenceForErrorAnnotation() throws Exception {
        runTest("compiler/testData/resolve/NoReferenceForErrorAnnotation.resolve");
    }

    @TestMetadata("Objects.resolve")
    public void testObjects() throws Exception {
        runTest("compiler/testData/resolve/Objects.resolve");
    }

    @TestMetadata("Packages.resolve")
    public void testPackages() throws Exception {
        runTest("compiler/testData/resolve/Packages.resolve");
    }

    @TestMetadata("PrimaryConstructorParameters.resolve")
    public void testPrimaryConstructorParameters() throws Exception {
        runTest("compiler/testData/resolve/PrimaryConstructorParameters.resolve");
    }

    @TestMetadata("PrimaryConstructors.resolve")
    public void testPrimaryConstructors() throws Exception {
        runTest("compiler/testData/resolve/PrimaryConstructors.resolve");
    }

    @TestMetadata("Projections.resolve")
    public void testProjections() throws Exception {
        runTest("compiler/testData/resolve/Projections.resolve");
    }

    @TestMetadata("PropertyAndFunctionNameClash.resolve")
    public void testPropertyAndFunctionNameClash() throws Exception {
        runTest("compiler/testData/resolve/PropertyAndFunctionNameClash.resolve");
    }

    @TestMetadata("ResolveOfInfixExpressions.resolve")
    public void testResolveOfInfixExpressions() throws Exception {
        runTest("compiler/testData/resolve/ResolveOfInfixExpressions.resolve");
    }

    @TestMetadata("ResolveToJava.resolve")
    public void testResolveToJava() throws Exception {
        runTest("compiler/testData/resolve/ResolveToJava.resolve");
    }

    @TestMetadata("ResolveToJava2.resolve")
    public void testResolveToJava2() throws Exception {
        runTest("compiler/testData/resolve/ResolveToJava2.resolve");
    }

    @TestMetadata("ResolveToJava3.resolve")
    public void testResolveToJava3() throws Exception {
        runTest("compiler/testData/resolve/ResolveToJava3.resolve");
    }

    @TestMetadata("ResolveToJavaTypeTransform.resolve")
    public void testResolveToJavaTypeTransform() throws Exception {
        runTest("compiler/testData/resolve/ResolveToJavaTypeTransform.resolve");
    }

    @TestMetadata("ScopeInteraction.resolve")
    public void testScopeInteraction() throws Exception {
        runTest("compiler/testData/resolve/ScopeInteraction.resolve");
    }

    @TestMetadata("StringTemplates.resolve")
    public void testStringTemplates() throws Exception {
        runTest("compiler/testData/resolve/StringTemplates.resolve");
    }

    @TestMetadata("Super.resolve")
    public void testSuper() throws Exception {
        runTest("compiler/testData/resolve/Super.resolve");
    }

    @TestMetadata("TryCatch.resolve")
    public void testTryCatch() throws Exception {
        runTest("compiler/testData/resolve/TryCatch.resolve");
    }

    @TestMetadata("compiler/testData/resolve/candidatesPriority")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CandidatesPriority extends AbstractResolveTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInCandidatesPriority() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolve/candidatesPriority"), Pattern.compile("^(.+)\\.resolve$"), null, true);
        }

        @TestMetadata("classObjectOuterResolve.resolve")
        public void testClassObjectOuterResolve() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/classObjectOuterResolve.resolve");
        }

        @TestMetadata("closerReceiver1.resolve")
        public void testCloserReceiver1() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/closerReceiver1.resolve");
        }

        @TestMetadata("closerReceiver2.resolve")
        public void testCloserReceiver2() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/closerReceiver2.resolve");
        }

        @TestMetadata("closerReceiver3.resolve")
        public void testCloserReceiver3() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/closerReceiver3.resolve");
        }

        @TestMetadata("closerScope.resolve")
        public void testCloserScope() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/closerScope.resolve");
        }

        @TestMetadata("dispatchReceiverVsExtensionReceiver.resolve")
        public void testDispatchReceiverVsExtensionReceiver() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/dispatchReceiverVsExtensionReceiver.resolve");
        }

        @TestMetadata("dispatchReceiverVsExtensionReceiver2.resolve")
        public void testDispatchReceiverVsExtensionReceiver2() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/dispatchReceiverVsExtensionReceiver2.resolve");
        }

        @TestMetadata("extensionToCloserReceiverVsMember.resolve")
        public void testExtensionToCloserReceiverVsMember() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/extensionToCloserReceiverVsMember.resolve");
        }

        @TestMetadata("implicitThisVsNoReceiver.resolve")
        public void testImplicitThisVsNoReceiver() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/implicitThisVsNoReceiver.resolve");
        }

        @TestMetadata("implicitThisVsNoReceiver2.resolve")
        public void testImplicitThisVsNoReceiver2() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/implicitThisVsNoReceiver2.resolve");
        }

        @TestMetadata("localVsImplicitThis.resolve")
        public void testLocalVsImplicitThis() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/localVsImplicitThis.resolve");
        }

        @TestMetadata("memberVsExtension1.resolve")
        public void testMemberVsExtension1() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/memberVsExtension1.resolve");
        }

        @TestMetadata("memberVsExtension2.resolve")
        public void testMemberVsExtension2() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/memberVsExtension2.resolve");
        }

        @TestMetadata("memberVsExtension3.resolve")
        public void testMemberVsExtension3() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/memberVsExtension3.resolve");
        }

        @TestMetadata("memberVsLocalExtension.resolve")
        public void testMemberVsLocalExtension() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/memberVsLocalExtension.resolve");
        }

        @TestMetadata("memberWithInvokeVsNonLocal.resolve")
        public void testMemberWithInvokeVsNonLocal() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/memberWithInvokeVsNonLocal.resolve");
        }

        @TestMetadata("wrongReceiverVsOtherError.resolve")
        public void testWrongReceiverVsOtherError() throws Exception {
            runTest("compiler/testData/resolve/candidatesPriority/wrongReceiverVsOtherError.resolve");
        }
    }

    @TestMetadata("compiler/testData/resolve/delegatedProperty")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DelegatedProperty extends AbstractResolveTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDelegatedProperty() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolve/delegatedProperty"), Pattern.compile("^(.+)\\.resolve$"), null, true);
        }

        @TestMetadata("delegationByCall.resolve")
        public void testDelegationByCall() throws Exception {
            runTest("compiler/testData/resolve/delegatedProperty/delegationByCall.resolve");
        }

        @TestMetadata("delegationByConstructor.resolve")
        public void testDelegationByConstructor() throws Exception {
            runTest("compiler/testData/resolve/delegatedProperty/delegationByConstructor.resolve");
        }

        @TestMetadata("delegationByFun.resolve")
        public void testDelegationByFun() throws Exception {
            runTest("compiler/testData/resolve/delegatedProperty/delegationByFun.resolve");
        }

        @TestMetadata("delegationByObject.resolve")
        public void testDelegationByObject() throws Exception {
            runTest("compiler/testData/resolve/delegatedProperty/delegationByObject.resolve");
        }

        @TestMetadata("delegationByProperty.resolve")
        public void testDelegationByProperty() throws Exception {
            runTest("compiler/testData/resolve/delegatedProperty/delegationByProperty.resolve");
        }

        @TestMetadata("delegationInClass.resolve")
        public void testDelegationInClass() throws Exception {
            runTest("compiler/testData/resolve/delegatedProperty/delegationInClass.resolve");
        }

        @TestMetadata("localDelegation.resolve")
        public void testLocalDelegation() throws Exception {
            runTest("compiler/testData/resolve/delegatedProperty/localDelegation.resolve");
        }
    }

    @TestMetadata("compiler/testData/resolve/imports")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Imports extends AbstractResolveTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInImports() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolve/imports"), Pattern.compile("^(.+)\\.resolve$"), null, true);
        }

        @TestMetadata("ImportConflictAllPackage.resolve")
        public void testImportConflictAllPackage() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportConflictAllPackage.resolve");
        }

        @TestMetadata("ImportConflictBetweenImportedAndRootPackage.resolve")
        public void testImportConflictBetweenImportedAndRootPackage() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportConflictBetweenImportedAndRootPackage.resolve");
        }

        @TestMetadata("ImportConflictBetweenImportedAndSamePackage.resolve")
        public void testImportConflictBetweenImportedAndSamePackage() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportConflictBetweenImportedAndSamePackage.resolve");
        }

        @TestMetadata("ImportConflictForFunctions.resolve")
        public void testImportConflictForFunctions() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportConflictForFunctions.resolve");
        }

        @TestMetadata("ImportConflictPackageAndClass.resolve")
        public void testImportConflictPackageAndClass() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportConflictPackageAndClass.resolve");
        }

        @TestMetadata("ImportConflictSameNameClass.resolve")
        public void testImportConflictSameNameClass() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportConflictSameNameClass.resolve");
        }

        @TestMetadata("ImportConflictWithClassObject.resolve")
        public void testImportConflictWithClassObject() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportConflictWithClassObject.resolve");
        }

        @TestMetadata("ImportConflictWithInFileClass.resolve")
        public void testImportConflictWithInFileClass() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportConflictWithInFileClass.resolve");
        }

        @TestMetadata("ImportConflictWithInnerClass.resolve")
        public void testImportConflictWithInnerClass() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportConflictWithInnerClass.resolve");
        }

        @TestMetadata("ImportConflictsWithMappedToJava.resolve")
        public void testImportConflictsWithMappedToJava() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportConflictsWithMappedToJava.resolve");
        }

        @TestMetadata("ImportNonBlockingAnalysis.resolve")
        public void testImportNonBlockingAnalysis() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportNonBlockingAnalysis.resolve");
        }

        @TestMetadata("ImportResolveOrderStable.resolve")
        public void testImportResolveOrderStable() throws Exception {
            runTest("compiler/testData/resolve/imports/ImportResolveOrderStable.resolve");
        }
    }

    @TestMetadata("compiler/testData/resolve/labels")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Labels extends AbstractResolveTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInLabels() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolve/labels"), Pattern.compile("^(.+)\\.resolve$"), null, true);
        }

        @TestMetadata("labelForPropertyInGetter.resolve")
        public void testLabelForPropertyInGetter() throws Exception {
            runTest("compiler/testData/resolve/labels/labelForPropertyInGetter.resolve");
        }

        @TestMetadata("labelForPropertyInSetter.resolve")
        public void testLabelForPropertyInSetter() throws Exception {
            runTest("compiler/testData/resolve/labels/labelForPropertyInSetter.resolve");
        }
    }

    @TestMetadata("compiler/testData/resolve/regressions")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Regressions extends AbstractResolveTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInRegressions() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolve/regressions"), Pattern.compile("^(.+)\\.resolve$"), null, true);
        }

        @TestMetadata("kt300.resolve")
        public void testKt300() throws Exception {
            runTest("compiler/testData/resolve/regressions/kt300.resolve");
        }

        @TestMetadata("kt45676.resolve")
        public void testKt45676() throws Exception {
            runTest("compiler/testData/resolve/regressions/kt45676.resolve");
        }

        @TestMetadata("objectInsideFun.resolve")
        public void testObjectInsideFun() throws Exception {
            runTest("compiler/testData/resolve/regressions/objectInsideFun.resolve");
        }
    }

    @TestMetadata("compiler/testData/resolve/varargs")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Varargs extends AbstractResolveTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInVarargs() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/resolve/varargs"), Pattern.compile("^(.+)\\.resolve$"), null, true);
        }

        @TestMetadata("MoreSpecificVarargsOfEqualLength.resolve")
        public void testMoreSpecificVarargsOfEqualLength() throws Exception {
            runTest("compiler/testData/resolve/varargs/MoreSpecificVarargsOfEqualLength.resolve");
        }

        @TestMetadata("NilaryVsVararg.resolve")
        public void testNilaryVsVararg() throws Exception {
            runTest("compiler/testData/resolve/varargs/NilaryVsVararg.resolve");
        }

        @TestMetadata("UnaryVsVararg.resolve")
        public void testUnaryVsVararg() throws Exception {
            runTest("compiler/testData/resolve/varargs/UnaryVsVararg.resolve");
        }
    }
}