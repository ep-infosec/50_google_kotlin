/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateJsTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/typescript-export")
@TestDataPath("$PROJECT_ROOT")
public class IrJsTypeScriptExportTestGenerated extends AbstractIrJsTypeScriptExportTest {
    @Test
    public void testAllFilesPresentInTypescript_export() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/abstract-classes")
    @TestDataPath("$PROJECT_ROOT")
    public class Abstract_classes {
        @Test
        @TestMetadata("abstract-classes.kt")
        public void testAbstract_classes() throws Exception {
            runTest("js/js.translator/testData/typescript-export/abstract-classes/abstract-classes.kt");
        }

        @Test
        public void testAllFilesPresentInAbstract_classes() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/abstract-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/abstract-classes-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Abstract_classes_in_exported_file {
        @Test
        @TestMetadata("abstract-classes.kt")
        public void testAbstract_classes() throws Exception {
            runTest("js/js.translator/testData/typescript-export/abstract-classes-in-exported-file/abstract-classes.kt");
        }

        @Test
        public void testAllFilesPresentInAbstract_classes_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/abstract-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/constructors")
    @TestDataPath("$PROJECT_ROOT")
    public class Constructors {
        @Test
        public void testAllFilesPresentInConstructors() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/constructors"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("constructors.kt")
        public void testConstructors() throws Exception {
            runTest("js/js.translator/testData/typescript-export/constructors/constructors.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/constructors-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Constructors_in_exported_file {
        @Test
        public void testAllFilesPresentInConstructors_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/constructors-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("constructors.kt")
        public void testConstructors() throws Exception {
            runTest("js/js.translator/testData/typescript-export/constructors-in-exported-file/constructors.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/data-classes")
    @TestDataPath("$PROJECT_ROOT")
    public class Data_classes {
        @Test
        public void testAllFilesPresentInData_classes() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/data-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("data-classes.kt")
        public void testData_classes() throws Exception {
            runTest("js/js.translator/testData/typescript-export/data-classes/data-classes.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/data-classes-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Data_classes_in_exported_file {
        @Test
        public void testAllFilesPresentInData_classes_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/data-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("data-classes.kt")
        public void testData_classes() throws Exception {
            runTest("js/js.translator/testData/typescript-export/data-classes-in-exported-file/data-classes.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/enum-classes")
    @TestDataPath("$PROJECT_ROOT")
    public class Enum_classes {
        @Test
        public void testAllFilesPresentInEnum_classes() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/enum-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("enum-classes.kt")
        public void testEnum_classes() throws Exception {
            runTest("js/js.translator/testData/typescript-export/enum-classes/enum-classes.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/enum-classes-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Enum_classes_in_exported_file {
        @Test
        public void testAllFilesPresentInEnum_classes_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/enum-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("enum-classes.kt")
        public void testEnum_classes() throws Exception {
            runTest("js/js.translator/testData/typescript-export/enum-classes-in-exported-file/enum-classes.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/escaped-declarations")
    @TestDataPath("$PROJECT_ROOT")
    public class Escaped_declarations {
        @Test
        public void testAllFilesPresentInEscaped_declarations() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/escaped-declarations"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("escaped-declarations.kt")
        public void testEscaped_declarations() throws Exception {
            runTest("js/js.translator/testData/typescript-export/escaped-declarations/escaped-declarations.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/escaped-declarations-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Escaped_declarations_in_exported_file {
        @Test
        public void testAllFilesPresentInEscaped_declarations_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/escaped-declarations-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("escaped-declarations.kt")
        public void testEscaped_declarations() throws Exception {
            runTest("js/js.translator/testData/typescript-export/escaped-declarations-in-exported-file/escaped-declarations.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/excluded-exported-declarations")
    @TestDataPath("$PROJECT_ROOT")
    public class Excluded_exported_declarations {
        @Test
        public void testAllFilesPresentInExcluded_exported_declarations() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/excluded-exported-declarations"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("excluded-exported-declarations.kt")
        public void testExcluded_exported_declarations() throws Exception {
            runTest("js/js.translator/testData/typescript-export/excluded-exported-declarations/excluded-exported-declarations.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/excluded-exported-declarations-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Excluded_exported_declarations_in_exported_file {
        @Test
        public void testAllFilesPresentInExcluded_exported_declarations_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/excluded-exported-declarations-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("excluded-exported-declarations.kt")
        public void testExcluded_exported_declarations() throws Exception {
            runTest("js/js.translator/testData/typescript-export/excluded-exported-declarations-in-exported-file/excluded-exported-declarations.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/functions")
    @TestDataPath("$PROJECT_ROOT")
    public class Functions {
        @Test
        public void testAllFilesPresentInFunctions() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/functions"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("functions.kt")
        public void testFunctions() throws Exception {
            runTest("js/js.translator/testData/typescript-export/functions/functions.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/functions-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Functions_in_exported_file {
        @Test
        public void testAllFilesPresentInFunctions_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/functions-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("functions.kt")
        public void testFunctions() throws Exception {
            runTest("js/js.translator/testData/typescript-export/functions-in-exported-file/functions.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/implicit-export")
    @TestDataPath("$PROJECT_ROOT")
    public class Implicit_export {
        @Test
        public void testAllFilesPresentInImplicit_export() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/implicit-export"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("implicit-export.kt")
        public void testImplicit_export() throws Exception {
            runTest("js/js.translator/testData/typescript-export/implicit-export/implicit-export.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/inheritance")
    @TestDataPath("$PROJECT_ROOT")
    public class Inheritance {
        @Test
        public void testAllFilesPresentInInheritance() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/inheritance"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("inheritance.kt")
        public void testInheritance() throws Exception {
            runTest("js/js.translator/testData/typescript-export/inheritance/inheritance.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/inner-classes")
    @TestDataPath("$PROJECT_ROOT")
    public class Inner_classes {
        @Test
        public void testAllFilesPresentInInner_classes() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/inner-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("inner-class.kt")
        public void testInner_class() throws Exception {
            runTest("js/js.translator/testData/typescript-export/inner-classes/inner-class.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/inner-classes-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Inner_classes_in_exported_file {
        @Test
        public void testAllFilesPresentInInner_classes_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/inner-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("inner-class.kt")
        public void testInner_class() throws Exception {
            runTest("js/js.translator/testData/typescript-export/inner-classes-in-exported-file/inner-class.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/interfaces")
    @TestDataPath("$PROJECT_ROOT")
    public class Interfaces {
        @Test
        public void testAllFilesPresentInInterfaces() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/interfaces"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("interfaces.kt")
        public void testInterfaces() throws Exception {
            runTest("js/js.translator/testData/typescript-export/interfaces/interfaces.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/interfaces-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Interfaces_in_exported_file {
        @Test
        public void testAllFilesPresentInInterfaces_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/interfaces-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("interfaces.kt")
        public void testInterfaces() throws Exception {
            runTest("js/js.translator/testData/typescript-export/interfaces-in-exported-file/interfaces.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/js-name")
    @TestDataPath("$PROJECT_ROOT")
    public class Js_name {
        @Test
        public void testAllFilesPresentInJs_name() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js-name"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("js-name.kt")
        public void testJs_name() throws Exception {
            runTest("js/js.translator/testData/typescript-export/js-name/js-name.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/js-name-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Js_name_in_exported_file {
        @Test
        public void testAllFilesPresentInJs_name_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js-name-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("js-name.kt")
        public void testJs_name() throws Exception {
            runTest("js/js.translator/testData/typescript-export/js-name-in-exported-file/js-name.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/member-properties")
    @TestDataPath("$PROJECT_ROOT")
    public class Member_properties {
        @Test
        public void testAllFilesPresentInMember_properties() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/member-properties"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("member-properties.kt")
        public void testMember_properties() throws Exception {
            runTest("js/js.translator/testData/typescript-export/member-properties/member-properties.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/member-properties-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Member_properties_in_exported_file {
        @Test
        public void testAllFilesPresentInMember_properties_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/member-properties-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("member-properties.kt")
        public void testMember_properties() throws Exception {
            runTest("js/js.translator/testData/typescript-export/member-properties-in-exported-file/member-properties.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/methods")
    @TestDataPath("$PROJECT_ROOT")
    public class Methods {
        @Test
        public void testAllFilesPresentInMethods() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/methods"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("methods.kt")
        public void testMethods() throws Exception {
            runTest("js/js.translator/testData/typescript-export/methods/methods.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/methods-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Methods_in_exported_file {
        @Test
        public void testAllFilesPresentInMethods_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/methods-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("methods.kt")
        public void testMethods() throws Exception {
            runTest("js/js.translator/testData/typescript-export/methods-in-exported-file/methods.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/module-systems")
    @TestDataPath("$PROJECT_ROOT")
    public class Module_systems {
        @Test
        public void testAllFilesPresentInModule_systems() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/module-systems"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("commonjs.kt")
        public void testCommonjs() throws Exception {
            runTest("js/js.translator/testData/typescript-export/module-systems/commonjs.kt");
        }

        @Test
        @TestMetadata("esm.kt")
        public void testEsm() throws Exception {
            runTest("js/js.translator/testData/typescript-export/module-systems/esm.kt");
        }

        @Test
        @TestMetadata("plain.kt")
        public void testPlain() throws Exception {
            runTest("js/js.translator/testData/typescript-export/module-systems/plain.kt");
        }

        @Test
        @TestMetadata("umd.kt")
        public void testUmd() throws Exception {
            runTest("js/js.translator/testData/typescript-export/module-systems/umd.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/module-systems-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Module_systems_in_exported_file {
        @Test
        public void testAllFilesPresentInModule_systems_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/module-systems-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("commonjs.kt")
        public void testCommonjs() throws Exception {
            runTest("js/js.translator/testData/typescript-export/module-systems-in-exported-file/commonjs.kt");
        }

        @Test
        @TestMetadata("esm.kt")
        public void testEsm() throws Exception {
            runTest("js/js.translator/testData/typescript-export/module-systems-in-exported-file/esm.kt");
        }

        @Test
        @TestMetadata("plain.kt")
        public void testPlain() throws Exception {
            runTest("js/js.translator/testData/typescript-export/module-systems-in-exported-file/plain.kt");
        }

        @Test
        @TestMetadata("umd.kt")
        public void testUmd() throws Exception {
            runTest("js/js.translator/testData/typescript-export/module-systems-in-exported-file/umd.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/namespaces")
    @TestDataPath("$PROJECT_ROOT")
    public class Namespaces {
        @Test
        public void testAllFilesPresentInNamespaces() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/namespaces"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("namespaces.kt")
        public void testNamespaces() throws Exception {
            runTest("js/js.translator/testData/typescript-export/namespaces/namespaces.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/namespaces-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Namespaces_in_exported_file {
        @Test
        public void testAllFilesPresentInNamespaces_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/namespaces-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("namespaces.kt")
        public void testNamespaces() throws Exception {
            runTest("js/js.translator/testData/typescript-export/namespaces-in-exported-file/namespaces.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/not-exported-declarations")
    @TestDataPath("$PROJECT_ROOT")
    public class Not_exported_declarations {
        @Test
        public void testAllFilesPresentInNot_exported_declarations() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/not-exported-declarations"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("not-exported-declarations.kt")
        public void testNot_exported_declarations() throws Exception {
            runTest("js/js.translator/testData/typescript-export/not-exported-declarations/not-exported-declarations.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/not-exported-declarations-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Not_exported_declarations_in_exported_file {
        @Test
        public void testAllFilesPresentInNot_exported_declarations_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/not-exported-declarations-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("not-exported-declarations.kt")
        public void testNot_exported_declarations() throws Exception {
            runTest("js/js.translator/testData/typescript-export/not-exported-declarations-in-exported-file/not-exported-declarations.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/objects")
    @TestDataPath("$PROJECT_ROOT")
    public class Objects {
        @Test
        public void testAllFilesPresentInObjects() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/objects"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("objects.kt")
        public void testObjects() throws Exception {
            runTest("js/js.translator/testData/typescript-export/objects/objects.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/objects-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Objects_in_exported_file {
        @Test
        public void testAllFilesPresentInObjects_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/objects-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("objects.kt")
        public void testObjects() throws Exception {
            runTest("js/js.translator/testData/typescript-export/objects-in-exported-file/objects.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/primitives")
    @TestDataPath("$PROJECT_ROOT")
    public class Primitives {
        @Test
        public void testAllFilesPresentInPrimitives() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/primitives"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("primitives.kt")
        public void testPrimitives() throws Exception {
            runTest("js/js.translator/testData/typescript-export/primitives/primitives.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/primitives-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Primitives_in_exported_file {
        @Test
        public void testAllFilesPresentInPrimitives_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/primitives-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("primitives.kt")
        public void testPrimitives() throws Exception {
            runTest("js/js.translator/testData/typescript-export/primitives-in-exported-file/primitives.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/properties")
    @TestDataPath("$PROJECT_ROOT")
    public class Properties {
        @Test
        public void testAllFilesPresentInProperties() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/properties"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("properties.kt")
        public void testProperties() throws Exception {
            runTest("js/js.translator/testData/typescript-export/properties/properties.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/properties-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Properties_in_exported_file {
        @Test
        public void testAllFilesPresentInProperties_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/properties-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("properties.kt")
        public void testProperties() throws Exception {
            runTest("js/js.translator/testData/typescript-export/properties-in-exported-file/properties.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/regular-classes")
    @TestDataPath("$PROJECT_ROOT")
    public class Regular_classes {
        @Test
        public void testAllFilesPresentInRegular_classes() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/regular-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("regular-classes.kt")
        public void testRegular_classes() throws Exception {
            runTest("js/js.translator/testData/typescript-export/regular-classes/regular-classes.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/regular-classes-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Regular_classes_in_exported_file {
        @Test
        public void testAllFilesPresentInRegular_classes_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/regular-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("regular-classes.kt")
        public void testRegular_classes() throws Exception {
            runTest("js/js.translator/testData/typescript-export/regular-classes-in-exported-file/regular-classes.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/sealed-classes")
    @TestDataPath("$PROJECT_ROOT")
    public class Sealed_classes {
        @Test
        public void testAllFilesPresentInSealed_classes() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/sealed-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("sealed-classes.kt")
        public void testSealed_classes() throws Exception {
            runTest("js/js.translator/testData/typescript-export/sealed-classes/sealed-classes.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/sealed-classes-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Sealed_classes_in_exported_file {
        @Test
        public void testAllFilesPresentInSealed_classes_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/sealed-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("sealed-classes.kt")
        public void testSealed_classes() throws Exception {
            runTest("js/js.translator/testData/typescript-export/sealed-classes-in-exported-file/sealed-classes.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/selective-export")
    @TestDataPath("$PROJECT_ROOT")
    public class Selective_export {
        @Test
        public void testAllFilesPresentInSelective_export() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/selective-export"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("selective-export.kt")
        public void testSelective_export() throws Exception {
            runTest("js/js.translator/testData/typescript-export/selective-export/selective-export.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/strict-implicit-export")
    @TestDataPath("$PROJECT_ROOT")
    public class Strict_implicit_export {
        @Test
        public void testAllFilesPresentInStrict_implicit_export() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/strict-implicit-export"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("strict-implicit-export.kt")
        public void testStrict_implicit_export() throws Exception {
            runTest("js/js.translator/testData/typescript-export/strict-implicit-export/strict-implicit-export.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/visibility")
    @TestDataPath("$PROJECT_ROOT")
    public class Visibility {
        @Test
        public void testAllFilesPresentInVisibility() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/visibility"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("visibility.kt")
        public void testVisibility() throws Exception {
            runTest("js/js.translator/testData/typescript-export/visibility/visibility.kt");
        }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/typescript-export/visibility-in-exported-file")
    @TestDataPath("$PROJECT_ROOT")
    public class Visibility_in_exported_file {
        @Test
        public void testAllFilesPresentInVisibility_in_exported_file() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/visibility-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("visibility.kt")
        public void testVisibility() throws Exception {
            runTest("js/js.translator/testData/typescript-export/visibility-in-exported-file/visibility.kt");
        }
    }
}