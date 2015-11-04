/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-10-29")
public class Message implements org.apache.thrift.TBase<Message, Message._Fields>, java.io.Serializable, Cloneable, Comparable<Message> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Message");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EVENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("eventId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField EVENT_FIELD_DESC = new org.apache.thrift.protocol.TField("event", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField ROUTE_FIELD_DESC = new org.apache.thrift.protocol.TField("route", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField USER_ROUTE_FIELD_DESC = new org.apache.thrift.protocol.TField("userRoute", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField ENDPOINT_ROUTE_UPDATE_FIELD_DESC = new org.apache.thrift.protocol.TField("endpointRouteUpdate", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField ENDPOINT_STATE_UPDATE_FIELD_DESC = new org.apache.thrift.protocol.TField("endpointStateUpdate", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MessageTupleSchemeFactory());
  }

  /**
   * 
   * @see EventMessageType
   */
  public EventMessageType type; // required
  public long eventId; // required
  public Event event; // required
  public EventRoute route; // required
  public UserRouteInfo userRoute; // required
  public EndpointRouteUpdate endpointRouteUpdate; // required
  public EndpointStateUpdate endpointStateUpdate; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see EventMessageType
     */
    TYPE((short)1, "type"),
    EVENT_ID((short)2, "eventId"),
    EVENT((short)3, "event"),
    ROUTE((short)4, "route"),
    USER_ROUTE((short)5, "userRoute"),
    ENDPOINT_ROUTE_UPDATE((short)6, "endpointRouteUpdate"),
    ENDPOINT_STATE_UPDATE((short)7, "endpointStateUpdate");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // EVENT_ID
          return EVENT_ID;
        case 3: // EVENT
          return EVENT;
        case 4: // ROUTE
          return ROUTE;
        case 5: // USER_ROUTE
          return USER_ROUTE;
        case 6: // ENDPOINT_ROUTE_UPDATE
          return ENDPOINT_ROUTE_UPDATE;
        case 7: // ENDPOINT_STATE_UPDATE
          return ENDPOINT_STATE_UPDATE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __EVENTID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, EventMessageType.class)));
    tmpMap.put(_Fields.EVENT_ID, new org.apache.thrift.meta_data.FieldMetaData("eventId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Long")));
    tmpMap.put(_Fields.EVENT, new org.apache.thrift.meta_data.FieldMetaData("event", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Event.class)));
    tmpMap.put(_Fields.ROUTE, new org.apache.thrift.meta_data.FieldMetaData("route", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EventRoute.class)));
    tmpMap.put(_Fields.USER_ROUTE, new org.apache.thrift.meta_data.FieldMetaData("userRoute", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, UserRouteInfo.class)));
    tmpMap.put(_Fields.ENDPOINT_ROUTE_UPDATE, new org.apache.thrift.meta_data.FieldMetaData("endpointRouteUpdate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EndpointRouteUpdate.class)));
    tmpMap.put(_Fields.ENDPOINT_STATE_UPDATE, new org.apache.thrift.meta_data.FieldMetaData("endpointStateUpdate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EndpointStateUpdate.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Message.class, metaDataMap);
  }

  public Message() {
  }

  public Message(
    EventMessageType type,
    long eventId,
    Event event,
    EventRoute route,
    UserRouteInfo userRoute,
    EndpointRouteUpdate endpointRouteUpdate,
    EndpointStateUpdate endpointStateUpdate)
  {
    this();
    this.type = type;
    this.eventId = eventId;
    setEventIdIsSet(true);
    this.event = event;
    this.route = route;
    this.userRoute = userRoute;
    this.endpointRouteUpdate = endpointRouteUpdate;
    this.endpointStateUpdate = endpointStateUpdate;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Message(Message other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.eventId = other.eventId;
    if (other.isSetEvent()) {
      this.event = new Event(other.event);
    }
    if (other.isSetRoute()) {
      this.route = new EventRoute(other.route);
    }
    if (other.isSetUserRoute()) {
      this.userRoute = new UserRouteInfo(other.userRoute);
    }
    if (other.isSetEndpointRouteUpdate()) {
      this.endpointRouteUpdate = new EndpointRouteUpdate(other.endpointRouteUpdate);
    }
    if (other.isSetEndpointStateUpdate()) {
      this.endpointStateUpdate = new EndpointStateUpdate(other.endpointStateUpdate);
    }
  }

  public Message deepCopy() {
    return new Message(this);
  }

  @Override
  public void clear() {
    this.type = null;
    setEventIdIsSet(false);
    this.eventId = 0;
    this.event = null;
    this.route = null;
    this.userRoute = null;
    this.endpointRouteUpdate = null;
    this.endpointStateUpdate = null;
  }

  /**
   * 
   * @see EventMessageType
   */
  public EventMessageType getType() {
    return this.type;
  }

  /**
   * 
   * @see EventMessageType
   */
  public Message setType(EventMessageType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public long getEventId() {
    return this.eventId;
  }

  public Message setEventId(long eventId) {
    this.eventId = eventId;
    setEventIdIsSet(true);
    return this;
  }

  public void unsetEventId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EVENTID_ISSET_ID);
  }

  /** Returns true if field eventId is set (has been assigned a value) and false otherwise */
  public boolean isSetEventId() {
    return EncodingUtils.testBit(__isset_bitfield, __EVENTID_ISSET_ID);
  }

  public void setEventIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EVENTID_ISSET_ID, value);
  }

  public Event getEvent() {
    return this.event;
  }

  public Message setEvent(Event event) {
    this.event = event;
    return this;
  }

  public void unsetEvent() {
    this.event = null;
  }

  /** Returns true if field event is set (has been assigned a value) and false otherwise */
  public boolean isSetEvent() {
    return this.event != null;
  }

  public void setEventIsSet(boolean value) {
    if (!value) {
      this.event = null;
    }
  }

  public EventRoute getRoute() {
    return this.route;
  }

  public Message setRoute(EventRoute route) {
    this.route = route;
    return this;
  }

  public void unsetRoute() {
    this.route = null;
  }

  /** Returns true if field route is set (has been assigned a value) and false otherwise */
  public boolean isSetRoute() {
    return this.route != null;
  }

  public void setRouteIsSet(boolean value) {
    if (!value) {
      this.route = null;
    }
  }

  public UserRouteInfo getUserRoute() {
    return this.userRoute;
  }

  public Message setUserRoute(UserRouteInfo userRoute) {
    this.userRoute = userRoute;
    return this;
  }

  public void unsetUserRoute() {
    this.userRoute = null;
  }

  /** Returns true if field userRoute is set (has been assigned a value) and false otherwise */
  public boolean isSetUserRoute() {
    return this.userRoute != null;
  }

  public void setUserRouteIsSet(boolean value) {
    if (!value) {
      this.userRoute = null;
    }
  }

  public EndpointRouteUpdate getEndpointRouteUpdate() {
    return this.endpointRouteUpdate;
  }

  public Message setEndpointRouteUpdate(EndpointRouteUpdate endpointRouteUpdate) {
    this.endpointRouteUpdate = endpointRouteUpdate;
    return this;
  }

  public void unsetEndpointRouteUpdate() {
    this.endpointRouteUpdate = null;
  }

  /** Returns true if field endpointRouteUpdate is set (has been assigned a value) and false otherwise */
  public boolean isSetEndpointRouteUpdate() {
    return this.endpointRouteUpdate != null;
  }

  public void setEndpointRouteUpdateIsSet(boolean value) {
    if (!value) {
      this.endpointRouteUpdate = null;
    }
  }

  public EndpointStateUpdate getEndpointStateUpdate() {
    return this.endpointStateUpdate;
  }

  public Message setEndpointStateUpdate(EndpointStateUpdate endpointStateUpdate) {
    this.endpointStateUpdate = endpointStateUpdate;
    return this;
  }

  public void unsetEndpointStateUpdate() {
    this.endpointStateUpdate = null;
  }

  /** Returns true if field endpointStateUpdate is set (has been assigned a value) and false otherwise */
  public boolean isSetEndpointStateUpdate() {
    return this.endpointStateUpdate != null;
  }

  public void setEndpointStateUpdateIsSet(boolean value) {
    if (!value) {
      this.endpointStateUpdate = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((EventMessageType)value);
      }
      break;

    case EVENT_ID:
      if (value == null) {
        unsetEventId();
      } else {
        setEventId((Long)value);
      }
      break;

    case EVENT:
      if (value == null) {
        unsetEvent();
      } else {
        setEvent((Event)value);
      }
      break;

    case ROUTE:
      if (value == null) {
        unsetRoute();
      } else {
        setRoute((EventRoute)value);
      }
      break;

    case USER_ROUTE:
      if (value == null) {
        unsetUserRoute();
      } else {
        setUserRoute((UserRouteInfo)value);
      }
      break;

    case ENDPOINT_ROUTE_UPDATE:
      if (value == null) {
        unsetEndpointRouteUpdate();
      } else {
        setEndpointRouteUpdate((EndpointRouteUpdate)value);
      }
      break;

    case ENDPOINT_STATE_UPDATE:
      if (value == null) {
        unsetEndpointStateUpdate();
      } else {
        setEndpointStateUpdate((EndpointStateUpdate)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case EVENT_ID:
      return getEventId();

    case EVENT:
      return getEvent();

    case ROUTE:
      return getRoute();

    case USER_ROUTE:
      return getUserRoute();

    case ENDPOINT_ROUTE_UPDATE:
      return getEndpointRouteUpdate();

    case ENDPOINT_STATE_UPDATE:
      return getEndpointStateUpdate();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case EVENT_ID:
      return isSetEventId();
    case EVENT:
      return isSetEvent();
    case ROUTE:
      return isSetRoute();
    case USER_ROUTE:
      return isSetUserRoute();
    case ENDPOINT_ROUTE_UPDATE:
      return isSetEndpointRouteUpdate();
    case ENDPOINT_STATE_UPDATE:
      return isSetEndpointStateUpdate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Message)
      return this.equals((Message)that);
    return false;
  }

  public boolean equals(Message that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_eventId = true;
    boolean that_present_eventId = true;
    if (this_present_eventId || that_present_eventId) {
      if (!(this_present_eventId && that_present_eventId))
        return false;
      if (this.eventId != that.eventId)
        return false;
    }

    boolean this_present_event = true && this.isSetEvent();
    boolean that_present_event = true && that.isSetEvent();
    if (this_present_event || that_present_event) {
      if (!(this_present_event && that_present_event))
        return false;
      if (!this.event.equals(that.event))
        return false;
    }

    boolean this_present_route = true && this.isSetRoute();
    boolean that_present_route = true && that.isSetRoute();
    if (this_present_route || that_present_route) {
      if (!(this_present_route && that_present_route))
        return false;
      if (!this.route.equals(that.route))
        return false;
    }

    boolean this_present_userRoute = true && this.isSetUserRoute();
    boolean that_present_userRoute = true && that.isSetUserRoute();
    if (this_present_userRoute || that_present_userRoute) {
      if (!(this_present_userRoute && that_present_userRoute))
        return false;
      if (!this.userRoute.equals(that.userRoute))
        return false;
    }

    boolean this_present_endpointRouteUpdate = true && this.isSetEndpointRouteUpdate();
    boolean that_present_endpointRouteUpdate = true && that.isSetEndpointRouteUpdate();
    if (this_present_endpointRouteUpdate || that_present_endpointRouteUpdate) {
      if (!(this_present_endpointRouteUpdate && that_present_endpointRouteUpdate))
        return false;
      if (!this.endpointRouteUpdate.equals(that.endpointRouteUpdate))
        return false;
    }

    boolean this_present_endpointStateUpdate = true && this.isSetEndpointStateUpdate();
    boolean that_present_endpointStateUpdate = true && that.isSetEndpointStateUpdate();
    if (this_present_endpointStateUpdate || that_present_endpointStateUpdate) {
      if (!(this_present_endpointStateUpdate && that_present_endpointStateUpdate))
        return false;
      if (!this.endpointStateUpdate.equals(that.endpointStateUpdate))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_eventId = true;
    list.add(present_eventId);
    if (present_eventId)
      list.add(eventId);

    boolean present_event = true && (isSetEvent());
    list.add(present_event);
    if (present_event)
      list.add(event);

    boolean present_route = true && (isSetRoute());
    list.add(present_route);
    if (present_route)
      list.add(route);

    boolean present_userRoute = true && (isSetUserRoute());
    list.add(present_userRoute);
    if (present_userRoute)
      list.add(userRoute);

    boolean present_endpointRouteUpdate = true && (isSetEndpointRouteUpdate());
    list.add(present_endpointRouteUpdate);
    if (present_endpointRouteUpdate)
      list.add(endpointRouteUpdate);

    boolean present_endpointStateUpdate = true && (isSetEndpointStateUpdate());
    list.add(present_endpointStateUpdate);
    if (present_endpointStateUpdate)
      list.add(endpointStateUpdate);

    return list.hashCode();
  }

  @Override
  public int compareTo(Message other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEventId()).compareTo(other.isSetEventId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventId, other.eventId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEvent()).compareTo(other.isSetEvent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEvent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.event, other.event);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoute()).compareTo(other.isSetRoute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoute()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.route, other.route);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserRoute()).compareTo(other.isSetUserRoute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserRoute()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userRoute, other.userRoute);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndpointRouteUpdate()).compareTo(other.isSetEndpointRouteUpdate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndpointRouteUpdate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endpointRouteUpdate, other.endpointRouteUpdate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndpointStateUpdate()).compareTo(other.isSetEndpointStateUpdate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndpointStateUpdate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endpointStateUpdate, other.endpointStateUpdate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Message(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("eventId:");
    sb.append(this.eventId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("event:");
    if (this.event == null) {
      sb.append("null");
    } else {
      sb.append(this.event);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("route:");
    if (this.route == null) {
      sb.append("null");
    } else {
      sb.append(this.route);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userRoute:");
    if (this.userRoute == null) {
      sb.append("null");
    } else {
      sb.append(this.userRoute);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endpointRouteUpdate:");
    if (this.endpointRouteUpdate == null) {
      sb.append("null");
    } else {
      sb.append(this.endpointRouteUpdate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endpointStateUpdate:");
    if (this.endpointStateUpdate == null) {
      sb.append("null");
    } else {
      sb.append(this.endpointStateUpdate);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (event != null) {
      event.validate();
    }
    if (route != null) {
      route.validate();
    }
    if (userRoute != null) {
      userRoute.validate();
    }
    if (endpointRouteUpdate != null) {
      endpointRouteUpdate.validate();
    }
    if (endpointStateUpdate != null) {
      endpointStateUpdate.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MessageStandardSchemeFactory implements SchemeFactory {
    public MessageStandardScheme getScheme() {
      return new MessageStandardScheme();
    }
  }

  private static class MessageStandardScheme extends StandardScheme<Message> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Message struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.kaaproject.kaa.server.common.thrift.gen.operations.EventMessageType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EVENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.eventId = iprot.readI64();
              struct.setEventIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EVENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.event = new Event();
              struct.event.read(iprot);
              struct.setEventIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROUTE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.route = new EventRoute();
              struct.route.read(iprot);
              struct.setRouteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // USER_ROUTE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.userRoute = new UserRouteInfo();
              struct.userRoute.read(iprot);
              struct.setUserRouteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ENDPOINT_ROUTE_UPDATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.endpointRouteUpdate = new EndpointRouteUpdate();
              struct.endpointRouteUpdate.read(iprot);
              struct.setEndpointRouteUpdateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ENDPOINT_STATE_UPDATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.endpointStateUpdate = new EndpointStateUpdate();
              struct.endpointStateUpdate.read(iprot);
              struct.setEndpointStateUpdateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Message struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EVENT_ID_FIELD_DESC);
      oprot.writeI64(struct.eventId);
      oprot.writeFieldEnd();
      if (struct.event != null) {
        oprot.writeFieldBegin(EVENT_FIELD_DESC);
        struct.event.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.route != null) {
        oprot.writeFieldBegin(ROUTE_FIELD_DESC);
        struct.route.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.userRoute != null) {
        oprot.writeFieldBegin(USER_ROUTE_FIELD_DESC);
        struct.userRoute.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.endpointRouteUpdate != null) {
        oprot.writeFieldBegin(ENDPOINT_ROUTE_UPDATE_FIELD_DESC);
        struct.endpointRouteUpdate.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.endpointStateUpdate != null) {
        oprot.writeFieldBegin(ENDPOINT_STATE_UPDATE_FIELD_DESC);
        struct.endpointStateUpdate.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageTupleSchemeFactory implements SchemeFactory {
    public MessageTupleScheme getScheme() {
      return new MessageTupleScheme();
    }
  }

  private static class MessageTupleScheme extends TupleScheme<Message> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Message struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetEventId()) {
        optionals.set(1);
      }
      if (struct.isSetEvent()) {
        optionals.set(2);
      }
      if (struct.isSetRoute()) {
        optionals.set(3);
      }
      if (struct.isSetUserRoute()) {
        optionals.set(4);
      }
      if (struct.isSetEndpointRouteUpdate()) {
        optionals.set(5);
      }
      if (struct.isSetEndpointStateUpdate()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetEventId()) {
        oprot.writeI64(struct.eventId);
      }
      if (struct.isSetEvent()) {
        struct.event.write(oprot);
      }
      if (struct.isSetRoute()) {
        struct.route.write(oprot);
      }
      if (struct.isSetUserRoute()) {
        struct.userRoute.write(oprot);
      }
      if (struct.isSetEndpointRouteUpdate()) {
        struct.endpointRouteUpdate.write(oprot);
      }
      if (struct.isSetEndpointStateUpdate()) {
        struct.endpointStateUpdate.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Message struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.type = org.kaaproject.kaa.server.common.thrift.gen.operations.EventMessageType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.eventId = iprot.readI64();
        struct.setEventIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.event = new Event();
        struct.event.read(iprot);
        struct.setEventIsSet(true);
      }
      if (incoming.get(3)) {
        struct.route = new EventRoute();
        struct.route.read(iprot);
        struct.setRouteIsSet(true);
      }
      if (incoming.get(4)) {
        struct.userRoute = new UserRouteInfo();
        struct.userRoute.read(iprot);
        struct.setUserRouteIsSet(true);
      }
      if (incoming.get(5)) {
        struct.endpointRouteUpdate = new EndpointRouteUpdate();
        struct.endpointRouteUpdate.read(iprot);
        struct.setEndpointRouteUpdateIsSet(true);
      }
      if (incoming.get(6)) {
        struct.endpointStateUpdate = new EndpointStateUpdate();
        struct.endpointStateUpdate.read(iprot);
        struct.setEndpointStateUpdateIsSet(true);
      }
    }
  }

}

