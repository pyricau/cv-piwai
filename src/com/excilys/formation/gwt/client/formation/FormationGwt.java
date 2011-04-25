package com.excilys.formation.gwt.client.formation;

import com.excilys.formation.gwt.client.formation.clientbundle.ClientBundle;
import com.excilys.formation.gwt.client.formation.environnement_dev.EnvironnementDev;
import com.excilys.formation.gwt.client.formation.events.Events;
import com.excilys.formation.gwt.client.formation.hosted_mode.HostedMode;
import com.excilys.formation.gwt.client.formation.introduction.Introduction;
import com.excilys.formation.gwt.client.formation.outil_avances.OutilsAvances;
import com.excilys.formation.gwt.client.formation.questionnaires.Questionnaires;
import com.excilys.formation.gwt.client.formation.rpc.RPC;
import com.excilys.formation.gwt.client.formation.uibinder.UIBinder;
import com.excilys.formation.gwt.client.formation.welcome.Welcome;
import com.excilys.formation.gwt.client.formation.widgets.Widgets;
import com.excilys.formation.gwt.client.slider.ElementSlide;
import com.excilys.formation.gwt.client.slider.SlideViewer;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;

public class FormationGwt extends SlideViewer {

    @UiTemplate("Plan.ui.xml")
    interface Plan extends UiBinder<Element, ElementSlide> {}

    public static final Plan PLAN = GWT.create(Plan.class);

    @Override
    protected void loadChapters() {
        add(new Welcome());
        add(new Introduction());
        add(new EnvironnementDev());
        add(new HostedMode());
        add(new Widgets());
        add(new Events());
        add(new RPC());
        add(new UIBinder());
        add(new ClientBundle());
        add(new OutilsAvances());
        add(new Questionnaires());
    }

}
