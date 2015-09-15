/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package wikipedia.schemas;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PageMetadata extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PageMetadata\",\"namespace\":\"wikipedia.schemas\",\"fields\":[{\"name\":\"title\",\"type\":[\"null\",\"string\"]},{\"name\":\"ns\",\"type\":[\"null\",\"int\"]},{\"name\":\"page_id\",\"type\":[\"null\",\"long\"]},{\"name\":\"redirect\",\"type\":[\"null\",\"string\"]},{\"name\":\"revisions\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"RevisionMetadata\",\"fields\":[{\"name\":\"revision_id\",\"type\":[\"null\",\"long\"]},{\"name\":\"parent_id\",\"type\":[\"null\",\"long\"]},{\"name\":\"timestamp\",\"type\":[\"null\",\"string\"]},{\"name\":\"contributor\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Contributor\",\"fields\":[{\"name\":\"ip\",\"type\":[\"null\",\"string\"]},{\"name\":\"username\",\"type\":[\"null\",\"string\"]},{\"name\":\"user_id\",\"type\":[\"null\",\"long\"]}]}]},{\"name\":\"minor\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"comment\",\"type\":[\"null\",\"string\"]},{\"name\":\"model\",\"type\":[\"null\",\"string\"]},{\"name\":\"format\",\"type\":[\"null\",\"string\"]},{\"name\":\"textSize\",\"type\":[\"null\",\"long\"]},{\"name\":\"sha1\",\"type\":[\"null\",\"string\"]}]}}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence title;
  @Deprecated public java.lang.Integer ns;
  @Deprecated public java.lang.Long page_id;
  @Deprecated public java.lang.CharSequence redirect;
  @Deprecated public java.util.List<wikipedia.schemas.RevisionMetadata> revisions;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public PageMetadata() {}

  /**
   * All-args constructor.
   */
  public PageMetadata(java.lang.CharSequence title, java.lang.Integer ns, java.lang.Long page_id, java.lang.CharSequence redirect, java.util.List<wikipedia.schemas.RevisionMetadata> revisions) {
    this.title = title;
    this.ns = ns;
    this.page_id = page_id;
    this.redirect = redirect;
    this.revisions = revisions;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return title;
    case 1: return ns;
    case 2: return page_id;
    case 3: return redirect;
    case 4: return revisions;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: title = (java.lang.CharSequence)value$; break;
    case 1: ns = (java.lang.Integer)value$; break;
    case 2: page_id = (java.lang.Long)value$; break;
    case 3: redirect = (java.lang.CharSequence)value$; break;
    case 4: revisions = (java.util.List<wikipedia.schemas.RevisionMetadata>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'title' field.
   */
  public java.lang.CharSequence getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.CharSequence value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'ns' field.
   */
  public java.lang.Integer getNs() {
    return ns;
  }

  /**
   * Sets the value of the 'ns' field.
   * @param value the value to set.
   */
  public void setNs(java.lang.Integer value) {
    this.ns = value;
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
   * Gets the value of the 'redirect' field.
   */
  public java.lang.CharSequence getRedirect() {
    return redirect;
  }

  /**
   * Sets the value of the 'redirect' field.
   * @param value the value to set.
   */
  public void setRedirect(java.lang.CharSequence value) {
    this.redirect = value;
  }

  /**
   * Gets the value of the 'revisions' field.
   */
  public java.util.List<wikipedia.schemas.RevisionMetadata> getRevisions() {
    return revisions;
  }

  /**
   * Sets the value of the 'revisions' field.
   * @param value the value to set.
   */
  public void setRevisions(java.util.List<wikipedia.schemas.RevisionMetadata> value) {
    this.revisions = value;
  }

  /** Creates a new PageMetadata RecordBuilder */
  public static wikipedia.schemas.PageMetadata.Builder newBuilder() {
    return new wikipedia.schemas.PageMetadata.Builder();
  }
  
  /** Creates a new PageMetadata RecordBuilder by copying an existing Builder */
  public static wikipedia.schemas.PageMetadata.Builder newBuilder(wikipedia.schemas.PageMetadata.Builder other) {
    return new wikipedia.schemas.PageMetadata.Builder(other);
  }
  
  /** Creates a new PageMetadata RecordBuilder by copying an existing PageMetadata instance */
  public static wikipedia.schemas.PageMetadata.Builder newBuilder(wikipedia.schemas.PageMetadata other) {
    return new wikipedia.schemas.PageMetadata.Builder(other);
  }
  
  /**
   * RecordBuilder for PageMetadata instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PageMetadata>
    implements org.apache.avro.data.RecordBuilder<PageMetadata> {

    private java.lang.CharSequence title;
    private java.lang.Integer ns;
    private java.lang.Long page_id;
    private java.lang.CharSequence redirect;
    private java.util.List<wikipedia.schemas.RevisionMetadata> revisions;

    /** Creates a new Builder */
    private Builder() {
      super(wikipedia.schemas.PageMetadata.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(wikipedia.schemas.PageMetadata.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ns)) {
        this.ns = data().deepCopy(fields()[1].schema(), other.ns);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.page_id)) {
        this.page_id = data().deepCopy(fields()[2].schema(), other.page_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.redirect)) {
        this.redirect = data().deepCopy(fields()[3].schema(), other.redirect);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.revisions)) {
        this.revisions = data().deepCopy(fields()[4].schema(), other.revisions);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing PageMetadata instance */
    private Builder(wikipedia.schemas.PageMetadata other) {
            super(wikipedia.schemas.PageMetadata.SCHEMA$);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ns)) {
        this.ns = data().deepCopy(fields()[1].schema(), other.ns);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.page_id)) {
        this.page_id = data().deepCopy(fields()[2].schema(), other.page_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.redirect)) {
        this.redirect = data().deepCopy(fields()[3].schema(), other.redirect);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.revisions)) {
        this.revisions = data().deepCopy(fields()[4].schema(), other.revisions);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'title' field */
    public java.lang.CharSequence getTitle() {
      return title;
    }
    
    /** Sets the value of the 'title' field */
    public wikipedia.schemas.PageMetadata.Builder setTitle(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.title = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'title' field has been set */
    public boolean hasTitle() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'title' field */
    public wikipedia.schemas.PageMetadata.Builder clearTitle() {
      title = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'ns' field */
    public java.lang.Integer getNs() {
      return ns;
    }
    
    /** Sets the value of the 'ns' field */
    public wikipedia.schemas.PageMetadata.Builder setNs(java.lang.Integer value) {
      validate(fields()[1], value);
      this.ns = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'ns' field has been set */
    public boolean hasNs() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'ns' field */
    public wikipedia.schemas.PageMetadata.Builder clearNs() {
      ns = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'page_id' field */
    public java.lang.Long getPageId() {
      return page_id;
    }
    
    /** Sets the value of the 'page_id' field */
    public wikipedia.schemas.PageMetadata.Builder setPageId(java.lang.Long value) {
      validate(fields()[2], value);
      this.page_id = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'page_id' field has been set */
    public boolean hasPageId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'page_id' field */
    public wikipedia.schemas.PageMetadata.Builder clearPageId() {
      page_id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'redirect' field */
    public java.lang.CharSequence getRedirect() {
      return redirect;
    }
    
    /** Sets the value of the 'redirect' field */
    public wikipedia.schemas.PageMetadata.Builder setRedirect(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.redirect = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'redirect' field has been set */
    public boolean hasRedirect() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'redirect' field */
    public wikipedia.schemas.PageMetadata.Builder clearRedirect() {
      redirect = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'revisions' field */
    public java.util.List<wikipedia.schemas.RevisionMetadata> getRevisions() {
      return revisions;
    }
    
    /** Sets the value of the 'revisions' field */
    public wikipedia.schemas.PageMetadata.Builder setRevisions(java.util.List<wikipedia.schemas.RevisionMetadata> value) {
      validate(fields()[4], value);
      this.revisions = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'revisions' field has been set */
    public boolean hasRevisions() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'revisions' field */
    public wikipedia.schemas.PageMetadata.Builder clearRevisions() {
      revisions = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public PageMetadata build() {
      try {
        PageMetadata record = new PageMetadata();
        record.title = fieldSetFlags()[0] ? this.title : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ns = fieldSetFlags()[1] ? this.ns : (java.lang.Integer) defaultValue(fields()[1]);
        record.page_id = fieldSetFlags()[2] ? this.page_id : (java.lang.Long) defaultValue(fields()[2]);
        record.redirect = fieldSetFlags()[3] ? this.redirect : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.revisions = fieldSetFlags()[4] ? this.revisions : (java.util.List<wikipedia.schemas.RevisionMetadata>) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
