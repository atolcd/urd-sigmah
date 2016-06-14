package org.sigmah.shared.dto.element;
/*
 * #%L
 * Sigmah
 * %%
 * Copyright (C) 2010 - 2016 URD
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import com.extjs.gxt.ui.client.widget.Component;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.sigmah.shared.command.result.ValueResult;
import org.sigmah.shared.dto.referential.ContactModelType;
import org.sigmah.shared.util.ValueResultUtils;

public class ContactListElementDTO extends FlexibleElementDTO {
  private static final long serialVersionUID = 646913359144175456L;

  private static final String ENTITY_NAME = "element.ContactListElement";

  public static final String ALLOWED_TYPE = "allowedType";
  public static final String ALLOWED_MODEL_IDS = "allowedModels";
  public static final String LIMIT = "limit";
  public static final String IS_MEMBER = "isMember";

  @Override
  protected Component getComponent(final ValueResult valueResult, boolean enabled) {
    // TODO
    return null;
  }

  @Override
  public boolean isCorrectRequiredValue(ValueResult result) {
    return !parseValue(result).isEmpty();
  }

  public ContactModelType getAllowedType() {
    return get(ALLOWED_TYPE);
  }

  public void setAllowedType(ContactModelType allowedType) {
    set(ALLOWED_TYPE, allowedType);
  }

  public Set<Integer> getAllowedModelIds() {
    return get(ALLOWED_MODEL_IDS);
  }

  public void setAllowedModelIds(Set<Integer> allowedModels) {
    set(ALLOWED_MODEL_IDS, allowedModels);
  }

  public int getLimit() {
    return get(LIMIT);
  }

  public void setLimit(int limit) {
    set(LIMIT, limit);
  }

  public boolean isMember() {
    return get(IS_MEMBER);
  }

  public void setMember(boolean isMember) {
    set(IS_MEMBER, isMember);
  }

  @Override
  public String getEntityName() {
    return ENTITY_NAME;
  }

  public static Set<Integer> parseValue(ValueResult result) {
    if (result == null || result.getValueObject() == null) {
      return Collections.emptySet();
    }

    Set<Integer> ids = new HashSet<Integer>();
    for (String serializedId : result.getValueObject().split(ValueResultUtils.DEFAULT_VALUE_SEPARATOR)) {
      ids.add(Integer.parseInt(serializedId));
    }
    return ids;
  }
}