/*
 * Copyright (c) 2020 Alan Snyder.
 * All rights reserved.
 *
 * You may not use, copy or modify this file, except in compliance with the license agreement. For details see
 * accompanying license terms.
 */

package org.violetlib.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
  TBD:

  It would be nice if @Cache implied @Nullable
*/

/**
  An annotation for an instance variable that caches a value. The value is created as needed and retained using the
  instance variable. The instance variable is cleared to invalidate the cache and force the value to be recreated.
*/

@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface Cache
{
}
