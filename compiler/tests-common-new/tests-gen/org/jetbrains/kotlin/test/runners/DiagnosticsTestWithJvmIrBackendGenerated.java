/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend")
@TestDataPath("$PROJECT_ROOT")
public class DiagnosticsTestWithJvmIrBackendGenerated extends AbstractDiagnosticsTestWithJvmIrBackend {
    @Test
    public void testAllFilesPresentInTestsWithJvmBackend() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
    }

    @Test
    @TestMetadata("indirectInlineCycle_ir.kt")
    public void testIndirectInlineCycle_ir() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithJvmBackend/indirectInlineCycle_ir.kt");
    }

    @Test
    @TestMetadata("inlineCycle_ir.kt")
    public void testInlineCycle_ir() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithJvmBackend/inlineCycle_ir.kt");
    }

    @Test
    @TestMetadata("multipleBigArityFunsImplemented_ir.kt")
    public void testMultipleBigArityFunsImplemented_ir() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithJvmBackend/multipleBigArityFunsImplemented_ir.kt");
    }

    @Test
    @TestMetadata("noWarningInLV1_5.kt")
    public void testNoWarningInLV1_5() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithJvmBackend/noWarningInLV1_5.kt");
    }

    @Test
    @TestMetadata("propertyInlineCycle.kt")
    public void testPropertyInlineCycle() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithJvmBackend/propertyInlineCycle.kt");
    }

    @Test
    @TestMetadata("suspendInlineCycle_ir.kt")
    public void testSuspendInlineCycle_ir() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithJvmBackend/suspendInlineCycle_ir.kt");
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/dataObjects")
    @TestDataPath("$PROJECT_ROOT")
    public class DataObjects {
        @Test
        public void testAllFilesPresentInDataObjects() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/dataObjects"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("customReadResolve.kt")
        public void testCustomReadResolve() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/dataObjects/customReadResolve.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature")
    @TestDataPath("$PROJECT_ROOT")
    public class DuplicateJvmSignature {
        @Test
        public void testAllFilesPresentInDuplicateJvmSignature() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("caseInProperties.kt")
        public void testCaseInProperties() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/caseInProperties.kt");
        }

        @Test
        @TestMetadata("changingNullabilityOfOrdinaryClassIsBinaryCompatibleChange.kt")
        public void testChangingNullabilityOfOrdinaryClassIsBinaryCompatibleChange() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/changingNullabilityOfOrdinaryClassIsBinaryCompatibleChange.kt");
        }

        @Test
        @TestMetadata("vararg.kt")
        public void testVararg() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/vararg.kt");
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides")
        @TestDataPath("$PROJECT_ROOT")
        public class AccidentalOverrides {
            @Test
            @TestMetadata("accidentalOverrideFromGrandparent.kt")
            public void testAccidentalOverrideFromGrandparent() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/accidentalOverrideFromGrandparent.kt");
            }

            @Test
            public void testAllFilesPresentInAccidentalOverrides() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
            }

            @Test
            @TestMetadata("classFunctionOverriddenByProperty.kt")
            public void testClassFunctionOverriddenByProperty() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/classFunctionOverriddenByProperty.kt");
            }

            @Test
            @TestMetadata("classFunctionOverriddenByPropertyInConstructor.kt")
            public void testClassFunctionOverriddenByPropertyInConstructor() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/classFunctionOverriddenByPropertyInConstructor.kt");
            }

            @Test
            @TestMetadata("classFunctionOverriddenByPropertyNoGetter.kt")
            public void testClassFunctionOverriddenByPropertyNoGetter() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/classFunctionOverriddenByPropertyNoGetter.kt");
            }

            @Test
            @TestMetadata("classPropertyOverriddenByFunction.kt")
            public void testClassPropertyOverriddenByFunction() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/classPropertyOverriddenByFunction.kt");
            }

            @Test
            @TestMetadata("defaultFunction_ir.kt")
            public void testDefaultFunction_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/defaultFunction_ir.kt");
            }

            @Test
            @TestMetadata("delegatedFunctionOverriddenByProperty_ir.kt")
            public void testDelegatedFunctionOverriddenByProperty_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/delegatedFunctionOverriddenByProperty_ir.kt");
            }

            @Test
            @TestMetadata("genericClassFunction.kt")
            public void testGenericClassFunction() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/genericClassFunction.kt");
            }

            @Test
            @TestMetadata("overridesNothing_ir.kt")
            public void testOverridesNothing_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/overridesNothing_ir.kt");
            }

            @Test
            @TestMetadata("privateClassFunctionOverriddenByProperty.kt")
            public void testPrivateClassFunctionOverriddenByProperty() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/privateClassFunctionOverriddenByProperty.kt");
            }

            @Test
            @TestMetadata("traitFunctionOverriddenByPropertyNoImpl.kt")
            public void testTraitFunctionOverriddenByPropertyNoImpl() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/traitFunctionOverriddenByPropertyNoImpl.kt");
            }

            @Test
            @TestMetadata("traitFunctionOverriddenByProperty_ir.kt")
            public void testTraitFunctionOverriddenByProperty_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/traitFunctionOverriddenByProperty_ir.kt");
            }

            @Test
            @TestMetadata("traitPropertyOverriddenByFunctionNoImpl.kt")
            public void testTraitPropertyOverriddenByFunctionNoImpl() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/traitPropertyOverriddenByFunctionNoImpl.kt");
            }

            @Test
            @TestMetadata("traitPropertyOverriddenByFunction_ir.kt")
            public void testTraitPropertyOverriddenByFunction_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/traitPropertyOverriddenByFunction_ir.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/bridges")
        @TestDataPath("$PROJECT_ROOT")
        public class Bridges {
            @Test
            public void testAllFilesPresentInBridges() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/bridges"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
            }

            @Test
            @TestMetadata("class_ir.kt")
            public void testClass_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/bridges/class_ir.kt");
            }

            @Test
            @TestMetadata("fakeOverrideTrait_ir.kt")
            public void testFakeOverrideTrait_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/bridges/fakeOverrideTrait_ir.kt");
            }

            @Test
            @TestMetadata("trait_ir.kt")
            public void testTrait_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/bridges/trait_ir.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure")
        @TestDataPath("$PROJECT_ROOT")
        public class Erasure {
            @Test
            public void testAllFilesPresentInErasure() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
            }

            @Test
            @TestMetadata("clashFromInterfaceAndSuperClass_ir.kt")
            public void testClashFromInterfaceAndSuperClass_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/clashFromInterfaceAndSuperClass_ir.kt");
            }

            @Test
            @TestMetadata("collections.kt")
            public void testCollections() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/collections.kt");
            }

            @Test
            @TestMetadata("delegateToTwoTraits.kt")
            public void testDelegateToTwoTraits() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/delegateToTwoTraits.kt");
            }

            @Test
            @TestMetadata("delegationAndOwnMethod.kt")
            public void testDelegationAndOwnMethod() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/delegationAndOwnMethod.kt");
            }

            @Test
            @TestMetadata("delegationToTraitImplAndOwnMethod.kt")
            public void testDelegationToTraitImplAndOwnMethod() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/delegationToTraitImplAndOwnMethod.kt");
            }

            @Test
            @TestMetadata("extensionProperties.kt")
            public void testExtensionProperties() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/extensionProperties.kt");
            }

            @Test
            @TestMetadata("genericType.kt")
            public void testGenericType() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/genericType.kt");
            }

            @Test
            @TestMetadata("inheritFromTwoTraits_ir.kt")
            public void testInheritFromTwoTraits_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/inheritFromTwoTraits_ir.kt");
            }

            @Test
            @TestMetadata("kotlinAndJavaCollections.kt")
            public void testKotlinAndJavaCollections() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/kotlinAndJavaCollections.kt");
            }

            @Test
            @TestMetadata("nullableType.kt")
            public void testNullableType() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/nullableType.kt");
            }

            @Test
            @TestMetadata("superTraitAndDelegationToTraitImpl_ir.kt")
            public void testSuperTraitAndDelegationToTraitImpl_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/superTraitAndDelegationToTraitImpl_ir.kt");
            }

            @Test
            @TestMetadata("twoTraitsAndOwnFunction_ir.kt")
            public void testTwoTraitsAndOwnFunction_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/twoTraitsAndOwnFunction_ir.kt");
            }

            @Test
            @TestMetadata("typeMappedToJava.kt")
            public void testTypeMappedToJava() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/typeMappedToJava.kt");
            }

            @Test
            @TestMetadata("typeParameter.kt")
            public void testTypeParameter() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/typeParameter.kt");
            }

            @Test
            @TestMetadata("typeParameterWithBound.kt")
            public void testTypeParameterWithBound() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/typeParameterWithBound.kt");
            }

            @Test
            @TestMetadata("typeParameterWithTwoBounds.kt")
            public void testTypeParameterWithTwoBounds() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/typeParameterWithTwoBounds.kt");
            }

            @Test
            @TestMetadata("typeParameterWithTwoBoundsInWhere.kt")
            public void testTypeParameterWithTwoBoundsInWhere() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/typeParameterWithTwoBoundsInWhere.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/finalMembersFromBuiltIns")
        @TestDataPath("$PROJECT_ROOT")
        public class FinalMembersFromBuiltIns {
            @Test
            public void testAllFilesPresentInFinalMembersFromBuiltIns() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/finalMembersFromBuiltIns"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
            }

            @Test
            @TestMetadata("enumMembers.kt")
            public void testEnumMembers() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/finalMembersFromBuiltIns/enumMembers.kt");
            }

            @Test
            @TestMetadata("waitNotifyGetClass_ir.kt")
            public void testWaitNotifyGetClass_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/finalMembersFromBuiltIns/waitNotifyGetClass_ir.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty")
        @TestDataPath("$PROJECT_ROOT")
        public class FunctionAndProperty {
            @Test
            public void testAllFilesPresentInFunctionAndProperty() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
            }

            @Test
            @TestMetadata("class.kt")
            public void testClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/class.kt");
            }

            @Test
            @TestMetadata("classObject.kt")
            public void testClassObject() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/classObject.kt");
            }

            @Test
            @TestMetadata("classPropertyInConstructor.kt")
            public void testClassPropertyInConstructor() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/classPropertyInConstructor.kt");
            }

            @Test
            @TestMetadata("extensionFunctionAndNormalFunction.kt")
            public void testExtensionFunctionAndNormalFunction() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/extensionFunctionAndNormalFunction.kt");
            }

            @Test
            @TestMetadata("extensionPropertyAndFunction.kt")
            public void testExtensionPropertyAndFunction() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/extensionPropertyAndFunction.kt");
            }

            @Test
            @TestMetadata("functionAndSetter.kt")
            public void testFunctionAndSetter() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/functionAndSetter.kt");
            }

            @Test
            @TestMetadata("functionAndVar.kt")
            public void testFunctionAndVar() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/functionAndVar.kt");
            }

            @Test
            @TestMetadata("localClass.kt")
            public void testLocalClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/localClass.kt");
            }

            @Test
            @TestMetadata("localClassInClass.kt")
            public void testLocalClassInClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/localClassInClass.kt");
            }

            @Test
            @TestMetadata("nestedClass.kt")
            public void testNestedClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/nestedClass.kt");
            }

            @Test
            @TestMetadata("object.kt")
            public void testObject() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/object.kt");
            }

            @Test
            @TestMetadata("objectExpression.kt")
            public void testObjectExpression() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/objectExpression.kt");
            }

            @Test
            @TestMetadata("objectExpressionInConstructor.kt")
            public void testObjectExpressionInConstructor() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/objectExpressionInConstructor.kt");
            }

            @Test
            @TestMetadata("privateClassPropertyNoClash.kt")
            public void testPrivateClassPropertyNoClash() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/privateClassPropertyNoClash.kt");
            }

            @Test
            @TestMetadata("topLevel.kt")
            public void testTopLevel() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/topLevel.kt");
            }

            @Test
            @TestMetadata("topLevelDifferentFiles.kt")
            public void testTopLevelDifferentFiles() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/topLevelDifferentFiles.kt");
            }

            @Test
            @TestMetadata("topLevelGetter.kt")
            public void testTopLevelGetter() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/topLevelGetter.kt");
            }

            @Test
            @TestMetadata("trait_ir.kt")
            public void testTrait_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/trait_ir.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames")
        @TestDataPath("$PROJECT_ROOT")
        public class SpecialNames {
            @Test
            public void testAllFilesPresentInSpecialNames() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
            }

            @Test
            @TestMetadata("classObjectCopiedField.kt")
            public void testClassObjectCopiedField() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/classObjectCopiedField.kt");
            }

            @Test
            @TestMetadata("classObjectCopiedFieldObject_ir.kt")
            public void testClassObjectCopiedFieldObject_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/classObjectCopiedFieldObject_ir.kt");
            }

            @Test
            @TestMetadata("classObject_ir.kt")
            public void testClassObject_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/classObject_ir.kt");
            }

            @Test
            @TestMetadata("dataClassCopy.kt")
            public void testDataClassCopy() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/dataClassCopy.kt");
            }

            @Test
            @TestMetadata("defaults_ir.kt")
            public void testDefaults_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/defaults_ir.kt");
            }

            @Test
            @TestMetadata("delegationBy_ir.kt")
            public void testDelegationBy_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/delegationBy_ir.kt");
            }

            @Test
            @TestMetadata("enum.kt")
            public void testEnum() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/enum.kt");
            }

            @Test
            @TestMetadata("innerClassField_ir.kt")
            public void testInnerClassField_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/innerClassField_ir.kt");
            }

            @Test
            @TestMetadata("instance_ir.kt")
            public void testInstance_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/instance_ir.kt");
            }

            @Test
            @TestMetadata("propertyMetadataCache_ir.kt")
            public void testPropertyMetadataCache_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/propertyMetadataCache_ir.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics")
        @TestDataPath("$PROJECT_ROOT")
        public class Statics {
            @Test
            public void testAllFilesPresentInStatics() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
            }

            @Test
            @TestMetadata("jkjk.kt")
            public void testJkjk() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/jkjk.kt");
            }

            @Test
            @TestMetadata("kotlinClassExtendsJavaClass.kt")
            public void testKotlinClassExtendsJavaClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/kotlinClassExtendsJavaClass.kt");
            }

            @Test
            @TestMetadata("kotlinClassExtendsJavaClassExtendsJavaClass.kt")
            public void testKotlinClassExtendsJavaClassExtendsJavaClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/kotlinClassExtendsJavaClassExtendsJavaClass.kt");
            }

            @Test
            @TestMetadata("kotlinClassImplementsJavaInterface.kt")
            public void testKotlinClassImplementsJavaInterface() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/kotlinClassImplementsJavaInterface.kt");
            }

            @Test
            @TestMetadata("kotlinClassImplementsJavaInterfaceExtendsJavaInteface.kt")
            public void testKotlinClassImplementsJavaInterfaceExtendsJavaInteface() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/kotlinClassImplementsJavaInterfaceExtendsJavaInteface.kt");
            }

            @Test
            @TestMetadata("kotlinMembersVsJavaNonVisibleStatics.kt")
            public void testKotlinMembersVsJavaNonVisibleStatics() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/kotlinMembersVsJavaNonVisibleStatics.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/synthesized")
        @TestDataPath("$PROJECT_ROOT")
        public class Synthesized {
            @Test
            public void testAllFilesPresentInSynthesized() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/synthesized"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
            }

            @Test
            @TestMetadata("enumValuesValueOf.kt")
            public void testEnumValuesValueOf() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/synthesized/enumValuesValueOf.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl")
        @TestDataPath("$PROJECT_ROOT")
        public class TraitImpl {
            @Test
            public void testAllFilesPresentInTraitImpl() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
            }

            @Test
            @TestMetadata("defaultVsNonDefault_ir.kt")
            public void testDefaultVsNonDefault_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl/defaultVsNonDefault_ir.kt");
            }

            @Test
            @TestMetadata("kt43611.kt")
            public void testKt43611() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl/kt43611.kt");
            }

            @Test
            @TestMetadata("oneTrait_ir.kt")
            public void testOneTrait_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl/oneTrait_ir.kt");
            }

            @Test
            @TestMetadata("traitFunctionOverriddenByPropertyInTrait_ir.kt")
            public void testTraitFunctionOverriddenByPropertyInTrait_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl/traitFunctionOverriddenByPropertyInTrait_ir.kt");
            }

            @Test
            @TestMetadata("traitPropertyOverriddenByFunctionInTrait_ir.kt")
            public void testTraitPropertyOverriddenByFunctionInTrait_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl/traitPropertyOverriddenByFunctionInTrait_ir.kt");
            }

            @Test
            @TestMetadata("twoTraits_ir.kt")
            public void testTwoTraits_ir() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl/twoTraits_ir.kt");
            }
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/multifileClasses")
    @TestDataPath("$PROJECT_ROOT")
    public class MultifileClasses {
        @Test
        public void testAllFilesPresentInMultifileClasses() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/multifileClasses"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("jvmSynthetic.kt")
        public void testJvmSynthetic() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/multifileClasses/jvmSynthetic.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/scripts")
    @TestDataPath("$PROJECT_ROOT")
    public class Scripts {
        @Test
        public void testAllFilesPresentInScripts() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/scripts"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("enumCapturesProperty.kts")
        public void testEnumCapturesProperty() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/scripts/enumCapturesProperty.kts");
        }

        @Test
        @TestMetadata("enumEntryCapturesProperty.kts")
        public void testEnumEntryCapturesProperty() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/scripts/enumEntryCapturesProperty.kts");
        }

        @Test
        @TestMetadata("interfaceCapturesProperty.kts")
        public void testInterfaceCapturesProperty() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/scripts/interfaceCapturesProperty.kts");
        }

        @Test
        @TestMetadata("nestedAndOuterClassesCaptureProperty.kts")
        public void testNestedAndOuterClassesCaptureProperty() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/scripts/nestedAndOuterClassesCaptureProperty.kts");
        }

        @Test
        @TestMetadata("nestedClassCapturesProperty.kts")
        public void testNestedClassCapturesProperty() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/scripts/nestedClassCapturesProperty.kts");
        }

        @Test
        @TestMetadata("nestedToObjectClassCapturesProperty.kts")
        public void testNestedToObjectClassCapturesProperty() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/scripts/nestedToObjectClassCapturesProperty.kts");
        }

        @Test
        @TestMetadata("objectCapturesProperty.kts")
        public void testObjectCapturesProperty() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/scripts/objectCapturesProperty.kts");
        }

        @Test
        @TestMetadata("objectCapturesPropertyIndirect.kts")
        public void testObjectCapturesPropertyIndirect() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/scripts/objectCapturesPropertyIndirect.kts");
        }

        @Test
        @TestMetadata("objectCapturesPropertyViaExtension1.kts")
        public void testObjectCapturesPropertyViaExtension1() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/scripts/objectCapturesPropertyViaExtension1.kts");
        }

        @Test
        @TestMetadata("objectCapturesPropertyViaExtension2.kts")
        public void testObjectCapturesPropertyViaExtension2() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/scripts/objectCapturesPropertyViaExtension2.kts");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/typeOf")
    @TestDataPath("$PROJECT_ROOT")
    public class TypeOf {
        @Test
        public void testAllFilesPresentInTypeOf() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/typeOf"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("nonReifiedTypeParameterWithRecursiveBound.kt")
        public void testNonReifiedTypeParameterWithRecursiveBound() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/typeOf/nonReifiedTypeParameterWithRecursiveBound.kt");
        }

        @Test
        @TestMetadata("suspendType.kt")
        public void testSuspendType() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/typeOf/suspendType.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/valueClasses")
    @TestDataPath("$PROJECT_ROOT")
    public class ValueClasses {
        @Test
        public void testAllFilesPresentInValueClasses() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/valueClasses"), Pattern.compile("^(.+)\\.kts?$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("cloneable.kt")
        public void testCloneable() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/valueClasses/cloneable.kt");
        }
    }
}