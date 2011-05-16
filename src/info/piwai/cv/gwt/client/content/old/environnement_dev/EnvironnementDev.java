package info.piwai.cv.gwt.client.content.old.environnement_dev;

import info.piwai.cv.gwt.client.content.old.FormationGwt.Plan;
import info.piwai.cv.gwt.client.slider.shownotes.ElementSlideNotes;
import info.piwai.cv.gwt.client.slider.slides.Chapter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;

public class EnvironnementDev extends Chapter {

    @UiTemplate("Titre.ui.xml")
    interface Titre extends UiBinder<Element, ElementSlideNotes> {
        Titre binder = GWT.create(Titre.class);
    }

    @UiTemplate("GWTDesigner.ui.xml")
    interface GWTDesigner extends UiBinder<Element, ElementSlideNotes> {
        GWTDesigner binder = GWT.create(GWTDesigner.class);
    }

    @UiTemplate("SpeedTracer.ui.xml")
    interface SpeedTracer extends UiBinder<Element, ElementSlideNotes> {
        SpeedTracer binder = GWT.create(SpeedTracer.class);
    }

    @UiTemplate("IDE.ui.xml")
    interface IDE extends UiBinder<Element, ElementSlideNotes> {
        IDE binder = GWT.create(IDE.class);
    }

    @Override
    protected void buildSlides() {
        addNotesSlide(Titre.binder);
        addNotesSlide(IDE.binder);
        addNotesSlide(GWTDesigner.binder);
        addNotesSlide(SpeedTracer.binder);
        addSlide(Plan.binder);
    }

}
