//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

@kotlin.jvm.JvmSynthetic
internal inline fun ideaKpmResolvedBinaryDependencyProto(block: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmResolvedBinaryDependencyProtoKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmResolvedBinaryDependencyProto =
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmResolvedBinaryDependencyProtoKt.Dsl._create(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmResolvedBinaryDependencyProto.newBuilder()).apply { block() }._build()
internal object IdeaKpmResolvedBinaryDependencyProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  internal class Dsl private constructor(
    private val _builder: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmResolvedBinaryDependencyProto.Builder
  ) {
    internal companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmResolvedBinaryDependencyProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmResolvedBinaryDependencyProto = _builder.build()

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
     * <code>optional string binary_type = 3;</code>
     */
    internal var binaryType: kotlin.String
      @JvmName("getBinaryType")
      get() = _builder.getBinaryType()
      @JvmName("setBinaryType")
      set(value) {
        _builder.setBinaryType(value)
      }
    /**
     * <code>optional string binary_type = 3;</code>
     */
    internal fun clearBinaryType() {
      _builder.clearBinaryType()
    }
    /**
     * <code>optional string binary_type = 3;</code>
     * @return Whether the binaryType field is set.
     */
    internal fun hasBinaryType(): kotlin.Boolean {
      return _builder.hasBinaryType()
    }

    /**
     * <code>optional string binary_file_absolute_path = 4;</code>
     */
    internal var binaryFileAbsolutePath: kotlin.String
      @JvmName("getBinaryFileAbsolutePath")
      get() = _builder.getBinaryFileAbsolutePath()
      @JvmName("setBinaryFileAbsolutePath")
      set(value) {
        _builder.setBinaryFileAbsolutePath(value)
      }
    /**
     * <code>optional string binary_file_absolute_path = 4;</code>
     */
    internal fun clearBinaryFileAbsolutePath() {
      _builder.clearBinaryFileAbsolutePath()
    }
    /**
     * <code>optional string binary_file_absolute_path = 4;</code>
     * @return Whether the binaryFileAbsolutePath field is set.
     */
    internal fun hasBinaryFileAbsolutePath(): kotlin.Boolean {
      return _builder.hasBinaryFileAbsolutePath()
    }
  }
}
@kotlin.jvm.JvmSynthetic
internal inline fun org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmResolvedBinaryDependencyProto.copy(block: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmResolvedBinaryDependencyProtoKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmResolvedBinaryDependencyProto =
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmResolvedBinaryDependencyProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()
