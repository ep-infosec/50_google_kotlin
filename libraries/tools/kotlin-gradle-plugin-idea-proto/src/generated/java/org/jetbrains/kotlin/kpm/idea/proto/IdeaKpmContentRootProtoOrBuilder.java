// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

interface IdeaKpmContentRootProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmContentRootProto)
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
   * <code>optional string absolute_path = 2;</code>
   * @return Whether the absolutePath field is set.
   */
  boolean hasAbsolutePath();
  /**
   * <code>optional string absolute_path = 2;</code>
   * @return The absolutePath.
   */
  java.lang.String getAbsolutePath();
  /**
   * <code>optional string absolute_path = 2;</code>
   * @return The bytes for absolutePath.
   */
  com.google.protobuf.ByteString
      getAbsolutePathBytes();

  /**
   * <code>optional string type = 3;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional string type = 3;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>optional string type = 3;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}