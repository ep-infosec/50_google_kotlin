//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

@kotlin.jvm.JvmSynthetic
internal inline fun ideaKpmContentRootProto(block: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProtoKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProto =
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProtoKt.Dsl._create(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProto.newBuilder()).apply { block() }._build()
internal object IdeaKpmContentRootProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  internal class Dsl private constructor(
    private val _builder: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProto.Builder
  ) {
    internal companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProto = _builder.build()

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
     * <code>optional string absolute_path = 2;</code>
     */
    internal var absolutePath: kotlin.String
      @JvmName("getAbsolutePath")
      get() = _builder.getAbsolutePath()
      @JvmName("setAbsolutePath")
      set(value) {
        _builder.setAbsolutePath(value)
      }
    /**
     * <code>optional string absolute_path = 2;</code>
     */
    internal fun clearAbsolutePath() {
      _builder.clearAbsolutePath()
    }
    /**
     * <code>optional string absolute_path = 2;</code>
     * @return Whether the absolutePath field is set.
     */
    internal fun hasAbsolutePath(): kotlin.Boolean {
      return _builder.hasAbsolutePath()
    }

    /**
     * <code>optional string type = 3;</code>
     */
    internal var type: kotlin.String
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * <code>optional string type = 3;</code>
     */
    internal fun clearType() {
      _builder.clearType()
    }
    /**
     * <code>optional string type = 3;</code>
     * @return Whether the type field is set.
     */
    internal fun hasType(): kotlin.Boolean {
      return _builder.hasType()
    }
  }
}
@kotlin.jvm.JvmSynthetic
internal inline fun org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProto.copy(block: org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProtoKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProto =
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()