// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto}
 */
final class IdeaKpmUnknownPlatformProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto)
    IdeaKpmUnknownPlatformProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IdeaKpmUnknownPlatformProto.newBuilder() to construct.
  private IdeaKpmUnknownPlatformProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IdeaKpmUnknownPlatformProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IdeaKpmUnknownPlatformProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IdeaKpmUnknownPlatformProto(
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
    return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmUnknownPlatformProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmUnknownPlatformProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto.class, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto.Builder.class);
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto)) {
      return super.equals(obj);
    }
    org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto other = (org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto) obj;

    if (hasExtras() != other.hasExtras()) return false;
    if (hasExtras()) {
      if (!getExtras()
          .equals(other.getExtras())) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parseFrom(
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
  public static Builder newBuilder(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto prototype) {
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
   * Protobuf type {@code org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto)
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmUnknownPlatformProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmUnknownPlatformProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto.class, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto.Builder.class);
    }

    // Construct using org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmUnknownPlatformProto_descriptor;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto getDefaultInstanceForType() {
      return org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto build() {
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto buildPartial() {
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto result = new org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto(this);
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
      if (other instanceof org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto) {
        return mergeFrom((org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto other) {
      if (other == org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto.getDefaultInstance()) return this;
      if (other.hasExtras()) {
        mergeExtras(other.getExtras());
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
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto)
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto)
  private static final org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto();
  }

  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IdeaKpmUnknownPlatformProto>
      PARSER = new com.google.protobuf.AbstractParser<IdeaKpmUnknownPlatformProto>() {
    @java.lang.Override
    public IdeaKpmUnknownPlatformProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IdeaKpmUnknownPlatformProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IdeaKpmUnknownPlatformProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IdeaKpmUnknownPlatformProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmUnknownPlatformProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
