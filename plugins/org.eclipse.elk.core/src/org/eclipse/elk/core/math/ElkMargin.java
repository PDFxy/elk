/*******************************************************************************
 * Copyright (c) 2016 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.core.math;

/**
 * Stores the margins of an element. The margin is the area around the border of an element that has to be kept free
 * of any other elements.
 */
public final class ElkMargin extends Spacing {

    /** The serial version UID. */
    private static final long serialVersionUID = 7465583871643915474L;

    /**
     * Creates a new instance with all fields set to {@code 0.0}.
     */
    public ElkMargin() {
        super();
    }

    /**
     * Creates a new instance with all fields set to the value of {@code other}.
     * 
     * @param other
     *            margins object from which to copy the values.
     */
    public ElkMargin(final ElkMargin other) {
        super(other.top, other.right, other.bottom, other.left);
    }

    /**
     * Creates a new instance initialized with the given values.
     * 
     * @param top
     *            the margin from the top.
     * @param right
     *            the margin from the right.
     * @param bottom
     *            the margin from the bottom.
     * @param left
     *            the margin from the left.
     */
    public ElkMargin(final double top, final double right, final double bottom, final double left) {
        super(top, right, bottom, left);
    }
}