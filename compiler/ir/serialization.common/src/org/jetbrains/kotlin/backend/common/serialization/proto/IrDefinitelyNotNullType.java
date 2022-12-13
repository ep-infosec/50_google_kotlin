// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType}
 */
public final class IrDefinitelyNotNullType extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType)
    IrDefinitelyNotNullTypeOrBuilder {
  // Use IrDefinitelyNotNullType.newBuilder() to construct.
  private IrDefinitelyNotNullType(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrDefinitelyNotNullType(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrDefinitelyNotNullType defaultInstance;
  public static IrDefinitelyNotNullType getDefaultInstance() {
    return defaultInstance;
  }

  public IrDefinitelyNotNullType getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrDefinitelyNotNullType(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    org.jetbrains.kotlin.protobuf.ByteString.Output unknownFieldsOutput =
        org.jetbrains.kotlin.protobuf.ByteString.newOutput();
    org.jetbrains.kotlin.protobuf.CodedOutputStream unknownFieldsCodedOutput =
        org.jetbrains.kotlin.protobuf.CodedOutputStream.newInstance(
            unknownFieldsOutput, 1);
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              types_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            types_.add(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              types_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              types_.add(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
        }
      }
    } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        types_ = java.util.Collections.unmodifiableList(types_);
      }
      try {
        unknownFieldsCodedOutput.flush();
      } catch (java.io.IOException e) {
      // Should not happen
      } finally {
        unknownFields = unknownFieldsOutput.toByteString();
      }
      makeExtensionsImmutable();
    }
  }
  public static org.jetbrains.kotlin.protobuf.Parser<IrDefinitelyNotNullType> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrDefinitelyNotNullType>() {
    public IrDefinitelyNotNullType parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrDefinitelyNotNullType(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrDefinitelyNotNullType> getParserForType() {
    return PARSER;
  }

  public static final int TYPES_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> types_;
  /**
   * <code>repeated int32 types = 1 [packed = true];</code>
   *
   * <pre>
   * In fact that is an `IntersectionType` so let represent it as it. In future it could be easy to support general case
   * </pre>
   */
  public java.util.List<java.lang.Integer>
      getTypesList() {
    return types_;
  }
  /**
   * <code>repeated int32 types = 1 [packed = true];</code>
   *
   * <pre>
   * In fact that is an `IntersectionType` so let represent it as it. In future it could be easy to support general case
   * </pre>
   */
  public int getTypesCount() {
    return types_.size();
  }
  /**
   * <code>repeated int32 types = 1 [packed = true];</code>
   *
   * <pre>
   * In fact that is an `IntersectionType` so let represent it as it. In future it could be easy to support general case
   * </pre>
   */
  public int getTypes(int index) {
    return types_.get(index);
  }
  private int typesMemoizedSerializedSize = -1;

  private void initFields() {
    types_ = java.util.Collections.emptyList();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getTypesList().size() > 0) {
      output.writeRawVarint32(10);
      output.writeRawVarint32(typesMemoizedSerializedSize);
    }
    for (int i = 0; i < types_.size(); i++) {
      output.writeInt32NoTag(types_.get(i));
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < types_.size(); i++) {
        dataSize += org.jetbrains.kotlin.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(types_.get(i));
      }
      size += dataSize;
      if (!getTypesList().isEmpty()) {
        size += 1;
        size += org.jetbrains.kotlin.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      typesMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.size();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullTypeOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      types_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        types_ = java.util.Collections.unmodifiableList(types_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.types_ = types_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType.getDefaultInstance()) return this;
      if (!other.types_.isEmpty()) {
        if (types_.isEmpty()) {
          types_ = other.types_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTypesIsMutable();
          types_.addAll(other.types_);
        }
        
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> types_ = java.util.Collections.emptyList();
    private void ensureTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        types_ = new java.util.ArrayList<java.lang.Integer>(types_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 types = 1 [packed = true];</code>
     *
     * <pre>
     * In fact that is an `IntersectionType` so let represent it as it. In future it could be easy to support general case
     * </pre>
     */
    public java.util.List<java.lang.Integer>
        getTypesList() {
      return java.util.Collections.unmodifiableList(types_);
    }
    /**
     * <code>repeated int32 types = 1 [packed = true];</code>
     *
     * <pre>
     * In fact that is an `IntersectionType` so let represent it as it. In future it could be easy to support general case
     * </pre>
     */
    public int getTypesCount() {
      return types_.size();
    }
    /**
     * <code>repeated int32 types = 1 [packed = true];</code>
     *
     * <pre>
     * In fact that is an `IntersectionType` so let represent it as it. In future it could be easy to support general case
     * </pre>
     */
    public int getTypes(int index) {
      return types_.get(index);
    }
    /**
     * <code>repeated int32 types = 1 [packed = true];</code>
     *
     * <pre>
     * In fact that is an `IntersectionType` so let represent it as it. In future it could be easy to support general case
     * </pre>
     */
    public Builder setTypes(
        int index, int value) {
      ensureTypesIsMutable();
      types_.set(index, value);
      
      return this;
    }
    /**
     * <code>repeated int32 types = 1 [packed = true];</code>
     *
     * <pre>
     * In fact that is an `IntersectionType` so let represent it as it. In future it could be easy to support general case
     * </pre>
     */
    public Builder addTypes(int value) {
      ensureTypesIsMutable();
      types_.add(value);
      
      return this;
    }
    /**
     * <code>repeated int32 types = 1 [packed = true];</code>
     *
     * <pre>
     * In fact that is an `IntersectionType` so let represent it as it. In future it could be easy to support general case
     * </pre>
     */
    public Builder addAllTypes(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureTypesIsMutable();
      org.jetbrains.kotlin.protobuf.AbstractMessageLite.Builder.addAll(
          values, types_);
      
      return this;
    }
    /**
     * <code>repeated int32 types = 1 [packed = true];</code>
     *
     * <pre>
     * In fact that is an `IntersectionType` so let represent it as it. In future it could be easy to support general case
     * </pre>
     */
    public Builder clearTypes() {
      types_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType)
  }

  static {
    defaultInstance = new IrDefinitelyNotNullType(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrDefinitelyNotNullType)
}