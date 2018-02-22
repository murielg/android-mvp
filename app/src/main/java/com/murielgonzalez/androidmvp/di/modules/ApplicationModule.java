package com.murielgonzalez.androidmvp.di.modules;

import android.app.Application;
import android.content.Context;

import com.murielgonzalez.androidmvp.data.AppDataManager;
import com.murielgonzalez.androidmvp.data.DataManager;
import com.murielgonzalez.androidmvp.data.db.AppDbHelper;
import com.murielgonzalez.androidmvp.data.db.DbHelper;
import com.murielgonzalez.androidmvp.data.network.ApiHelper;
import com.murielgonzalez.androidmvp.data.network.AppApiHelper;
import com.murielgonzalez.androidmvp.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }


}