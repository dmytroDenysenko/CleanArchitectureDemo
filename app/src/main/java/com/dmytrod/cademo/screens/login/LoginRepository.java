package com.dmytrod.cademo.screens.login;

import rx.Observable;

/**
 * Created by Dmytro Denysenko on 20.11.17.
 */

interface LoginRepository {
    Observable<Profile> getCurrentUser();
}
