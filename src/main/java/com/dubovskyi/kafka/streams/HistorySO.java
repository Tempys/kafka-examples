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
  private static final long serialVersionUID = 1896427659461841209L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HistorySO\",\"namespace\":\"com.smartfocus.smartfocusbackend.domain\",\"fields\":[{\"name\":\"uuid\",\"type\":\"string\"},{\"name\":\"response\",\"type\":\"string\"}]}");
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

  @Deprecated public CharSequence uuid;
  @Deprecated public CharSequence response;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HistorySO() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param response The new value for response
   */
  public HistorySO(CharSequence uuid, CharSequence response) {
    this.uuid = uuid;
    this.response = response;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return response;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: uuid = (CharSequence)value$; break;
    case 1: response = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uuid' field.
   * @return The value of the 'uuid' field.
   */
  public CharSequence getUuid() {
    return uuid;
  }

  /**
   * Sets the value of the 'uuid' field.
   * @param value the value to set.
   */
  public void setUuid(CharSequence value) {
    this.uuid = value;
  }

  /**
   * Gets the value of the 'response' field.
   * @return The value of the 'response' field.
   */
  public CharSequence getResponse() {
    return response;
  }

  /**
   * Sets the value of the 'response' field.
   * @param value the value to set.
   */
  public void setResponse(CharSequence value) {
    this.response = value;
  }

  /**
   * Creates a new HistorySO RecordBuilder.
   * @return A new HistorySO RecordBuilder
   */
  public static HistorySO.Builder newBuilder() {
    return new HistorySO.Builder();
  }

  /**
   * Creates a new HistorySO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HistorySO RecordBuilder
   */
  public static HistorySO.Builder newBuilder(HistorySO.Builder other) {
    return new HistorySO.Builder(other);
  }

  /**
   * Creates a new HistorySO RecordBuilder by copying an existing HistorySO instance.
   * @param other The existing instance to copy.
   * @return A new HistorySO RecordBuilder
   */
  public static HistorySO.Builder newBuilder(HistorySO other) {
    return new HistorySO.Builder(other);
  }

  /**
   * RecordBuilder for HistorySO instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HistorySO>
    implements org.apache.avro.data.RecordBuilder<HistorySO> {

    private CharSequence uuid;
    private CharSequence response;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(HistorySO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.response)) {
        this.response = data().deepCopy(fields()[1].schema(), other.response);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing HistorySO instance
     * @param other The existing instance to copy.
     */
    private Builder(HistorySO other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.response)) {
        this.response = data().deepCopy(fields()[1].schema(), other.response);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'uuid' field.
      * @return The value.
      */
    public CharSequence getUuid() {
      return uuid;
    }

    /**
      * Sets the value of the 'uuid' field.
      * @param value The value of 'uuid'.
      * @return This builder.
      */
    public HistorySO.Builder setUuid(CharSequence value) {
      validate(fields()[0], value);
      this.uuid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'uuid' field has been set.
      * @return True if the 'uuid' field has been set, false otherwise.
      */
    public boolean hasUuid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'uuid' field.
      * @return This builder.
      */
    public HistorySO.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'response' field.
      * @return The value.
      */
    public CharSequence getResponse() {
      return response;
    }

    /**
      * Sets the value of the 'response' field.
      * @param value The value of 'response'.
      * @return This builder.
      */
    public HistorySO.Builder setResponse(CharSequence value) {
      validate(fields()[1], value);
      this.response = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'response' field has been set.
      * @return True if the 'response' field has been set, false otherwise.
      */
    public boolean hasResponse() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'response' field.
      * @return This builder.
      */
    public HistorySO.Builder clearResponse() {
      response = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HistorySO build() {
      try {
        HistorySO record = new HistorySO();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (CharSequence) defaultValue(fields()[0]);
        record.response = fieldSetFlags()[1] ? this.response : (CharSequence) defaultValue(fields()[1]);
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