// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.Utf8String;

public final class SetSignatureCsReqOuterClass {
  /**
   * Protobuf type {@code SetSignatureCsReq}
   */
  public static final class SetSignatureCsReq extends ProtoMessage<SetSignatureCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional string signature = 13;</code>
     */
    private final Utf8String signature = Utf8String.newEmptyInstance();

    private SetSignatureCsReq() {
    }

    /**
     * @return a new empty instance of {@code SetSignatureCsReq}
     */
    public static SetSignatureCsReq newInstance() {
      return new SetSignatureCsReq();
    }

    /**
     * <code>optional string signature = 13;</code>
     * @return whether the signature field is set
     */
    public boolean hasSignature() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional string signature = 13;</code>
     * @return this
     */
    public SetSignatureCsReq clearSignature() {
      bitField0_ &= ~0x00000001;
      signature.clear();
      return this;
    }

    /**
     * <code>optional string signature = 13;</code>
     * @return the signature
     */
    public String getSignature() {
      return signature.getString();
    }

    /**
     * <code>optional string signature = 13;</code>
     * @return internal {@code Utf8String} representation of signature for reading
     */
    public Utf8String getSignatureBytes() {
      return this.signature;
    }

    /**
     * <code>optional string signature = 13;</code>
     * @return internal {@code Utf8String} representation of signature for modifications
     */
    public Utf8String getMutableSignatureBytes() {
      bitField0_ |= 0x00000001;
      return this.signature;
    }

    /**
     * <code>optional string signature = 13;</code>
     * @param value the signature to set
     * @return this
     */
    public SetSignatureCsReq setSignature(final CharSequence value) {
      bitField0_ |= 0x00000001;
      signature.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string signature = 13;</code>
     * @param value the signature to set
     * @return this
     */
    public SetSignatureCsReq setSignature(final Utf8String value) {
      bitField0_ |= 0x00000001;
      signature.copyFrom(value);
      return this;
    }

    @Override
    public SetSignatureCsReq copyFrom(final SetSignatureCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        signature.copyFrom(other.signature);
      }
      return this;
    }

    @Override
    public SetSignatureCsReq mergeFrom(final SetSignatureCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSignature()) {
        getMutableSignatureBytes().copyFrom(other.signature);
      }
      return this;
    }

    @Override
    public SetSignatureCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      signature.clear();
      return this;
    }

    @Override
    public SetSignatureCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      signature.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SetSignatureCsReq)) {
        return false;
      }
      SetSignatureCsReq other = (SetSignatureCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasSignature() || signature.equals(other.signature));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 106);
        output.writeStringNoTag(signature);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(signature);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetSignatureCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 106: {
            // signature
            input.readString(signature);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeString(FieldNames.signature, signature);
      }
      output.endObject();
    }

    @Override
    public SetSignatureCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1073584312: {
            if (input.isAtField(FieldNames.signature)) {
              if (!input.trySkipNullValue()) {
                input.readString(signature);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public SetSignatureCsReq clone() {
      return new SetSignatureCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetSignatureCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetSignatureCsReq(), data).checkInitialized();
    }

    public static SetSignatureCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetSignatureCsReq(), input).checkInitialized();
    }

    public static SetSignatureCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetSignatureCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetSignatureCsReq messages
     */
    public static MessageFactory<SetSignatureCsReq> getFactory() {
      return SetSignatureCsReqFactory.INSTANCE;
    }

    private enum SetSignatureCsReqFactory implements MessageFactory<SetSignatureCsReq> {
      INSTANCE;

      @Override
      public SetSignatureCsReq create() {
        return SetSignatureCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName signature = FieldName.forField("signature");
    }
  }
}
