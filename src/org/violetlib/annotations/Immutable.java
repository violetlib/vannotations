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

/**
  An annotation for classes whose instances are immutable.
*/

@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface Immutable
{
}
