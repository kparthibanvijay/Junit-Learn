/**
 * @(#) $Id: eRTJalopyCodeConventions.xml 1657 2007-06-12 14:55:27Z worourke $
 * Copyright (c) 2010 eResearchTechnology, Inc. All Rights Reserved.
 */

package com.greet;

/**
 * DOCUMENT ME!
 *
 * @author $author$ Created On 05-Aug-2020
 */
public class GreetingImpl implements Greeting {
    /**
     * @see com.greet.Greeting#greet(java.lang.String)
     */
    @Override public String greet(String name) {
        if ((name == null) || (name.length() == 0)) { throw new IllegalArgumentException(); }
        return "Hello " + name + "!";
    }
}