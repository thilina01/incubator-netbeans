/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.javascript2.editor.formatter.ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.modules.javascript2.lexer.api.JsTokenId;
import org.netbeans.modules.options.editor.spi.PreferencesCustomizer;
import static org.netbeans.modules.javascript2.editor.formatter.FmtOptions.*;
import static org.netbeans.modules.javascript2.editor.formatter.FmtOptions.CategorySupport.OPTION_ID;
import org.netbeans.modules.javascript2.editor.formatter.Utils;

/**
 *
 * @author phrebejk
 * @author rsvitanic
 */
public class FmtAlignment extends javax.swing.JPanel {

    private static final Logger LOGGER = Logger.getLogger(FmtAlignment.class.getName());

    public FmtAlignment() {
        initComponents();
        nlElseCheckBox.putClientProperty(OPTION_ID, placeElseOnNewLine);
        nlWhileCheckBox.putClientProperty(OPTION_ID, placeWhileOnNewLine);
        nlCatchCheckBox.putClientProperty(OPTION_ID, placeCatchOnNewLine);
        nlFinallyCheckBox.putClientProperty(OPTION_ID, placeFinallyOnNewLine);

    }

    public static PreferencesCustomizer.Factory getController() {
        String preview = "";
        try {
            preview = Utils.loadPreviewText(FmtAlignment.class.getClassLoader().getResourceAsStream("org/netbeans/modules/javascript2/editor/formatter/ui/Spaces.js")); //NOI18N
        } catch (IOException ex) {
            LOGGER.log(Level.WARNING, null, ex);
        }
        return new CategorySupport.Factory(JsTokenId.JAVASCRIPT_MIME_TYPE, "alignment", // NOI18N
                FmtAlignment.class, preview);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newLinesLabel = new javax.swing.JLabel();
        nlElseCheckBox = new javax.swing.JCheckBox();
        nlWhileCheckBox = new javax.swing.JCheckBox();
        nlCatchCheckBox = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        nlFinallyCheckBox = new javax.swing.JCheckBox();

        setName(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "LBL_Alignment")); // NOI18N
        setOpaque(false);

        org.openide.awt.Mnemonics.setLocalizedText(newLinesLabel, org.openide.util.NbBundle.getMessage(FmtAlignment.class, "LBL_al_newLines")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(nlElseCheckBox, org.openide.util.NbBundle.getMessage(FmtAlignment.class, "LBL_nl_Else")); // NOI18N
        nlElseCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(nlWhileCheckBox, org.openide.util.NbBundle.getMessage(FmtAlignment.class, "LBL_nl_While")); // NOI18N
        nlWhileCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(nlCatchCheckBox, org.openide.util.NbBundle.getMessage(FmtAlignment.class, "LBL_nl_Catch")); // NOI18N
        nlCatchCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(nlFinallyCheckBox, org.openide.util.NbBundle.getMessage(FmtAlignment.class, "LBL_nl_Finally")); // NOI18N
        nlFinallyCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newLinesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nlElseCheckBox)
                            .addComponent(nlWhileCheckBox)
                            .addComponent(nlCatchCheckBox)
                            .addComponent(nlFinallyCheckBox))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newLinesLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nlElseCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nlWhileCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nlCatchCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nlFinallyCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        newLinesLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.newLinesLabel.AccessibleContext.accessibleName")); // NOI18N
        newLinesLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.newLinesLabel.AccessibleContext.accessibleDescription")); // NOI18N
        nlElseCheckBox.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.nlElseCheckBox.AccessibleContext.accessibleName")); // NOI18N
        nlElseCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.nlElseCheckBox.AccessibleContext.accessibleDescription")); // NOI18N
        nlWhileCheckBox.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.nlWhileCheckBox.AccessibleContext.accessibleName")); // NOI18N
        nlWhileCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.nlWhileCheckBox.AccessibleContext.accessibleDescription")); // NOI18N
        nlCatchCheckBox.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.nlCatchCheckBox.AccessibleContext.accessibleName")); // NOI18N
        nlCatchCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.nlCatchCheckBox.AccessibleContext.accessibleDescription")); // NOI18N
        nlFinallyCheckBox.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.nlFinallyCheckBox.AccessibleContext.accessibleName")); // NOI18N
        nlFinallyCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.nlFinallyCheckBox.AccessibleContext.accessibleDescription")); // NOI18N

        getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.AccessibleContext.accessibleName")); // NOI18N
        getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtAlignment.class, "FmtAlignment.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel newLinesLabel;
    private javax.swing.JCheckBox nlCatchCheckBox;
    private javax.swing.JCheckBox nlElseCheckBox;
    private javax.swing.JCheckBox nlFinallyCheckBox;
    private javax.swing.JCheckBox nlWhileCheckBox;
    // End of variables declaration//GEN-END:variables

}