package com.uharris.wedding.presentation.injection.modules

import com.uharris.wedding.domain.executor.PostExecutionThread
import com.uharris.wedding.presentation.base.UiThread
import com.uharris.wedding.presentation.sections.main.MainActivity
import com.uharris.wedding.presentation.sections.photos.PhotosFragment
import com.uharris.wedding.presentation.sections.photos.add.AddPhotoActivity
import com.uharris.wedding.presentation.sections.register.RegisterActivity
import com.uharris.wedding.presentation.sections.sites.SitesFragment
import com.uharris.wedding.presentation.sections.splash.SplashActivity
import com.uharris.wedding.presentation.sections.wishes.WishesFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class UiModule {

    @Binds
    abstract fun bindPostExecutionThread(uiThread: UiThread): PostExecutionThread

    @ContributesAndroidInjector
    abstract fun contributesRegisterActivty(): RegisterActivity

    @ContributesAndroidInjector
    abstract fun contributesMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributesWishesFragment(): WishesFragment

    @ContributesAndroidInjector
    abstract fun contributesSitesFragment(): SitesFragment

    @ContributesAndroidInjector
    abstract fun contributesPhotosFragment(): PhotosFragment

    @ContributesAndroidInjector
    abstract fun contributesAddPhotoActivity(): AddPhotoActivity

    @ContributesAndroidInjector
    abstract fun contributesSplashActivity(): SplashActivity
}