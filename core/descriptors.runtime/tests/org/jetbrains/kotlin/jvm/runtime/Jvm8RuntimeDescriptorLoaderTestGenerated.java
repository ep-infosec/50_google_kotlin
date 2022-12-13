/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jvm.runtime;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateRuntimeDescriptorTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/loadJava8/compiledJava")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class Jvm8RuntimeDescriptorLoaderTestGenerated extends AbstractJvm8RuntimeDescriptorLoaderTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInCompiledJava() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/compiledJava"), Pattern.compile("^(.+)\\.java$"), null, true);
    }

    @TestMetadata("InnerClassTypeAnnotation.java")
    public void testInnerClassTypeAnnotation() throws Exception {
        runTest("compiler/testData/loadJava8/compiledJava/InnerClassTypeAnnotation.java");
    }

    @TestMetadata("MapRemove.java")
    public void testMapRemove() throws Exception {
        runTest("compiler/testData/loadJava8/compiledJava/MapRemove.java");
    }

    @TestMetadata("ParameterNames.java")
    public void testParameterNames() throws Exception {
        runTest("compiler/testData/loadJava8/compiledJava/ParameterNames.java");
    }

    @TestMetadata("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TypeParameterAnnotations extends AbstractJvm8RuntimeDescriptorLoaderTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInTypeParameterAnnotations() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations"), Pattern.compile("^(.+)\\.java$"), null, true);
        }

        @TestMetadata("Basic.java")
        public void testBasic() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations/Basic.java");
        }

        @TestMetadata("Basic_DisabledImprovements.java")
        public void testBasic_DisabledImprovements() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations/Basic_DisabledImprovements.java");
        }
    }

    @TestMetadata("compiler/testData/loadJava8/compiledJava/typeUseAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TypeUseAnnotations extends AbstractJvm8RuntimeDescriptorLoaderTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInTypeUseAnnotations() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/compiledJava/typeUseAnnotations"), Pattern.compile("^(.+)\\.java$"), null, true);
        }

        @TestMetadata("BaseClassTypeArguments.java")
        public void testBaseClassTypeArguments() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/BaseClassTypeArguments.java");
        }

        @TestMetadata("Basic.java")
        public void testBasic() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/Basic.java");
        }

        @TestMetadata("Basic_DisabledImprovements.java")
        public void testBasic_DisabledImprovements() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/Basic_DisabledImprovements.java");
        }

        @TestMetadata("ClassTypeParameterBounds.java")
        public void testClassTypeParameterBounds() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/ClassTypeParameterBounds.java");
        }

        @TestMetadata("MethodReceiver.java")
        public void testMethodReceiver() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/MethodReceiver.java");
        }

        @TestMetadata("MethodTypeParameterBounds.java")
        public void testMethodTypeParameterBounds() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/MethodTypeParameterBounds.java");
        }

        @TestMetadata("ReturnType.java")
        public void testReturnType() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/ReturnType.java");
        }

        @TestMetadata("ValueArguments.java")
        public void testValueArguments() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/ValueArguments.java");
        }
    }
}