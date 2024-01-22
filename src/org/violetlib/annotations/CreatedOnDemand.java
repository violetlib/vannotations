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

  It would be nice if @CreatedOnDemand implied @Nullable
*/

/**
  An annotation for instance variables that are created on demand (and thus never reveal themselves as null to the
  outside world).
*/

@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface CreatedOnDemand
{
}
