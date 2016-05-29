/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package de.mpg.mpi.inf.d5.wikipedia.export.schemas;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class WikipediaRevisionText extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WikipediaRevisionText\",\"namespace\":\"de.mpg.mpi.inf.d5.wikipedia.export.schemas\",\"fields\":[{\"name\":\"revision_id\",\"type\":[\"null\",\"long\"]},{\"name\":\"text\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Long revision_id;
  @Deprecated public java.lang.CharSequence text;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public WikipediaRevisionText() {}

  /**
   * All-args constructor.
   */
  public WikipediaRevisionText(java.lang.Long revision_id, java.lang.CharSequence text) {
    this.revision_id = revision_id;
    this.text = text;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return revision_id;
    case 1: return text;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: revision_id = (java.lang.Long)value$; break;
    case 1: text = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'revision_id' field.
   */
  public java.lang.Long getRevisionId() {
    return revision_id;
  }

  /**
   * Sets the value of the 'revision_id' field.
   * @param value the value to set.
   */
  public void setRevisionId(java.lang.Long value) {
    this.revision_id = value;
  }

  /**
   * Gets the value of the 'text' field.
   */
  public java.lang.CharSequence getText() {
    return text;
  }

  /**
   * Sets the value of the 'text' field.
   * @param value the value to set.
   */
  public void setText(java.lang.CharSequence value) {
    this.text = value;
  }

  /** Creates a new WikipediaRevisionText RecordBuilder */
  public static de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder newBuilder() {
    return new de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder();
  }
  
  /** Creates a new WikipediaRevisionText RecordBuilder by copying an existing Builder */
  public static de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder newBuilder(de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder other) {
    return new de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder(other);
  }
  
  /** Creates a new WikipediaRevisionText RecordBuilder by copying an existing WikipediaRevisionText instance */
  public static de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder newBuilder(de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText other) {
    return new de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder(other);
  }
  
  /**
   * RecordBuilder for WikipediaRevisionText instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WikipediaRevisionText>
    implements org.apache.avro.data.RecordBuilder<WikipediaRevisionText> {

    private java.lang.Long revision_id;
    private java.lang.CharSequence text;

    /** Creates a new Builder */
    private Builder() {
      super(de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.revision_id)) {
        this.revision_id = data().deepCopy(fields()[0].schema(), other.revision_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.text)) {
        this.text = data().deepCopy(fields()[1].schema(), other.text);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing WikipediaRevisionText instance */
    private Builder(de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText other) {
            super(de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.SCHEMA$);
      if (isValidValue(fields()[0], other.revision_id)) {
        this.revision_id = data().deepCopy(fields()[0].schema(), other.revision_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.text)) {
        this.text = data().deepCopy(fields()[1].schema(), other.text);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'revision_id' field */
    public java.lang.Long getRevisionId() {
      return revision_id;
    }
    
    /** Sets the value of the 'revision_id' field */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder setRevisionId(java.lang.Long value) {
      validate(fields()[0], value);
      this.revision_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'revision_id' field has been set */
    public boolean hasRevisionId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'revision_id' field */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder clearRevisionId() {
      revision_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'text' field */
    public java.lang.CharSequence getText() {
      return text;
    }
    
    /** Sets the value of the 'text' field */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder setText(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.text = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'text' field has been set */
    public boolean hasText() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'text' field */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionText.Builder clearText() {
      text = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public WikipediaRevisionText build() {
      try {
        WikipediaRevisionText record = new WikipediaRevisionText();
        record.revision_id = fieldSetFlags()[0] ? this.revision_id : (java.lang.Long) defaultValue(fields()[0]);
        record.text = fieldSetFlags()[1] ? this.text : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
