// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_idea_kpm_extras.proto

package org.jetbrains.kotlin.kpm.idea.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto}
 */
final class IdeaKpmExtrasProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto)
    IdeaKpmExtrasProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IdeaKpmExtrasProto.newBuilder() to construct.
  private IdeaKpmExtrasProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IdeaKpmExtrasProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IdeaKpmExtrasProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IdeaKpmExtrasProto(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              values_ = com.google.protobuf.MapField.newMapField(
                  ValuesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ByteString>
            values__ = input.readMessage(
                ValuesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            values_.getMutableMap().put(
                values__.getKey(), values__.getValue());
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
    return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmExtrasProto_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetValues();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmExtrasProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.class, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private static final class ValuesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.protobuf.ByteString> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.protobuf.ByteString>newDefaultInstance(
                org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmExtrasProto_ValuesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.BYTES,
                com.google.protobuf.ByteString.EMPTY);
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.google.protobuf.ByteString> values_;
  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
  internalGetValues() {
    if (values_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ValuesDefaultEntryHolder.defaultEntry);
    }
    return values_;
  }

  public int getValuesCount() {
    return internalGetValues().getMap().size();
  }
  /**
   * <code>map&lt;string, bytes&gt; values = 1;</code>
   */

  @java.lang.Override
  public boolean containsValues(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetValues().getMap().containsKey(key);
  }
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getValues() {
    return getValuesMap();
  }
  /**
   * <code>map&lt;string, bytes&gt; values = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getValuesMap() {
    return internalGetValues().getMap();
  }
  /**
   * <code>map&lt;string, bytes&gt; values = 1;</code>
   */
  @java.lang.Override

  public com.google.protobuf.ByteString getValuesOrDefault(
      java.lang.String key,
      com.google.protobuf.ByteString defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetValues().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, bytes&gt; values = 1;</code>
   */
  @java.lang.Override

  public com.google.protobuf.ByteString getValuesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetValues().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetValues(),
        ValuesDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.ByteString> entry
         : internalGetValues().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ByteString>
      values__ = ValuesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, values__);
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
    if (!(obj instanceof org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto)) {
      return super.equals(obj);
    }
    org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto other = (org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto) obj;

    if (!internalGetValues().equals(
        other.internalGetValues())) return false;
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
    if (!internalGetValues().getMap().isEmpty()) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetValues().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parseFrom(
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
  public static Builder newBuilder(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto prototype) {
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
   * Protobuf type {@code org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto)
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmExtrasProto_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmExtrasProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.class, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.Builder.class);
    }

    // Construct using org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableValues().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmExtrasProto_descriptor;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto getDefaultInstanceForType() {
      return org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto build() {
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto buildPartial() {
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto result = new org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto(this);
      int from_bitField0_ = bitField0_;
      result.values_ = internalGetValues();
      result.values_.makeImmutable();
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
      if (other instanceof org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto) {
        return mergeFrom((org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto other) {
      if (other == org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto.getDefaultInstance()) return this;
      internalGetMutableValues().mergeFrom(
          other.internalGetValues());
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
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, com.google.protobuf.ByteString> values_;
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
    internalGetValues() {
      if (values_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ValuesDefaultEntryHolder.defaultEntry);
      }
      return values_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
    internalGetMutableValues() {
      onChanged();;
      if (values_ == null) {
        values_ = com.google.protobuf.MapField.newMapField(
            ValuesDefaultEntryHolder.defaultEntry);
      }
      if (!values_.isMutable()) {
        values_ = values_.copy();
      }
      return values_;
    }

    public int getValuesCount() {
      return internalGetValues().getMap().size();
    }
    /**
     * <code>map&lt;string, bytes&gt; values = 1;</code>
     */

    @java.lang.Override
    public boolean containsValues(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetValues().getMap().containsKey(key);
    }
    /**
     * Use {@link #getValuesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getValues() {
      return getValuesMap();
    }
    /**
     * <code>map&lt;string, bytes&gt; values = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getValuesMap() {
      return internalGetValues().getMap();
    }
    /**
     * <code>map&lt;string, bytes&gt; values = 1;</code>
     */
    @java.lang.Override

    public com.google.protobuf.ByteString getValuesOrDefault(
        java.lang.String key,
        com.google.protobuf.ByteString defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          internalGetValues().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, bytes&gt; values = 1;</code>
     */
    @java.lang.Override

    public com.google.protobuf.ByteString getValuesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          internalGetValues().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearValues() {
      internalGetMutableValues().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, bytes&gt; values = 1;</code>
     */

    public Builder removeValues(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableValues().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString>
    getMutableValues() {
      return internalGetMutableValues().getMutableMap();
    }
    /**
     * <code>map&lt;string, bytes&gt; values = 1;</code>
     */
    public Builder putValues(
        java.lang.String key,
        com.google.protobuf.ByteString value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableValues().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, bytes&gt; values = 1;</code>
     */

    public Builder putAllValues(
        java.util.Map<java.lang.String, com.google.protobuf.ByteString> values) {
      internalGetMutableValues().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto)
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto)
  private static final org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto();
  }

  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IdeaKpmExtrasProto>
      PARSER = new com.google.protobuf.AbstractParser<IdeaKpmExtrasProto>() {
    @java.lang.Override
    public IdeaKpmExtrasProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IdeaKpmExtrasProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IdeaKpmExtrasProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IdeaKpmExtrasProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

