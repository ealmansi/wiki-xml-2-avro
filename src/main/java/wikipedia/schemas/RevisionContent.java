/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package wikipedia.schemas;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RevisionContent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RevisionContent\",\"namespace\":\"wikipedia.schemas\",\"fields\":[{\"name\":\"page_id\",\"type\":[\"null\",\"long\"]},{\"name\":\"revision_id\",\"type\":[\"null\",\"long\"]},{\"name\":\"content\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Long page_id;
  @Deprecated public java.lang.Long revision_id;
  @Deprecated public java.lang.CharSequence content;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public RevisionContent() {}

  /**
   * All-args constructor.
   */
  public RevisionContent(java.lang.Long page_id, java.lang.Long revision_id, java.lang.CharSequence content) {
    this.page_id = page_id;
    this.revision_id = revision_id;
    this.content = content;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return page_id;
    case 1: return revision_id;
    case 2: return content;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: page_id = (java.lang.Long)value$; break;
    case 1: revision_id = (java.lang.Long)value$; break;
    case 2: content = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'page_id' field.
   */
  public java.lang.Long getPageId() {
    return page_id;
  }

  /**
   * Sets the value of the 'page_id' field.
   * @param value the value to set.
   */
  public void setPageId(java.lang.Long value) {
    this.page_id = value;
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
   * Gets the value of the 'content' field.
   */
  public java.lang.CharSequence getContent() {
    return content;
  }

  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(java.lang.CharSequence value) {
    this.content = value;
  }

  /** Creates a new RevisionContent RecordBuilder */
  public static wikipedia.schemas.RevisionContent.Builder newBuilder() {
    return new wikipedia.schemas.RevisionContent.Builder();
  }
  
  /** Creates a new RevisionContent RecordBuilder by copying an existing Builder */
  public static wikipedia.schemas.RevisionContent.Builder newBuilder(wikipedia.schemas.RevisionContent.Builder other) {
    return new wikipedia.schemas.RevisionContent.Builder(other);
  }
  
  /** Creates a new RevisionContent RecordBuilder by copying an existing RevisionContent instance */
  public static wikipedia.schemas.RevisionContent.Builder newBuilder(wikipedia.schemas.RevisionContent other) {
    return new wikipedia.schemas.RevisionContent.Builder(other);
  }
  
  /**
   * RecordBuilder for RevisionContent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RevisionContent>
    implements org.apache.avro.data.RecordBuilder<RevisionContent> {

    private java.lang.Long page_id;
    private java.lang.Long revision_id;
    private java.lang.CharSequence content;

    /** Creates a new Builder */
    private Builder() {
      super(wikipedia.schemas.RevisionContent.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(wikipedia.schemas.RevisionContent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.page_id)) {
        this.page_id = data().deepCopy(fields()[0].schema(), other.page_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.revision_id)) {
        this.revision_id = data().deepCopy(fields()[1].schema(), other.revision_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.content)) {
        this.content = data().deepCopy(fields()[2].schema(), other.content);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing RevisionContent instance */
    private Builder(wikipedia.schemas.RevisionContent other) {
            super(wikipedia.schemas.RevisionContent.SCHEMA$);
      if (isValidValue(fields()[0], other.page_id)) {
        this.page_id = data().deepCopy(fields()[0].schema(), other.page_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.revision_id)) {
        this.revision_id = data().deepCopy(fields()[1].schema(), other.revision_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.content)) {
        this.content = data().deepCopy(fields()[2].schema(), other.content);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'page_id' field */
    public java.lang.Long getPageId() {
      return page_id;
    }
    
    /** Sets the value of the 'page_id' field */
    public wikipedia.schemas.RevisionContent.Builder setPageId(java.lang.Long value) {
      validate(fields()[0], value);
      this.page_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'page_id' field has been set */
    public boolean hasPageId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'page_id' field */
    public wikipedia.schemas.RevisionContent.Builder clearPageId() {
      page_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'revision_id' field */
    public java.lang.Long getRevisionId() {
      return revision_id;
    }
    
    /** Sets the value of the 'revision_id' field */
    public wikipedia.schemas.RevisionContent.Builder setRevisionId(java.lang.Long value) {
      validate(fields()[1], value);
      this.revision_id = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'revision_id' field has been set */
    public boolean hasRevisionId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'revision_id' field */
    public wikipedia.schemas.RevisionContent.Builder clearRevisionId() {
      revision_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'content' field */
    public java.lang.CharSequence getContent() {
      return content;
    }
    
    /** Sets the value of the 'content' field */
    public wikipedia.schemas.RevisionContent.Builder setContent(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.content = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'content' field has been set */
    public boolean hasContent() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'content' field */
    public wikipedia.schemas.RevisionContent.Builder clearContent() {
      content = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public RevisionContent build() {
      try {
        RevisionContent record = new RevisionContent();
        record.page_id = fieldSetFlags()[0] ? this.page_id : (java.lang.Long) defaultValue(fields()[0]);
        record.revision_id = fieldSetFlags()[1] ? this.revision_id : (java.lang.Long) defaultValue(fields()[1]);
        record.content = fieldSetFlags()[2] ? this.content : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
