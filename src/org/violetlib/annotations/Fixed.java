/*
 * Copyright (c) 2020 Alan Snyder.
 * All rights reserved.
 *
 * You may not use, copy or modify this file, except in compliance with the license agreement. For details see
 * accompanying license terms.
 */

package org.violetlib.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
  A variable or method result is fixed if it always has the same value. A fixed variable is similar to a final variable
  except that a fixed variable is not subject to the strict initialization rules of a final variable. A fixed method
  result is nothing at all like a final method. It means the method is equivalent to a named constant.
*/

@Retention(RetentionPolicy.SOURCE)
public @interface Fixed
{
}
