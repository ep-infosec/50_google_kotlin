// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

interface IdeaKpmFragmentDependencyProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentDependencyProto)
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
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentDependencyProto.Type type = 2;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentDependencyProto.Type type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentDependencyProto.Type type = 2;</code>
   * @return The type.
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentDependencyProto.Type getType();

  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentCoordinatesProto coordinates = 3;</code>
   * @return Whether the coordinates field is set.
   */
  boolean hasCoordinates();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentCoordinatesProto coordinates = 3;</code>
   * @return The coordinates.
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentCoordinatesProto getCoordinates();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentCoordinatesProto coordinates = 3;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentCoordinatesProtoOrBuilder getCoordinatesOrBuilder();
}