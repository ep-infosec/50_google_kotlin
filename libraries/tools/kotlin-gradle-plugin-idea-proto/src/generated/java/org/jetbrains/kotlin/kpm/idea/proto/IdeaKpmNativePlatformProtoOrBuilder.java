// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

interface IdeaKpmNativePlatformProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmNativePlatformProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
   * @return Whether the extras field is set.
   */
  boolean hasExtras();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
   * @return The extras.
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto getExtras();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProtoOrBuilder getExtrasOrBuilder();

  /**
   * <code>optional string konan_target = 2;</code>
   * @return Whether the konanTarget field is set.
   */
  boolean hasKonanTarget();
  /**
   * <code>optional string konan_target = 2;</code>
   * @return The konanTarget.
   */
  java.lang.String getKonanTarget();
  /**
   * <code>optional string konan_target = 2;</code>
   * @return The bytes for konanTarget.
   */
  com.google.protobuf.ByteString
      getKonanTargetBytes();
}
