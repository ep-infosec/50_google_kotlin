/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.diagnostics;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class DiagnosticWithParameters4<E extends PsiElement, A, B, C, D> extends AbstractDiagnostic<E> implements DiagnosticWithParameters4Marker<A, B, C, D> {
    private final A a;
    private final B b;
    private final C c;
    private final D d;

    public DiagnosticWithParameters4(
            @NotNull E psiElement,
            @NotNull A a,
            @NotNull B b,
            @NotNull C c,
            @NotNull D d,
            @NotNull DiagnosticFactory4<E, A, B, C, D> factory,
            @NotNull Severity severity
    ) {
        super(psiElement, factory, severity);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @NotNull
    @Override
    @SuppressWarnings("unchecked")
    public DiagnosticFactory4<E, A, B, C, D> getFactory() {
        return (DiagnosticFactory4<E, A, B, C, D>) super.getFactory();
    }

    @NotNull
    @Override
    public A getA() {
        return a;
    }

    @NotNull
    @Override
    public B getB() {
        return b;
    }

    @NotNull
    @Override
    public C getC() {
        return c;
    }

    @NotNull
    @Override
    public D getD() {
        return d;
    }

    @Override
    public String toString() {
        return getFactory() + "(a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DiagnosticWithParameters4<?, ?, ?, ?, ?> that = (DiagnosticWithParameters4<?, ?, ?, ?, ?>) o;
        return Objects.equals(a, that.a) &&
               Objects.equals(b, that.b) &&
               Objects.equals(c, that.c) &&
               Objects.equals(d, that.d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), a, b, c, d);
    }
}
