/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;  
@SuppressWarnings("all")
public class BlocklistRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"BlocklistRequest\",\"namespace\":\"org.openrtb.common.api\",\"fields\":[{\"name\":\"identification\",\"type\":[{\"type\":\"record\",\"name\":\"Identification\",\"fields\":[{\"name\":\"organization\",\"type\":[\"string\",\"null\"]},{\"name\":\"timestamp\",\"type\":[\"long\",\"null\"]},{\"name\":\"token\",\"type\":[\"string\",\"null\"]}]},\"null\"]},{\"name\":\"advertisers\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Advertiser\",\"fields\":[{\"name\":\"landingPageTLD\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"timestamp\",\"type\":[\"long\",\"null\"]},{\"name\":\"blocklist\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Blocklist\",\"fields\":[{\"name\":\"publisherID\",\"type\":[\"string\",\"null\"]},{\"name\":\"publisherName\",\"type\":[\"string\",\"null\"]},{\"name\":\"sideID\",\"type\":[\"string\",\"null\"]},{\"name\":\"siteName\",\"type\":[\"string\",\"null\"]}]}}}]}}}]}");
  public org.openrtb.common.api.Identification identification;
  public java.util.List<org.openrtb.common.api.Advertiser> advertisers;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return identification;
    case 1: return advertisers;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: identification = (org.openrtb.common.api.Identification)value$; break;
    case 1: advertisers = (java.util.List<org.openrtb.common.api.Advertiser>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}