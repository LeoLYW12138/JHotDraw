/*
 * @(#)ClearAction.java  1.0  2005-10-16
 *
 * Copyright (c) 1996-2006 by the original authors of JHotDraw
 * and all its contributors ("JHotDraw.org")
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * JHotDraw.org ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * JHotDraw.org.
 */

package org.jhotdraw.application.action;

import org.jhotdraw.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.jhotdraw.application.DocumentOrientedApplication;
import org.jhotdraw.application.Project;

/**
 * Clears a project.
 *
 * @author Werner Randelshofer
 * @version 1.0  2005-10-16 Created.
 */
public class ClearAction extends AbstractSaveBeforeAction {
    public final static String ID = "clear";
    
    /** Creates a new instance. */
    public ClearAction() {
        ResourceBundleUtil labels = ResourceBundleUtil.getLAFBundle("org.jhotdraw.application.Labels");
        labels.configureAction(this, "new");
    }
    
    @Override public void doIt(Project project) {
        project.clear();
        project.setFile(null);
    }
}