//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.11.14 at 02:49:33 PM GMT
//

package net.sf.mpxj.mspdi.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import net.sf.mpxj.AccrueType;

@SuppressWarnings("all") public class Adapter8 extends XmlAdapter<String, AccrueType>
{

   public AccrueType unmarshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.parseAccrueType(value));
   }

   public String marshal(AccrueType value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.printAccrueType(value));
   }

}
