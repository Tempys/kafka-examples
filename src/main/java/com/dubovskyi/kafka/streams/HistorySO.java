/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.dubovskyi.kafka.streams;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HistorySO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4404050144491661783L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HistorySO\",\"namespace\":\"com.smartfocus.smartfocusbackend.domain.avro\",\"fields\":[{\"name\":\"system_request_id\",\"type\":\"string\"},{\"name\":\"provider_id\",\"type\":\"string\"},{\"name\":\"provider_request_id\",\"type\":\"string\"},{\"name\":\"recipients\",\"type\":\"int\"},{\"name\":\"response_status\",\"type\":\"string\"},{\"name\":\"error_message\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HistorySO> ENCODER =
      new BinaryMessageEncoder<HistorySO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HistorySO> DECODER =
      new BinaryMessageDecoder<HistorySO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<HistorySO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<HistorySO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HistorySO>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this HistorySO to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a HistorySO from a ByteBuffer. */
  public static HistorySO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public CharSequence system_request_id;
  @Deprecated public CharSequence provider_id;
  @Deprecated public CharSequence provider_request_id;
  @Deprecated public int recipients;
  @Deprecated public CharSequence response_status;
  @Deprecated public CharSequence error_message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HistorySO() {}

  /**
   * All-args constructor.
   * @param system_request_id The new value for system_request_id
   * @param provider_id The new value for provider_id
   * @param provider_request_id The new value for provider_request_id
   * @param recipients The new value for recipients
   * @param response_status The new value for response_status
   * @param error_message The new value for error_message
   */
  public HistorySO(CharSequence system_request_id, CharSequence provider_id, CharSequence provider_request_id, Integer recipients, CharSequence response_status, CharSequence error_message) {
    this.system_request_id = system_request_id;
    this.provider_id = provider_id;
    this.provider_request_id = provider_request_id;
    this.recipients = recipients;
    this.response_status = response_status;
    this.error_message = error_message;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return system_request_id;
    case 1: return provider_id;
    case 2: return provider_request_id;
    case 3: return recipients;
    case 4: return response_status;
    case 5: return error_message;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: system_request_id = (CharSequence)value$; break;
    case 1: provider_id = (CharSequence)value$; break;
    case 2: provider_request_id = (CharSequence)value$; break;
    case 3: recipients = (Integer)value$; break;
    case 4: response_status = (CharSequence)value$; break;
    case 5: error_message = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'system_request_id' field.
   * @return The value of the 'system_request_id' field.
   */
  public CharSequence getSystemRequestId() {
    return system_request_id;
  }

  /**
   * Sets the value of the 'system_request_id' field.
   * @param value the value to set.
   */
  public void setSystemRequestId(CharSequence value) {
    this.system_request_id = value;
  }

  /**
   * Gets the value of the 'provider_id' field.
   * @return The value of the 'provider_id' field.
   */
  public CharSequence getProviderId() {
    return provider_id;
  }

  /**
   * Sets the value of the 'provider_id' field.
   * @param value the value to set.
   */
  public void setProviderId(CharSequence value) {
    this.provider_id = value;
  }

  /**
   * Gets the value of the 'provider_request_id' field.
   * @return The value of the 'provider_request_id' field.
   */
  public CharSequence getProviderRequestId() {
    return provider_request_id;
  }

  /**
   * Sets the value of the 'provider_request_id' field.
   * @param value the value to set.
   */
  public void setProviderRequestId(CharSequence value) {
    this.provider_request_id = value;
  }

  /**
   * Gets the value of the 'recipients' field.
   * @return The value of the 'recipients' field.
   */
  public Integer getRecipients() {
    return recipients;
  }

  /**
   * Sets the value of the 'recipients' field.
   * @param value the value to set.
   */
  public void setRecipients(Integer value) {
    this.recipients = value;
  }

  /**
   * Gets the value of the 'response_status' field.
   * @return The value of the 'response_status' field.
   */
  public CharSequence getResponseStatus() {
    return response_status;
  }

  /**
   * Sets the value of the 'response_status' field.
   * @param value the value to set.
   */
  public void setResponseStatus(CharSequence value) {
    this.response_status = value;
  }

  /**
   * Gets the value of the 'error_message' field.
   * @return The value of the 'error_message' field.
   */
  public CharSequence getErrorMessage() {
    return error_message;
  }

  /**
   * Sets the value of the 'error_message' field.
   * @param value the value to set.
   */
  public void setErrorMessage(CharSequence value) {
    this.error_message = value;
  }

  /**
   * Creates a new HistorySO RecordBuilder.
   * @return A new HistorySO RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new HistorySO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HistorySO RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /**
   * Creates a new HistorySO RecordBuilder by copying an existing HistorySO instance.
   * @param other The existing instance to copy.
   * @return A new HistorySO RecordBuilder
   */
  public static Builder newBuilder(HistorySO other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for HistorySO instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HistorySO>
    implements org.apache.avro.data.RecordBuilder<HistorySO> {

    private CharSequence system_request_id;
    private CharSequence provider_id;
    private CharSequence provider_request_id;
    private int recipients;
    private CharSequence response_status;
    private CharSequence error_message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.system_request_id)) {
        this.system_request_id = data().deepCopy(fields()[0].schema(), other.system_request_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.provider_id)) {
        this.provider_id = data().deepCopy(fields()[1].schema(), other.provider_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.provider_request_id)) {
        this.provider_request_id = data().deepCopy(fields()[2].schema(), other.provider_request_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.recipients)) {
        this.recipients = data().deepCopy(fields()[3].schema(), other.recipients);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.response_status)) {
        this.response_status = data().deepCopy(fields()[4].schema(), other.response_status);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.error_message)) {
        this.error_message = data().deepCopy(fields()[5].schema(), other.error_message);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing HistorySO instance
     * @param other The existing instance to copy.
     */
    private Builder(HistorySO other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.system_request_id)) {
        this.system_request_id = data().deepCopy(fields()[0].schema(), other.system_request_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.provider_id)) {
        this.provider_id = data().deepCopy(fields()[1].schema(), other.provider_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.provider_request_id)) {
        this.provider_request_id = data().deepCopy(fields()[2].schema(), other.provider_request_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.recipients)) {
        this.recipients = data().deepCopy(fields()[3].schema(), other.recipients);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.response_status)) {
        this.response_status = data().deepCopy(fields()[4].schema(), other.response_status);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.error_message)) {
        this.error_message = data().deepCopy(fields()[5].schema(), other.error_message);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'system_request_id' field.
      * @return The value.
      */
    public CharSequence getSystemRequestId() {
      return system_request_id;
    }

    /**
      * Sets the value of the 'system_request_id' field.
      * @param value The value of 'system_request_id'.
      * @return This builder.
      */
    public Builder setSystemRequestId(CharSequence value) {
      validate(fields()[0], value);
      this.system_request_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'system_request_id' field has been set.
      * @return True if the 'system_request_id' field has been set, false otherwise.
      */
    public boolean hasSystemRequestId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'system_request_id' field.
      * @return This builder.
      */
    public Builder clearSystemRequestId() {
      system_request_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'provider_id' field.
      * @return The value.
      */
    public CharSequence getProviderId() {
      return provider_id;
    }

    /**
      * Sets the value of the 'provider_id' field.
      * @param value The value of 'provider_id'.
      * @return This builder.
      */
    public Builder setProviderId(CharSequence value) {
      validate(fields()[1], value);
      this.provider_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'provider_id' field has been set.
      * @return True if the 'provider_id' field has been set, false otherwise.
      */
    public boolean hasProviderId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'provider_id' field.
      * @return This builder.
      */
    public Builder clearProviderId() {
      provider_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'provider_request_id' field.
      * @return The value.
      */
    public CharSequence getProviderRequestId() {
      return provider_request_id;
    }

    /**
      * Sets the value of the 'provider_request_id' field.
      * @param value The value of 'provider_request_id'.
      * @return This builder.
      */
    public Builder setProviderRequestId(CharSequence value) {
      validate(fields()[2], value);
      this.provider_request_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'provider_request_id' field has been set.
      * @return True if the 'provider_request_id' field has been set, false otherwise.
      */
    public boolean hasProviderRequestId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'provider_request_id' field.
      * @return This builder.
      */
    public Builder clearProviderRequestId() {
      provider_request_id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'recipients' field.
      * @return The value.
      */
    public Integer getRecipients() {
      return recipients;
    }

    /**
      * Sets the value of the 'recipients' field.
      * @param value The value of 'recipients'.
      * @return This builder.
      */
    public Builder setRecipients(int value) {
      validate(fields()[3], value);
      this.recipients = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'recipients' field has been set.
      * @return True if the 'recipients' field has been set, false otherwise.
      */
    public boolean hasRecipients() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'recipients' field.
      * @return This builder.
      */
    public Builder clearRecipients() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'response_status' field.
      * @return The value.
      */
    public CharSequence getResponseStatus() {
      return response_status;
    }

    /**
      * Sets the value of the 'response_status' field.
      * @param value The value of 'response_status'.
      * @return This builder.
      */
    public Builder setResponseStatus(CharSequence value) {
      validate(fields()[4], value);
      this.response_status = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'response_status' field has been set.
      * @return True if the 'response_status' field has been set, false otherwise.
      */
    public boolean hasResponseStatus() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'response_status' field.
      * @return This builder.
      */
    public Builder clearResponseStatus() {
      response_status = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'error_message' field.
      * @return The value.
      */
    public CharSequence getErrorMessage() {
      return error_message;
    }

    /**
      * Sets the value of the 'error_message' field.
      * @param value The value of 'error_message'.
      * @return This builder.
      */
    public Builder setErrorMessage(CharSequence value) {
      validate(fields()[5], value);
      this.error_message = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'error_message' field has been set.
      * @return True if the 'error_message' field has been set, false otherwise.
      */
    public boolean hasErrorMessage() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'error_message' field.
      * @return This builder.
      */
    public Builder clearErrorMessage() {
      error_message = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HistorySO build() {
      try {
        HistorySO record = new HistorySO();
        record.system_request_id = fieldSetFlags()[0] ? this.system_request_id : (CharSequence) defaultValue(fields()[0]);
        record.provider_id = fieldSetFlags()[1] ? this.provider_id : (CharSequence) defaultValue(fields()[1]);
        record.provider_request_id = fieldSetFlags()[2] ? this.provider_request_id : (CharSequence) defaultValue(fields()[2]);
        record.recipients = fieldSetFlags()[3] ? this.recipients : (Integer) defaultValue(fields()[3]);
        record.response_status = fieldSetFlags()[4] ? this.response_status : (CharSequence) defaultValue(fields()[4]);
        record.error_message = fieldSetFlags()[5] ? this.error_message : (CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HistorySO>
    WRITER$ = (org.apache.avro.io.DatumWriter<HistorySO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HistorySO>
    READER$ = (org.apache.avro.io.DatumReader<HistorySO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
