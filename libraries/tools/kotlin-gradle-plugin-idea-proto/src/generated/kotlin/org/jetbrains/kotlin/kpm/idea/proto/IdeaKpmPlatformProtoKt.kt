//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

@kotlin.jvm.JvmSynthetic
internal inline fun ideaKpmPlatformProto(block: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProtoKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto =
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProtoKt.Dsl._create(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto.newBuilder()).apply { block() }._build()
internal object IdeaKpmPlatformProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  internal class Dsl private constructor(
    private val _builder: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto.Builder
  ) {
    internal companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto = _builder.build()

    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmJvmPlatformProto jvm = 1;</code>
     */
    internal var jvm: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmJvmPlatformProto
      @JvmName("getJvm")
      get() = _builder.getJvm()
      @JvmName("setJvm")
      set(value) {
        _builder.setJvm(value)
      }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmJvmPlatformProto jvm = 1;</code>
     */
    internal fun clearJvm() {
      _builder.clearJvm()
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmJvmPlatformProto jvm = 1;</code>
     * @return Whether the jvm field is set.
     */
    internal fun hasJvm(): kotlin.Boolean {
      return _builder.hasJvm()
    }

    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmNativePlatformProto native = 2;</code>
     */
    internal var native: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmNativePlatformProto
      @JvmName("getNative")
      get() = _builder.getNative()
      @JvmName("setNative")
      set(value) {
        _builder.setNative(value)
      }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmNativePlatformProto native = 2;</code>
     */
    internal fun clearNative() {
      _builder.clearNative()
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmNativePlatformProto native = 2;</code>
     * @return Whether the native field is set.
     */
    internal fun hasNative(): kotlin.Boolean {
      return _builder.hasNative()
    }

    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmJsPlatformProto js = 3;</code>
     */
    internal var js: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmJsPlatformProto
      @JvmName("getJs")
      get() = _builder.getJs()
      @JvmName("setJs")
      set(value) {
        _builder.setJs(value)
      }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmJsPlatformProto js = 3;</code>
     */
    internal fun clearJs() {
      _builder.clearJs()
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmJsPlatformProto js = 3;</code>
     * @return Whether the js field is set.
     */
    internal fun hasJs(): kotlin.Boolean {
      return _builder.hasJs()
    }

    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmWasmPlatformProto wasm = 4;</code>
     */
    internal var wasm: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmWasmPlatformProto
      @JvmName("getWasm")
      get() = _builder.getWasm()
      @JvmName("setWasm")
      set(value) {
        _builder.setWasm(value)
      }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmWasmPlatformProto wasm = 4;</code>
     */
    internal fun clearWasm() {
      _builder.clearWasm()
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmWasmPlatformProto wasm = 4;</code>
     * @return Whether the wasm field is set.
     */
    internal fun hasWasm(): kotlin.Boolean {
      return _builder.hasWasm()
    }

    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto unknown = 5;</code>
     */
    internal var unknown: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto
      @JvmName("getUnknown")
      get() = _builder.getUnknown()
      @JvmName("setUnknown")
      set(value) {
        _builder.setUnknown(value)
      }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto unknown = 5;</code>
     */
    internal fun clearUnknown() {
      _builder.clearUnknown()
    }
    /**
     * <code>.org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto unknown = 5;</code>
     * @return Whether the unknown field is set.
     */
    internal fun hasUnknown(): kotlin.Boolean {
      return _builder.hasUnknown()
    }
    internal val platformCase: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto.PlatformCase
      @JvmName("getPlatformCase")
      get() = _builder.getPlatformCase()

    internal fun clearPlatform() {
      _builder.clearPlatform()
    }
  }
}
@kotlin.jvm.JvmSynthetic
internal inline fun org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto.copy(block: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProtoKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto =
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()
