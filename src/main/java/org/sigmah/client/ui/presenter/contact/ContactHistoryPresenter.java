package org.sigmah.client.ui.presenter.contact;
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

import com.google.inject.ImplementedBy;
import com.google.inject.Inject;

import org.sigmah.client.i18n.I18N;
import org.sigmah.client.inject.Injector;
import org.sigmah.client.ui.presenter.base.AbstractPresenter;
import org.sigmah.client.ui.view.base.ViewInterface;
import org.sigmah.client.ui.view.contact.ContactHistoryView;
import org.sigmah.shared.dto.ContactDTO;

public class ContactHistoryPresenter extends AbstractPresenter<ContactHistoryPresenter.View> implements ContactPresenter.ContactSubPresenter<ContactHistoryPresenter.View> {
  @ImplementedBy(ContactHistoryView.class)
  public interface View extends ViewInterface {

  }

  @Inject
  public ContactHistoryPresenter(View view, Injector injector) {
    super(view, injector);
  }

  @Override
  public String getTabHeader() {
    return I18N.CONSTANTS.contactHistoryHeader();
  }

  @Override
  public void refresh(ContactDTO contactDTO) {
    // TODO
  }
}