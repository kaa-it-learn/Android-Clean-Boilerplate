package com.kodelabs.boilerplate.domain.interactors;

import com.kodelabs.boilerplate.domain.interactors.base.Interactor;

/**
 * Created by akruglov on 01.04.17.
 */

public interface WelcomingInteractor extends Interactor {

    interface Callback {

        void onMessageRetrieved(String message);

        void onRetrievalFailed(String error);
    }

}
