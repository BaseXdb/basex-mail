package org.basex.modules;

import org.basex.core.*;
import org.basex.query.*;
import org.basex.query.value.map.*;

/**
 * Mail test class.
 *
 * @author BaseX Team 2005-12, BSD License
 * @author Christian Gruen
 */
public final class MailTest extends QueryModule {
  /**
   * Test method.
   * @param args ignored
   * @throws Exception exception
   */
  public static void main(final String[] args) throws Exception {
    testXQuery();
  }

  /**
   * Java test method.
   * @throws Exception exception
   */
  public static void testJava() throws Exception {
    MapBuilder map = new MapBuilder();
    map.put("subject", "Hi");
    map.put("message", "hi there");
    new Mail().send(map.map());
  }

  /**
   * Java XQuery test method.
   * @throws Exception exception
   */
  public static void testXQuery() throws Exception {
    final Context ctx = new Context();
    String query =
      "import module namespace mail = 'http://basex.org/modules/mail'; " +
      "mail:send({ 'subject': 'Hi', 'message': 'hi there' })";
    System.out.println(new QueryProcessor(query, ctx).value().serialize());
  }
}
