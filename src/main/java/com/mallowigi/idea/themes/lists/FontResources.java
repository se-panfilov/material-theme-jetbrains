/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015-2021 Elior "Mallowigi" Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.mallowigi.idea.themes.lists;

import com.google.common.collect.Sets;
import org.jetbrains.annotations.NonNls;

import java.util.Collections;
import java.util.Set;

public enum FontResources {
  DEFAULT;
  @SuppressWarnings("DuplicateStringLiteralInspection")
  @NonNls
  public static final Set<String> FONT_RESOURCES = Collections.unmodifiableSet(
    Sets.newHashSet(
      "Button.font",
      "Component.font",
      "CheckBox.font",
      "CheckBoxMenuItem.acceleratorFont",
      "CheckBoxMenuItem.font",
      "ColorChooser.font",
      "ComboBox.font",
      "DesktopIcon.font",
      "EditorPane.font",
      "FormattedTextField.font",
      "IconButton.font",
      "Label.font",
      "LinkButton.font",
      "List.font",
      "Menu.font",
      "MenuBar.font",
      "MenuItem.acceleratorFont",
      "MenuItem.font",
      "OptionPane.buttonFont",
      "OptionPane.font",
      "OptionPane.messageFont",
      "Panel.font",
      "PasswordField.font",
      "PopupMenu.font",
      "ProgressBar.font",
      "RadioButton.font",
      "RadioButtonMenuItem.acceleratorFont",
      "RadioButtonMenuItem.font",
      "ScrollPane.font",
      "Slider.font",
      "Spinner.font",
      "TabbedPane.font",
      "TabbedPane.smallFont",
      "Table.font",
      "TableHeader.font",
      "TextArea.font",
      "TextField.font",
      "TextPane.font",
      "TitledBorder.font",
      "ToggleButton.font",
      "ToolBar.font",
      "ToolTip.font",
      "Tree.font",
      "Viewport.font"
    ));
}
