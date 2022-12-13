// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto}
 */
final class IdeaKpmUnresolvedBinaryDependencyProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto)
    IdeaKpmUnresolvedBinaryDependencyProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IdeaKpmUnresolvedBinaryDependencyProto.newBuilder() to construct.
  private IdeaKpmUnresolvedBinaryDependencyProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IdeaKpmUnresolvedBinaryDependencyProto() {
    cause_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IdeaKpmUnresolvedBinaryDependencyProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IdeaKpmUnresolvedBinaryDependencyProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = extras_.toBuilder();
            }
            extras_ = input.readMessage(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(extras_);
              extras_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = coordinates_.toBuilder();
            }
            coordinates_ = input.readMessage(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(coordinates_);
              coordinates_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000004;
            cause_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmUnresolvedBinaryDependencyProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmUnresolvedBinaryDependencyProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto.class, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto.Builder.class);
  }

  private int bitField0_;
  public static final int EXTRAS_FIELD_NUMBER = 1;
  private org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras_;
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
   * @return Whether the extras field is set.
   */
  @java.lang.Override
  public boolean hasExtras() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
   * @return The extras.
   */
  @java.lang.Override
  public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto getExtras() {
    return extras_ == null ? org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.getDefaultInstance() : extras_;
  }
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
   */
  @java.lang.Override
  public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProtoOrBuilder getExtrasOrBuilder() {
    return extras_ == null ? org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.getDefaultInstance() : extras_;
  }

  public static final int COORDINATES_FIELD_NUMBER = 2;
  private org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates_;
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
   * @return Whether the coordinates field is set.
   */
  @java.lang.Override
  public boolean hasCoordinates() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
   * @return The coordinates.
   */
  @java.lang.Override
  public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto getCoordinates() {
    return coordinates_ == null ? org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.getDefaultInstance() : coordinates_;
  }
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
   */
  @java.lang.Override
  public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProtoOrBuilder getCoordinatesOrBuilder() {
    return coordinates_ == null ? org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.getDefaultInstance() : coordinates_;
  }

  public static final int CAUSE_FIELD_NUMBER = 3;
  private volatile java.lang.Object cause_;
  /**
   * <code>optional string cause = 3;</code>
   * @return Whether the cause field is set.
   */
  @java.lang.Override
  public boolean hasCause() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string cause = 3;</code>
   * @return The cause.
   */
  @java.lang.Override
  public java.lang.String getCause() {
    java.lang.Object ref = cause_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cause_ = s;
      return s;
    }
  }
  /**
   * <code>optional string cause = 3;</code>
   * @return The bytes for cause.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCauseBytes() {
    java.lang.Object ref = cause_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cause_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getExtras());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getCoordinates());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cause_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getExtras());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCoordinates());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cause_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto)) {
      return super.equals(obj);
    }
    org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto other = (org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto) obj;

    if (hasExtras() != other.hasExtras()) return false;
    if (hasExtras()) {
      if (!getExtras()
          .equals(other.getExtras())) return false;
    }
    if (hasCoordinates() != other.hasCoordinates()) return false;
    if (hasCoordinates()) {
      if (!getCoordinates()
          .equals(other.getCoordinates())) return false;
    }
    if (hasCause() != other.hasCause()) return false;
    if (hasCause()) {
      if (!getCause()
          .equals(other.getCause())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasExtras()) {
      hash = (37 * hash) + EXTRAS_FIELD_NUMBER;
      hash = (53 * hash) + getExtras().hashCode();
    }
    if (hasCoordinates()) {
      hash = (37 * hash) + COORDINATES_FIELD_NUMBER;
      hash = (53 * hash) + getCoordinates().hashCode();
    }
    if (hasCause()) {
      hash = (37 * hash) + CAUSE_FIELD_NUMBER;
      hash = (53 * hash) + getCause().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto)
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmUnresolvedBinaryDependencyProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmUnresolvedBinaryDependencyProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto.class, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto.Builder.class);
    }

    // Construct using org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getExtrasFieldBuilder();
        getCoordinatesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (extrasBuilder_ == null) {
        extras_ = null;
      } else {
        extrasBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (coordinatesBuilder_ == null) {
        coordinates_ = null;
      } else {
        coordinatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      cause_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmUnresolvedBinaryDependencyProto_descriptor;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto getDefaultInstanceForType() {
      return org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto build() {
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto buildPartial() {
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto result = new org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (extrasBuilder_ == null) {
          result.extras_ = extras_;
        } else {
          result.extras_ = extrasBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (coordinatesBuilder_ == null) {
          result.coordinates_ = coordinates_;
        } else {
          result.coordinates_ = coordinatesBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.cause_ = cause_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto) {
        return mergeFrom((org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto other) {
      if (other == org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto.getDefaultInstance()) return this;
      if (other.hasExtras()) {
        mergeExtras(other.getExtras());
      }
      if (other.hasCoordinates()) {
        mergeCoordinates(other.getCoordinates());
      }
      if (other.hasCause()) {
        bitField0_ |= 0x00000004;
        cause_ = other.cause_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.Builder, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProtoOrBuilder> extrasBuilder_;
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     * @return Whether the extras field is set.
     */
    public boolean hasExtras() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     * @return The extras.
     */
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto getExtras() {
      if (extrasBuilder_ == null) {
        return extras_ == null ? org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.getDefaultInstance() : extras_;
      } else {
        return extrasBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     */
    public Builder setExtras(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto value) {
      if (extrasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        extras_ = value;
        onChanged();
      } else {
        extrasBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     */
    public Builder setExtras(
        org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.Builder builderForValue) {
      if (extrasBuilder_ == null) {
        extras_ = builderForValue.build();
        onChanged();
      } else {
        extrasBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     */
    public Builder mergeExtras(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto value) {
      if (extrasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            extras_ != null &&
            extras_ != org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.getDefaultInstance()) {
          extras_ =
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.newBuilder(extras_).mergeFrom(value).buildPartial();
        } else {
          extras_ = value;
        }
        onChanged();
      } else {
        extrasBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     */
    public Builder clearExtras() {
      if (extrasBuilder_ == null) {
        extras_ = null;
        onChanged();
      } else {
        extrasBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     */
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.Builder getExtrasBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getExtrasFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     */
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProtoOrBuilder getExtrasOrBuilder() {
      if (extrasBuilder_ != null) {
        return extrasBuilder_.getMessageOrBuilder();
      } else {
        return extras_ == null ?
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.getDefaultInstance() : extras_;
      }
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.Builder, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProtoOrBuilder> 
        getExtrasFieldBuilder() {
      if (extrasBuilder_ == null) {
        extrasBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.Builder, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProtoOrBuilder>(
                getExtras(),
                getParentForChildren(),
                isClean());
        extras_ = null;
      }
      return extrasBuilder_;
    }

    private org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.Builder, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProtoOrBuilder> coordinatesBuilder_;
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     * @return Whether the coordinates field is set.
     */
    public boolean hasCoordinates() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     * @return The coordinates.
     */
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto getCoordinates() {
      if (coordinatesBuilder_ == null) {
        return coordinates_ == null ? org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.getDefaultInstance() : coordinates_;
      } else {
        return coordinatesBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     */
    public Builder setCoordinates(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto value) {
      if (coordinatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        coordinates_ = value;
        onChanged();
      } else {
        coordinatesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     */
    public Builder setCoordinates(
        org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.Builder builderForValue) {
      if (coordinatesBuilder_ == null) {
        coordinates_ = builderForValue.build();
        onChanged();
      } else {
        coordinatesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     */
    public Builder mergeCoordinates(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto value) {
      if (coordinatesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            coordinates_ != null &&
            coordinates_ != org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.getDefaultInstance()) {
          coordinates_ =
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.newBuilder(coordinates_).mergeFrom(value).buildPartial();
        } else {
          coordinates_ = value;
        }
        onChanged();
      } else {
        coordinatesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     */
    public Builder clearCoordinates() {
      if (coordinatesBuilder_ == null) {
        coordinates_ = null;
        onChanged();
      } else {
        coordinatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     */
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.Builder getCoordinatesBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCoordinatesFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     */
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProtoOrBuilder getCoordinatesOrBuilder() {
      if (coordinatesBuilder_ != null) {
        return coordinatesBuilder_.getMessageOrBuilder();
      } else {
        return coordinates_ == null ?
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.getDefaultInstance() : coordinates_;
      }
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto coordinates = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.Builder, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProtoOrBuilder> 
        getCoordinatesFieldBuilder() {
      if (coordinatesBuilder_ == null) {
        coordinatesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProto.Builder, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmBinaryCoordinatesProtoOrBuilder>(
                getCoordinates(),
                getParentForChildren(),
                isClean());
        coordinates_ = null;
      }
      return coordinatesBuilder_;
    }

    private java.lang.Object cause_ = "";
    /**
     * <code>optional string cause = 3;</code>
     * @return Whether the cause field is set.
     */
    public boolean hasCause() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string cause = 3;</code>
     * @return The cause.
     */
    public java.lang.String getCause() {
      java.lang.Object ref = cause_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cause_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string cause = 3;</code>
     * @return The bytes for cause.
     */
    public com.google.protobuf.ByteString
        getCauseBytes() {
      java.lang.Object ref = cause_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cause_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string cause = 3;</code>
     * @param value The cause to set.
     * @return This builder for chaining.
     */
    public Builder setCause(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      cause_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string cause = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCause() {
      bitField0_ = (bitField0_ & ~0x00000004);
      cause_ = getDefaultInstance().getCause();
      onChanged();
      return this;
    }
    /**
     * <code>optional string cause = 3;</code>
     * @param value The bytes for cause to set.
     * @return This builder for chaining.
     */
    public Builder setCauseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      cause_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto)
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto)
  private static final org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto();
  }

  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IdeaKpmUnresolvedBinaryDependencyProto>
      PARSER = new com.google.protobuf.AbstractParser<IdeaKpmUnresolvedBinaryDependencyProto>() {
    @java.lang.Override
    public IdeaKpmUnresolvedBinaryDependencyProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IdeaKpmUnresolvedBinaryDependencyProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IdeaKpmUnresolvedBinaryDependencyProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IdeaKpmUnresolvedBinaryDependencyProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnresolvedBinaryDependencyProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
