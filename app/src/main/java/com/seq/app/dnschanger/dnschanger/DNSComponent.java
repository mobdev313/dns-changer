package com.seq.app.dnschanger.dnschanger;

import com.seq.app.dnschanger.di.component.ApplicationComponent;
import com.seq.app.dnschanger.di.scope.ActivityScope;

import dagger.Component;

@Component(modules = {DNSModule.class}, dependencies = {ApplicationComponent.class})
@ActivityScope
public interface DNSComponent {

    IDNSView view();

    void inject(MainActivity activity);
}
