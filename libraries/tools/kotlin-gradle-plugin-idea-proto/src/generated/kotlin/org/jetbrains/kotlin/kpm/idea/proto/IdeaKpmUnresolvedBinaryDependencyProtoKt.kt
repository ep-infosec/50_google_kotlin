//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

@kotlin.jvm.JvmSynthetic
internal inline fun ideaKpmUnresolvedBinaryDependencyProto(block: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProtoKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto =
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProtoKt.Dsl._create(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto.newBuilder()).apply { block() }._build()
internal object IdeaKpmUnresolvedBinaryDependencyProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  internal class Dsl private constructor(
    private val _builder: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto.Builder
  ) {
    internal companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto = _builder.build()

    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     */
    internal var extras: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto
      @JvmName("getExtras")
      get() = _builder.getExtras()
      @JvmName("setExtras")
      set(value) {
        _builder.setExtras(value)
      }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     */
    internal fun clearExtras() {
      _builder.clearExtras()
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     * @return Whether the extras field is set.
     */
    internal fun hasExtras(): kotlin.Boolean {
      return _builder.hasExtras()
    }

    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     */
    internal var coordinates: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto
      @JvmName("getCoordinates")
      get() = _builder.getCoordinates()
      @JvmName("setCoordinates")
      set(value) {
        _builder.setCoordinates(value)
      }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     */
    internal fun clearCoordinates() {
      _builder.clearCoordinates()
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     * @return Whether the coordinates field is set.
     */
    internal fun hasCoordinates(): kotlin.Boolean {
      return _builder.hasCoordinates()
    }

    /**
     * <code>optional string cause = 3;</code>
     */
    internal var cause: kotlin.String
      @JvmName("getCause")
      get() = _builder.getCause()
      @JvmName("setCause")
      set(value) {
        _builder.setCause(value)
      }
    /**
     * <code>optional string cause = 3;</code>
     */
    internal fun clearCause() {
      _builder.clearCause()
    }
    /**
     * <code>optional string cause = 3;</code>
     * @return Whether the cause field is set.
     */
    internal fun hasCause(): kotlin.Boolean {
      return _builder.hasCause()
    }
  }
}
@kotlin.jvm.JvmSynthetic
internal inline fun org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto.copy(block: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProtoKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto =
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()